package com.example.exercisemodule6

fun main() {
    // Lista de veículos
    val vehicles: MutableList<Vehicle3> = mutableListOf()

    // Factory para criar um carro
    fun createCarFactory(): Vehicle3 {
        return Vehicle3().apply {
            model = "Car Model"
            velocity = 0
            acceleration = 10
        }
    }

    // Factory para criar uma moto

    fun createMotorcycleFactory(): Vehicle3 {
        return Vehicle3().apply {
            model = "Motorcycle Model"
            velocity = 0
            acceleration = 5
        }
    }

    // Adiciona carro e moto à lista
    vehicles.add(createCarFactory())
    vehicles.add(createMotorcycleFactory())

    // Percorre a lista e acelera cada veículo
    for (vehicle in vehicles) {
        vehicle.increaseVelocity(50)
    }

    // Imprime a velocidade de cada veículo
    for ((index, vehicle) in vehicles.withIndex()) {
        println("Veículo $index - Modelo: ${vehicle.model}, Velocidade: ${vehicle.currentVelocity()}")
    }
}

 class Vehicle3 {
    var velocity: Long = 0
    var acceleration: Long = 10
    var model: String = "Dodge RAM"

    fun increaseVelocity(acceleration: Long){
        velocity += acceleration
    }

    fun decreaseVelocity(acceleration: Long): Long {
        velocity -= acceleration
        if(velocity < 0){
            velocity = 0
        }
        return velocity
    }

    fun currentVelocity() = this.velocity

}
