let transactions:number[]=[50000,-2000,3000, -15000,-200,-300, 4000 ,-3000];

let creditedAmount=0;
let debitedAmount=0;
let totalCreditedAmount=0;
let totalDebitedAmount=0;
let suspeciousTransaction=0;

//Getting the each transaction through the loop
for(let amount of transactions ){
     
     if(amount>0){
        creditedAmount++;
        totalCreditedAmount+=amount;
     }else if(amount<0){
        debitedAmount++;
        totalDebitedAmount+=amount;
     }

     //Suspecious Transaction between 10000 to -10000
     if(amount> 10000 || amount < -10000){
      console.log("Suspecious Transaction  :" + amount);
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



