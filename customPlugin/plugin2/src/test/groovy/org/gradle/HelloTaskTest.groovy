package org.gradle

import org.junit.Test
import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import static org.junit.Assert.*

// START SNIPPET test-task
class HelloTaskTest {
    @Test
    public void canAddTaskToProject() {
        Project project = ProjectBuilder.builder().build()
        def task = project.task('hello', type: HelloTask)
        assertTrue(task instanceof HelloTask)
    }
}
// END SNIPPET test-task
