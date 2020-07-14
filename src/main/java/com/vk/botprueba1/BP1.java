package com.vk.botprueba1;

/* imports */
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.Message;


public class BP1 {
	
	/* Variables */
	
	static String prefix = "$";
	
    public static void main( String[] args ){
    	
    	if(args.length <1 ) {
    		System.err.println("Please, Set a valid token");
    	}
    	
    	String botToken = args[0];
    	DiscordApi api = new DiscordApiBuilder().setToken(botToken).login().join();
    	
    	// Create a simple message
    	api.addMessageCreateListener( event ->{
    		Message msg = event.getMessage();
    		String beginningPrefix = msg.getContent();
    		if(prefix.compareTo(beginningPrefix)) {
    			System.out.println(msg.getContent());
    			/*switch(msg.getContent()){
    			
    			}*/
    			event.getChannel().sendMessage("Hola y bienvenido");
    		}
    	});

    }
}
