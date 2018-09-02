<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
    box-sizing: border-box;
}

/* Style the body */
body {
    font-family: Arial, Helvetica, sans-serif;
    margin: 0;
}

/* Header/logo Title */
.header {
    padding: 20px;
    text-align: center;
    height:150px;
    color: Black;
    background-image : linear-gradient(#A9A9A9,#808080);

} 


.header a.logo {

 font-size: 25px; 
 font-weight: bold; 
 width: 170px; 
 height: 38px; 
 background-image: url(../img/logo.svg);

}  
/* Increase the font size of the heading */
.header h1 {
    font-size: 40px;
    color: 	#0070ad;
}

/* Style the top navigation bar */


/* Style the navigation bar links */



/* Main column */
.main {   
    -ms-flex: 70%; /* IE10 */
    flex: 70%;
    background-color: white;
    padding: 20px;
}



/* Responsive layout - when the screen is less than 700px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 700px) {
    .row {   
        flex-direction: column;
    }
}


</style>
</head>

<body>

<div class="header">
<table width=100%>
   <tr>
   <td align = "left"><a href="https://www.capgemini.com/"><img src = "../img/logo.svg" ></a> </td>
  <td align="right"><a href="localhost:9063"><img src = "../img/CAPSTORE.png" ></a> </td>
  </tr>
 </table>
</div>


</body>
</html>
