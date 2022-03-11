import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  //template:'<h1>Helloo World</h1>',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm:FormGroup;
  submitted:boolean=false;
  constructor(private builder:FormBuilder) { }

  ngOnInit(): void {

    this.registerForm= this.builder.group({
      firstName:["",Validators.required]
    })
  }
  