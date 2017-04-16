package me.diax.diaxbotirc;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

/**
 * Created by comportment on 16/04/17.
 */
public class Main {

    public static DiaxBot DOMIRC;
    public static JDA JDA_BOT;

    public static void main(String[] args) {
        try {
            new Main().init();
        } catch (Exception ignored){}
    }

    public void init() throws Exception {
        JDA_BOT = new JDABuilder(AccountType.BOT)
                .setToken("Mjk1MTYxNTUyNzk1OTkyMDY0.C8bMYw.RLo96PDsJGsBgWk7OgErRYOwKQw")
                .addEventListener(new DiaxDiscord())
                .buildAsync();
        DOMIRC = new DiaxBot("Diax", "DOMIRC");
        DOMIRC.connect("irc.domirc.net");
        DOMIRC.joinChannel("#diax.me");
    }

    public static String chatFormat() {
        return "[%s](%s/%s) %s: %s";
    }
}