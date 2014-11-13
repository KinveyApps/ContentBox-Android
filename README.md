ContentBox-Android
==================

This application allows for the distribution of content.  The content itself, as well as the format it is accessible in is configured through a Kinvey application.

In particular this sample application highlights the following key backend tasks:

* Configurable App experience through Kinvey
* In memory caching of data
* Offline storage


## Set up ContentBox Project
1. Download the [ContentBox](https://github.com/KinveyApps/contentbox-Android/archive/master.zip) project and import it into your IDE.  
2. Download [ActionBarSherlock](http://actionbarsherlock.com/) and in Eclipse, go `File` -> `New` -> `Android Project from Existing Source` and navigate to the ActionBarSherlock directory, and import it as a library project.
3. Download [ViewPagerIndicator](http://viewpagerindicator.com/) and in Eclipse, go `File` -> `New` -> `Android Project from Existing Source` and navigate to the ViewPagerIndicator directory, and import it as a library project.
4. [Download Kinvey's Android Library](http://devcenter.kinvey.com/android/downloads) and get your app-key and app-secret from the Kinvey console, by signing up and then creating a new app.
5.  Vist out [getting started guide for android](http://devcenter.kinvey.com/android/guides/getting-started) and follow the `Manual Project Set Up` steps to import the library into your IDE.
6. In Eclipse, right click on the newly created project, and select __Properties__, then select __Android__ on the left.  At the bottom of the window, under the __Library__ section add `ActionBarSherlock` and `ViewPagerIndicator` as a dependency. 
7. Specify your app.key and app.secret in the property file located at `assets/kinvey.properties` 
8. Visit [The Kinvey Console](www.console.kinvey.com), and create three collections within the __Data__ section named `Content`, `ContentTypes`, and `Markets`.
9. When viewing the __Data__ browser for each of these collections, click __Settings__ -> __import__, and select the respective *.json file from the `assets/` directory.
10.  Within the console, visit the __Users__ section, and click __Add User__.  Give the test user a username and a apssword, which you can use to log into the application.  

##License


Copyright (c) 2014 Kinvey Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
in compliance with the License. You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License
is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
or implied. See the License for the specific language governing permissions and limitations under
the License.
