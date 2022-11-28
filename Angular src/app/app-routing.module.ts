import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ItemDetailsComponent } from './item-details/item-details.component';
import { StudentResultComponent } from './student-result/student-result.component';
import { UserNamesComponent } from './user-names/user-names.component';
import { UserRegistrationComponent } from './user-registration/user-registration.component';

const routes: Routes = [
  { path :'userNames',component:UserNamesComponent},
  { path :'item',component:ItemDetailsComponent},
  { path: 'studentResult', component:StudentResultComponent},
  {path :'userRegistration',component:UserRegistrationComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const routingComponents = [
    StudentResultComponent,
    UserNamesComponent,ItemDetailsComponent,UserRegistrationComponent
]
