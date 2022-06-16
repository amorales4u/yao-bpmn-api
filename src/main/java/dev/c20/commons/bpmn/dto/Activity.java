package dev.c20.commons.bpmn.dto;

import dev.c20.commons.stororage.dto.adds.Perm;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class Activity implements Serializable {

    public static final String ACTIVITY_FLOW = "FLOW";

    public static final String ACTIVITY_START_EVENT = "startEvent";
    public static final String ACTIVITY_END_EVENT = "endEvent";
    public static final String ACTIVITY_TIMER_EVENT = "timerEvent";

    public static final String ACTIVITY_USER_TASK = "userTask";
    public static final String ACTIVITY_MANUAL_TASK = "manualTask";
    public static final String ACTIVITY_SCRIPT_TASK = "scriptTask";
    public static final String ACTIVITY_SERVICE_TASK = "serviceTask";

    public static final String ACTIVITY_PARALLEL_GATEWAY = "parallelGateway";
    public static final String ACTIVITY_EXCLUSIVE_GATEWAY = "exclusiveGateway";

    public static final Integer OUTGOING_TYPE_EXCLUSIVE = 10;
    public static final Integer OUTGOING_TYPE_INCLUSIVE = 20;
    public static final Integer OUTGOING_TYPE_PARALLEL = 30;


    private String name;
    private String id;
    private String type;
    private String clazz;
    private String folder;
    private List<String> outgoing = new LinkedList<>();
    private List<String> incoming = new LinkedList<>();
    private Integer outgoingType =  OUTGOING_TYPE_EXCLUSIVE;
    private Boolean autoComplete = false;
    private Boolean async = true;
    private String expression;
    private List<Perm> candidateGroups;

    private String description;

    public Activity() {
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getClazz() {
        return this.clazz;
    }

    public String getFolder() {
        return this.folder;
    }

    public List<String> getOutgoing() {
        return this.outgoing;
    }

    public List<String> getIncoming() {
        return this.incoming;
    }

    public Integer getOutgoingType() {
        return this.outgoingType;
    }

    public Boolean getAutoComplete() {
        return this.autoComplete;
    }

    public Boolean getAsync() {
        return this.async;
    }

    public String getExpression() {
        return this.expression;
    }

    public List<Perm> getCandidateGroups() {
        return this.candidateGroups;
    }

    public String getDescription() {
        return this.description;
    }

    public Activity setName(String name) {
        this.name = name;
        return this;
    }

    public Activity setId(String id) {
        this.id = id;
        return this;
    }

    public Activity setType(String type) {
        this.type = type;
        return this;
    }

    public Activity setClazz(String clazz) {
        this.clazz = clazz;
        return this;
    }

    public Activity setFolder(String folder) {
        this.folder = folder;
        return this;
    }

    public Activity setOutgoing(List<String> outgoing) {
        this.outgoing = outgoing;
        return this;
    }

    public Activity setIncoming(List<String> incoming) {
        this.incoming = incoming;
        return this;
    }

    public Activity setOutgoingType(Integer outgoingType) {
        this.outgoingType = outgoingType;
        return this;
    }

    public Activity setAutoComplete(Boolean autoComplete) {
        this.autoComplete = autoComplete;
        return this;
    }

    public Activity setAsync(Boolean async) {
        this.async = async;
        return this;
    }

    public Activity setExpression(String expression) {
        this.expression = expression;
        return this;
    }

    public Activity setCandidateGroups(List<Perm> candidateGroups) {
        this.candidateGroups = candidateGroups;
        return this;
    }

    public Activity setDescription(String description) {
        this.description = description;
        return this;
    }
}
