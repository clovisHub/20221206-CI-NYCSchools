package com.clovis.dataprovider.cases;

import com.clovis.dataprovider.models.NewYorkCitySchool;
import com.clovis.dataprovider.models.SchoolSATData;

import java.util.List;

public interface SchoolsInterface {
    void updateSchoolsList(List<NewYorkCitySchool> schoolsList);

    void updateSchoolsSATScores(List<SchoolSATData> schoolsCores);
}
