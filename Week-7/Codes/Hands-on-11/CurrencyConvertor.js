// src/CurrencyConvertor.js
import React, { Component } from 'react';

class CurrencyConvertor extends Component {
  constructor() {
    super();
    this.state = {
      rupees: '',
      euro: ''
    };
  }

  handleChange = (e) => {
    this.setState({ rupees: e.target.value });
  };

  handleSubmit = () => {
    const rupees = parseFloat(this.state.rupees);
    if (isNaN(rupees)) {
      alert("Please enter a valid number");
      return;
    }
    const euroRate = 0.011; // You can adjust the rate as needed
    const euro = (rupees * euroRate).toFixed(2);
    this.setState({ euro });
  };

  render() {
    return (
      <div style={{ marginTop: '20px' }}>
        <h3>Currency Converter (₹ to €)</h3>
        <input
          type="number"
          placeholder="Enter amount in ₹"
          value={this.state.rupees}
          onChange={this.handleChange}
          style={{ marginRight: '10px' }}
        />
        <button onClick={this.handleSubmit}>Convert</button>

        {this.state.euro && (
          <p>Converted Amount in Euro: <strong>€{this.state.euro}</strong></p>
        )}
      </div>
    );
  }
}

export default CurrencyConvertor;
