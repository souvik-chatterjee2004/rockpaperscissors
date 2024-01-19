package com.example.rockpaperscissors
fun main(){
    var computerchoice=""
    var playerchoice=""
    println("rock,paper or scissors enter your choice")
    playerchoice=readln()

    val randomnumber=(1..3).random()
    when (randomnumber) {
        1 -> {
            computerchoice="Rock"

        }
        2 -> {
            computerchoice="paper"

        }
        3 -> {
            computerchoice="scissors"

        }
    }
    println(computerchoice)


    val winner=when{
        playerchoice==computerchoice->"tie"
        playerchoice=="Rock"&& computerchoice=="scissors"->"Player"
        playerchoice=="paper"&& computerchoice=="rock"->"Player"
        playerchoice=="scissors"&& computerchoice=="paper"->"Player"
        else->"Computer"


    }
    if(winner=="tie") {
        println("its a tie")
    }else{
        println("$winner won!!")
    }



}

