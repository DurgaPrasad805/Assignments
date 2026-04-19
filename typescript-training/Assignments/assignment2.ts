function LoanEligibityOfPerson(custonerName:string,creditScore:number,income:number,isEmployed:boolean,debtToIncomeRatio:number):void{
    if(creditScore>=750){
        console.log("customer eligible for loan"); 
    }else if(creditScore<750 && creditScore>=650){
        if(income==55000.0){
            console.log("need to verify weather employed or not ")
            if(isEmployed){
                console.log("Need to check debt to income ratio")
                if(debtToIncomeRatio<=40.0){
                    console.log("Eligible for loan")
                }else{
                    console.log("Not eligible due to more debt to income ratio")
                }
            }else{
                console.log("not eligine because of unemployed")
            }
        }else{
            console.log("not eligible for loan because for low income")
        }
    }else{
        console.log("not eligible for loan because low creditscore")
    }

}
 console.log("Prasad is " + LoanEligibityOfPerson("prasad",750,55000.0,true,35.0));



    




