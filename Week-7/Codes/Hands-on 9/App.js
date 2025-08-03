// src/App.js
import React from 'react';
import ListOfPlayers from './Components/Listofplayers';
import IndianPlayers from './Components/Indianplayers';

function App() {
  const flag = false; // toggle this to false to show other component

  return (
    <div className="App">
      <h1>🏏 Cricket App</h1>
      {flag ? <ListOfPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
