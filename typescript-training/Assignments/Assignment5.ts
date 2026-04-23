//Defining the structure of employee data
interface empData{
    name:string,
    salary:number,
    experience:number,
    rating:number
}

//Employee data set
let empDetails:empData[]=[

     {name:"Alice Johnson",salary:75000.0,experience:5.1,rating:4.2},
     {name:"Bob Smith",salary:68000.0,experience:3.2,rating:3.8},
     {name:"Carol Brown",salary:82000.0,experience:7.1,rating:4.5},
     {name:"David Brown",salary:90000.0,experience:10.2,rating:2.5},
     {name:"Eva Green",salary:60000.0,experience:2.4,rating:3.5}


];

//Map for storing the emp name and percentage
let hikeMap:Map<string,number>=new Map();

//Loop throgh each employee details
for(let emp of empDetails ){

    let variable=0;
    let bonus=0;

    //Determine hike percentage and bonus based on rating
    if(emp.rating>=4){
        variable=0.15;
        bonus=1500;
    }else if(emp.rating>=3 && emp.rating<4){
        variable=0.10;
        bonus=1200;
    }else{
        variable=0.03;
        bonus=300;
    }

    //Reward for more than 5 years of experience
    let reward=emp.experience>5 ? 5000 :0;

    //Total hike
    let hike = (emp.salary *variable)+bonus+reward;

    //convert hike amount into percentage of salary
    let hikePercentage=hike/emp.salary;
     
    //store result in map
    hikeMap.set(emp.name ,hikePercentage);

}

//print each employee's hike percentage
for(let [name,percent] of hikeMap){
     console.log(name, percent);
}




