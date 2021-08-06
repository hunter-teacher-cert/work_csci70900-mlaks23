//Conditionals Activity
//Run the code. Answer the prompted questions. Look at the outputs.
//Re-run the code using different answers. Look at the outputs.


const prompt = require('prompt-sync')()  //defines prompt


//Scenario 1
const alice = prompt("Alice finds a cake and eats it. Does it make Alice taller or shorter? ")

if (alice === "taller") {
   console.log("Alice grows " + alice + ". She reaches the key" + "\n")
 } else {
   console.log("Alice grows " + alice + ". She creeps under the door" + "\n")
 }

//Scenario 2
const verb = prompt("Tweedle Dee and Tweedle Dum are talking. Choose 'was,' 'were,' or isn't: ")

if (verb === "was") {
   console.log("If it " + verb + " so, it might be.")
 } else if (verb === "were") {
   console.log("If it " + verb + " so, it would be.")
 } else {
   console.log("As it " + verb + ". It ain't.")
 }
console.log("That's logic. " + "\n")

//Scenario 3
const tweedle = prompt("How old are you? ")

console.log("Who are you?")
 if (tweedle > 17) {
   console.log("You are Tweedle Dee" + "\n")
 } else {
   console.log("You are Tweedle Dum" + "\n")
 }


//Scenario 4
if ((alice !== "taller") && (tweedle > 17)) {
   console.log("Since Alice is " + alice + " and she is " + tweedle + " years old")
   console.log("Alice shakes hands with Tweedle DEE.")
 } else {
   console.log("Since Alice is " + alice + " and she is " + tweedle + " years old")
   console.log("Alice shakes hands with Tweedle DUM.")
 }

 //Practice with Comparison Operators
 //Replace the blanks with comparison operators to make true statements. Then uncomment the console.log statements and run the code.
 //If they are true, the following lines should say TRUE"

 //console.log("True Statements: ")
 //console.log(20 __ 25)
 //console.log(5 __ -4)
 //console.log(12 __ 12)
 //console.log("run" __ "walk")

 //Replace the blanks with comparison operators to make false statements. Then uncomment the console.log statements and run the code.
 //If they are false, the following lines should say FALSE"

 //console.log("False Statements: ")
 //console.log(5.6 __ 5.5)
 //console.log(23 __ 23)
 //console.log("dog" __ "cat")

 //Practice with Condtionals 1
//Replace the blanks with a conditional statement that prints the correct statement depending on the height, in inches, that you input.

// let yourHeight = _____
let maxHeight = 72
let miniHeight = 54


// if (__________) {
//     console.log("Sorry, you are too tall for the ride.")
// } else if (__________) {
//     console.log("Sorry, you are too short for this ride.")
// } else {
//     print("You can go on the ride. Have fun!")
// }

//Practice with Conditionals 2
//Write a program the compares the speed of a car to the maximum speed limit and minimum speed limit on a highway.
//For example, if the car goes too fast, display a message that tells the driver to slow down.
//If the car goes too slow, display a message that tells the driver to speed up.
//If the car is going within the limits, display a message the tells the driver they are driving at a good speed.

//let yourSpeed = _____
let maxSpeed = 65
let minSpeed = 40


//Challenge: Create your own scenario with condtionals.
