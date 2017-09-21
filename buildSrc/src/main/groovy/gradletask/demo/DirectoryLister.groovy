package gradletask.demo

import groovy.transform.CompileStatic
import org.gradle.api.tasks.AbstractExecTask

@CompileStatic
class DirectoryLister extends AbstractExecTask {

    DirectoryLister() {
        super(DirectoryLister)
        setCommandLine('ls', '-l')
    }

    // this of course be done by directly using workingDir
    // instead of having this custom method.
    // this is here just as an example of how to get data
    // from the build file into the custom task.
    void setDirectoryToList(String path) {
        workingDir = path
    }
}
