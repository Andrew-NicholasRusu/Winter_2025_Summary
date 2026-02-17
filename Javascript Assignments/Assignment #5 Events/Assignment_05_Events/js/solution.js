
/**
 * Step1: use document.getElementById for name,email and phone inputs and save them in variables
 * Step2: use addEventListener for the event focus and blur and use functions 
 * Step3: inside each function for event listener you should:
 *      use following methodology to access an elements’ CSS properties through the DOM. 
 *        element.style.property= “value” 
 * Step4:  when you click submit button it will automatically call submit funtion , you must create a submit() function and add following logic:
 *          1- create multiple elements based on lab5.2 (look at the buttom of the image how values are added to the page) 
 *          2- create multiple TextNode and add values of name, email and phone inputs.
 *          3- use appendChild function to append nodes to the appropriate elements.
 *          4- Finally you get body element and use appendChild to add them to DOM body section
 *
 **/

let x = document.getElementById("nameinput")
let y = document.getElementById("emailinput")
let z = document.getElementById("phoneinput")

let body = document.getElementById("body")

x.addEventListener("focus", myFocusfunction) 
x.addEventListener("blur", myBlurfunction)

function myFocusfunction(){
    document.getElementById("nameinput").style.backgroundColor = "yellow"
}

function myBlurfunction(){
    document.getElementById("nameinput").style.backgroundColor = "green"
}

document.getElementById("submit").addEventListener("click", submitForm);

function submitForm(){
    
    let brE1 = document.createElement("br")
    let brE2 = document.createElement("br")
    let para = document.createElement("p")

    let textN1 = document.createTextNode(x.value)
    let textN2 = document.createTextNode(y.value)
    let textN3 = document.createTextNode(z.value)

    para.appendChild(textN1)
    para.appendChild(brE1)

    para.appendChild(textN2)
    para.appendChild(brE2)

    para.appendChild(textN3)

    body.appendChild(para)

}