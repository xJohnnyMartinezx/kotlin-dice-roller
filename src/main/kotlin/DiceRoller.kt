package main.kotlin

fun main(){

//    ********** RANDOM NUM GENERATOR **********
//    println("test");
//
//    val diceRange = 1..6;
//
//    val randomNum = diceRange.random();
//
//    println("Random number is: ${randomNum}");
//
//

//    **** INITIALIZING DICE CLASS
    val myFirstDice = Dice();

    println(myFirstDice.sides);
    println(myFirstDice.makeRoll());

}

class Dice{

//    PROPERTIES
    val sides = 6;

//    METHODS
    fun makeRoll(){
        val randomNum = (1..6).random();
        println(randomNum);
    }



}
