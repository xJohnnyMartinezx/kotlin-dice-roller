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
    val myFirstDice = Dice(6);
    val mySecondDice = Dice(20)

    val diceRoll = myFirstDice.makeRoll();
    val diceRollTwo = mySecondDice.makeRoll();

    println("Your ${myFirstDice.numSides} sided dice rolled a $diceRoll");

    println("Your ${mySecondDice.numSides} sided dice rolled a $diceRollTwo");



}

class Dice(val numSides: Int){

//    METHODS
    fun makeRoll(): Int{
        val randomNum = (1..numSides).random();
        return randomNum;
    }



}
