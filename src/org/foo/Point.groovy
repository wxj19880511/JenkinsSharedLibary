// src/org/foo/Point.groovy
package org.foo

// point in 3D space
class Point implements Serializable {
  float x,y,z;

  def setX(x) {
      x = x
  }

  def getX() {
      return x;
  }
}
