package dev.c20.commons.stororage.dto.adds;

import dev.c20.commons.stororage.dto.Storage;

import java.io.Serializable;

public class Data implements Serializable {

    Long id;
    public Storage parent;
    public String name;
    public String customData;

    public Data() {
    }

    public Long getId() {
        return this.id;
    }

    public Storage getParent() {
        return this.parent;
    }

    public String getName() {
        return this.name;
    }

    public String getCustomData() {
        return this.customData;
    }

    public Data setId(Long id) {
        this.id = id;
        return this;
    }

    public Data setParent(Storage parent) {
        this.parent = parent;
        return this;
    }

    public Data setName(String name) {
        this.name = name;
        return this;
    }

    public Data setCustomData(String customData) {
        this.customData = customData;
        return this;
    }
}
