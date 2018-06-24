def call(Closure body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config

    checgit branch: 'develop', credentialsId: 'github', url: 'https://github.com/wxj19880511/JenkinsSharedLibary'
kout
}