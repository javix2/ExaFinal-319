using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Webfibonaci2
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            int n = Int32.Parse(TextBox1.Text);
            String res="";
            for (int i = 1; i <= n; i++){
                res = res + (Library1.miModulo.fiboRec(i)).ToString()+",";
            }
            TextBox2.Text =res;
        }
    }
}