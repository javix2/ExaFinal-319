using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary2
{
    public class Class1
    {
        public String fibonaci4(int n)
        {
            int a = 0, b = -1, c = 1, d = 0, f = 0;
            String r = "";
            for (int i = 1; i <= n; i++)
            {
                f = a + b + c + d;
                a = b;
                b = c;
                c = d;
                d = f;
                r += f + ", ";
            }
            return r;
        }
    }
}
