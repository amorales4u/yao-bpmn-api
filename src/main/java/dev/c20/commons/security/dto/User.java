package dev.c20.commons.security.dto;

import dev.c20.commons.security.dto.PermDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.security.Principal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Setter
@Getter
@Accessors(chain = true)
public class User implements Principal {
    private String domain ;
    private String name;
    private String password;
    private String description;
    private Boolean exists = false;
    private Long validTo = 0L;
    private List<PermDto> groups = new LinkedList<>();
    private List<String> roles = new ArrayList<>();

    public String resolvePath(String path) {
        if( path.startsWith("/") && domain.equals("/") ) {
            return path;
        }

        return domain + path;
    }


}
