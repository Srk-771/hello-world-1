job('First-Maven-Project-Via-DSL') {
    description("First Maven job generated by the DSL on ${new Date()}, the project is a small Maven project hosted on github")
    scm {
        git("https://github.com/Srk-771/hello-world-1.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('mvn clean install')
    }
}