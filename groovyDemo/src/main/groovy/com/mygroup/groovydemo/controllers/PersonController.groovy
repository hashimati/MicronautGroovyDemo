package com.mygroup.groovydemo.controllers

import com.mygroup.groovydemo.domains.Person
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import reactor.core.publisher.Mono

@Controller("/person")
class PersonController {

    @Get("/hashim")
    Mono<Person> hashim()
    {
        Person hashim = new Person()
        hashim.setName("Hashim Al Hashim")
        hashim.setAge(2)
        hashim.setOccupation("Future Software Engineer");
        return Mono.just(hashim)
    }
}
