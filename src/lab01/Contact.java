/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author Om
 */
 class Contact {
   private String name;
   private String address;
   private String phone;
    
    public Contact(String Y, String Address, String phone)
    {
        this.name= Y;
        this.address = Address;
        this.phone = phone;
    }
    
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return  address;
    }
    public String getphone()
    {
         return phone;
    } 
    public void setName(String s)
    {
        this.name= s;
    }
    public void setAddress(String ad)
    {
        this.address = ad;
    }
    public void setPhone(String ad)
    {
        this.phone = ad;
    }
    
    public String toString()
    {
       return getClass().getName()+ ":" + this.name + ":" + this.address + ":" + this.phone;
    }
    
    
    public boolean equals(Object o)
    {
        if(!(o instanceof Contact))
            return false;
        Contact c = (Contact)o;
        return name.equals(c.name)&& address.equals(c.address)&& phone.equals(c.phone);
    }
}
