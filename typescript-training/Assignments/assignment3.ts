let studentNames:string[]=["Suresh","Mahesh","Naresh"];
let studentMarks:number[]=[75,80,82];

let total=0;
let updatedMarks:number[]=[];

//looping through student marks to get the each marks
for(let i=0; i<studentMarks.length;i++){
         let newmarks= studentMarks[i]+10;
         updatedMarks[i]=newmarks;
         total=total+newmarks;
}

//Average marks of the students
let average=total/updatedMarks.length;

//Printing the student names with updated marks after addding 10 marks
console.log("Updated Marks: ");
for(let i=0; i<studentNames.length;i++){
      console.log(studentNames[i] +" : "+updatedMarks[i]);
}

//Printing the Average marks of the students
console.log("Average : " + average );

