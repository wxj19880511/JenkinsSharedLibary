def call(Closure body) {
    node('Docker') {
        body()
    }
}