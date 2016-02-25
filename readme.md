#FormHelper for use in my android apps.

#Simple Check for null in edittext[s] on Button click,setError Text if null.


#Usage
add this to your build.gradle.

#======For Gradle Users=========
repositories{<br/>
 maven {<br/>
        url  "http://dl.bintray.com/rbkgh/maven"<br/>
    }<br/>
}<br/>
and <br/>
compile 'com.swiftpot:com.swiftpot.formhelper:1.0.0'<br/>
#======For Gradle Users=========

#================For Maven users===============
<dependency>
  <groupId>com.swiftpot</groupId>
  <artifactId>com.swiftpot.formhelper</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
#================For Maven users===============


#--Future To-Do--
#1.Check Email conformance,
#2.Check PhoneNumber compliance,
#3.Check for specific number of characters and more.