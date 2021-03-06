# SimpleDialogs

[![API 14+](https://img.shields.io/badge/API-14+-green.svg)](https://developer.android.com/about/dashboards/index.html#Platform)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.ParklyInc/simpledialogfragments.svg)](https://search.maven.org/artifact/io.github.ParklyInc/simpledialogfragments)
[![JitPack](https://jitpack.io/v/ParklyInc/SimpleDialog.svg)](https://jitpack.io/#ParklyInc/SimpleDialog)
[![Code Climate Rating](https://codeclimate.com/github/ParklyInc/SimpleDialog/badges/gpa.svg)](https://codeclimate.com/github/ParklyInc/SimpleDialog)
[![Github CI](https://github.com/ParklyInc/SimpleDialog/actions/workflows/build.yml/badge.svg)](https://github.com/Parkly/SimpleDialog/actions/workflows/build.yml)
[![License](https://img.shields.io/github/license/ParklyInc/simpledialogfragments.svg)](https://github.com/ParklyInc/SimpleDialog#license)






<img width="40%" align="right" src="https://github.com/ParklyInc/SimpleDialogFragments/raw/main/media/screenshot.png"/>

SimpleDialog Library is a collection of easy to use and extendable DialogFragment's for Android.
It is fully compatible with rotation changes and can be implemented with only a few lines of code.

A new approach of result handling ensures data integrity over rotation changes, that many other libraries lack.



|[API](https://eltos.github.io/SimpleDialogFragments)|[Wiki](https://github.com/ParklyInc/SimpleDialogFragments/wiki)|[Releases](https://github.com/ParklyInc/SimpleDialogFragments/releases)|[Screenshots](https://github.com/ParklyInc/SimpleDialogFragments/wiki/Showcase)|[Demo APK](https://github.com/ParklyInc/SimpleDialogFragments/releases/download/v3.4/testApp.apk)|
|-|-|-|-|-|



### Features

* Common dialogs that can be used with few lines of code
  * Alert dialogs
  * Input and checkbox dialogs with suggestions and validations
  * Filterable single- / multi-choice dialogs
  * Color pickers (palettes and/or HSV)
  * Extensive forms
  * Date and time pickers
  * Pin code dialog
  * Progress dialogs
* Easy result handling even after rotation changes
* Persistence on rotation changes
* Material design
* Customizable and extendable dialogs


## Usage

Check the [release page](https://github.com/ParklyInc/SimpleDialogFragments/releases) for the latest and older versions:

In your module level ``build.gradle`` when using [mavenCentral](https://search.maven.org/artifact/io.github.ParklyInc/simpledialogfragments):
```groovy
dependencies {
    implementation 'io.github.parkly:SimpleDialog:1.0.+'
}
```
or if using [JitPack](https://jitpack.io/#ParklyInc/SimpleDialog):
```groovy
dependencies {
    implementation 'com.github.parkly:SimpleDialog:v1.0.0'
}
```

### Building dialogs

Building dialogs is very easy and short handed:

```java
SimpleDialog.build()
            .title(R.string.hello)
            .msg(R.string.hello_world)
            .show(this);
```

Check the [wiki pages](https://github.com/ParklyInc/SimpleDialogFragments/wiki) for instructions and examples on how to build the different dialogs available.

### Receive Results
Supply a tag when showing the dialog and let the hosting Activity or Fragment implement the `SimpleDialog.OnDialogResultListener`.  
For details, please refere to the [wiki pages](https://github.com/ParklyInc/SimpleDialogFragments/wiki/SimpleDialog#receiving-results).

```java
@Override
public boolean onResult(@NonNull String dialogTag, int which, @NonNull Bundle extras) {
    if (YES_NO_DIALOG.equals(dialogTag) && which == BUTTON_POSITIVE){
        // ...
        return true;
    }
    if (LIST_DIALOG.equals(dialogTag) && which == BUTTON_POSITIVE){
        ArrayList<Integer> pos = extras.getIntegerArrayList(SimpleListDialog.SELECTED_POSITIONS);
        // ...
        return true;
    }
    if (REGISTRATION_DIALOG.equals(dialogTag) && which == BUTTON_POSITIVE){
        String username = extras.getString(USERNAME);
        String password = extras.getString(PASSWORD);
        // ...
        return true;
    }
    // ...
    return false;
}

```

## Extensions
Known extensions and projects using this library:
- [File/Folder picker](https://github.com/isabsent/FilePicker) (see [#30](https://github.com/ParklyInc/SimpleDialogFragments/issues/30))

## License

Copyright 2011-2027 Parkly Inc ([github.com/ParklyInc](https://github.com/ParklyInc))

Licensed under the [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0)  


You may only use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software in compliance with the License. For more information visit http://www.apache.org/licenses/LICENSE-2.0  
The above copyright notice alongside a copy of the Apache License shall be included in all copies or substantial portions of the Software not only in source code but also in a license listing accessible by the user.  

