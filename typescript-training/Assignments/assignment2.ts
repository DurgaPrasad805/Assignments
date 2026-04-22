function LoanEligibityOfPerson(customerName:string,creditScore:number,income:number,isEmployed:boolean,debtToIncomeRatio:number):void{
    
    if(creditScore>=750){
        console.log(`${customerName} is eligible for loan`); 
    }else if(creditScore<750 && creditScore>=650){
        if(income==55000.0){
            console.log("need to verify you are weather employed or not ");
            if(isEmployed){
                console.log(`we need to check debt to income ratio`);
                if(debtToIncomeRatio<=40.0){
                    console.log(`${customerName} is Eligible for loan`)
                }else{
                    console.log(`${customerName} is Not eligible due to more debt to income ratio`);
                }
            }else{
                console.log(`${customerName} is not eligible because of unemployed`);
            }
        }else{
            console.log(` ${customerName} is not eligible for loan because for low income`);
        }
    }else{
        console.log(`${customerName} is not eligible for loan because low creditscore`);
    }

}
 LoanEligibityOfPerson("prasad",670,55000.0,true,35.0);



    




