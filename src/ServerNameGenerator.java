import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

        String[] adj = new String[10];
        String[] noun = new String[10];
        adj[0] = "modern";
        adj[1] = "dirty";
        adj[2] = "annoyed";
        adj[3] = "average";
        adj[4] = "thirsty";
        adj[5] = "uneven";
        adj[6] = "broken";
        adj[7] = "hollow";
        adj[8] = "energetic";
        adj[9] = "embarrassed";

        noun[0] = "walrus";
        noun[1] = "pig";
        noun[2] = "t-rex";
        noun[3] = "bobcat";
        noun[4] = "toucan";
        noun[5] = "shark";
        noun[6] = "clownfish";
        noun[7] = "jellyfish";
        noun[8] = "lizard";
        noun[9] = "zebra";

        String randomAdj = adj[new Random ().nextInt(adj.length)];
        String randomNoun = noun[new Random ().nextInt(noun.length)];

        System.out.printf("Here is your server name:%n%s-%s", randomAdj, randomNoun);


        }



}
