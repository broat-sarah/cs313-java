/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageBoard.model;

import java.util.List;

/**
 *
 * @author sarahbroat
 */
public interface PostDataHandler {

    /**
     *
     * @param postTitle
     * @param postText
     * @return
     */
    public List<Post> getNewPost(String postTitle, String postText);
}
