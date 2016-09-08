package org.gradle

import org.gradle.api.*
import org.gradle.api.invocation.Gradle
import org.gradle.api.artifacts.repositories.ArtifactRepository
import org.gradle.api.artifacts.repositories.MavenArtifactRepository

class EnterpriseRepositoryPlugin implements Plugin<Gradle> {
    private static String ENTERPRISE_REPOSITORY_URL = System.getenv('ENTERPRISE_REPOSITORY_URL') ?: "https://repo.gradle.org/gradle/repo"

    void apply(Gradle gradle) {
        def allowedUrls = [ENTERPRISE_REPOSITORY_URL, 'https://jcenter.bintray.com/']
        gradle.allprojects{ project ->
            project.repositories {
                all { ArtifactRepository repo ->
                    if (!(repo instanceof MavenArtifactRepository) ||
                          !(repo.url.toString() in allowedUrls)) {
                        project.logger.lifecycle "Repository ${repo.url} removed. Only $ENTERPRISE_REPOSITORY_URL or jcenter() is allowed"
                        remove repo
                    }
                }

                maven {
                    name "STANDARD_ENTERPRISE_REPO"
                    url ENTERPRISE_REPOSITORY_URL
                }
                jcenter()
            }
        }
    }
}
