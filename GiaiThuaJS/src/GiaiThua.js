var factorial = function (n) {
    if (n == 0){
        return 1;
    }else {
        return n * factorial(n-1);
    }
}

var number = prompt("What number do you want to find the factorial of?");
document.write(factorial(number));