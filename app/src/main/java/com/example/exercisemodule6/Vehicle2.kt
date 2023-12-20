package com.example.exercisemodule6

//JULIANA SOUZA - EXERCICIO MODULO 6


fun main() {
    val car = Car2()
    car.print()
    car.increaseVelocity(60)
    car.print()
    car.decreaseVelocity(20)
    car.print()

    val motorcycle = Motorcycle2()
    motorcycle.print()
    motorcycle.increaseVelocity(60)
    motorcycle.print()
    motorcycle.decreaseVelocity(120)
    motorcycle.print()
}


interface Vehicle2 {
    val velocity: Long
    val acceleration: Long
    val model: String

    fun increaseVelocity(acceleration: Long)

    fun decreaseVelocity(acceleration: Long): Long

    fun currentVelocity() = this.velocity

    fun print()

}

class Car2 : Vehicle2 {
    override var velocity: Long = 0
    override var acceleration: Long = 10
    override var model: String = "Car Model"

    override fun increaseVelocity(acceleration: Long) {
        velocity += acceleration
    }

    override fun decreaseVelocity(acceleration: Long): Long {
        velocity -= acceleration

        if (velocity < 0) {
            velocity = 0
        }
        return velocity
    }

    override fun currentVelocity() = velocity

    override fun print() {
        println("Car model: $model, velocity: $velocity")
    }
}

class Motorcycle2 : Vehicle2 {
    override var velocity: Long = 0
    override var acceleration: Long = 5
    override var model: String = "Motorcycle Model"

    override fun increaseVelocity(acceleration: Long) {
        velocity += acceleration
    }

    override fun decreaseVelocity(acceleration: Long): Long {
        velocity -= acceleration

        if (velocity < 0) {
            velocity = 0
        }
        return velocity
    }

    override fun currentVelocity() = velocity

    override fun print() {
        println("Motorcycle model: $model, velocity: $velocity")
    }
}





