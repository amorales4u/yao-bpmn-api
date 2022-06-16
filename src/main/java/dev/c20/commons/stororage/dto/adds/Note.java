package dev.c20.commons.stororage.dto.adds;

import dev.c20.commons.stororage.dto.Storage;

import java.io.Serializable;
import java.util.Date;


public class Note implements Serializable {

    Long id;
    public Storage parent;
    public String creator;
    public Date created;
    public String image;
    public String comment;

    public Note() {
    }

    public Long getId() {
        return this.id;
    }

    public Storage getParent() {
        return this.parent;
    }

    public String getCreator() {
        return this.creator;
    }

    public Date getCreated() {
        return this.created;
    }

    public String getImage() {
        return this.image;
    }

    public String getComment() {
        return this.comment;
    }

    public Note setId(Long id) {
        this.id = id;
        return this;
    }

    public Note setParent(Storage parent) {
        this.parent = parent;
        return this;
    }

    public Note setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public Note setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Note setImage(String image) {
        this.image = image;
        return this;
    }

    public Note setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
