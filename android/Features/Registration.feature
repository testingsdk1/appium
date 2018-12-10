Feature: Registration


Scenario: Launch App >> Select Hotels >> Read out the first 5 Hotel Names and their rates.
Given The application is launched
When I tap on "phoneNumberTextBox" element
Then I enter "mobileNumber" having className "editTextView" with 0 index
When I tap on "NEXT" element
When I tap on "loginviaOtp" element
Then The user waits for sms to get autofiled
Then The text "Home" for id "homeId" is verified
When I tap on "askmeLater" element
Then I Click on "textView" with "Hotels" text using List
When I tap on "hotelSearchCityTextbox" element
Then I enter "Sikanderpur" having className "editTextView" with 0 index
When I tap on "searchPrimaryText" element
When I tap on "SEARCH" element
When I tap on "sortFilter" element
Then I Click on "textView" with "UserRating" text using List




#Sample Scenarios:
#1. Launch App >> Select Hotels >> In Hotel Search, Input "Sikanderpur" >> Search
#Rooms >> Sort by User Rating >> Read out the first 5 Hotel Names and their rates.
#2. Launch App >> Login >> Go to My Account >> Change userName provided.
#Candidate needs to share the code for the same on their github account. 

#Scenario: Invalid OTP Assertion on the OTP page and very all elements on the OTP Page
#Given The application is launched
#When I tap on "phoneNumberTextBox" element
#Then I enter "mobileNumber" having className "editTextView" with 0 index
#When I tap on "NEXT" element
#When I tap on "createNewAccount" element
#Then The user waits for sms to get autofiled
#Then I enter "password" having className "editTextView" with 0 index
#Then I tap on "imageView" with 1 index





