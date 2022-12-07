package com.clovis.dataprovider.models;

import com.google.gson.annotations.SerializedName;

public class NewYorkCitySchool {

    private String dbn;

    @SerializedName("school_name")
    private String schoolName;

    private String boro;

    @SerializedName("overview_paragraph")
    private String overviewParagraph;

    @SerializedName("school_10th_seats")
    private String schoolTenthSeats;

    @SerializedName("academicopportunities1")
    private String academicOpportunitiesOne;

    @SerializedName("academicopportunities2")
    private String academicOpportunitiesTwo;

    @SerializedName("ell_programs")
    private String ellPrograms;

    private String neighborhood;

    @SerializedName("building_code")
    private String building_code;

    private String location;

    @SerializedName("phone_number")
    private String phoneNumber;

    @SerializedName("fax_number")
    private String faxNumber;

    @SerializedName("school_email")
    private String schoolEmail;

    private String website;

    private String subway;
    private String bus;

    @SerializedName("grades2018")
    private String gradesTwentyEighteen;

    @SerializedName("finalgrades")
    private String finalGrades;

    @SerializedName("total_students")
    private String totalStudents;

    @SerializedName("extracurricular_activities")
    private String extracurricularActivities;

    @SerializedName("school_sports")
    private String schoolSports;

    @SerializedName("attendance_rate")
    private String attendanceRate;

    @SerializedName("pct_stu_enough_variety")
    private String pctStuEnoughVariety;

    @SerializedName("pct_stu_safe")
    private String pctStuSafe;

    @SerializedName("school_accessibility_description")
    private String schoolAccessibilityDescription;

    @SerializedName("directions1")
    private String directionsOne;

    @SerializedName("requirement1_1")
    private String requirementOneOne;

    @SerializedName("requirement2_1")
    private String requirementTwoOne;

    @SerializedName("requirement3_1")
    private String requirementThreeOne;

    @SerializedName("requirement4_1")
    private String requirementFourOne;

    @SerializedName("requirement5_1")
    private String requirementFiveOne;

    @SerializedName("offer_rate1")
    private String offerRatelOne;

    @SerializedName("program1")
    private String programOne;

    @SerializedName("code1")
    private String codeOne;

    @SerializedName("interest1")
    private String interestOne;

    @SerializedName("method1")
    private String methodOne;

    @SerializedName("seats9ge1")
    private String seatsNineGel;

    @SerializedName("grade9gefilledflag1")
    private String gradeNineGeFilledFlagOne;

    @SerializedName("grade9geapplicants1")
    private String gradeNineGeApplicantsOne;

    @SerializedName("seats9swd1")
    private String seatsNineSwdOne;

    @SerializedName("grade9swdfilledflag1")
    private String seatsNineSwdFilledFlagOne;

    @SerializedName("grade9swdapplicants1")
    private String seatsNineSwdApplicantsOne;

    @SerializedName("seats101")
    private String seatsOneZerOne;

    @SerializedName("admissionspriority11")
    private String admissionsPriorityOneOne;

    @SerializedName("admissionspriority21")
    private String admissionsPriorityTwoOne;

    @SerializedName("admissionspriority31")
    private String admissionsPriorityThreeOne;

    @SerializedName("grade9geapplicantsperseat1")
    private String grade9geApplicantsPerSeatOne;

    @SerializedName("grade9swdapplicantsperseat1")
    private String grade9swdApplicantsPerSeatOne;

    @SerializedName("primary_address_line_1")
    private String primaryAddressLineOne;

    private String city;

    private String zip;

    @SerializedName("state_code")
    private String stateCode;
    private String latitude;
    private String longitude;

    @SerializedName("community_board")
    private String communityBoard;

    @SerializedName("council_district")
    private String councilDistrict;

    @SerializedName("census_tract")
    private String censusTract;

    private String bin;

    private String bbl;

    private String nta;

    private String borough;

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getBoro() {
        return boro;
    }

    public void setBoro(String boro) {
        this.boro = boro;
    }

    public String getOverviewParagraph() {
        return overviewParagraph;
    }

    public void setOverviewParagraph(String overviewParagraph) {
        this.overviewParagraph = overviewParagraph;
    }

    public String getSchoolTenthSeats() {
        return schoolTenthSeats;
    }

    public void setSchoolTenthSeats(String schoolTenthSeats) {
        this.schoolTenthSeats = schoolTenthSeats;
    }

    public String getAcademicOpportunitiesOne() {
        return academicOpportunitiesOne;
    }

    public void setAcademicOpportunitiesOne(String academicOpportunitiesOne) {
        this.academicOpportunitiesOne = academicOpportunitiesOne;
    }

    public String getAcademicOpportunitiesTwo() {
        return academicOpportunitiesTwo;
    }

    public void setAcademicOpportunitiesTwo(String academicOpportunitiesTwo) {
        this.academicOpportunitiesTwo = academicOpportunitiesTwo;
    }

    public String getEllPrograms() {
        return ellPrograms;
    }

    public void setEllPrograms(String ellPrograms) {
        this.ellPrograms = ellPrograms;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getBuilding_code() {
        return building_code;
    }

    public void setBuilding_code(String building_code) {
        this.building_code = building_code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getGradesTwentyEighteen() {
        return gradesTwentyEighteen;
    }

    public void setGradesTwentyEighteen(String gradesTwentyEighteen) {
        this.gradesTwentyEighteen = gradesTwentyEighteen;
    }

    public String getFinalGrades() {
        return finalGrades;
    }

    public void setFinalGrades(String finalGrades) {
        this.finalGrades = finalGrades;
    }

    public String getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(String totalStudents) {
        this.totalStudents = totalStudents;
    }

    public String getExtracurricularActivities() {
        return extracurricularActivities;
    }

    public void setExtracurricularActivities(String extracurricularActivities) {
        this.extracurricularActivities = extracurricularActivities;
    }

    public String getSchoolSports() {
        return schoolSports;
    }

    public void setSchoolSports(String schoolSports) {
        this.schoolSports = schoolSports;
    }

    public String getAttendanceRate() {
        return attendanceRate;
    }

    public void setAttendanceRate(String attendanceRate) {
        this.attendanceRate = attendanceRate;
    }

    public String getPctStuEnoughVariety() {
        return pctStuEnoughVariety;
    }

    public void setPctStuEnoughVariety(String pctStuEnoughVariety) {
        this.pctStuEnoughVariety = pctStuEnoughVariety;
    }

    public String getPctStuSafe() {
        return pctStuSafe;
    }

    public void setPctStuSafe(String pctStuSafe) {
        this.pctStuSafe = pctStuSafe;
    }

    public String getSchoolAccessibilityDescription() {
        return schoolAccessibilityDescription;
    }

    public void setSchoolAccessibilityDescription(String schoolAccessibilityDescription) {
        this.schoolAccessibilityDescription = schoolAccessibilityDescription;
    }

    public String getDirectionsOne() {
        return directionsOne;
    }

    public void setDirectionsOne(String directionsOne) {
        this.directionsOne = directionsOne;
    }

    public String getRequirementOneOne() {
        return requirementOneOne;
    }

    public void setRequirementOneOne(String requirementOneOne) {
        this.requirementOneOne = requirementOneOne;
    }

    public String getRequirementTwoOne() {
        return requirementTwoOne;
    }

    public void setRequirementTwoOne(String requirementTwoOne) {
        this.requirementTwoOne = requirementTwoOne;
    }

    public String getRequirementThreeOne() {
        return requirementThreeOne;
    }

    public void setRequirementThreeOne(String requirementThreeOne) {
        this.requirementThreeOne = requirementThreeOne;
    }

    public String getRequirementFourOne() {
        return requirementFourOne;
    }

    public void setRequirementFourOne(String requirementFourOne) {
        this.requirementFourOne = requirementFourOne;
    }

    public String getRequirementFiveOne() {
        return requirementFiveOne;
    }

    public void setRequirementFiveOne(String requirementFiveOne) {
        this.requirementFiveOne = requirementFiveOne;
    }

    public String getOfferRatelOne() {
        return offerRatelOne;
    }

    public void setOfferRatelOne(String offerRatelOne) {
        this.offerRatelOne = offerRatelOne;
    }

    public String getProgramOne() {
        return programOne;
    }

    public void setProgramOne(String programOne) {
        this.programOne = programOne;
    }

    public String getCodeOne() {
        return codeOne;
    }

    public void setCodeOne(String codeOne) {
        this.codeOne = codeOne;
    }

    public String getInterestOne() {
        return interestOne;
    }

    public void setInterestOne(String interestOne) {
        this.interestOne = interestOne;
    }

    public String getMethodOne() {
        return methodOne;
    }

    public void setMethodOne(String methodOne) {
        this.methodOne = methodOne;
    }

    public String getSeatsNineGel() {
        return seatsNineGel;
    }

    public void setSeatsNineGel(String seatsNineGel) {
        this.seatsNineGel = seatsNineGel;
    }

    public String getGradeNineGeFilledFlagOne() {
        return gradeNineGeFilledFlagOne;
    }

    public void setGradeNineGeFilledFlagOne(String gradeNineGeFilledFlagOne) {
        this.gradeNineGeFilledFlagOne = gradeNineGeFilledFlagOne;
    }

    public String getGradeNineGeApplicantsOne() {
        return gradeNineGeApplicantsOne;
    }

    public void setGradeNineGeApplicantsOne(String gradeNineGeApplicantsOne) {
        this.gradeNineGeApplicantsOne = gradeNineGeApplicantsOne;
    }

    public String getSeatsNineSwdOne() {
        return seatsNineSwdOne;
    }

    public void setSeatsNineSwdOne(String seatsNineSwdOne) {
        this.seatsNineSwdOne = seatsNineSwdOne;
    }

    public String getSeatsNineSwdFilledFlagOne() {
        return seatsNineSwdFilledFlagOne;
    }

    public void setSeatsNineSwdFilledFlagOne(String seatsNineSwdFilledFlagOne) {
        this.seatsNineSwdFilledFlagOne = seatsNineSwdFilledFlagOne;
    }

    public String getSeatsNineSwdApplicantsOne() {
        return seatsNineSwdApplicantsOne;
    }

    public void setSeatsNineSwdApplicantsOne(String seatsNineSwdApplicantsOne) {
        this.seatsNineSwdApplicantsOne = seatsNineSwdApplicantsOne;
    }

    public String getSeatsOneZerOne() {
        return seatsOneZerOne;
    }

    public void setSeatsOneZerOne(String seatsOneZerOne) {
        this.seatsOneZerOne = seatsOneZerOne;
    }

    public String getAdmissionsPriorityOneOne() {
        return admissionsPriorityOneOne;
    }

    public void setAdmissionsPriorityOneOne(String admissionsPriorityOneOne) {
        this.admissionsPriorityOneOne = admissionsPriorityOneOne;
    }

    public String getAdmissionsPriorityTwoOne() {
        return admissionsPriorityTwoOne;
    }

    public void setAdmissionsPriorityTwoOne(String admissionsPriorityTwoOne) {
        this.admissionsPriorityTwoOne = admissionsPriorityTwoOne;
    }

    public String getAdmissionsPriorityThreeOne() {
        return admissionsPriorityThreeOne;
    }

    public void setAdmissionsPriorityThreeOne(String admissionsPriorityThreeOne) {
        this.admissionsPriorityThreeOne = admissionsPriorityThreeOne;
    }

    public String getGrade9geApplicantsPerSeatOne() {
        return grade9geApplicantsPerSeatOne;
    }

    public void setGrade9geApplicantsPerSeatOne(String grade9geApplicantsPerSeatOne) {
        this.grade9geApplicantsPerSeatOne = grade9geApplicantsPerSeatOne;
    }

    public String getGrade9swdApplicantsPerSeatOne() {
        return grade9swdApplicantsPerSeatOne;
    }

    public void setGrade9swdApplicantsPerSeatOne(String grade9swdApplicantsPerSeatOne) {
        this.grade9swdApplicantsPerSeatOne = grade9swdApplicantsPerSeatOne;
    }

    public String getPrimaryAddressLineOne() {
        return primaryAddressLineOne;
    }

    public void setPrimaryAddressLineOne(String primaryAddressLineOne) {
        this.primaryAddressLineOne = primaryAddressLineOne;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCommunityBoard() {
        return communityBoard;
    }

    public void setCommunityBoard(String communityBoard) {
        this.communityBoard = communityBoard;
    }

    public String getCouncilDistrict() {
        return councilDistrict;
    }

    public void setCouncilDistrict(String councilDistrict) {
        this.councilDistrict = councilDistrict;
    }

    public String getCensusTract() {
        return censusTract;
    }

    public void setCensusTract(String censusTract) {
        this.censusTract = censusTract;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getBbl() {
        return bbl;
    }

    public void setBbl(String bbl) {
        this.bbl = bbl;
    }

    public String getNta() {
        return nta;
    }

    public void setNta(String nta) {
        this.nta = nta;
    }

    public String getBorough() {
        return borough;
    }

    public void setBorough(String borough) {
        this.borough = borough;
    }

}
