//Common function for Prime Number
function primeNumberCheck(inputNumber:number):void{
let count:number=0;

//loop through the input numbers
for(let i=1;i<=inputNumber;i++){
    if(inputNumber%i===0)
    count++;
}

//Checking the number counts 
if(count==2){
  console.log("prime number"); //print prime
}else{
  console.log("Not a prime number");//Not a prime number
}
}
primeNumberCheck(1);




