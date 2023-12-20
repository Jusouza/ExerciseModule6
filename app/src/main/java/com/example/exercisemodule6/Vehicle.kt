package com.example.exercisemodule6

//JULIANA SOUZA - EXERCICIO MODULO 6


fun main() {

    var vehicle = Motocycle()
    vehicle.print()
    vehicle.increaseVelocity(60)
    vehicle.print()
    vehicle.decreaseVelocity(20)
    vehicle.print()
    vehicle.increaseVelocity(60)
    vehicle.print()
    vehicle.decreaseVelocity(120)
    vehicle.print()

}

abstract class Vehicle() {
    var velocity: Long = 0
    abstract var acceleration: Long
    var model: String = "Dodge RAM"

    init{
        this.model = model
        this.velocity = velocity
        this.acceleration = acceleration
    }

    fun increaseVelocity(acceleration: Long){
        velocity += acceleration
    }

    fun decreaseVelocity(acceleration: Long): Long{
        velocity -= acceleration

        if(velocity < 0){
            velocity = 0
        }
        return velocity
    }

    fun currentVelocity() = this.velocity

    fun print(){
        println("model: $model, velocity: $velocity")
    }

}

   abstract class Car : Vehicle() {

   }

   class Motocycle : Vehicle() {
       override var acceleration: Long = 5
   }





