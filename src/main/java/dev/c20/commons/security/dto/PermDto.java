package dev.c20.commons.security.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;


@Getter
@Setter
@Accessors(chain = true)
public class PermDto {

    private Long id;
    private String user;
    private Boolean canCreate;
    private Boolean canRead;
    private Boolean canUpdate;
    private Boolean canDelete;
    private Boolean canAdmin;
    private Boolean canSend;


}
