<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="">

<head>
    <meta charset="UTF-8">
    <title>CreditCard-Home Page </title>

</head>
    <style>
        body {
    background-color: skyblue;

}

form {
    border: solid 0px;
    height: 1000px;
    margin-left: 25%;
    margin-right: 25%;
    margin-top: 10%;
    text-align: center;
}


#one{
    border: solid 0px;
    height: 400px;
    background-color:gainsboro;
    box-shadow: 5px 10px 18px black;
}
#panNo{
    width: 300px;
    height:40px; 
    padding-left: 10px; 
    font-size: 20px;
    border-radius: 8px;
    border-color: cornflowerblue;
}
.button {
    background-color: lawngreen;
    border: none;
    color: white;
    text-align: center;
    text-decoration: none;
    transition-duration: 0.4s;
    cursor: pointer;
}

.button1 {
    background-color: white;
    color: black;
    border: 2px solid green;
}

.button1:hover {
    background-color:forestgreen;
    color: white;
}

    </style>

<body>
   <form action="checkEligibility">
        <div id="one">
        <h1 style="font-size: 50px; color: black;padding-top: 40px">
            Check for Credit Card Eligibility
        </h1><br>
        <label style="font-size:30px">Enter PAN Number:</label><input type="text" name="t1" id="panNo" pattern="[A-Za-z]{5}\d{4}[A-Za-z]{1}" title="10 character alpha numeric" required autofocus><br><br><br>
        <input class="button button1" type="Submit" value="Check" id="submit"  style="height: 35px;width: 150px; font-size: 25px">
</div>
    </form>

</body>

</html>