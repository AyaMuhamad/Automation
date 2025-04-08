Feature: Ecommerce Cycle for Purchasing Product

  @testcase1
  Scenario: Product Search with Valid Input
    Given User Search with a Valid Data
    When Click on Search Result
    Then The Correct Data will Appear Successfully

  @testcase2
  Scenario: Add Product to Cart
    Given User Search with a Valid Data
    When Click on Search Result
    And Choose a Product
    And Add it to Cart
    Then The Product will Add to Cart Successfully


  @testcase3
  Scenario: AllOverProcess and apply invalid coupon
    Given User Search with a Valid Data
    When Click on Search Result
    And Choose a Product
    And Add it to Cart
    And Apply Invalid Coupon
    Then The Error Message Will Appears and the Code not Applied
