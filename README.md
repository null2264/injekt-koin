[![Kotlin](https://img.shields.io/badge/kotlin-1.0.2-blue.svg)](http://kotlinlang.org) [![Maven Version](https://img.shields.io/maven-central/v/uy.kohesive.injekt/injekt-core.svg)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22uy.kohesive.injekt%22) [![CircleCI branch](https://img.shields.io/circleci/project/kohesive/injekt/master.svg)](https://circleci.com/gh/kohesive/injekt/tree/master) [![Issues](https://img.shields.io/github/issues/kohesive/injekt.svg)](https://github.com/kohesive/injekt/issues?q=is%3Aopen) [![DUB](https://img.shields.io/dub/l/vibe-d.svg)](https://github.com/kohesive/injekt/blob/master/LICENSE) [![Kotlin Slack](https://img.shields.io/badge/chat-kotlin%20slack-orange.svg)](http://kotlinslackin.herokuapp.com)

# Injekt-Koin

Bridge between Injekt and Koin.

## Why?

Projects like Tachiyomi allow their users to create extensions, those extensions are able to use Injekt for dependency
injection, because of that, migrating to a different dependency injection is not a straight forward process, this
library aim to solve that issue and provide Injekt API for those user-made extensions to use.

# Injekt

Injekt gives you crazy easy **Dependency Injection** in Kotlin.  Although you can probably use it in other JVM languages if you are feeling lucky.

Injekt is NOT inversion of control.  It is NOT some mystical class file manipulator.  It is NOT complex.  But it IS powerful.

Injekt can also load, bind to objects, and inject configuration using Typesafe Config.  Read more in the [injekt-config-typesafe module](https://github.com/kohesive/klutter/tree/master/config-typesafe).

## Usage

Add `jitpack.io` repository to your root `build.gradle.kts` file:

```kotlin
dependencyResolutionManagement {
    repositories {
        ...
        maven(url = "https://www.jitpack.io")
    }
}
```

Add library to dependencies (replace HASH with whatever git revision hash you want to use):

```kotlin
dependencies {
    implementation("com.github.null2264:injekt-koin:HASH")
}
```
