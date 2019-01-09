/*
 * Copyright 2014 Soichiro Kashima
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.blog.korn123.easydiary.activities

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.View
import android.widget.FrameLayout

import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks
import com.github.ksoichiro.android.observablescrollview.ScrollState
import com.github.ksoichiro.android.observablescrollview.Scrollable
import com.nineoldandroids.animation.ValueAnimator
import com.nineoldandroids.view.ViewHelper
import me.blog.korn123.easydiary.R

abstract class ToolbarControlBaseActivity<S : Scrollable> : EasyDiaryActivity(), ObservableScrollViewCallbacks {

    private var mToolbar: Toolbar? = null
    private var mScrollable: S? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())

        mToolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(mToolbar)

        mScrollable = createScrollable()
        mScrollable!!.setScrollViewCallbacks(this)
    }

    protected abstract fun createScrollable(): S

    override fun onScrollChanged(scrollY: Int, firstScroll: Boolean, dragging: Boolean) {}

    override fun onDownMotionEvent() {}

    override fun onUpOrCancelMotionEvent(scrollState: ScrollState) {
        Log.e("DEBUG", "onUpOrCancelMotionEvent: $scrollState")
        if (scrollState == ScrollState.UP) {
            if (toolbarIsShown()) {
                hideToolbar()
            }
        } else if (scrollState == ScrollState.DOWN) {
            if (toolbarIsHidden()) {
                showToolbar()
            }
        }
    }

    protected abstract fun getLayoutResId(): Int

    private fun toolbarIsShown(): Boolean {
        return ViewHelper.getTranslationY(mToolbar).toInt() == 0
    }

    private fun toolbarIsHidden(): Boolean {
        return ViewHelper.getTranslationY(mToolbar).toInt() == -mToolbar!!.height
    }

    private fun showToolbar() {
        moveToolbar(0f)
    }

    private fun hideToolbar() {
        moveToolbar((-mToolbar!!.height).toFloat())
    }

    private fun moveToolbar(toTranslationY: Float) {
        if (ViewHelper.getTranslationY(mToolbar) === toTranslationY) {
            return
        }
        val animator = ValueAnimator.ofFloat(ViewHelper.getTranslationY(mToolbar), toTranslationY).setDuration(200)
        animator.addUpdateListener(object : ValueAnimator.AnimatorUpdateListener {
            override fun onAnimationUpdate(animation: ValueAnimator) {
                val translationY = animation.getAnimatedValue() as Float
                ViewHelper.setTranslationY(mToolbar, translationY)
                ViewHelper.setTranslationY(mScrollable as View?, translationY)
                val lp = (mScrollable as View).layoutParams as FrameLayout.LayoutParams
                lp.height = (-translationY).toInt() + getScreenHeight() - lp.topMargin
                (mScrollable as View).requestLayout()
            }
        })
        animator.start()
    }

    protected fun getScreenHeight(): Int {
        return findViewById<View>(android.R.id.content).height
    }
}