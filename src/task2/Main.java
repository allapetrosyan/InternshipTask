package task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Cartoon cartoon1 = new Cartoon("The Simpsons", random.nextInt(10) + 1);
        Cartoon cartoon2 = new Cartoon("Naruto", random.nextInt(10) + 1);
        Cartoon cartoon3 = new Cartoon("Little Bear", random.nextInt(10) + 1);
        Cartoon cartoon4 = new Cartoon("Speed Racer", random.nextInt(10) + 1);
        Cartoon cartoon5 = new Cartoon("Dragon Tales", random.nextInt(10) + 1);
        Cartoon cartoon6 = new Cartoon("Timon & Pumba", random.nextInt(10) + 1);

        Movie movie1 = new Movie("Kill Bill", random.nextInt(10) + 1);
        Movie movie2 = new Movie("Whale Rider", random.nextInt(10) + 1);
        Movie movie3 = new Movie("The Longest Day", random.nextInt(10) + 1);
        Movie movie4 = new Movie("A Clockwork Orange", random.nextInt(10) + 1);
        Movie movie5 = new Movie("Anne", random.nextInt(10) + 1);

        List a = new ArrayList<Cinema>();
        a.add(cartoon1);
        a.add(cartoon2);
        a.add(cartoon3);
        a.add(cartoon4);
        a.add(cartoon5);
        a.add(cartoon6);
        a.add(movie1);
        a.add(movie2);
        a.add(movie3);
        a.add(movie4);
        a.add(movie5);

        int maxRating = 1;
        Movie movie = new Movie(" ", maxRating);
        Iterator<Cinema> itr = a.iterator();
        while (itr.hasNext()) {
            Cinema next = itr.next();
            if (next instanceof Movie) {
                Movie myMove = (Movie) next;
                if (myMove.rating > movie.rating) {
                    movie.rating = myMove.rating;
                    movie.title = myMove.title;
                }
            }
        }
        System.out.println("The highest rated movie title is - " + movie.title);
    }
}
