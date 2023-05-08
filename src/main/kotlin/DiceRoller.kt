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
//    val diceRollTwo = mySecondDice.makeRoll();

//    println("Your ${myFirstDice.numSides} sided dice rolled a $diceRoll");
//
//    println("Your ${mySecondDice.numSides} sided dice rolled a $diceRollTwo");

    val luckyNum = 4;
    println("$diceRoll : 6 lucky num is: $luckyNum");

    when (diceRoll){
        luckyNum -> println("You win!");
        1 -> println("you rolled a 1, try again.");
        2 -> println("you rolled a 2, try again.");
        3 -> println("you rolled a 3, try again.");
        5 -> println("you rolled a 5, try again.");
        6 -> println("you rolled a 6, try again.");


    }



//    println("$diceRollTwo : 20 lucky num is: $luckyNum");

//    if (diceRoll == luckyNum){
//        println("You're in luck. the numbers match!");
//    }else if (diceRoll == 1){
//        println("you rolled a 1, try again.");
//    }else if (diceRoll == 2){
//        println("you rolled a 2, try again.");
//    }else if (diceRoll == 3){
//        println("you rolled a 3, try again.");
//    }else if (diceRoll == 5){
//        println("you rolled a 5, try again.");
//    }else {
//        println("you rolled a 6, try again.");
//    }



}

class Dice(val numSides: Int){

//    METHODS
    fun makeRoll(): Int{
        val randomNum = (1..numSides).random();
        return randomNum;
    }



}
