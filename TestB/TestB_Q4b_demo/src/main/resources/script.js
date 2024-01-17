document.getElementById('shippingForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Collect form data
    var length = document.getElementById('length').value;
    var width = document.getElementById('width').value;
    var height = document.getElementById('height').value;
    var weight = document.getElementById('weight').value;
    var temperatureCondition = document.getElementById('temperatureCondition').value;
    var quantity = document.getElementById('quantity').value;

    // Create the request payload
    var data = {
        items: [
            {
                length: length,
                width: width,
                height: height,
                weight: weight,
                temperatureCondition: temperatureCondition,
                quantity: quantity
            }
        ]
    };

    // Send data to the API
    fetch('/calculateShippingFee', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
    .then(response => response.json())
    .then(data => {
        // Display the result
        document.getElementById('result').textContent = 'Total Shipping Fee: ' + data.totalShippingFee;
    })
    .catch((error) => {
        // Handle any errors
        console.error('Error:', error);
    });
});