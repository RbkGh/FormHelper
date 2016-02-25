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

#====For Maven users===<br/>
<dependency><br/>
&nbsp<groupId>com.swiftpot</groupId><br/>
&nbsp<artifactId>com.swiftpot.formhelper</artifactId><br/>
&nbsp<version>1.0.0</version><br/>
&nbsp<type>pom</type><br/>
</dependency><br/>
#====For Maven users===<br/>

#===For Ivy Users===<br/>
<dependency org='com.swiftpot' name='com.swiftpot.formhelper' rev='1.0.0'><br/>
 &nbsp<artifact name='$AID' ext='pom'></artifact><br/>
</dependency><br/>
#===For Ivy Users===


#--Future To-Do--
#1.Check Email conformance,
#2.Check PhoneNumber compliance,
#3.Check for specific number of characters and more.