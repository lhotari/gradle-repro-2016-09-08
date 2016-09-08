package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class HelloTask extends DefaultTask {
    String hello = 'hello from HelloTask'

    @TaskAction
    def greet() {
        println hello
    }
}