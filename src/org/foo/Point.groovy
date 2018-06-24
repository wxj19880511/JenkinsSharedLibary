// src/org/foo/Point.groovy
package org.foo

// point in 3D space
class Point implements Serializable {
    float x,y,z;
    def steps;

    Test(steps) {this.steps = steps}

    def setX(x) {
        this.x = x
    }

    def getX() {
        return this.x;
    }

    def displayX() {
        steps.sh "echo ${this.x}"
    }
}
