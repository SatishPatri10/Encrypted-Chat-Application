/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.or.register;

/**
 *
 * @author Sunil
 */
    public class Ban {
    public static String UserName;
    public static String Address;
    public static String EmailId;
    public static String PhoneNo;
    public static String Password;
    public static String RetypePass;
    
    
    public static String getUserName()
    {
      return UserName;
     }
    public static void setUserName(String name)
    {
     UserName=name;
     }
    
    
    public static String getAddress(){
        return Address;     
    }
    public static void setAddress(String add){
        Address=add;
    }
    
     public static String getEmailId()
    {
      return EmailId;
     }
    public static void setEmailId(String email)
    {
     EmailId=email;
     }
    
     public static String getPhoneNo()
    {
      return PhoneNo;
     }
    public static void setPhoneNo(String number)
    {
     PhoneNo=number;
     }
    
     public static String getPassword()
    {
      return Password;
     }
    public static void setPassword(String pass)
    {
     Password=pass;
     }
    
     public static String getRetypePass()
    {
      return RetypePass;
     }
    public static void setRetypePass(String repass)
    {
     RetypePass=repass;
     }
}