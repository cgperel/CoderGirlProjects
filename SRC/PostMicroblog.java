public class PostMicroblog {

    private int id;
    private String postContent;
    private String webLink;
    private String username;

    public PostMicroblog(int id, String postContent, String webLink, String username)
    {
        this.id = id;
        this.postContent= postContent;
        this.webLink = webLink;
        this.username = username;
    }

}
