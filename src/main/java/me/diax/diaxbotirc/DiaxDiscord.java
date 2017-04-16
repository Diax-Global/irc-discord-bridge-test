package me.diax.diaxbotirc;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

/**
 * Created by comportment on 16/04/17.
 */
public class DiaxDiscord extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;
        if (event.getGuild().getIdLong() != 293889712014360586L) return;
        if (event.getChannel().getIdLong() != 303149519103721472L) return;
        Main.DOMIRC.sendMessage("#diax.me", String.format(Main.chatFormat(), "Discord", event.getGuild().getName(), "#" + event.getChannel()
                .getName(), event.getAuthor().getName().replaceFirst(event.getAuthor().getName().split("")[0], event.getAuthor().getName().split("")[0] + "​"), event.getMessage().getRawContent()));
    }
}
