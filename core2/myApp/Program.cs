using System;

namespace myApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!" + sum(5, 9));

        }

        static int sum(int x, int y) {
            return x * y;
        }
    }
}
