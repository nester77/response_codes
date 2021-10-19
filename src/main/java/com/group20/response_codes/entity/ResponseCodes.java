package com.group20.response_codes.entity;


import javax.persistence.*;

@Entity
@Table (name = "response_codes")
public class ResponseCodes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (name = "status_code")
    private String statusCode;
    private int code;
    @Column (name = "name_en")
    private String nameEn;
    @Column (name = "name_ru")
    private String nameRu;
    @Column (name = "description_en")
    private String descriptionEn;
    @Column (name = "description_ru")
    private String descriptionRu;

    public ResponseCodes() {
    }

    public ResponseCodes(String statusCode, int code, String nameEn, String nameRu, String descriptionEn, String descriptionRu) {
        this.statusCode = statusCode;
        this.code = code;
        this.nameEn = nameEn;
        this.nameRu = nameRu;
        this.descriptionEn = descriptionEn;
        this.descriptionRu = descriptionRu;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameRu() {
        return nameRu;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getDescriptionRu() {
        return descriptionRu;
    }

    public void setDescriptionRu(String descriptionRu) {
        this.descriptionRu = descriptionRu;
    }

    @Override
    public String toString() {
        return "ResponseCodes{" +
                "id=" + id +
                ", statusCode='" + statusCode + '\'' +
                ", code=" + code +
                ", nameEn='" + nameEn + '\'' +
                ", nameRu='" + nameRu + '\'' +
                ", descriptionEn='" + descriptionEn + '\'' +
                ", descriptionRu='" + descriptionRu + '\'' +
                '}';
    }
}
