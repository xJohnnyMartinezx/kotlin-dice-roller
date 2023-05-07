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

    val diceRoll = myFirstDice.makeRoll();
    println("Your ${myFirstDice.sides} sided dice, rolled a $diceRoll");


}

class Dice{

//    PROPERTIES
    val sides = 6;

//    METHODS
    fun makeRoll(): Int{
        val randomNum = (1..6).random();
        return randomNum;
    }



}
