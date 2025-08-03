// src/App.js
import React, { Component } from 'react';
import GuestPage from './Components/GuestPage';
import UserPage from './Components/UserPage';

class App extends Component {
  constructor() {
    super();
    this.state = {
      isLoggedIn: false
    };
  }

  handleLogin = () => {
    this.setState({ isLoggedIn: true });
  };

  handleLogout = () => {
    this.setState({ isLoggedIn: false });
  };

  render() {
    const { isLoggedIn } = this.state;

    let pageContent;
    if (isLoggedIn) {
      pageContent = <UserPage />;
    } else {
      pageContent = <GuestPage />;
    }

    return (
      <div style={{ padding: '20px' }}>
        <h1>✈️ Flight Ticket Booking App</h1>
        {isLoggedIn ? (
          <button onClick={this.handleLogout}>Logout</button>
        ) : (
          <button onClick={this.handleLogin}>Login</button>
        )}
        <hr />
        {pageContent}
      </div>
    );
  }
}

export default App;
