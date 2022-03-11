import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'secondapp';
  fname:string="prince";
  lname:string="kumar";
  flag:boolean=false;
  show()
  {
    this.flag=!this.flag;
  }
red:string="red";
  products=[
    {name:"pencil","available":"08-03-2022",price:10.23,rating:4.5},
    {name:"Eraser","available":"06-03-2022",price:3.89,rating:4.3},
    {name:"Scale","available":"02-03-2022",price:36.90,rating:4.0},
    {name:"Pen","available":"08-02-2022",price:5.00,rating:3.5},
  
  ]
}
