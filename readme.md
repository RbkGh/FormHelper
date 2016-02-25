DroidFormHelper
===============


#DroidFormHelper is a simple library for Validating Various Form Inputs,eg check for null(set error if null),check character length etc. automatically

#Demonstration  https://github.com/RbkGh/FormHelper.git
![](https://github.com/RbkGh/FormHelper/raw/master/descriptionalImages/droidformHelperGIF.gif)

##Usage
add this to your build.gradle.

#===For Gradle Users===
```groovy
repositories{
 maven {
        url  "http://dl.bintray.com/rbkgh/maven"
    }
}
```
and 
```groovy
compile 'com.swiftpot:com.swiftpot.formhelper:1.0.0'
```
#===For Gradle Users===

#====For Maven users===
```xml
<repositories>
    <repository>
       <url>http://dl.bintray.com/rbkgh/maven</url>
    </repository>
```  
  And

```xml
<dependency>
  <groupId>com.swiftpot</groupId>
  <artifactId>com.swiftpot.formhelper</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
#====For Maven users===

##===For Ivy Users===

```xml
<dependency org='com.swiftpot' name='com.swiftpot.formhelper' rev='1.0.0'>
 <artifact name='$AID' ext='pom'></artifact>
</dependency>
```
##===For Ivy Users===


##DETAILED EXAMPLE TUTORIAL-HOW TO USE THE LIBRARY IN YOUR APP.
Kindly click on this Link Below:
- [DroidFormHelperExampleApp](https://github.com/RbkGh/DroidFormHelperExampleApp)

#--Future To-Do--
#1.Check Email conformance,
#2.Check PhoneNumber compliance,
#3.Check for specific number of characters and more.



Developed By
------------

* Rodney Boachie - <rbk.unlimited@gmail.com>


License
--------

    Copyright 2016 Rodney Boachie.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.