<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="gridview.WebForm1" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head runat="server">
        <title></title>
    </head>
    <body>
        <form id="form1" runat="server">
            <div></div>
            <asp:GridView ID="GridView1" runat="server" AllowPaging="True" AutoGenerateColumns="False"
                DataKeyNames="Rollno" DataSourceID="SqlDataSource1">
                <Columns>
                    <asp:CommandField ShowEditButton="True" />
                    <asp:BoundField DataField="Rollno" HeaderText="Rollno" ReadOnly="True" SortExpression="Rollno" />
                    <asp:BoundField DataField="Name" HeaderText="Name" SortExpression="Name" />
                    <asp:BoundField DataField="Class" HeaderText="Class" SortExpression="Class" />
                    <asp:BoundField DataField="Phone" HeaderText="Phone" SortExpression="Phone" />
                    <asp:BoundField DataField="Email" HeaderText="Email" SortExpression="Email" />
                </Columns>
            </asp:GridView>
            <asp:SqlDataSource ID="SqlDataSource1" runat="server" ConnectionString="<%$ ConnectionStrings:ConnectionString %>" DeleteCommand="DELETE FROM [demo] WHERE [Rollno] = @Rollno"
                InsertCommand="INSERT INTO [demo] ([Rollno], [Name], [Class], [Phone], [Email]) VALUES (@Rollno, 
@Name, @Class, @Phone, @Email)" SelectCommand="SELECT * FROM [demo]" UpdateCommand="UPDATE 
[demo] SET [Name] = @Name, [Class] = @Class, [Phone] = @Phone, [Email] = @Email WHERE [Rollno] = 
@Rollno">
                <DeleteParameters>
                    <asp:Parameter Name="Rollno" Type="Int32" />
                </DeleteParameters>
                <InsertParameters>
                    <asp:Parameter Name="Rollno" Type="Int32" />
                    <asp:Parameter Name="Name" Type="String" />
                    <asp:Parameter Name="Class" Type="String" />
                    <asp:Parameter Name="Phone" Type="Int32" />
                    <asp:Parameter Name="Email" Type="String" />
                </InsertParameters>
                <UpdateParameters>
                    <asp:Parameter Name="Name" Type="String" />
                    <asp:Parameter Name="Class" Type="String" />
                    <asp:Parameter Name="Phone" Type="Int32" />
                    <asp:Parameter Name="Email" Type="String" />
                    <asp:Parameter Name="Rollno" Type="Int32" />
                </UpdateParameters>
            </asp:SqlDataSource>
        </form>
    </body>
</html>
