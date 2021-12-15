using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary1
{
    public class Class1
    {
        public String fibonaci(int n) {
            int a = 0;
            int b = 1;
            int f = 0;
            String r = "";
            for (int i = 1; i <= n; i++)
            {
                f = a + b;
                b = a;
                a = f;
                r = r + f.ToString() + ", ";
            }
            return r;
        }
    }
}
