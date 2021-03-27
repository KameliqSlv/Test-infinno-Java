using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace staj_c_sharp
{
    class Program
    {
        static void Main(string[] args)
        {
            for(int i=1;i<=100; i++)
            {
               
                if (i % 3 == 0 && i != 3)
                {
                    string git = i.ToString();
                    Console.WriteLine(i = git);
                } else if(i % 5==0 && i != 5)
                {
                    string hub = i.ToString();
                    Console.WriteLine(i = hub);
                }
                Console.WriteLine(i);
            }
        }
    }
}
