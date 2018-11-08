public class FizzAnotherWay { //FAMOUs problem- need to solve problem on interview
    public static void main(String[] args){
        int count = 1; //decleration
        for(int i = 1; i <=100; i++){//declare loop variable- alot of time its an int- i is common name for loop variable
        //while( count <= 100) { //condition
                    if (count % 3 == 0 && count % 5 == 0){
                        System.out.println("fizzbuzz");
                    } else if(count % 5 == 0){
                            System.out.println("buzz");
                    } else if(count % 3 == 0) {
                        System.out.println("fizz");
                    } else {
                        System.out.println(count);
                    }
                    count++;//modifier
                }
    }
}

//for has same parts of while loop just in different places
//in some pal

