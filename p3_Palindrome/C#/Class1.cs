using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibrary2
{
    public class Class1
    {
        public String palindrome(String pal)
        {
            String res,rev = "";
            for (int i = pal.Length-1; i >= 0; i--)
            {
                String car = pal.Substring(i,1);
                rev = rev + car;
            }

            if (rev == pal) { res = "es palindrome"; }
            else {res = "no es palindrome"; }
            return res;
            
        }
    }
}
