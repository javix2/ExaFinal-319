using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary1
{
    public class Class1
    {
        public String  factorial(int n)
        {
            int i = 2, fac = 1;
            String m = "1*";
            while (i <= n)
            {
                fac *= i;
                m += i+"*";
                i++;
            }
         
            return (m+" = "+fac);
        }
    }
}
