import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class ChatListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        System.out.println(event.getMessage().getContentRaw());

        String messageRecieved = event.getMessage().getContentRaw();

        if (messageRecieved.equalsIgnoreCase("!say_something")) {

            String greeting = JsonReader.getKeyValue("greeting");

            event.getChannel().sendMessage(greeting).queue();

        }

    }
}
