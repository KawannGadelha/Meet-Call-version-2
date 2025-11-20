pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral() // <- Moved to a new line
        maven { url = uri("https://maven.zego.im") }
        maven { url = uri("https://www.jitpack.io") } // Corrected the URL
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // If your app modules need these repositories, add them here as well.
        maven { url = uri("https://maven.zego.im") }
        maven { url = uri("https://www.jitpack.io") }
    }
}

rootProject.name = "Chamada de video teste"
include(":app")
