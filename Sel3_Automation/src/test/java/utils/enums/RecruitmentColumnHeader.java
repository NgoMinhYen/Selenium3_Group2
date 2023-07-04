package utils.enums;

/**
 * @author DungHa
 * @Date 25/10/2022
 */
public enum RecruitmentColumnHeader {
    VACANCY("Vacancy"),
    CANDIDATE("Candidate"),
    HIRING_MANAGER("Hiring Manager"),
    DATE_OF_APPLICATION("Date of Application"),
    STATUS("Status"),
    ACTIONS("Actions");


    private String value;

    RecruitmentColumnHeader(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
