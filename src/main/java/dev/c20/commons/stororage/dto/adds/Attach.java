package dev.c20.commons.stororage.dto.adds;

import dev.c20.commons.stororage.dto.Storage;

import java.io.Serializable;
import java.util.Date;

public class Attach implements Serializable {

    Long id;
    public Storage parent;
    public Date modified;
    public String modifier;
    public String name;
    public Long file;

    public Attach() {
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

    public String getName() {
        return this.name;
    }

    public Long getFile() {
        return this.file;
    }

    public Attach setId(Long id) {
        this.id = id;
        return this;
    }

    public Attach setParent(Storage parent) {
        this.parent = parent;
        return this;
    }

    public Attach setModified(Date modified) {
        this.modified = modified;
        return this;
    }

    public Attach setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public Attach setName(String name) {
        this.name = name;
        return this;
    }

    public Attach setFile(Long file) {
        this.file = file;
        return this;
    }
}
