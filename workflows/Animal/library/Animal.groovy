class Test {
    static def test() {
        echo "using the groovy class"
    }
}

def test() {
    obj = new Test()
    obj.test()
}


return this