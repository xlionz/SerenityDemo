#author: liongamesps47@gmail.com

Feature: Create a new meeting
  Me as user
  I want login on SerenityDemo
  To create a new meetin

  @CreateANewMeeting
  Scenario Outline: Create a new meeting
    Given "user" is in the url
    When login on serenitydemo
      | userName   | password   |
      | <userName> | <password> |
    And creates a new bussines unit and create a new meeting and create a new meeting
      | nameBussinesUnit   | meetingName   | meetingType   | meetingNumber   | starDate   | hourStar   | endDate   | hourEnd   | nameLocation   | addresLocation   | latitudeLocation   | longitudeLocation   | unit   | contacTitle   | contactFirstName   | contactLastName   | contactEmail   | contactId   | contactUser   | reporterTitle   | reporterFirstName   | reporterLastName   | reporterEmail   | reporterId   | reporterUser   | titleAttendee   | attendeeFirstName   | attendeeLastName   | attendeeEmail   | attendeeId   | attendeeUser   |
      | <nameBussinesUnit> | <meetingName> | <meetingType> | <meetingNumber> | <starDate> | <hourStar> | <endDate> | <hourEnd> | <nameLocation> | <addresLocation> | <latitudeLocation> | <longitudeLocation> | <unit> | <contacTitle> | <contactFirstName> | <contactLastName> | <contactEmail> | <contactId> | <contactUser> | <reporterTitle> | <reporterFirstName> | <reporterLastName> | <reporterEmail> | <reporterId> | <reporterUser> | <titleAttendee> | <attendeeFirstName> | <attendeeLastName> | <attendeeEmail> | <attendeeId> | <attendeeUser> |
    Then check that the meeting has been created with the name of "Challenge 989821"

    Examples:
      | userName | password | nameBussinesUnit | meetingName          | meetingType      | meetingNumber | starDate   | hourStar | endDate    | hourEnd | nameLocation | addresLocation         | latitudeLocation | longitudeLocation | unit    | contacTitle | contactFirstName | contactLastName | contactEmail   | contactId | contactUser | reporterTitle | reporterFirstName | reporterLastName | reporterEmail        | reporterId | reporterUser | titleAttendee | attendeeFirstName | attendeeLastName | attendeeEmail      | attendeeId | attendeeUser |
      | admin    | serenity | Proof QA 989821  | Reu Challenge 989821 | Challenge 989821 | 989821        | 03/02/2022 | 18:00    | 03/02/2022 | 18:30   | NameProof    | calle prueba numero QA | 123              | 321               | QA Unit | QA          | Pepito           | Perez           | proofQA@QA.com | 123321    | admin       | QA2           | Pep               | Per              | reportearQA@chou.com | 332        | admin        | QA            | Pepi              | ToPerez          | ettendee@email.com | 12323      | admin        |