class Test {
    static def test() {
        println("using the groovy class")
    }
}

def test() {
    obj = new Test()
    println("--------------")
    obj.test()
    println("-------------")
}


return this