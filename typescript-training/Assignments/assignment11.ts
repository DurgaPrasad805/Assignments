//printing the pyramid with numbers

//variable to print the number of rows
let n:number =5;

//for upper pyramid
for(let i=1 ; i<=n ;i++){
 
    let row="";
    
    //for row
    for(let k=1 ;k<=n-i;k++){
        row+=" ";
    }

    //for spaces
    for(let j=1 ; j<=i ; j++){
       row+=j+" ";
    }  
    //printing the upper part
    console.log(row);
}

//for lower part
for(let i=n-1;i>=1;i--){
   let row="";

   //for spaces
   for(let k=1;k<=n-i;k++){
    row+=" ";
   }

   //for numbers
   for(let j=1 ;j<=i;j++){
    row+=j+" ";
   }
   //printing the lower part 
   console.log(row);
}
