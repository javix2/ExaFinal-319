using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebFibonaci
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            int n = Int32.Parse(TextBox1.Text);
            String c = "";
            ClassLibrary1.Class1 c1 = new ClassLibrary1.Class1();
            c = c1.fibonaci(n);
            TextBox2.Text = c;

        }
    }
}