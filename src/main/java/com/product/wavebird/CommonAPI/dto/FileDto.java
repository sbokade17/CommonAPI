package com.product.wavebird.CommonAPI.dto;

import java.io.Serializable;

public class FileDto implements Serializable {
    private static final long serialVersionUID = -1615675106168870645L;
    private Long id;
    private String name;
    private String type;
    private byte[] fileByte;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getFileByte() {
        return fileByte;
    }

    public void setFileByte(byte[] fileByte) {
        this.fileByte = fileByte;
    }
}
