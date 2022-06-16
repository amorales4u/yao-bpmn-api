package dev.c20.commons.stororage.dto.adds;

import dev.c20.commons.stororage.dto.Storage;

import java.io.Serializable;
import java.util.Date;


public class ProtectedValue implements Serializable {

    public static final int VALUE_IS_PROPERTY = 1000;
    public static final int VALUE_IS_PROPERTY_MASKED = 1010;
    public static final int VALUE_IS_PROPERTY_PROTECTED = 1020;

    Long id;
    public Storage parent;
    public  String name;
    public  String stringValue;
    public  String type;
    public  Double doubleValue;
    public  Date dateValue;
    public  Long longValue;
    public  Integer intValue;
    public  Integer order;

    public ProtectedValue() {
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

    public String getStringValue() {
        return this.stringValue;
    }

    public String getType() {
        return this.type;
    }

    public Double getDoubleValue() {
        return this.doubleValue;
    }

    public Date getDateValue() {
        return this.dateValue;
    }

    public Long getLongValue() {
        return this.longValue;
    }

    public Integer getIntValue() {
        return this.intValue;
    }

    public Integer getOrder() {
        return this.order;
    }

    public ProtectedValue setId(Long id) {
        this.id = id;
        return this;
    }

    public ProtectedValue setParent(Storage parent) {
        this.parent = parent;
        return this;
    }

    public ProtectedValue setName(String name) {
        this.name = name;
        return this;
    }

    public ProtectedValue setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    public ProtectedValue setType(String type) {
        this.type = type;
        return this;
    }

    public ProtectedValue setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    public ProtectedValue setDateValue(Date dateValue) {
        this.dateValue = dateValue;
        return this;
    }

    public ProtectedValue setLongValue(Long longValue) {
        this.longValue = longValue;
        return this;
    }

    public ProtectedValue setIntValue(Integer intValue) {
        this.intValue = intValue;
        return this;
    }

    public ProtectedValue setOrder(Integer order) {
        this.order = order;
        return this;
    }
}
