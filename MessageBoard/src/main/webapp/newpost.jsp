<%-- 
    Document   : newpost
    Created on : Nov 12, 2016, 1:22:34 PM
    Author     : sarahbroat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Post</title>
    </head>
    <body>
        <h1>Add New Post</h1>
        <form method="POST" action="NewPost">
            Post Title: <input type="text" name="postTitle" /><br />
            Post Text: <textarea cols="40" rows="5" name="postText"></textarea><br />
            <br />
            <input type="submit" value="Submit" />
       </form>
    </body>
</html>
