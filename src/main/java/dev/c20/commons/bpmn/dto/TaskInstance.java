package dev.c20.commons.bpmn.dto;

import dev.c20.commons.stororage.dto.Storage;

public class TaskInstance extends Storage {
    String taskType;

    public String getTaskType() {
        return this.taskType;
    }

    public TaskInstance setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
}
