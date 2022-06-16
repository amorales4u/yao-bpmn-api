package dev.c20.commons.bpmn.commons;

import dev.c20.commons.bpmn.dto.TaskMessage;

public interface BPMNExecutor {

    Object execute(TaskMessage taskMessage );
}
