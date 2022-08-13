package com.hritsaha.routes

import com.hritsaha.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


private const val BASE_URL="http://192.168.164.1:8080"
private val rabbits= listOf(
    Rabbit("Das","Psychopath rabbit","https://mydukaan-prod-new.s3.amazonaws.com/149205/2424c1ce-78ae-47a5-9197-876f47b20459.png"),
    Rabbit("Chaki","Honu ekta Honu","https://image.petmd.com/files/styles/article_image/public/rabies-rabbits.jpg?VersionId=AXvMCtvC9wpwvI7w4VyWZkN_i2vnkU6Q&itok=sSzRMpgr"),
    Rabbit("Stefan","He is a good rabbit","https://api.time.com/wp-content/uploads/2019/03/us-movie-rabbits-meaning.jpg?quality=85&w=1200&h=628&crop=1"),
    Rabbit("Emily","She is weird","https://www.collinsdictionary.com/images/full/rabbit_274039655.jpg"),
    Rabbit("Benjamin","Never gets Old","https://www.outsideonline.com/wp-content/uploads/2022/06/Moose2.jpg")

)

fun Route.randomRabbit(){
    route("/random-rabbit"){
        get {
            call.respond(
                HttpStatusCode.OK,
                rabbits.random()
            )
        }
    }
}