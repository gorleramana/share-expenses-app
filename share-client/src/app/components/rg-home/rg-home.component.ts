import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-rg-home',
  templateUrl: './rg-home.component.html',
  styleUrl: './rg-home.component.css'
})
export class RgHomeComponent {

  person:string ='';
  constructor(){
    
  }

  addPerson(person:string){
    alert('in progreess'+person);
  }
}
