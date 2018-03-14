using System;

namespace myApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!" + sum(5, 9));
			var p = new Person() {
				name = "Ali",
				age = 15
			};
			Console.WriteLine(p.name + " : " + p.age);
        }

        static int sum(int x, int y) {
            return x * y;
        }
    }
    
    class Person {
    	public string name { set; get; }
    	public int age { set; get; }
    	Public Person() {
    	}
    }
}
