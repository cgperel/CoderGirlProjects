public class UserMicroblog {
    private int id;
    private int nextid;
    private String name;
    private String linkToPicture;
    private String username;
    private String firstAndLastName;
    private String emailAddress;

    public UserMicroblog(int id, String name, String linkToPicture, String username, String firstAndLastName, String emailAddress) {
        this.id = id;
        this.name = name;
        this.linkToPicture = linkToPicture;
        this.username = username;
        this.firstAndLastName = firstAndLastName;
        this.emailAddress = emailAddress;
    }
}


/*public class MyClass {
    private int id;
    //private int nextid;
    private String name;
    private String postContent;
    private String webLink;
    private String linkToPicture;
    private String username;
    private String firstAndLastName;
    private String emailAddress;

    public MyClass(int id, String name, String postContent, String webLink, String linkToPicture, String username, String firstAndLastName, String emailAddress)
    {
        this.id = id;
        this.name = name;
        this.postContent= postContent;
        this.webLink = webLink;
        this.linkToPicture = linkToPicture;
        this.username = username;
        this.firstAndLastName = firstAndLastName;
        this.emailAddress = emailAddress;
    }
*/