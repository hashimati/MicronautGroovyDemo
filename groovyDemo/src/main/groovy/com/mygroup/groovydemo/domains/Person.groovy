package com.mygroup.groovydemo.domains

import groovy.transform.Canonical

@Canonical
class Person {
    String name
    int age
    String occupation
}

