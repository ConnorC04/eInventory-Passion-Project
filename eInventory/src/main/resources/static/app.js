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
    document.getElementById('addAssetForm').addEventListener('submit', function(event) {
        event.preventDefault();

        const equipmentType = document.getElementById('equipmentType').value;
        const equipmentAge = document.getElementById('equipmentAge').value;
        const equipmentSize = document.getElementById('equipmentSize').value;

        const newAsset = { equipmentType, equipmentAge, equipmentSize };
        assets.push(newAsset);

        // Optionally, update the DOM or send a request to your backend
        console.log(newAsset);
    });
});