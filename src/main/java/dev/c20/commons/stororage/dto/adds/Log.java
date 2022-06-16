package dev.c20.commons.stororage.dto.adds;

import dev.c20.commons.stororage.dto.Storage;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {

    Long id;
    public Storage parent;
    public Date modified;
    public String modifier;
    public String comment;
    public Long commentId = 0l;
    public Long type = 0l;

    public Log() {
    }

    public Long getId() {
        return this.id;
    }

    public Storage getParent() {
        return this.parent;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getModifier() {
        return this.modifier;
    }

    public String getComment() {
        return this.comment;
    }

    public Long getCommentId() {
        return this.commentId;
    }

    public Long getType() {
        return this.type;
    }

    public Log setId(Long id) {
        this.id = id;
        return this;
    }

    public Log setParent(Storage parent) {
        this.parent = parent;
        return this;
    }

    public Log setModified(Date modified) {
        this.modified = modified;
        return this;
    }

    public Log setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public Log setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Log setCommentId(Long commentId) {
        this.commentId = commentId;
        return this;
    }

    public Log setType(Long type) {
        this.type = type;
        return this;
    }
}
