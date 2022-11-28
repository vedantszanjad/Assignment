import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-names',
  templateUrl: './user-names.component.html',
  styleUrls: ['./user-names.component.css']
})
export class UserNamesComponent implements OnInit {

  names ="";
  list: String[] = [];


  constructor() { }

  ngOnInit(): void {
  
  }
  
  change()
  {
    this.list=this.names.split(',');
  }

}
