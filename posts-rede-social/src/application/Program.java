package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Scanner sc = new Scanner(System.in);

        Comment comentario1 = new Comment("Have a nice trip!");
        Comment comentario2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(simpleDateFormat.parse("23/07/2024 01:30:33"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

        post1.addComment(comentario1);
        post1.addComment(comentario2);
        post1.removeComment(comentario2);

        System.out.println(post1);

        Comment comentario3 = new Comment("traveling to New Zeala");
        Comment comentario4 = new Comment("Wow that's awesome!");

        Post post2 = new Post(simpleDateFormat.parse("23/07/2024 01:30:33"), "Meu segundo post", "I'm going to visit this wonderful country!", 12);

        post2.addComment(comentario3);
        post2.addComment(comentario4);
        post2.removeComment(comentario4);

        System.out.println(post2);

        sc.close();
    }
}
