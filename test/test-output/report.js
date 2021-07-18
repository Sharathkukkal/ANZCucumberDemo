$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/ANZ_Workspace/test/src/main/java/feature/anz_testfeature.feature");
formatter.feature({
  "line": 1,
  "name": "loading banking site page",
  "description": "",
  "id": "loading-banking-site-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User is able to load and navigate to estimation page",
  "description": "",
  "id": "loading-banking-site-page;user-is-able-to-load-and-navigate-to-estimation-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is opening the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter\u0027s the correct URL\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is able to navigate to expected page",
  "keyword": "Then "
});
formatter.match({
  "location": "UserNavigation.user_is_opening_browser()"
});
formatter.result({
  "duration": 2193365400,
  "status": "passed"
});
formatter.match({
  "location": "UserNavigation.user_enter_s_the_correct_URL()"
});
formatter.result({
  "duration": 5727302600,
  "status": "passed"
});
formatter.match({
  "location": "UserNavigation.user_is_able_to_navigate_to_expected_page()"
});
formatter.result({
  "duration": 232546800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User is able to view the borrowing capacity by entering by filling the form and able to clear it.",
  "description": "",
  "id": "loading-banking-site-page;user-is-able-to-view-the-borrowing-capacity-by-entering-by-filling-the-form-and-able-to-clear-it.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user is in calculator page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "a person is single",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "person has 0 dependants,",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "person is\tbuying a home to live in,",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "person with income of $80,000,",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "person has other income $10,000,",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "person\u0027s living expenses $500,",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "person\u0027s current home loan repayments $0,",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "person\u0027s other loan repayments $100,",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "person\u0027s other commitments $0",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "person\u0027s total credit card limits $10,000",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "person\u0027s borrowing capacity would be $479,000.",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "start over button is visible and active",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user clicks start over button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "form fields values get cleared",
  "keyword": "Then "
});
formatter.match({
  "location": "BorrowEstimator.user_is_in_calculator_page()"
});
formatter.result({
  "duration": 5355964600,
  "status": "passed"
});
formatter.match({
  "location": "BorrowEstimator.a_person_is_single()"
});
formatter.result({
  "duration": 89274600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 11
    }
  ],
  "location": "BorrowEstimator.person_has_dependants(int)"
});
formatter.result({
  "duration": 72042800,
  "status": "passed"
});
formatter.match({
  "location": "BorrowEstimator.person_is_buying_a_home_to_live_in()"
});
formatter.result({
  "duration": 70148100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "80",
      "offset": 23
    },
    {
      "val": "000",
      "offset": 26
    }
  ],
  "location": "BorrowEstimator.person_with_income_of_$(int,int)"
});
formatter.result({
  "duration": 123879000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 25
    },
    {
      "val": "000",
      "offset": 28
    }
  ],
  "location": "BorrowEstimator.person_has_other_income_$(int,int)"
});
formatter.result({
  "duration": 117511900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 26
    }
  ],
  "location": "BorrowEstimator.person_s_living_expenses_$(int)"
});
formatter.result({
  "duration": 113751500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 39
    }
  ],
  "location": "BorrowEstimator.person_s_current_home_loan_repayments_$(int)"
});
formatter.result({
  "duration": 86289200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 32
    }
  ],
  "location": "BorrowEstimator.person_s_other_loan_repayments_$(int)"
});
formatter.result({
  "duration": 118263200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 28
    }
  ],
  "location": "BorrowEstimator.person_s_other_commitments_$(int)"
});
formatter.result({
  "duration": 97628600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 35
    },
    {
      "val": "000",
      "offset": 38
    }
  ],
  "location": "BorrowEstimator.person_s_total_credit_card_limits_$(int,int)"
});
formatter.result({
  "duration": 144285200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "479",
      "offset": 38
    },
    {
      "val": "000",
      "offset": 42
    }
  ],
  "location": "BorrowEstimator.person_s_borrowing_capacity_would_be_$(int,int)"
});
formatter.result({
  "duration": 4145613500,
  "status": "passed"
});
formatter.match({
  "location": "BorrowEstimator.start_over_button_is_visible_and_active()"
});
formatter.result({
  "duration": 63818900,
  "status": "passed"
});
formatter.match({
  "location": "BorrowEstimator.user_clicks_start_over_button()"
});
formatter.result({
  "duration": 70248100,
  "status": "passed"
});
formatter.match({
  "location": "BorrowEstimator.form_fields_values_get_cleared()"
});
formatter.result({
  "duration": 245995200,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Application displays the expected warning message when user fails to enter the expected details.",
  "description": "",
  "id": "loading-banking-site-page;application-displays-the-expected-warning-message-when-user-fails-to-enter-the-expected-details.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 31,
  "name": "user is in borrow calculator page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user enter\u0027s \u0027$1\u0027 in the living expense field.",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user leves other field value as zero.",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user click\u0027s Work out how much I could borrow button",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user is able to view the expected message in application",
  "keyword": "Then "
});
formatter.match({
  "location": "SinglefieldEntryTest.user_is_in_borrow_calculator_page()"
});
formatter.result({
  "duration": 5037355400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "SinglefieldEntryTest.user_enter_s_$_in_the_living_expense_field(int)"
});
formatter.result({
  "duration": 79015500,
  "status": "passed"
});
formatter.match({
  "location": "SinglefieldEntryTest.user_leves_other_field_value_as_zero()"
});
formatter.result({
  "duration": 408386500,
  "status": "passed"
});
formatter.match({
  "location": "SinglefieldEntryTest.user_click_s_Work_out_how_much_I_could_borrow_button()"
});
formatter.result({
  "duration": 2100893600,
  "status": "passed"
});
formatter.match({
  "location": "SinglefieldEntryTest.user_is_able_to_view_the_expected_message_in_application()"
});
formatter.result({
  "duration": 145673300,
  "status": "passed"
});
});