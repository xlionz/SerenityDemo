package com.co.challenge.cer.serenitydemo.hooks;

import com.co.challenge.cer.serenitydemo.models.OrganizationAndMeet;
import io.cucumber.java.DataTableType;
import java.util.Map;

public class DataTablaOrganizationAndMeet {

    @DataTableType
    public OrganizationAndMeet TransformToOrganizationAndMeet(Map<String, String> data){
        return new OrganizationAndMeet(data.get("nameBussinesUnit"), data.get("meetingName"), data.get("meetingType"), data.get("meetingNumber"),
                data.get("starDate"), data.get("hourStar"), data.get("endDate"), data.get("hourEnd"), data.get("nameLocation"), data.get("addresLocation"),
                data.get("latitudeLocation"), data.get("longitudeLocation"), data.get("unit"), data.get("contacTitle"), data.get("contactFirstName"),
                data.get("contactLastName"), data.get("contactEmail"), data.get("contactId"), data.get("contactUser"), data.get("reporterTitle"),
                data.get("reporterFirstName"), data.get("reporterLastName"), data.get("reporterEmail"), data.get("reporterId"), data.get("reporterUser"), data.get("titleAttendee"),
                data.get("attendeeFirstName"), data.get("attendeeLastName"), data.get("attendeeEmail"), data.get("attendeeId"), data.get("attendeeUser"));
    }
}
