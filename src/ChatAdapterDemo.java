public class ChatAdapterDemo {
    public static void main(String[] args) {
        // Creating legacy chat service instance
        LegacyChatService legacyChat = new LegacyChatService();

        // Wrapping it with the adapter
        ChatService chatService = new ChatServiceAdapter(legacyChat);

        // Sending a message through the adapter
        chatService.sendMessage("Hello world!");
    }
}
