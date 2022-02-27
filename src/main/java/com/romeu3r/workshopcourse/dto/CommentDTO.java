package com.romeu3r.workshopcourse.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
    private String text;
    private Date date;
    private AuthoDTO authoDTO;

    public CommentDTO() {
    }

    public CommentDTO(String text, Date date, AuthoDTO authoDTO) {
        this.text = text;
        this.date = date;
        this.authoDTO = authoDTO;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthoDTO getAuthoDTO() {
        return authoDTO;
    }

    public void setAuthoDTO(AuthoDTO authoDTO) {
        this.authoDTO = authoDTO;
    }
}
