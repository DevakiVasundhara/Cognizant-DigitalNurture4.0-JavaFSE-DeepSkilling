// src/components/ListOfPlayers.js
import React from 'react';

const ListOfPlayers = () => {
  const players = [
    { name: 'Virat', score: 95 },
    { name: 'Rohit', score: 88 },
    { name: 'KL Rahul', score: 67 },
    { name: 'Hardik', score: 55 },
    { name: 'Pant', score: 73 },
    { name: 'Jadeja', score: 62 },
    { name: 'Ashwin', score: 45 },
    { name: 'Shami', score: 80 },
    { name: 'Bumrah', score: 92 },
    { name: 'Kuldeep', score: 49 },
    { name: 'Surya', score: 99 },
  ];

  const below70 = players.filter(player => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
      <h3>Players with Score &lt; 70</h3>
      <ul>
        {below70.map((player, index) => (
          <li key={index}>{player.name} - {player.score}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
