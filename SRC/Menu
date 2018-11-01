import java.util.ArrayList;
import java.util.Scanner;
public class Menu {

    public User currentUser;
    public ArrayList<User> usersList = new ArrayList<User> ( );
    public String name;
    public int postCount = 0;
    public int existingUser=0;

    public void displayMenu(String name) {
        System.out.println ("Main Menu");
        System.out.println ("1)Create a new user \n2)Become an existing user\n3)Create a post as the current user\n4)" +
                "Print all posts\n5)Print all users");
        chooseMenuOption ( );
    }

    public void newUser() {
        System.out.println ("What is your avatar url?");
        Scanner keyboard = new Scanner (System.in);
        String avatarUrl = keyboard.nextLine ( );
        System.out.println ("What is your username?");
        String username = keyboard.nextLine ( );
        System.out.println ("What is your name?");
        String name = keyboard.nextLine ( );
        System.out.println ("What is your email address?");
        String email = keyboard.nextLine ( );
        currentUser = new User (avatarUrl, username, name, email);
        usersList.add (currentUser);
        System.out.println ("Welcome " + name + "! Your username is " + username + ". Your email is " + email + ". Your avatar url is " + avatarUrl);
    }

    public void getExistingUser() {
        existingUser++;
        printUsers ();
        Scanner keyboard = new Scanner (System.in);
        existingUser = keyboard.nextInt ( );
        User currentUser = (User) usersList.get (existingUser - 1);
        System.out.println("You are now logged in as "+currentUser.getName ());
    }

    public void newPost(User currentUser){
       if (postCount>=1){System.out.println ("Your last post was:"+ currentUser.getLastPost().getPost ()+"\n");}
       System.out.println ("Please type your new post.");
       Scanner keyboard = new Scanner (System.in);
       String newPostContent = keyboard.nextLine ();
       System.out.println ("Please enter url. Press enter again if no url.");
       String urlForPost=keyboard.nextLine ();
       Post newPost = new Post (currentUser,newPostContent,urlForPost);
       currentUser.addPost (newPost);
       postCount++;
   }

   public void printPosts()
   {
       for(int count = 0; count < usersList.size(); count++) {
           currentUser = usersList.get(count);
           ArrayList newPostsList = currentUser.getPostList();
           for (int i = 0; i < newPostsList.size(); i++) {
               Post postToPrint = (Post) newPostsList.get(i);
               System.out.println(postToPrint.getPost()+"\n");
           }
       }
   }

   public void printUsers(){
       for (int count = 0; count < usersList.size ();count++) {
        int numbering=count;
        currentUser = usersList.get(count);
        System.out.print (numbering+1);
        System.out.print (". ");
        System.out.println (currentUser.getName ());
    }
   }

    public void chooseMenuOption()
    {int optionMenu;
        do {
            System.out.println ("Please enter menu option 1-5. Enter 9 to exit.");
            if (usersList.size ()>=1){
              //  System.out.println ("You are currently logged in as " + currentUser.getName () + ".");
            }
            Scanner keyboard = new Scanner (System.in);
            optionMenu = keyboard.nextInt ();
            keyboard.skip ("\n");
            if (optionMenu == 1){
                newUser();//current user
            } else if (usersList.size ()== 0) {
                System.out.println ("No users found. Please create a new user");
            } else if(optionMenu==2){
                getExistingUser ();//name
            }else if (optionMenu==3 && existingUser==0){
                System.out.println ("You are not logged in yet. Please become an existing user.");
            }else if (optionMenu==3  && existingUser>=0){//display last post by user and then ask for next post
                newPost (currentUser);//current user, 0
            }else if(optionMenu==4 && postCount ==0){
                System.out.println ("No posts yet. Please create a post.");
            }else if(optionMenu==4 && postCount>=0){
                printPosts ();
            } else if(optionMenu==5){
                printUsers ();
            }
        }
        while (optionMenu!=9);
    }

    public static void main(String[] args){
        String name="";
        Menu displayMenu = new Menu ();//instance of class
        displayMenu.displayMenu (name);
    }
}
