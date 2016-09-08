package org.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin

class HelloPlugin implements Plugin<Project> {
    void apply(Project target) {
        target.task('hello', type: HelloTask)
    }
}
