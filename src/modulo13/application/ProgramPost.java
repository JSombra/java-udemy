package modulo13.application;

import modulo13.entities.Comment;
import modulo13.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ProgramPost {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);

        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        Comment c1 = new Comment("Have nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        post1.addComment(c1);//Posso adicionar tanto assim a lista
        post1.addComment(c2);

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        post2.addComment(new Comment("Good night")); //quanto instanciar direto para a lista
        post2.addComment(new Comment("May the Force be with you"));


        System.out.println(post1);
        System.out.println(post2);

        sc.close();
    }
}
