#FormHelper for use in my android apps.

#Simple Check for null in edittext[s] on Button click,setError Text if null.


#Usage
add this to your build.gradle.

#======For Gradle Users=========
repositories{
 maven {
        url  "http://dl.bintray.com/rbkgh/maven"
    }
}
and 

compile 'com.swiftpot:com.swiftpot.formhelper:1.0.0'
#======For Gradle Users=========

#====For Maven users===
<dependency>
<groupId>com.swiftpot</groupId>
<artifactId>com.swiftpot.formhelper</artifactId>
<version>1.0.0</version>
<type>pom</type>
</dependency>
#====For Maven users===

##===For Ivy Users===<br/>
<dependency org='com.swiftpot' name='com.swiftpot.formhelper' rev='1.0.0'>
 <artifact name='$AID' ext='pom'></artifact>
</dependency>
##===For Ivy Users===


#--Future To-Do--
#1.Check Email conformance,
#2.Check PhoneNumber compliance,
#3.Check for specific number of characters and more.