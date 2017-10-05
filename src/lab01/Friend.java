/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

import java.util.Date;

/**
 *
 * @author Om
 */
public class Friend {
    
    Date birthday;
    
    String favoriteMovie;
    
    public Friend(Date d, String mov){
    this.birthday = d;
    this.favoriteMovie = mov;
    }
    
    public Date getBirthday()
    {
        return birthday;
    }
    
    public String getFavoriteMovie()
    {
        return favoriteMovie;
    }
    
    public void setBirthday(Date d )
    {
        birthday = d;
    }
    
    public void setFavoriteMovie(String mov)
    {
        favoriteMovie = mov;
    }
    
     @Override
    public String toString() {
        return super.toString() + "Birthday= " + birthday + ", FavoriteMovie= " + favoriteMovie ;
    }
    
    public boolean equals(Object o)
    {
     if (!(o instanceof Friend))
         return false;
     Friend f = (Friend)o;
     return super.equals(o) && birthday.equals(f.birthday)&& favoriteMovie.equals(f.favoriteMovie);
    }   
    
}
