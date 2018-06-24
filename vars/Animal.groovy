#!/usr/bin/groovy


def call(body) {

    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    echo "Dogs is eating ${config.food}"
    log.info "How to make it"
    log.warning "Don't eat ${config.food}"
}