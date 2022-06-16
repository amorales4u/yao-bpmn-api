package dev.c20.commons.bpmn.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Accessors(chain = true)
public class BpmnError {
    private String message;
    private Integer line;
    private Integer column;
    private String mainBpmnElementId;
    private List<String> bpmnElementIds = new ArrayList<>();

}
