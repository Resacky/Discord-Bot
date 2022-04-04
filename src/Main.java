import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    private static String botToken = JsonReader.getKeyValue("bottoken");
    public static JDA jda;

    public static void main(String[] args) {

        System.out.println(hello);

        System.out.println(botToken);

        try {

            jda = JDABuilder.createDefault(botToken).build();

        } catch (LoginException error) {

            System.err.println("couldn't log in");

        }

        jda.addEventListener(new ChatListener());

    }

}
