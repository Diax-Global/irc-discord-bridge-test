package me.diax.diaxbotirc;

import org.jibble.pircbot.PircBot;

/**
 * Created by comportment on 16/04/17.
 */
public class DiaxBot extends PircBot {

    private final String client;

    public DiaxBot(String name, String client) {
        this.setName(name);
        this.setVerbose(true);
        this.client = client;
    }

    @Override
    public void onMessage(String channel, String sender,
                          String login, String hostname, String message) {

        Main.JDA_BOT.getGuildById(293889712014360586L).getTextChannelById(303149519103721472L).
                sendMessage(String.format(Main.chatFormat(), "IRC", "DomIRC", channel, sender.replaceFirst(sender.split("")[0], sender.split("")[0] + "​"), message)).queue();

    }
}
