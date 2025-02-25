package org.acme.model;

import org.bson.types.ObjectId;
import java.util.Date;
import java.util.List;

public class Request {
    private ObjectId id;
    private String userId;
    private String title;
    private Date requestedDate;
    private String status;
    private List<StatusUpdate> updates;

    public static class StatusUpdate {
        public Date date;
        public String status;
    }

    public Request() {
        this.requestedDate = new Date();
        this.status = "In Prüfung";
    }

    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Date getRequestedDate() { return requestedDate; }
    public void setRequestedDate(Date requestedDate) { this.requestedDate = requestedDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public List<StatusUpdate> getUpdates() { return updates; }
    public void setUpdates(List<StatusUpdate> updates) { this.updates = updates; }
}