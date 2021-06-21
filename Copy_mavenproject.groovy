job('create a maven project using DSL'){
    description("This is my first DSL project created on ${new Date()}" )
    logRotator{
        daysToKeep(2)
        numToKeep(3)
    }
    scm{
        github('https://github.com/anshulc55/Jenkins_Upgradev3.git','master')

    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven('clean package')

    }
    publishers{
        archiveArtifacts('**/*.jar')
    }

}
