package TestB;

public class TestB_Q4 {

//     API Endpoint Design:

// Endpoint: /calculateShippingFee

// Method: POST

// Content-Type: application/json

//Request Body Structure:
// {
//     "items": [
//       {
//         "length": "cm",
//         "width": "cm",
//         "height": "cm",
//         "weight": "kg",
//         "temperatureCondition": "Chill/Normal/Freeze",
//         "quantity": "int"
//       },
//       ...
//     ]
//   }
// API Specification:

// The API will accept a list of items, each with length, width, height, weight, temperature condition, and quantity.

// The temperature condition for all items in a request will be the same.

// The API will calculate the volumetric weight for each item using the formula (length x width x height) / 5000 and compare it with the physical weight to determine the chargeable weight (the higher of the two).

// The API will then calculate the total shipping fee based on the chargeable weight, temperature condition, and quantity, using the provided rate card.


    
}
