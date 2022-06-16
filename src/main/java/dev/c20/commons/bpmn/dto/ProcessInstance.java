package dev.c20.commons.bpmn.dto;

import dev.c20.commons.stororage.dto.Storage;

public class ProcessInstance extends Storage {

    Long startedAt = 0L;

    Long finishedAt = 0L;

    Long time = 0L;

    public Long getStartedAt() {
        return this.startedAt;
    }

    public Long getFinishedAt() {
        return this.finishedAt;
    }

    public Long getTime() {
        return this.time;
    }

    public ProcessInstance setStartedAt(Long startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    public ProcessInstance setFinishedAt(Long finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    public ProcessInstance setTime(Long time) {
        this.time = time;
        return this;
    }
}
