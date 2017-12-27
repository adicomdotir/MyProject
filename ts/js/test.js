var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
{
    var student = void 0;
    student.name = "Ali";
}
var Person = (function () {
    function Person() {
    }
    return Person;
}());
var Student = (function (_super) {
    __extends(Student, _super);
    function Student() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return Student;
}(Person));
//# sourceMappingURL=test.js.map