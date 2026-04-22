let studentNames:string[]=["Suresh","Mahesh","Naresh"];
let studentMarks:number[]=[75,80,82];

let total=0;
let updatedMarks:number[]=[];

//looping through student marks 
for(let i=0; i<studentMarks.length;i++){
         let newmarks= studentMarks[i]+10;
         updatedMarks[i]=newmarks;
         total=total+newmarks;
}
let average=total/updatedMarks.length;

console.log("Updated Marks: ");
for(let i=0; i<studentNames.length;i++){
      console.log(studentNames[i] +" : "+updatedMarks[i]);
}

console.log("Average : " + average );

