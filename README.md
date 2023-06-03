StrokedTextView
===============
A native android textview capable of adding strokes or outlines to texts.

[<img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/IODevBlue/StrokedTextView?label=Current Version&color=2CCCE4&style=for-the-badge&labelColor=0109B6">](https://github.com/IODevBlue/StrokedTextView/releases) <img alt="Repository Size" src="https://img.shields.io/github/repo-size/IODevBlue/StrokedTextView?color=2CCCE4&style=for-the-badge&labelColor=0109B6"> [<img alt="License" src="https://img.shields.io/github/license/IODevBlue/StrokedTextView?color=2CCCE4&style=for-the-badge&labelColor=0109B6">](http://www.apache.org/licenses/LICENSE-2.0) [<img alt="GitHub Repository stars" src="https://img.shields.io/github/stars/IODevBlue/StrokedTextView?color=2CCCE4&style=for-the-badge&labelColor=0109B6">](https://github.com/IODevBlue/StrokedTextView/stargazers)
<img alt="GitHub watchers" src="https://img.shields.io/github/watchers/IODevBlue/StrokedTextView?label=Repository Watchers&color=2CCCE4&style=for-the-badge&labelColor=0109B6"> [<img alt="Gradle version" src="https://img.shields.io/static/v1?label=Gradle version&message=8.0.0&color=2CCCE4&style=for-the-badge&labelColor=0109B6">](https://docs.gradle.org/8.0/release-notes) [<img alt="Kotlin version" src="https://img.shields.io/static/v1?label=Kotlin version&message=1.8.20&color=2CCCE4&style=for-the-badge&labelColor=0109B6">](https://kotlinlang.org/docs/whatsnew1820.html)

Table of content
----------------
- [Documentations](https://github.com/IODevBlue/StrokedTextView/tree/main#documentations)
- [Uses](https://github.com/IODevBlue/StrokedTextView/tree/main#uses)
- [Installation](https://github.com/IODevBlue/StrokedTextView/tree/main#installation)
- [Usage](https://github.com/IODevBlue/StrokedTextView/tree/main#usage)
- [XML attributes](https://github.com/IODevBlue/StrokedTextView/tree/main#xml-attributes)
- [Contributions](https://github.com/IODevBlue/StrokedTextView/tree/main#contributions)
- [Changelog](https://github.com/IODevBlue/StrokedTextView/tree/main#changelog)
- [License](https://github.com/IODevBlue/StrokedTextView/tree/main#license)


Documentations
--------------
Documentations are available online in [KDoc](https://raw.githack.com/IODevBlue/project-docs/main/api/android/strokedtextview/html/index.html).

Uses
----
StrokedTextView can be used for:
- Game GUIs
- Graffiti and art applications
- Stylizing fonts and typefaces
- Fancy texts

<p align="center"><img src="/art/1.png" alt="Sample preview of the StrokedTextView widget" title="StrokedTextView"></p>

Installation
------------
There are several ways to install this widget.

1. Grab a JAR artifact from the Maven Central Repository:
```GROOVY
implementation 'io.github.iodevblue:strokedtextview:1.0.0'
```
- On Apache Maven
```XML
<dependency>
  <groudId> io.github.iodevblue </groudId>
  <artifactId> strokedtextview </artifactId>
  <version> 1.0.0 </version>
</dependency>
```
If it is a snapshot version, add the snapshot Maven Nexus OSS repository:
```GROOVY
maven {   
  url 'https://s01.oss.sonatype.org/content/repositories/snapshots/'
}
```
Then retrieve a copy:
```GROOVY
implementation 'io.github.iodevblue:strokedtextview:1.0.0-SNAPSHOT'
```

2. If you do not prefer the compiled JAR and want access to the source files directly, then follow this process:
- [Download](https://github.com/IODevBlue/StrokedTextView/archive/refs/heads/main.zip) the project zip file.
- Create a new package with name `strokedtextview` in your project.
- Copy the `StrokedTextView` class file located in the `com.blueiobase.api.android.strokedtextview` package from the downloaded project zip file into the new `strokedtextview` package.
- Edit the package declaration in the class file accordingly.
- Copy the contents of the `res` folder in the project zip into your module's `res` folder. 
- Alternatively for convenience and arrangement in an ordered manner, you could create a `sourceSet` dedicated to 3rd party libraries like so:
```GROOVY
android {
  sourceSets {
    main {
      res {
        srcDirs file("src/main/thirdpartyres/").listFiles(),
                'src/main/thirdpartyres'
      }
      java {
        srcDirs 'src/main/thirdpartylibraries'
      }
    }
  }
}
```
- Then sync project with Gradle.
- This creates a specialized Gradle source set `thirdpartylibraries` for 3rd party library source files and `thirdpartyres` for 3rd party resource files in the `main` directory.
- Create a `strokedtextview` subfolder in the `thirdpartyres` folder and copy the resource contents from the `strokedtextview` module from the downloaded project zip file into the new subfolder.
- Copy the contents of the `com.blueiobase.api.android.strokedtextview` package from the downloaded project zip file into the `thirdpartylibraries` source set.
- Again, this method makes the source code accessible. If you do make major or minor improvements to the source code, consider making a pull request or an issue to make a contribution.
Check the [Contributing](https://github.com/IODevBlue/StrokedTextView/blob/development/CONTRIBUTING.md) for more information.


Usage
-----
Add a `StrokedTextView` to your XML design
```xml
<com.blueiobase.api.android.strokedtextview.StrokedTextView 
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Superman"
        android:gravity="center"
        android:textSize="50sp"
        android:fontFamily="@font/asterix_blink"
        android:layout_marginBottom="20dp"
        app:textStrokeColor="#FF5722"
        app:textStrokeWidth="5"
/>
```
The `textStrokeColor` attribute defines the color to be applied to the text outline.

The `textStrokeWidth` defines the thickness of the stroke applied to the text.

`StrokedTextView` is essentially a `TextView` and contains all its methods and properties.

Configurations: (Optional)
---------------
|Variable | Default |        Use        |
|:---|:-------:|:-----------------:|
|`strokeColor` |    0    | The Stroke color. |
|`strokeWidth` |   0F    | The stroke width. |

XML attributes: (Optional)
--------------
|Attribute |   Default   |Use |
|:---|:-----------:|:---:|
|`textStrokeColor` | Transparent |The stroke color for the textview. |
|`textStrokeWidth` |      0      |The stroke width for the textview. |

Contributions
-------------
Contributors are welcome!

**NOTE:** This repository is split into two branches:
- [main](https://github.com/IODevBlue/StrokedTextView/tree/main) branch
- [development](https://github.com/IODevBlue/StrokedTextView/tree/development) branch
All developing implementations and proposed changes are pushed to the [development](https://github.com/IODevBlue/StrokedTextView/tree/development) branch and finalized updates are pushed to the [main](https://github.com/IODevBlue/StrokedTextView/tree/main) branch.

To note if current developments are being made, there would be more commits in the [development](https://github.com/IODevBlue/StrokedTextView/tree/development) branch than in the [main](https://github.com/IODevBlue/StrokedTextView/tree/main) branch.

Check the [Contributing](https://github.com/IODevBlue/StrokedTextView/blob/development/CONTRIBUTING.md) for more information.

Changelog
---------
* **1.0.0**
    * Initial release

More version history can be gotten from the [Change log](https://github.com/IODevBlue/StrokedTextView/blob/main/CHANGELOG.md) file.


License
=======
```
    Copyright 2023 IO DevBlue

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
```