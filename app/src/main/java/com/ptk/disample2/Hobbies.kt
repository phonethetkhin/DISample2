package com.ptk.disample2

data class Hobbies(val hobbiesList: List<HobbiesModel>)

data class HobbiesModel(val hobbyName: String, val passionateLevel: Int)