class Test implements Serializable {
    def steps

    Test(steps) {this.steps = steps}

    def main() {
        steps.sh "ls && pwd"    
    }
}

def test() {
    obj = new Test(this)
    println("--------------")
    obj.main()
    println("-------------")
}


return this