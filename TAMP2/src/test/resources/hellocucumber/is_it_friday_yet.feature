Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Search
    Given Customer open site
    When Customer perform search with 'QA'
    Then Customer see results
