package org.organey.data.model;

public class Order {

    public int id;
    public String code;
    public String description;
    public String status;
    public String created_at;
    public int users_id;

    public Order(String code, String description, String status, String created_at, int users_id) {
        super();
        this.code = code;
        this.description = description;
        this.status = status;
        this.created_at = created_at;
        this.users_id = users_id;
    }

    public Order(String code, String description, String status, int userId) {
        this.code = code;
        this.description = description;
        this.status = status;
        this.users_id = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public Order(int id, String code, String description, String status, String created_at, int users_id) {
        super();
        this.id = id;
        this.code = code;
        this.description = description;
        this.status = status;
        this.created_at = created_at;
        this.users_id = users_id;
    }

}
