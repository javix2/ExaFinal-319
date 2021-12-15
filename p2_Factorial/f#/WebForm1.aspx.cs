using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebFactorial
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            int n = Int32.Parse(TextBox1.Text);
            int c;
            c = Library1.miModulos.factorial(n);
            TextBox2.Text = c.ToString();
        }
    }
}