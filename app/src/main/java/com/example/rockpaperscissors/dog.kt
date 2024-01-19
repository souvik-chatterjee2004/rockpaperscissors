package com.example.rockpaperscissors

class dog (val name:String,val breed:String,var age:Int=0)//here age is made having a default value of 0 which can be overwritten by us
    {
    init {
        bark(name,breed)
    }

    fun bark(name: String,breed:String){
        println(" $name says woof woof")
    }
}