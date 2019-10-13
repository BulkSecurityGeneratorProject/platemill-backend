package com.pmill.vuejs.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A PictureOfEvent.
 */
@Entity
@Table(name = "picture_of_event")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class PictureOfEvent implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pic_date")
    private LocalDate picDate;

    @Column(name = "img_type")
    private String imgType;

    
    @Lob
    @Column(name = "img_file", nullable = true)
    private byte[] imgFile;

    @Column(name = "img_file_content_type", nullable = false)
    private String imgFileContentType;

    @ManyToOne
    @JsonIgnoreProperties("pictureOfEvents")
    private EventOfPlateMill eventPM;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getPicDate() {
        return picDate;
    }

    public PictureOfEvent picDate(LocalDate picDate) {
        this.picDate = picDate;
        return this;
    }

    public void setPicDate(LocalDate picDate) {
        this.picDate = picDate;
    }

    public String getImgType() {
        return imgType;
    }

    public PictureOfEvent imgType(String imgType) {
        this.imgType = imgType;
        return this;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }

    public byte[] getImgFile() {
        return imgFile;
    }

    public PictureOfEvent imgFile(byte[] imgFile) {
        this.imgFile = imgFile;
        return this;
    }

    public void setImgFile(byte[] imgFile) {
        this.imgFile = imgFile;
    }

    public String getImgFileContentType() {
        return imgFileContentType;
    }

    public PictureOfEvent imgFileContentType(String imgFileContentType) {
        this.imgFileContentType = imgFileContentType;
        return this;
    }

    public void setImgFileContentType(String imgFileContentType) {
        this.imgFileContentType = imgFileContentType;
    }

    public EventOfPlateMill getEventPM() {
        return eventPM;
    }

    public PictureOfEvent eventPM(EventOfPlateMill eventOfPlateMill) {
        this.eventPM = eventOfPlateMill;
        return this;
    }

    public void setEventPM(EventOfPlateMill eventOfPlateMill) {
        this.eventPM = eventOfPlateMill;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PictureOfEvent)) {
            return false;
        }
        return id != null && id.equals(((PictureOfEvent) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "PictureOfEvent{" +
            "id=" + getId() +
            ", picDate='" + getPicDate() + "'" +
            ", imgType='" + getImgType() + "'" +
            ", imgFile='" + getImgFile() + "'" +
            ", imgFileContentType='" + getImgFileContentType() + "'" +
            "}";
    }
}
