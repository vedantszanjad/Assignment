import { Component, OnInit } from '@angular/core';
import {Item} from './Item';
@Component({
  selector: 'app-item-details',
  templateUrl: './item-details.component.html',
  styleUrls: ['./item-details.component.css']
})
export class ItemDetailsComponent implements OnInit {

  items:Item[]=
  [
    new Item(1,'Gulabjam,',100),
    new Item(2,'Rasgulla',200),
    new Item(3,'Rasmalai',150),
    new Item(4,'Jalebi',100),
   ];
  constructor() {
  }
   

  ngOnInit(): void {
    //console.log(this.items);

    }
  

}


