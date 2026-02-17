var table = 3;             // Unit of table
var operator = 'addition'; // Operator (Type of calculation)
var i = 1;                 // Set counter to 1
var msg = '';              // Message (an empty string to store the results)


// TODO: Write your JavaScript code here to generate a mathematical table

// Addition

if(operator === 'addition'){
    while( i < 11) {
        msg += i + ' + ' + table + " = " + (i + table) + "<br>";
        i++;  
    }

// Multiplication

} else {
    while (i < 11) {
        msg += i + ' x ' + table + ' = ' + (i * table) + '<br>';
        i++
    }
}

// - Implement a loop that iterates from 1 to 10
// - Inside the loop:
//   - Check the selected calculation type (addition or multiplication)
//   - Compute the result accordingly
//   - Concatenate the result into a string variable for display

// TODO: Write your JavaScript code here to display the results

console.log(msg)
var el = document.getElementById("blackboard");
el.innerHTML = msg;

// - Find the HTML element with id 'blackboard'
// - Insert the generated results into the 'blackboard' section
