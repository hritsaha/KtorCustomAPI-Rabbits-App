package com.hritsaha

import io.ktor.server.application.*
import com.hritsaha.plugins.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(){
    embeddedServer(Netty, port=8080,host="192.168.164.1"){
        configureSerialization()
        configureMonitoring()
        configureRouting()
    }.start(wait = true)
}
