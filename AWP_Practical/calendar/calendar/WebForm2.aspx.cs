using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace calendar
{
    public partial class WebForm2 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
        }
        protected void Calendar1_SelectionChanged(object sender, EventArgs e)
        {
        }
        protected void Calendar1_DayRender(object sender, DayRenderEventArgs e)
        {
            {
                if ((e.Day.Date >= new DateTime(2021, 09, 10)) && (e.Day.Date <= new DateTime(2021, 09, 15)))
                {
                    e.Cell.BackColor = System.Drawing.Color.Blue;
                    e.Cell.BorderColor = System.Drawing.Color.Black;
                    e.Cell.BorderWidth = new Unit(3);
                }
            }
        }
    }
}