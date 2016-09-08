package org.gradle

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

// START SNIPPET test-plugin
class HelloPluginTest {
    @Test
    public void greeterPluginAddsHelloTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'org.samples.hello'

        assertTrue(project.tasks.hello instanceof HelloTask)
    }
}
// END SNIPPET test-plugin
