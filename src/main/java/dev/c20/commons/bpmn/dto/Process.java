package dev.c20.commons.bpmn.dto;

import dev.c20.commons.stororage.dto.adds.Perm;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Process implements Serializable {

    private String domain;
    private String name;
    private String version;
    private String id;
    private List<Perm> candidateGroups;
    private List<Perm> adminGroups;
    private String authorization;
    private String startEvent;
    private String folder;

    private Map<String,Object> data = new HashMap<>();
    private Map<String, Activity> activities = new HashMap<>();
    private Map<String,Flow> flow = new HashMap<>();

    public Process() {
    }

    public Activity findActivityByName(String name) {
        Activity result = activities.get(name);
        return result;

    }
    public Flow findFlowByName(String name) {
        Flow result = flow.get(name);
        return result;

    }

    public String getDomain() {
        return this.domain;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public String getId() {
        return this.id;
    }

    public List<Perm> getCandidateGroups() {
        return this.candidateGroups;
    }

    public List<Perm> getAdminGroups() {
        return this.adminGroups;
    }

    public String getAuthorization() {
        return this.authorization;
    }

    public String getStartEvent() {
        return this.startEvent;
    }

    public String getFolder() {
        return this.folder;
    }

    public Map<String, Object> getData() {
        return this.data;
    }

    public Map<String, Activity> getActivities() {
        return this.activities;
    }

    public Map<String, Flow> getFlow() {
        return this.flow;
    }

    public Process setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public Process setName(String name) {
        this.name = name;
        return this;
    }

    public Process setVersion(String version) {
        this.version = version;
        return this;
    }

    public Process setId(String id) {
        this.id = id;
        return this;
    }

    public Process setCandidateGroups(List<Perm> candidateGroups) {
        this.candidateGroups = candidateGroups;
        return this;
    }

    public Process setAdminGroups(List<Perm> adminGroups) {
        this.adminGroups = adminGroups;
        return this;
    }

    public Process setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    public Process setStartEvent(String startEvent) {
        this.startEvent = startEvent;
        return this;
    }

    public Process setFolder(String folder) {
        this.folder = folder;
        return this;
    }

    public Process setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }

    public Process setActivities(Map<String, Activity> activities) {
        this.activities = activities;
        return this;
    }

    public Process setFlow(Map<String, Flow> flow) {
        this.flow = flow;
        return this;
    }
}
