package Communicator;

import java.time.LocalDateTime;

public class BetterSlackError {
    private LocalDateTime timestamp;
    private String message;

    private BetterSlackError() {

    }

    public BetterSlackError (String message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }
}
