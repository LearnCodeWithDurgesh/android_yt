# Project Structure

- Manifests folder

  It contain **AndroidManifest.xml** file which is heart of android project.

  This file contains information about our application such as app metadata, android version,app name, activities, permissions, and much more.

- Java folder

  This folder contain source code java/kotlin

- Resource folder(res)

  This folder contain all non-code resources such as images, audio, video, menus, styles, strings,etc

  - drawable

    contains assets like images etc

  - layout:

    Contain all xml layouts

  - mipmap:

    Contains file to defined icons

  - values

    Contains files like strings, dimensions, colors etc

- **Gradle Scripts folder**

  Gradle is project management tool which help to manage dependency , build of the projects.

  Gradle folder contains many files used to defined number of configuraion files.

  - build.gradle(project)

    Is used to specify global build configurations for the entire project, including the repositories where dependencies can be found and the version of the Android build tools to use.

  - build.gradle(module)

    Is used to specify the build configurations for a specific module within the project, such as the dependencies, build tools, and other settings needed to build and run the app.

  - gradle.setting

    Is used to specify project-wide settings for the build process, including which modules should be included in the project and how they should be organized.

  - gradle-wrapper.properties

    Is used to specify the version of Gradle to use for the build process.

---
