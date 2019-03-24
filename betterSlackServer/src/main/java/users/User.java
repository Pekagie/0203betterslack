package users;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter

public class User {
    private static final int MIN_USERNAME_LENGTH = 4;
    private static final int MAX_USERNAME_LENGTH = 20;
    private UUID id;
    private String username;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(String username, String password, LocalDateTime createdAt, LocalDateTime updatedAt) {
        id = UUID.randomUUID();
        this.username = username;
        this.password = password;
        createdAt = LocalDateTime.now();
        updatedAt = createdAt;
    }

    public void changeUsername(String username){
        if(username != null && username.length() >= MIN_USERNAME_LENGTH && username.length() <= MAX_USERNAME_LENGTH)
        this.username = username;
    }

    private boolean isUsernameValid(String username) {
        return username != null &&
                username.length() >= MIN_USERNAME_LENGTH &&
                username.length() <= MAX_USERNAME_LENGTH;
    }

    private void update() {
        updatedAt = LocalDateTime.now();
    }
}
