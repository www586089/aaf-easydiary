# Easy Diary
## [README of Korean(한국어)][README_ko.md]

[![Awesome](https://cdn.rawgit.com/sindresorhus/awesome/d7305f38d29fed78fa85652e3a63e154dd8e8829/media/badge.svg)](https://github.com/unicodeveloper/awesome-opensource-apps)
[![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)
[![License][licensesvg]][LICENSE.md]

<img src="screenshots/ic_launcher.png" >

This is a diary application optimized to user experience.

<a href='https://play.google.com/store/apps/details?id=me.blog.korn123.easydiary'><img alt='Get it on Google Play' src='https://play.google.com/intl/en_us/badges/images/generic/en_badge_web_generic.png' width="258" height="98"/></a>
<a href='https://f-droid.org/en/packages/me.blog.korn123.easydiary'><img alt='Get it on F-Droid' src='screenshots/fdroid.png' height="98"/></a>
     
<img src="screenshots/00.jpg">&nbsp;
<img src="screenshots/showcase_en.gif" width="288" height="512">

# Support Features
```
01. Write diary (voice or keypad)
02. Search diary
03. Read Diary
04. Edit Diary
05. Chart
06. Calendar
07. Diary Card
08. Time Line
09. Advanced Settings
     - Font Setting
     - Lock Setting(PIN or Fingerprint)
     - Theme Setting
     - Backup and Recovery
```
# Screen Shot
## Write diary (voice or keypad)
<p align="left">
<img src="screenshots/01_1.jpg">
<img src="screenshots/01_2.jpg">
</p>

## Search diary
<p align="left">
<img src="screenshots/02.jpg">
</p>

## Read Diary
<p align="left">
<img src="screenshots/03_1.jpg">
<img src="screenshots/03_2.jpg">
</p>

## Edit Diary
<p align="left">
<img src="screenshots/04.jpg">
</p>

## Chart
<p align="left">
<img src="screenshots/05.jpg">
</p>

## Calendar
<p align="left">
<img src="screenshots/06.jpg">
</p>

## Diary Card
<p align="left">
<img src="screenshots/app_easydiary10_01_en.png" width="288" height="512">
<img src="screenshots/app_easydiary10_02_en.png" width="288" height="512">
<img src="screenshots/app_easydiary10_03.png" width="288" height="512">
<img src="screenshots/app_easydiary10_04.png" width="288" height="512">
<img src="screenshots/app_easydiary10_05_en.png" width="288" height="512">
<img src="screenshots/app_easydiary10_06_en.png" width="288" height="512">
<img src="screenshots/app_easydiary10_07_en.png" width="288" height="512">
</p>

## Time Line
<p align="left">
<img src="screenshots/08_1.jpg">
<img src="screenshots/08_2.jpg">
<img src="screenshots/08_3.jpg">
</p>

## Advanced Settings
<p align="left">
<img src="screenshots/app_easydiary09_01_en.png" width="288" height="512">
<img src="screenshots/app_easydiary09_03_en.png" width="288" height="512">
<img src="screenshots/app_easydiary09_02_en.png" width="288" height="512">
<img src="screenshots/app_easydiary06_en.png" width="288" height="512">
</p>

# How to build
## GMS Flavor
To build the gms flavor build, you need to add your Google Mobile Service settings and download the weather icons from Flaticon and import them directly.
```
Step1. Fork or download 'aaf-easydiary' project.
Step2. Import 'aaf-easydiary' project into android studio.
Step3. Setting storeFile and storePassword in local.properties file
       +++++++ local.properties +++++++++++++++++++++++++++++++++++
       storeFile=your signing key location
       storePassword=your password
       ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
       +++++++ example ++++++++++++++++++++++++++++++++++++++++++++
       storeFile=C:/dev/android/app-signing.jks
       storePassword=sjdiSDAss3!@#
       ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
       If you do not have the signing key, you can create it by referring to the link below:
       https://developer.android.com/studio/publish/app-signing#generate-key
Step4. Use below link download svg images from Flaticon.
Step5. Import 10 svg files for your project from your Android studio.
       Project rightclick > New > Vector Asset...(Res Directory is gms)
       You can import from the menu and the resource names are:
       clouds-and-sun.svg -> ic_clouds_and_sun.xml
       umbrella-1.svg     -> ic_umbrella_1.xml
       sunny.svg          -> ic_sunny.xml
       stars-2.svg        -> ic_stars_2.xml
       snowing.svg        -> ic_snowing.xml
       raindrops.svg      -> ic_raindrops.xml
       rainbow.svg        -> ic_rainbow.xml
       night-rain.svg     -> ic_night_rain.xml
       moon-9.svg         -> ic_moon_9.xml
       bolt.svg           -> ic_bolt.xml
Step6. Register your package name and SHA-1 signature certificate fingerprint for Google Drive use:
       https://console.developers.google.com/
Step7. Build 'aaf-easydiary' project with android studio.
       a. Build > Select Build Variant
       b. Select 'gmsRelease' from the Build Variant setting and run
```
[Download 'weather-set-2' svg images from Flaticon](https://www.flaticon.com/packs/weather-set-2)

## FOSS Flavor
For the foss flavor build, no further action is required. However, because we do not use Google Mobile Service, we can not use the backup function with Google Drive, and we will use simpler weather icons than weather icons provided by gms flavor.  
※ Since we are developing the GMS Flavor package first, the merging of the latest features may be delayed in the FOSS Flavor package.
```
Step1. Fork or download 'aaf-easydiary' project.
Step2. Import 'aaf-easydiary' project into android studio.
Step3. Setting storeFile and storePassword in local.properties file
       +++++++ local.properties +++++++++++++++++++++++++++++++++++
       storeFile=your signing key location
       storePassword=your password
       ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
       +++++++ example ++++++++++++++++++++++++++++++++++++++++++++
       storeFile=C:/dev/android/app-signing.jks
       storePassword=sjdiSDAss3!@#
       ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
       If you do not have the signing key, you can create it by referring to the link below:
       https://developer.android.com/studio/publish/app-signing#generate-key
Step4. Build 'aaf-easydiary' project with android studio.
       a. Build > Select Build Variant
       b. Select 'fossRelease' from the Build Variant setting and run
```

# Translation
Thanks for someone help me to translate this app.   

Currently supported languages are listed below:   

> Korean Translation contributor   
* hanjoongcho (https://github.com/hanjoongcho)  
[strings.xml](https://github.com/hanjoongcho/aaf-easydiary/blob/master/app/src/main/res/values-ko/strings.xml)  
[MANUAL_ko.md](https://github.com/hanjoongcho/aaf-easydiary/blob/master/MANUAL_ko.md)  

> English Translation contributor 
* Google translation robot  
[strings.xml](https://github.com/hanjoongcho/aaf-easydiary/blob/master/app/src/main/res/values-en/strings.xml)  

> Japanese Translation contributor  
* Google translation robot  
[strings.xml](https://github.com/hanjoongcho/aaf-easydiary/blob/master/app/src/main/res/values-ja/strings.xml)  

> German Translation contributor
* fulmeek (https://github.com/fulmeek)  
[strings.xml](https://github.com/hanjoongcho/aaf-easydiary/blob/master/app/src/main/res/values-de/strings.xml)  
[MANUAL_de.md](https://github.com/hanjoongcho/aaf-easydiary/blob/master/MANUAL_de.md)  

# Contributing
[Contributing](Contributing.md)

# License
[LICENSE][LICENSE.md]

[licensesvg]: https://img.shields.io/badge/License-Apache--2.0-brightgreen.svg
[README_ko.md]: https://github.com/hanjoongcho/aaf-easydiary/blob/master/README_ko.md
[LICENSE.md]: https://github.com/hanjoongcho/aaf-easydiary/blob/master/LICENSE.md
