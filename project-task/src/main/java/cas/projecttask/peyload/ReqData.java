package cas.projecttask.peyload;

import cas.projecttask.entity.enums.Status;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

public class ReqData {

    @NotBlank
    private String summary;

    private String acceptanceCriteria;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private Status status;

    public ReqData() {
    }

    public ReqData(String summary, String acceptanceCriteria, Status status) {
        this.summary = summary;
        this.acceptanceCriteria = acceptanceCriteria;
        this.status = status;
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
