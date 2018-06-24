def call(Closure body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config

   git branch: 'develop', changelog: false, credentialsId: 'github', poll: false, url: 'https://github.com/wxj19880511/JenkinsSharedLibary'

}