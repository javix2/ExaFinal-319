using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace palindrome
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            String n = TextBox1.Text;
            ClassLibrary2.Class1 c = new ClassLibrary2.Class1();
            String r = c.palindrome(n);
            Label1.Text = r;
        }
    }
}