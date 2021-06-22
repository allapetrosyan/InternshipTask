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
        Movie movie2 = new Movie("Whale Rider", 16); //this is for test
        Movie movie3 = new Movie("The Longest Day", random.nextInt(10) + 1);
        Movie movie4 = new Movie("A Clockwork Orange", random.nextInt(10) + 1);
        Movie movie5 = new Movie("Anne", random.nextInt(10) + 1);

        List<Cinema> cinemaList = new ArrayList<>();
        cinemaList.add(cartoon1);
        cinemaList.add(cartoon2);
        cinemaList.add(cartoon3);
        cinemaList.add(cartoon4);
        cinemaList.add(cartoon5);
        cinemaList.add(cartoon6);
        cinemaList.add(movie1);
        cinemaList.add(movie2);
        cinemaList.add(movie3);
        cinemaList.add(movie4);
        cinemaList.add(movie5);

        int currentRating = 0;
        int highRatingIndex = 0;
        for (int i = 0;i<cinemaList.size();i++){
            Cinema currentCinema = cinemaList.get(i);
            if (currentCinema instanceof Movie) {
                if (currentCinema.rating > currentRating){
                    currentRating = currentCinema.rating;
                    highRatingIndex = i;
                }
            }
        }

        System.out.println("The highest rated movie title is - " + cinemaList.get(highRatingIndex).title);
    }
}
