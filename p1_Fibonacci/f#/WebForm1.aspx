<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="Webfibonaci2.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        <div style="margin-left: 160px">
            <asp:Label ID="Label1" runat="server" Text="SERIE FIBONACI F#"></asp:Label>
        </div>
        <p>
            <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Generar" />
            <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        </p>
        <asp:TextBox ID="TextBox2" runat="server" Width="517px"></asp:TextBox>
    </form>
</body>
</html>
