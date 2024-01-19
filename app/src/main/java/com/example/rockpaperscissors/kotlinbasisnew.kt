package com.example.rockpaperscissors
//data class coffeeDetails(val sugarCount: Int,val name: String, val size:String,val creamAmount:Int)

fun main(){

   // val shoppinglist= listOf("processor","ram","grahics card","ssd")//this is a immutable list
    //creating mutable list
    val shoppinglist= mutableListOf("processor","ram","grahics card","ssd")
    //adding elemets in the list
    shoppinglist.add("cooling system")
    //removing items from the list
    shoppinglist.remove("graphics card")
    shoppinglist.add("new graphics card")
    println(shoppinglist)
    shoppinglist.removeAt(2)
    println(shoppinglist)
    shoppinglist.add(2,"ram")
    println(shoppinglist[2])
    shoppinglist.set(1,"DRAM")
    println(shoppinglist)
    shoppinglist.set(1,"sand cooling")
    println(shoppinglist)
    val hasram=shoppinglist.contains("ram")
    if(hasram){
        println("the list containn ram in it ")
    }
    else {
        println("the list doesnot contain ram in it ")
    }

    for(index in 0 until shoppinglist.size){
        println("item ${shoppinglist[index]} is at index $index")
        /*println(item)
        if(item=="ram"){
            shoppinglist.removeLast()
            break */
        }
    }






/*
fun coffeedetail(){
    println("enter the first number ")
    val num1=readln().toInt()
    println("enter the second number ")
    val num2=readln().toInt()
    val myresult=add(num1,num2)
    val resultdiv= divide(3,2)
    println("$num1 + $num2 = $myresult")
    println("$num1 / $num2 = $resultdiv")

}
fun divide(num1:Int,num2:Int):Double{
    val result=num1.toDouble()/num2.toDouble()
    return result
}
fun add(num:Int,num2:Int):Int{
    val results=num+num2
    return results

}
fun askCoffeeDetail(){
    println("whos is this coffe for :")
    val name=readln()
    println("how many cubes of sugar u want ")
    val sugarCount=readln().toInt()

    makecoffee(sugarCount,name)

}
fun makecoffee(coffeeDetails: coffeeDetails){
    if(coffeeDetails.sugarCount==1){
        println("coffee with $coffeeDetails.sugarCount spoon of sugar for $coffeeDetails.name")
    }
    else if(coffeeDetails.sugarCount==0){
        println("coffe with no sugar for ${coffeeDetails.name}")
    }
    else{
        println("cofee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name}")
    }

}

 */