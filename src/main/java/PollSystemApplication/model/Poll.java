package PollSystemApplication.model;


public class Poll {

    private Long id;

    private String title;

    private String firstOption;

    private String secondOption;

    private String thirdOption;

    private String fourthOption;


    public Poll(Long id, String title, String firstOption, String secondOption, String thirdOption, String fourthOption) {
        this.id = id;
        this.title = title;
        this.firstOption = firstOption;
        this.secondOption = secondOption;
        this.thirdOption = thirdOption;
        this.fourthOption = fourthOption;

    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstOption() {
        return firstOption;
    }

    public String getSecondOption() {
        return secondOption;
    }


    public String getThirdOption() {
        return thirdOption;
    }

    public String getFourthOption() {
        return fourthOption;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirstOption(String firstOption) {
        this.firstOption = firstOption;
    }

    public void setSecondOption(String secondOption) {
        this.secondOption = secondOption;
    }

    public void setThirdOption(String thirdOption) {
        this.thirdOption = thirdOption;
    }

    public void setFourthOption(String fourthOption) {
        this.fourthOption = fourthOption;
    }


}