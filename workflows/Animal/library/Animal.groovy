class Test {
    static def test() {
        println("My favoriate")
        println("using the groovy class")
        println("++++++++++")
    }
}

def test() {
    obj = new Test()
    println("--------------")
    obj.test()
    println("-------------")
}


return this