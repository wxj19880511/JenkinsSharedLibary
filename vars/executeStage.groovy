def call(String name, Closure body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config

    stage(name) {
        println("""
        ==========================================================================
                                    ${name}                                
        ==========================================================================
        """)
        body.call()
        println("""
        ==========================================================================
                                      END                                
        ==========================================================================
        """)
    }
}