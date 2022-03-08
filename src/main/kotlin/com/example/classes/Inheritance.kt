package com.example.classes

open class User(val name: String) {
    open var isLoggedIn = false
    open fun login() {
        println("$name is Logging in")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn = false

    companion object {
        const val numberOfEnrolledCourses = 112
        fun country() = "USA"
    }

    override fun login() {
        println("Inside Student Login")
        super.login()
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Hippo")
    println("student.name = ${student.name}")
    student.login()
    student.isLoggedIn = true
    val country = Student.country()
    println("country = $country")
    val numberOfEnrolledCourses = Student.numberOfEnrolledCourses
    println("numberOfEnrolledCourses = $numberOfEnrolledCourses")

    val instructor = Instructor("Hippopo")
    println("instructor.name = ${instructor.name}")
    instructor.login()
}

