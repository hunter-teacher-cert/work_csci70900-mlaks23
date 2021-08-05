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
