package dev.c20.commons.stororage.dto;

import dev.c20.commons.stororage.dto.adds.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Storage implements Serializable {

    public Long id;
    private Boolean isFolder = null;
    private String name;
    private String alias;
    private String extension;
    private String image;
    private Date created;
    private String creator;
    private Date modifyDate;
    private String modifier;
    private Boolean deleted = false;
    private Date deletedDate;
    private String userDeleter;
    private Boolean readOnly = false;
    private Boolean visible = true;
    private Boolean locked = false;
    private Boolean restrictedByPerm = false;
    private Integer status;
    private String clazzName;
    private Integer level = 0;
    private String description;
    private String key;
    private String path;
    private String extraData;
    private String assigned;
    private Date assignedFrom;
    private Date assignedTo;
    private Integer type = 0;
    private List<Attach> attachments = new ArrayList<>();
    private List<Note> notes = new ArrayList<>();
    private List<Value> values = new ArrayList<>();
    private List<ProtectedValue> protectedValues = new ArrayList<>();
    private List<Perm> permissions = new ArrayList<>();

    public Storage() {
    }

    public String keyForCache() {
        return this.id + ",process definition";
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsFolder() {
        return this.isFolder;
    }

    public String getName() {
        return this.name;
    }

    public String getAlias() {
        return this.alias;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getImage() {
        return this.image;
    }

    public Date getCreated() {
        return this.created;
    }

    public String getCreator() {
        return this.creator;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public String getModifier() {
        return this.modifier;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public Date getDeletedDate() {
        return this.deletedDate;
    }

    public String getUserDeleter() {
        return this.userDeleter;
    }

    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public Boolean getLocked() {
        return this.locked;
    }

    public Boolean getRestrictedByPerm() {
        return this.restrictedByPerm;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getClazzName() {
        return this.clazzName;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getDescription() {
        return this.description;
    }

    public String getKey() {
        return this.key;
    }

    public String getPath() {
        return this.path;
    }

    public String getExtraData() {
        return this.extraData;
    }

    public String getAssigned() {
        return this.assigned;
    }

    public Date getAssignedFrom() {
        return this.assignedFrom;
    }

    public Date getAssignedTo() {
        return this.assignedTo;
    }

    public Integer getType() {
        return this.type;
    }

    public List<Attach> getAttachments() {
        return this.attachments;
    }

    public List<Note> getNotes() {
        return this.notes;
    }

    public List<Value> getValues() {
        return this.values;
    }

    public List<ProtectedValue> getProtectedValues() {
        return this.protectedValues;
    }

    public List<Perm> getPermissions() {
        return this.permissions;
    }

    public Storage setId(Long id) {
        this.id = id;
        return this;
    }

    public Storage setIsFolder(Boolean isFolder) {
        this.isFolder = isFolder;
        return this;
    }

    public Storage setName(String name) {
        this.name = name;
        return this;
    }

    public Storage setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public Storage setExtension(String extension) {
        this.extension = extension;
        return this;
    }

    public Storage setImage(String image) {
        this.image = image;
        return this;
    }

    public Storage setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Storage setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    public Storage setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
        return this;
    }

    public Storage setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }

    public Storage setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public Storage setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
        return this;
    }

    public Storage setUserDeleter(String userDeleter) {
        this.userDeleter = userDeleter;
        return this;
    }

    public Storage setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Storage setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    public Storage setLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    public Storage setRestrictedByPerm(Boolean restrictedByPerm) {
        this.restrictedByPerm = restrictedByPerm;
        return this;
    }

    public Storage setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Storage setClazzName(String clazzName) {
        this.clazzName = clazzName;
        return this;
    }

    public Storage setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Storage setDescription(String description) {
        this.description = description;
        return this;
    }

    public Storage setKey(String key) {
        this.key = key;
        return this;
    }

    public Storage setPath(String path) {
        this.path = path;
        return this;
    }

    public Storage setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }

    public Storage setAssigned(String assigned) {
        this.assigned = assigned;
        return this;
    }

    public Storage setAssignedFrom(Date assignedFrom) {
        this.assignedFrom = assignedFrom;
        return this;
    }

    public Storage setAssignedTo(Date assignedTo) {
        this.assignedTo = assignedTo;
        return this;
    }

    public Storage setType(Integer type) {
        this.type = type;
        return this;
    }

    public Storage setAttachments(List<Attach> attachments) {
        this.attachments = attachments;
        return this;
    }

    public Storage setNotes(List<Note> notes) {
        this.notes = notes;
        return this;
    }

    public Storage setValues(List<Value> values) {
        this.values = values;
        return this;
    }

    public Storage setProtectedValues(List<ProtectedValue> protectedValues) {
        this.protectedValues = protectedValues;
        return this;
    }

    public Storage setPermissions(List<Perm> permissions) {
        this.permissions = permissions;
        return this;
    }
}
