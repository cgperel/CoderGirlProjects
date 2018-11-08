import static java.lang.System.out;
import java.util.Scanner;

public class Entertainment {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
// could use booleans but need to get them to enter in weather first and then state booleans after they enter in weather
        out.println("What is the weather like today? Answer: sunny, cloudy or rainy.");
        String weather = keyboard.next();

        out.println("What kind of mood are you in for activities? Answer: exercise, party or quiet.");
        String mood = keyboard.next();

        if (weather.equals("sunny") && mood.equals("exercise")) {
            out.println("For exercise on a sunny day, try a brisk walk in a natural preserve.");
        }
        else if (weather.equals("sunny") && mood.equals("party")) {
            out.print("For a fun party on a sunny day, look for a street festival.");
        }
        else if (weather.equals("sunny") && mood.equals("quiet")) {
            out.print("A sunny day is a beautiful time to sit under a tree and read a book.");
        }
        else if (weather.equals("cloudy") && mood.equals("exercise")) {
            out.print("For exercise on a cloudy day, the botanical gardens are a lovely walk.");
        }
        else if (weather.equals("cloudy") && mood.equals("party")) {
            out.print("For a fun party on a cloudy day, ride the paddle boats at the park.");
        }
        else if (weather.equals("cloudy") && mood.equals("quiet")) {
            out.print("On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
        }
        else if (weather.equals("rainy") && mood.equals("exercise")) {
            out.print("Giant indoor trampolines are a fun place to exercise on a rainy day.");
        }
        else if (weather.equals("rainy") && mood.equals("party")) {
            out.print("See if your friends are playing board gmaes to pass a rainy day.");
        }
        else if (weather.equals("rainy") && mood.equals("quiet")) {
            out.print("A rainy day is a peaceful time to journal and daydream.");
        }
        else {
            if (weather.equals("rainy") || weather.equals("sunny") || weather.equals("cloudy")) {
                out.println("Error: Your mood wasn't one of the choices.");}
            else if (mood.equals("exercise") || mood.equals("party") || mood.equals("quiet")) {
                out.println("Error: Your weather wasn't one of the choice."); }
            else {
                out.println("Error: Your mood and weather were not available choices.");
            }
            }
        }
    }
