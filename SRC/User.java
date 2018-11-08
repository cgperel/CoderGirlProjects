import java.util.ArrayList;
public class User{
    private String avatarUrl;
    private String username;
    private String name;
    private String email;
    private ArrayList<Post>posts;//this is just keeping one users posts together
    private String postContent;

    public User(String avatarUrl, String username, String name, String email){
        this.avatarUrl = avatarUrl;
        this.username = username;
        this.name = name;
        this.email = email;
        this.posts=new ArrayList<> ();
        this.postContent=postContent;
    }

    public ArrayList<Post> addPost(Post p)
    {
        posts.add (p);
        return posts;
    }
    public ArrayList getPostList(){return posts;}

    public Post getLastPost(){
        return posts.get (posts.size()-1);
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args){
        User Sally = new User ("www.hi.com","Sally1", "Sally Jones", "sallyjones@gmail.com");
        User Nick = new User ("www.hello.com", "nick1","Nick","nick@gmail.com");
        System.out.println (Sally);
        System.out.println (Nick);
    }
    public String toString(){//this is so you can print out objects or you can create getters, don;t need to call the method because it's automatic
        return this.name + "\n"+ this.avatarUrl + "\n" + this.username + "\n" + this.email;
    }
}