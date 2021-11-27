package com.adoptapp.solicitud_ms.models;


import org.springframework.data.annotation.Id;

import java.util.Date;

public class RequestPet {

    enum RequestKind {
        AD,
        HD,
    }

    @Id
    private String id;
    private String user;
    private String pet;
    private Date created_at;
    private RequestKind request_kind;
    private Date finalized_at;

    public RequestPet(String id, String user, String pet, Date created_at, RequestKind request_kind, Date finalized_at) {
        this.id = id;
        this.user = user;
        this.pet = pet;
        this.created_at = created_at;
        this.request_kind = request_kind;
        this.finalized_at = finalized_at;
    }

    public String getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public RequestKind getRequest_kind() {
        return request_kind;
    }

    public void setRequest_kind(RequestKind request_kind) {
        this.request_kind = request_kind;
    }

    public Date getFinalized_at() {
        return finalized_at;
    }

    public void setFinalized_at(Date finalized_at) {
        this.finalized_at = finalized_at;
    }
}
