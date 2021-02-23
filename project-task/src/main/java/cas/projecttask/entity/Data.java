package cas.projecttask.entity;

import cas.projecttask.entity.enums.Status;

import javax.persistence.*;

@Entity
public class Data {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String summary;

    private String acceptanceCriteria;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Data() {
    }

    public Data(String summary, String acceptanceCriteria, Status status) {
        this.summary = summary;
        this.acceptanceCriteria = acceptanceCriteria;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAcceptanceCriteria() {
        return acceptanceCriteria;
    }

    public void setAcceptanceCriteria(String acceptanceCriteria) {
        this.acceptanceCriteria = acceptanceCriteria;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

