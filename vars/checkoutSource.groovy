def call(Closure body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config

    checkout([$class: 'GitSCM', branches: [[name: '*/develop']], browser: [$class: 'GithubWeb', repoUrl: 'https://github.com/wxj19880511/JenkinsSharedLibary.git'], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'ScmName', name: 'JenkinsSharedLibrary']], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github', url: 'https://github.com/wxj19880511/JenkinsSharedLibary.git']]])
}