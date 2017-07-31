function myMethod(index) {
    document.writeln("HelloWorld! " + index);
    $("div").click(function () {

    });
    $(document).ready(function() {

    });
}
var test = function() {
    return
}

var myVar = "global"; // Declare a global variable
function checkscope( ) {
    var myVar = "local";  // Declare a local variable
    document.write(myVar);
}

var person = new Object();
person.name = "Ali";
person.age = 34;

var person = {
    name : "Yashar",
    age = 30
};

var person = {}; // LIKE = var person = new Object();

class MyClass {
    
}