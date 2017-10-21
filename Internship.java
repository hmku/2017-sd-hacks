import java.util.*;

public class Internship {
  private int grade; // Grade that student is in
  private String companyName;
  private String major; //CS = computer science, EE = electrical engineer
  private String jobType;
  private boolean paid;
  private boolean providesHousing;
  private String location;
  private char fpi;
  private String duration;
  private ArrayList<String> skills;
  private Date deadline;
  private boolean closed;
  private boolean approved;
  private String link;

  public Internship() {
    grade = 0;
    companyName = "";
    major = "";
    jobType = "";
    paid = false;
    providesHousing = false;
    location = "";
    fpi = "";
    duration = "";
    skills = new ArrayList<String>();
    deadline = null;
    closed = false;
    approved = false;
    link = "";
  }

  public Internship(int myGrade, String myCompanyName, String myMajor, String myJobType, boolean myPaid, boolean myProvidesHousing, String myLocation
                    , char myFPI, String myDuration, ArrayList<String> mySkills, Date myDeadline, boolean myClosed, boolean myApproved, String myLink) {

    grade = myGrade;
    companyName = myCompanyName;
    major = myMajor;
    jobType = myJobType;
    paid = myPaid;
    providesHousing = myProvidesHousing;
    location = myLocation;
    fpi = myFPI;
    duration = myDuration;
    skills = mySkills;
    deadline = myDeadline;
    closed = myClosed;
    approved = myApproved;
    link = myLink;
  }
  
	
  private static void main (String [] args) {
	
  }
  public int getGrade() {
    return grade;
  }
  
  public String getCompanyName() {
    return companyName;
  }

  public String getMajor() {
    return major;
  }

  public String getJobType() {
    return jobType;
  }

  public boolean isPaid() {
    return paid;
  }

  public boolean housing() {
    return providesHousing;
  }

  public String getLocation() {
    return location;
  }

  public char getFPI() {
    return fpi;
  }

  public String getDuration () {
    return duration;
  }

  public ArrayList<String> getSkills() {
    return skills;
  }

  public Date getDeadline() {
    return deadline;
  }

  public boolean isClosed() {
    return closed;
  }

  public boolean isApproved() {
    return approved;
  }

  public String getLink() {
    return link;
  }
}
