import React from 'react';

const IndianPlayers = () => {
  const oddTeam = ['Virat', 'KL Rahul', 'Pant', 'Ashwin', 'Bumrah'];
  const evenTeam = ['Rohit', 'Hardik', 'Jadeja', 'Shami', 'Kuldeep', 'Surya'];

  // Destructuring
  const [firstOdd, secondOdd, ...remainingOdd] = oddTeam;
  const [firstEven, secondEven, ...remainingEven] = evenTeam;

  // Merging using spread operator
  const T20players = ['Virat', 'Rohit', 'Pant'];
  const RanjiTrophy = ['Pujara', 'Rahane', 'Iyer'];
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        {[firstOdd, secondOdd, ...remainingOdd].map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        {[firstEven, secondEven, ...remainingEven].map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged T20 and Ranji Trophy Players</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
