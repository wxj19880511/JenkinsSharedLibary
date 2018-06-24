def call(Closure body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    println(config.name)
    println(config.cmd)

    stage(config.name) {
        config.cmd
    }
}