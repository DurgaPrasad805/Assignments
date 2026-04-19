function LoanEligibityOfPerson(custonerName:string,creditScore:number,income:number,isEmployed:boolean,debtToIncomeRatio:number):void{
    
    if(creditScore>=750){
        console.log(`${custonerName} is eligible for loan`); 
    }else if(creditScore<750 && creditScore>=650){
        if(income==55000.0){
            console.log("need to verify you are weather employed or not ");
            if(isEmployed){
                console.log(`we need to check debt to income ratio`);
                if(debtToIncomeRatio<=40.0){
                    console.log(`${custonerName} is Eligible for loan`)
                }else{
                    console.log(`${custonerName} is Not eligible due to more debt to income ratio`);
                }
            }else{
                console.log(`${custonerName} is not eligible because of unemployed`);
            }
        }else{
            console.log(` ${custonerName} is not eligible for loan because for low income`);
        }
    }else{
        console.log(`${custonerName} is not eligible for loan because low creditscore`);
    }

}
 LoanEligibityOfPerson("prasad",750,55000.0,true,35.0);



    




