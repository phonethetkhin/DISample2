package com.ptk.disample2

data class Employee(

    val education: Education,
    val experience: Experience,
    val resume: Resume,
    val information: Information,
    val id: String = "E001",
    val name: String = "Thomas",
)