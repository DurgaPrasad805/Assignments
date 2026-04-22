let transactions:number[]=[50000,-2000,3000, -15000,-200,-300, 4000 ,-3000];

let creditedAmount=0;
let debitedAmount=0;
let totalCreditedAmount=0;
let totalDebitedAmount=0;
let suspeciousTransaction=0;

//Getting the each transaction through the loop
for(let amuont of transactions ){
     
     if(amuont>0){
        creditedAmount++;
        totalCreditedAmount+=amuont;
     }else if(amuont<0){
        debitedAmount++;
        totalDebitedAmount+=amuont;
     }

     //Suspecious Transaction between 10000 to -10000
     if(amuont> 10000 || amuont < -10000){
      console.log("Suspecious Transaction  :" + amuont);
        suspeciousTransaction++;
     }
}

//Total Balance
let balance = totalCreditedAmount+totalDebitedAmount;

//Final Balabce
console.log("Final balance:" + balance);

//Total Credited Amount
console.log("Credited Amount :" + creditedAmount);

//Total Debited Amount
console.log("Debited Amount :" + debitedAmount);

//Total Credited Amount
console.log("Total Amount Credited :" + totalCreditedAmount);

//Total Debited Amount
console.log("Total Amount Debited :" + totalDebitedAmount);



