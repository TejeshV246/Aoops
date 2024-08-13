public class ErrorHandler extends LogHandler {
    @Override
    public void handle(String message) {
        if (message.contains("ERROR")) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
