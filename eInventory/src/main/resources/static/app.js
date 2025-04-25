document.addEventListener("DOMContentLoaded", function() {
    // Example data (replace with API data or dynamic data)
    const assets = [
        { equipmentType: "Shin Pad", equipmentAge: "SENIOR", equipmentSize: "SMALL" },
        { equipmentType: "Helmet", equipmentAge: "SENIOR", equipmentSize: "MEDIUM" }
    ];

    const assetsContainer = document.getElementById('assets');

    // Loop through assets and display them
    assets.forEach(asset => {
        const assetElement = document.createElement('div');
        assetElement.classList.add('asset');
        assetElement.innerHTML = `
            <h3>${asset.equipmentType}</h3>
            <p>Age: ${asset.equipmentAge}</p>
            <p>Size: ${asset.equipmentSize}</p>
        `;
        assetsContainer.appendChild(assetElement);
    });

    // Handle form submission
    document.getElementById("addAssetForm").addEventListener("submit", function(event) {
        event.preventDefault(); // Prevent page reload on form submission

        // Collect form values
        const equipmentType = document.getElementById("equipmentType").value;
        const equipmentAge = document.getElementById("equipmentAge").value;
        const equipmentSize = document.getElementById("equipmentSize").value;

        // Log the data to the console
        console.log("New Asset Added:");
        console.log("Equipment Type:", equipmentType);
        console.log("Equipment Age:", equipmentAge);
        console.log("Equipment Size:", equipmentSize);

        // Optionally, clear the form after submission
        document.getElementById("addAssetForm").reset();
    });
});