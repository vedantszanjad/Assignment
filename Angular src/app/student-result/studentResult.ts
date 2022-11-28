export class studentResult{

    studentId!:number;
    studentName!:String;
    marks!:number;

    constructor(id:number,name:string,marks:number)
    {
        this.studentId=id;
        this.studentName=name;
        this.marks=marks;
    }
}