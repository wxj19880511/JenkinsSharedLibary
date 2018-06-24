def call(Closure body) {
    stage(config.name) {
        config.cmd
    }
}