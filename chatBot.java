
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class chatBot {
    private Map<String, String> responses;

    public chatBot() {
        responses = new HashMap<>();
        loadResponses();
    }

    private void loadResponses() {
        responses.put("hello", "Hi there! How can I help you?");
        responses.put("how are you", "I'm just a bot, but I'm doing great! How about you?");
        responses.put("what is your name ?", "I am a ChatBot created in Java.");
        responses.put("bye", "Goodbye! Have a nice day!");
    }

    public String getResponse(String input) {
        String response = responses.get(input.toLowerCase());
        return response != null ? response : "Sorry, I don't understand that.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        chatBot ChatBot = new chatBot();

        System.out.println("Hello! I'm your ChatBot. Type 'bye' to end the chat.");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            }
            String response = ChatBot.getResponse(userInput);
            System.out.println("ChatBot: " + response);
        }
        scanner.close();
    }
}

    

