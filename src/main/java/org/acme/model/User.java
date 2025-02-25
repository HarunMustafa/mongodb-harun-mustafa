package org.acme.model;

import org.bson.types.ObjectId;
import java.util.List;

public class User {
    private ObjectId id;
    private String username;
    private String email;
    private List<String> requests;

    public User() {}

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<String> getRequests() { return requests; }
    public void setRequests(List<String> requests) { this.requests = requests; }
}