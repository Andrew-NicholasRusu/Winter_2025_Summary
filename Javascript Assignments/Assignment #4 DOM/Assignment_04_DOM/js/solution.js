// SELECT THE <UL> ELEMENT AS THE GROCERY LIST
// TODO: Get the <ul> element               
var list = document.getElementsByTagName('ul')[0]
console.log(list)

// ADD NEW ITEM TO END OF LIST
// Create and add a new item to the end of the list
// TODO: Create <li> element
var newItemLast = document.createElement('li');

// TODO: Create text node                  
var newTextLast = document.createTextNode('cream');

// TODO: Add text node to element (Add text to <li>)             
newItemLast.appendChild(newTextLast); 

// TODO: Add element end of list (Append <li> to <ul>)                            
list.appendChild(newItemLast)

// ADD NEW ITEM START OF LIST
// Create and add a new item to the beginning of the list
// TODO: Create <li> element
var newItemFirst = document.createElement('Li')

// TODO: Create text node                 
// TODO: Add text node to element (Add text to <li>)          
// TODO: Add element to list (Insert before first <li>) 
var newTextFirst = document.createTextNode('kale')
newItemFirst.appendChild(newTextFirst)                     
list.appendChild(newItemFirst)             

// SELECT ALL <LI> ELEMENTS IN THE GROCERY LIST
// TODO: Get all <li> elements in the grocery list
var listItems = document.querySelectorAll('Li')              

// ADD A CLASS OF COOL TO ALL LIST ITEMS
// Loop through each <li> element and add a CSS class 'cool'
// TODO: Create a counter variable, loop through elements, and change class to cool
var i;
for (i = 0; i < listItems.length; i++) {
    listItems[i].className = 'cool'
}

// ADD NUMBER OF ITEMS IN THE LIST TO THE HEADING
// Select the <h2> element and update its content with the total number of items
// TODO: Get <h2> element
// TODO: Get current <h2> text                       
// TODO: Count <li> elements                  
// TODO: Create updated content                                 
// TODO: Update <h2> with new content

var heading = document.querySelector('h2')
var headingText = heading.firstChild.nodeValue
var totalItems = listItems.length
var newHeading = headingText + '<span>' + totalItems + '</span>'
heading.innerHTML = newHeading
                                