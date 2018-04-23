# Fat-Aar-demo
The fat-aar plugin repositories: https://github.com/NicoToast/fat-aar

#### How to use?

1. Configure your project build script.

   > build.gradle

   ```groovy
   buildscript {
     repositories {
       maven {
         url "https://plugins.gradle.org/m2/"
       }
     }
     dependencies {
       classpath 'com.android.tools.build:gradle:3.0.1'
       classpath "gradle.plugin.me.lucas:fat-aar-plugin:1.0.9"
     }
   }
   ```

2. Apply the plugin and add 'fatLibraryExt ' on the top of your library module **build.gradle**:

   'enable = true' is mean fat-aar turn on.

   'enable = false' is mean fat-aar turn off.

   > library/build.gradle

   ```groovy
   apply plugin: 'me.lucas.fat-aar'

   dependencies {
     embed project(path: ':subLibrary', configuration: 'default')
     implementation project(':subLibrary')
   }

   fatLibraryExt {
       enable true
   }

   ```

3. If you need to remove some files while packing, please add 'excludeFiles '.

   ```groovy
   fatLibraryExt {
       enable true
       excludeFiles {
         libs {
           fileNames('gson.jar')
         }
         jni {
            fileNames('test/test.so')
         }
       }
   }

   ```

​        