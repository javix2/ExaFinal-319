using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace factorial
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            int n = Int32.Parse(TextBox1.Text);
            ClassLibrary1.Class1 c = new ClassLibrary1.Class1();
            String r = c.factorial(n);
            Label1.Text = r;
        }
    }
}