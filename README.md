ContentBox-Android
==================

This application allows for the distribution of content.  The content itself, as well as the format it is accessible in is configured through a Kinvey application.

In particular this sample application highlights the following key backend tasks:

* Configurable App experience through Kinvey
* In memory caching of data
* Offline storage


## Set up ContentBox Project
1. Download the [ContentBox](https://github.com/KinveyApps/contentbox-Android/archive/master.zip) project.
2. Download the latest Kinvey library (zip) and extract the downloaded zip file, from: http://devcenter.kinvey.com/android/downloads


###Android Studio
1. In Android Studio, go to **File &rarr; New &rarr; Import Project**
2. **Browse** to the extracted zip from step 1, and click **OK**
3. Click **Next** and **Finish**.
4. Copy all jars in the **libs/** folder of the Kinvey Android library zip to the **lib/** folder at the root of the project
5. Within the `Top-level` build.gradle script, add the following repository:

	```
    repositories {
        maven { url "http://dl.bintray.com/populov/maven" }
    }
    ```
    
6.  Click the **play** button to start a build, if you still see compilation errors ensure the versions are correctly defined in the dependencies list

###Finally, for all IDEs
1. Specify your app.key and app.secret in the property file located at `assets/kinvey.properties` 
2. Visit [The Kinvey Console](www.console.kinvey.com), and create three collections within the __Data__ section named `Content`, `ContentTypes`, and `Markets`.
3. When viewing the __Data__ browser for each of these collections, click __Settings__ -> __import__, and select the respective *.json file from the `assets/` directory.
4.  Within the console, visit the __Users__ section, and click __Add User__.  Give the test user a username and a apssword, which you can use to log into the application.  

##License


Copyright (c) 2014 Kinvey Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
in compliance with the License. You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License
is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
or implied. See the License for the specific language governing permissions and limitations under
the License.
