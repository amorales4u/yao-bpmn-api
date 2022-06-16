package dev.c20.commons.bpmn.dto;

import dev.c20.commons.security.dto.User;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class TaskMessage implements Serializable {

    public static final Integer TASK_STATUS_CREATED = 10000;
    public static final Integer TASK_STATUS_LIVE = 10010;
    public static final Integer TASK_STATUS_WAITING = 10020;
    public static final Integer TASK_STATUS_ERROR = 10030;
    public static final Integer TASK_STATUS_COMPLETED = 10100;

    public static final String TASK_EVENT_TYPE_START = "task_start";
    public static final String TASK_EVENT_TYPE_FINISH = "task_finish";
    public static final String TASK_EVENT_TYPE_MANUAL = "task_manual";
    public static final String TASK_EVENT_TYPE_AUTOMATIC = "task_automatic";
    public static final String TASK_EVENT_TYPE_SUB_PROCESS = "task_sub_process";
    public static final String TASK_EVENT_TYPE_GATEWAY = "task_gateway";
    public static final String TASK_EVENT_TYPE_EVENT = "task_event";
    public static final String TASK_MSG_TYPE_EXECUTE = "task_execute";
    public static final String TASK_MSG_TYPE_COMPLETE = "task_complete";

    Process processDefinition;

    String messageType;
    String processCache;
    ProcessInstance processInstance;
    TaskInstance taskInstance;
    Activity activity;
    Object taskData;

    User user;

    Boolean error = false;
    List<String> errorDescription = new LinkedList<>();


    public TaskMessage(String errorDescription) {
        this.errorDescription.add( errorDescription );
        this.error = true;
    }

    public TaskMessage(List<String> errorDescription) {
        this.errorDescription = errorDescription;
        this.error = true;
    }

    public TaskMessage() {
    }

    public Process getProcessDefinition() {
        return this.processDefinition;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public String getProcessCache() {
        return this.processCache;
    }

    public ProcessInstance getProcessInstance() {
        return this.processInstance;
    }

    public TaskInstance getTaskInstance() {
        return this.taskInstance;
    }

    public Activity getActivity() {
        return this.activity;
    }

    public Object getTaskData() {
        return this.taskData;
    }

    public User getUser() {
        return this.user;
    }

    public Boolean getError() {
        return this.error;
    }

    public List<String> getErrorDescription() {
        return this.errorDescription;
    }

    public TaskMessage setProcessDefinition(Process processDefinition) {
        this.processDefinition = processDefinition;
        return this;
    }

    public TaskMessage setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }

    public TaskMessage setProcessCache(String processCache) {
        this.processCache = processCache;
        return this;
    }

    public TaskMessage setProcessInstance(ProcessInstance processInstance) {
        this.processInstance = processInstance;
        return this;
    }

    public TaskMessage setTaskInstance(TaskInstance taskInstance) {
        this.taskInstance = taskInstance;
        return this;
    }

    public TaskMessage setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public TaskMessage setTaskData(Object taskData) {
        this.taskData = taskData;
        return this;
    }

    public TaskMessage setUser(User user) {
        this.user = user;
        return this;
    }

    public TaskMessage setError(Boolean error) {
        this.error = error;
        return this;
    }

    public TaskMessage setErrorDescription(List<String> errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }
}
