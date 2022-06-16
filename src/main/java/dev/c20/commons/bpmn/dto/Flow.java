package dev.c20.commons.bpmn.dto;

import java.io.Serializable;

public class Flow implements Serializable {

    private String id;
    private String name;
    private String targetRef;
    private String sourceRef;
    private String clazz;
    private String expression;


    public Flow() {
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getTargetRef() {
        return this.targetRef;
    }

    public String getSourceRef() {
        return this.sourceRef;
    }

    public String getClazz() {
        return this.clazz;
    }

    public String getExpression() {
        return this.expression;
    }

    public Flow setId(String id) {
        this.id = id;
        return this;
    }

    public Flow setName(String name) {
        this.name = name;
        return this;
    }

    public Flow setTargetRef(String targetRef) {
        this.targetRef = targetRef;
        return this;
    }

    public Flow setSourceRef(String sourceRef) {
        this.sourceRef = sourceRef;
        return this;
    }

    public Flow setClazz(String clazz) {
        this.clazz = clazz;
        return this;
    }

    public Flow setExpression(String expression) {
        this.expression = expression;
        return this;
    }
}
