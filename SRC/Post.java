public class Post {
    private User user;
    private int number;
    private static int nextNumber = 1;
    private String contents;
    private String url;

    public Post(User user, String contents, String url){
        this.user = user;
        this.number = nextNumber;
        nextNumber++;
        this.contents=contents;
        this.url = url;
    }

    public String getPost(){
        return "\n"+"#"+ number+ "\nUser's name: "+user.getName()+"\nBlog Post: " + contents +"\nLink to post sources: " +url;
    }

    public String toString(){
        return this.user + "\n"+ number + "\n" + this.contents + "\n" + this.url;
    }

    public static void main(String[] args){
        User Sally = new User ("www.pic.com","Sally1", "Sally Jones", "sallyjones@gmail.com");
        User Nick = new User ("www.avatar.com", "nick1","Nick","nick@gmail.com");
        Post sallyPost = new Post (Sally, "hi","www.hi.com");
        Post nickPost = new Post (Nick, "hello", "www.hello.com");
        System.out.println (sallyPost+"\n");
        System.out.println (nickPost);
    }
}
