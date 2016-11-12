/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageBoard.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sarahbroat
 */
public class FilePostHandler implements PostDataHandler{
private String fileName;

     public FilePostHandler(String fileName) { 
          this.fileName = fileName;
     }

     public String getFileName() {
          return fileName;
     }

     public void setFileName(String fileName) {
          this.fileName = fileName;
     }
 
     public void addPost(Post post) {
          try {
              try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true))) {
                  writer.write(post.toFileString() + "\n");
              } 

          } catch (IOException e) { 
          }
     }

    /**
     *
     * @return
     */


    @Override
    public List<Post> getNewPost(String postTitle, String postText) {
        List<Post> list = new ArrayList<>();

          try {
               BufferedReader reader = new BufferedReader(new FileReader(getFileName()));

               String line;

               while ((line = reader.readLine()) != null) {
                    Post post = new Post();
                    post.loadFromFileString(line);
                    list.add(post);
               }

          } catch (IOException e) { 
          }

          return list;
     }
    }
