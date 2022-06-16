package dev.c20.commons.stororage.dto.adds;

import dev.c20.commons.stororage.dto.Storage;

import java.io.Serializable;


public class Perm implements Serializable {

    Long id;
    public Storage parent;
    public String user;
    public Boolean canCreate;
    public Boolean canRead;
    public Boolean canDelete;
    public Boolean canAdmin;
    public Boolean canSend;

    public Perm() {
    }

    public Long getId() {
        return this.id;
    }

    public Storage getParent() {
        return this.parent;
    }

    public String getUser() {
        return this.user;
    }

    public Boolean getCanCreate() {
        return this.canCreate;
    }

    public Boolean getCanRead() {
        return this.canRead;
    }

    public Boolean getCanDelete() {
        return this.canDelete;
    }

    public Boolean getCanAdmin() {
        return this.canAdmin;
    }

    public Boolean getCanSend() {
        return this.canSend;
    }

    public Perm setId(Long id) {
        this.id = id;
        return this;
    }

    public Perm setParent(Storage parent) {
        this.parent = parent;
        return this;
    }

    public Perm setUser(String user) {
        this.user = user;
        return this;
    }

    public Perm setCanCreate(Boolean canCreate) {
        this.canCreate = canCreate;
        return this;
    }

    public Perm setCanRead(Boolean canRead) {
        this.canRead = canRead;
        return this;
    }

    public Perm setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    public Perm setCanAdmin(Boolean canAdmin) {
        this.canAdmin = canAdmin;
        return this;
    }

    public Perm setCanSend(Boolean canSend) {
        this.canSend = canSend;
        return this;
    }
}
