// src/App.js
import React, { Component } from 'react';
import CurrencyConvertor from './CurrencyConvertor';


class App extends Component {
  constructor() {
    super();
    this.state = {
      counter: 0,
    };
  }

  increment = () => {
    this.setState({ counter: this.state.counter + 1 });
    this.sayHello();
    this.showMessage();
  };

  decrement = () => {
    this.setState({ counter: this.state.counter - 1 });
  };

  sayHello = () => {
    console.log("Hello from Devaki!");
  };

  showMessage = () => {
    console.log("You clicked increment!");
  };

  sayWelcome = (msg) => {
    alert(msg);
  };

  handleSynthetic = (event) => {
    alert("I was clicked!");
    console.log("Synthetic Event:", event);
  };

  render() {
    return (
      <div style={{ padding: "20px" }}>
        <h2>Counter: {this.state.counter}</h2>
        <button onClick={this.increment}>Increment</button>&nbsp;
        <button onClick={this.decrement}>Decrement</button>

        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome to React Event Handling!")}>
          Say Welcome
        </button>

        <br /><br />
        <button onClick={this.handleSynthetic}>Synthetic Event (OnPress)</button>

        <br /><br />
        <CurrencyConvertor />
      </div>
    );
  }
}

export default App;
