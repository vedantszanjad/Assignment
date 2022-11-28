import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators,FormGroup } from '@angular/forms';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent implements OnInit {
  // registrationForm: FormGroup | undefined;
  // registrationForm= new FormGroup({

  //   userName: new FormControl(''),
  //   password: new FormControl(''),
  //   emailId: new FormControl(''),
  //   mobileNo: new FormControl(''),
  //   city: new FormControl('')   

  // });

  registrationForm=this.formBuilder.group({
    userName:["",[Validators.required]],/* Validators.minLength(2)*/
    password:['',[Validators.required]],
    emailId:['',[Validators.required]],
    mobileNo:[''],
    city:['']
  }); 

  get formError()
  {
    return this.registrationForm.controls;
  }


  constructor(private formBuilder: FormBuilder) {
   

   }

  ngOnInit(): void {
  }

}
