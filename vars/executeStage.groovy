def call(String name, Closure body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config


    stage(config.name) {
        println("""
        ==========================================================================
                                    ${config.name}                                
        ==========================================================================
        """)
        body()
    }
}