/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageBoard.model;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author sarahbroat
 */
public class Post {
    private String postTitle;
    private String postText;

    
    // constructor
    public Post(String postTitle, String postText) {
        this.postTitle = postTitle;
        this.postText = postText;
    }
    
    // logger
    private static final Logger LOG = Logger.getLogger(Post.class.getName());

    Post() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // getters and setters
    public String getPostTitle() {
        return postTitle;
    }
    
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostText() {
        return postText;
    }
    
    public void setPostText(String postText) {
    this.postText = postText;
    }
    
    // toString
     @Override
    public String toString() {
        return "Post{" + "postTitle=" + postTitle + ", postText=" + postText + '}';
    }
    
    public void loadFromFileString(String str) {
            // TODO: Validation should be done here
            String[] parts = str.split(",");

 
            postTitle = parts[0];
            postText = parts[1];
    }
    
    // hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.postTitle);
        hash = 19 * hash + Objects.hashCode(this.postText);
        return hash;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Post other = (Post) obj;
        if (!Objects.equals(this.postTitle, other.postTitle)) {
            return false;
        }
        return Objects.equals(this.postText, other.postText);
    }

    String toFileString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
