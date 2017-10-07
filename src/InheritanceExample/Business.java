/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceExample;

/**
 *
 * @author Om
 */
public class Business extends Contact{
    
    private String title;
    private String BusinessName; 
    
    public Business(String X, String address, String phone, String title, String BusinessName)
    {
        super(X, address, phone);
        this.title= title;
        this.BusinessName = BusinessName;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getBusinessName()
    {
        return BusinessName;
    }
    
    public void setTitle(String t)
    {
        title=t;
    }
    
    public void setBusinessName(String bn)
    {
        BusinessName=bn;
    }

    @Override
    public String toString() {
        return super.toString() + "title=" + title + ", BusinessName=" + BusinessName ;
    }
    
    public boolean equals(Object o)
    {
     if (!(o instanceof Business))
         return false;
     Business b = (Business)o;
     return super.equals(o) && title.equals(b.title)&& BusinessName.equals(b.BusinessName);
    }    
}
