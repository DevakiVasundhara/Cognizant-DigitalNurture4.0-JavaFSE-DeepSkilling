// src/App.js
import React from 'react';

function App() {
  const officeList = [
  {
    name: "Ocean View Workspace",
    rent: 45000,
    address: "Beach Road, Vizag",
    image: "https://images.unsplash.com/photo-1504384308090-c894fdcc538d?auto=format&fit=crop&w=400&q=80"
  },
  {
    name: "TechPark Office",
    rent: 75000,
    address: "MVP Colony, Vizag",
    image: "https://images.unsplash.com/photo-1570129477492-45c003edd2be?auto=format&fit=crop&w=400&q=80"
  },
  {
    name: "Startup Bay",
    rent: 60000,
    address: "Dwaraka Nagar, Vizag",
    image: "https://images.unsplash.com/photo-1600585154356-596af9009e8b?auto=format&fit=crop&w=400&q=80"
  }
];


  return (
    <div style={{ padding: "20px" }}>
      {/* JSX Heading */}
      <h1 style={{ textAlign: 'center' }}>🏢 Office Space Rentals</h1>

      {/* Loop through offices */}
      {officeList.map((office, index) => (
        <div key={index} style={{
          border: '1px solid grey',
          margin: '10px',
          padding: '10px',
          borderRadius: '10px'
        }}>
          {/* JSX Image attribute */}
          <img src={office.image} alt={office.name} style={{ width: "150px", borderRadius: "8px" }} />
          
          {/* JSX Data Display */}
          <h2>{office.name}</h2>
          <p><strong>Address:</strong> {office.address}</p>
          
          {/* Conditional Inline CSS */}
          <p style={{
            color: office.rent < 60000 ? 'red' : 'green',
            fontWeight: 'bold'
          }}>
            Rent: ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
