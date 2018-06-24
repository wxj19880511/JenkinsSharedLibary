// src/org/foo/Zot.groovy
package org.foo;

def checkOutFrom(repo) {
  git url: "https://github.com/wxj19880511/JenkinsSharedLibary.git", credentialsId: 'github'
}

return this