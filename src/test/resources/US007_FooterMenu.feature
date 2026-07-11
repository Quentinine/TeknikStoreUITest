Feature: Footer menu objects

  Background:
    Given User opens the website.
    Given User scrolls down the page.

  Scenario: User successfully opens "Yeni Üyelik" url.
    When User clicks 'Yeni üyelik'.
    Then User directs to 'Yeni Üyelik' page.

  Scenario: User successfully opens "Uye Girişi" url.
    When User clicks 'Üye Girişi'.
    Then User directs to 'Üye Girişi' page.

  Scenario: User successfully opens "Şifremi Unuttum" url.
    When User clicks 'Şifremi Unuttum'.
    Then User directs to 'Şifremi Unuttum' page.

  Scenario: User successfully opens "İletişim" url.
    When
    Then

