

// Declare variables
let firstName
let lastName
let age

// Initialize variable -give the variable a value


//When we write the word, we use double quotation marks
firstName = "Alice"
lastName = "Liddell"
age = 7


//print the name
console.log(firstName, lastName, "is a little girl who is approximately ", age, " years old.")

//different format
console.log(firstName + " " + lastName + " is a little girl is approximately " + age + " years old.")

//Declare a variable for the object
let character1
//Assign an object to that variable
character1 = {
  firstName: "Alice",
  lastName: "Liddell",
  age: 7
}

//print the object
console.log(character1)
//dot notation
console.log(character1.firstName)

//change the property by reassigning the value
character1.firstName = "Mad"
character1.lastName = "Hatter"

console.log("New character1 properties: ")
console.log(character1.firstName, character1.lastName)

//Add an object for a second character
let character2
character2 = {
  firstName: "Cheshire",
  lastName: "Cat",
  age: 20
}

//print out information for character 2 using dot notation
console.log("Character2 Information: ")
console.log(character2.firstName, character2.lastName)



//Activity Example: Try to program an address as an object
let address

address = {
  houseNumber: 20,
  streetName: "Broadway",
  city: "New York City",
  state: "New York",
  country: "USA"
}

console.log(address)
console.log(address.city)
