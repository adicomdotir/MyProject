// میتوان یک عبارت تابعی را به یک شی نسبت داد
var sum = function(a, b) {
    return a + b;
}

var object = new Object();
object.age = 20;
var obj = { age:55, name:"Ali" };
alert(obj.age);

function team(name) {
    var obj = {};
    obj.name = name;
    obj.game = 0;
    obj.win = 0;
    obj.lose = 0;
    obj.draw = 0;
    obj.ga = 0;
    obj.gf = 0;
    obj.points = 0;
    return obj;
}

var team01 = new team('Chelsea');
