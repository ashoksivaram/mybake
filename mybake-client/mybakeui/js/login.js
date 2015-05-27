
function validateLoginInfo() {
    var x = document.forms["login"]["username"].value;
    if (x == null || x == "") {
        alert("Please enter the name.");
        return false;
    }
    
    var y = document.forms["login"]["password"].value;
    if (y == null || y == "") {
        alert("Please enter the password.");
        return false;
    }
}