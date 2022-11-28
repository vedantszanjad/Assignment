import { Component, OnInit } from '@angular/core';
import { studentResult } from './studentResult';

@Component({
  selector: 'app-student-result',
  templateUrl: './student-result.component.html',
  styleUrls: ['./student-result.component.css']
})
export class StudentResultComponent implements OnInit {

  public results:studentResult[]=[
    new studentResult(1,"Hrushikesh",78),
    new studentResult(2,"Vedant",29),
    new studentResult(3,"Abhay",59),
    new studentResult(4,"Vishal",70),
    new studentResult(5,"Shree",46),
  ];
  constructor() { }

  ngOnInit(): void {
  }

}
