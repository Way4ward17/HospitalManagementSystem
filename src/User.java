/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WAY4WARD
 */
class User {
    private int no;
    private String Pname,Number,Date,Time,Disease,Gender;
    
    public User(int no,String Pname,String Number,String Date,String Time,String Disease,String Gender)
    {
        this.no=no;
        this.Pname=Pname;
        this.Number = Number;
        this.Date=Date;
        this.Time=Time;
        this.Disease=Disease;
        this.Gender=Gender;
    }       
     public int getno(){
     return no;
    }
     public String getPname(){
     return Pname;
    }       
    public String getNumber(){
     return Number;
    }       
public String getDate(){
     return Date;
    }       
public String getTime(){
     return Time;
    }       
public String getDisease(){
     return Disease;
    }       
public String getGender(){
     return Gender;
    }
}