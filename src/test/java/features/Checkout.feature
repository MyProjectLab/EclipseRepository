Feature:  place the order for the product
@PlaceOrder
Scenario Outline: Search experience for product search for both home and offer page

Given User is on GreenKart Landing page
When user search with Shortname <Name> and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceed to Checkout and validate the <Name> items in checkout page
And verify user has ability to enter promo code and place the order

Examples: 
| Name |
|  Tom |


