// src/App.js
import React from 'react';
import CohortDetails from './CohortDetails';

function App() {
  const cohorts = [
    {
      name: "React Basics - July",
      status: "ongoing",
      startDate: "2025-07-01",
      endDate: "2025-08-01"
    },
    {
      name: "Spring Boot - June",
      status: "completed",
      startDate: "2025-06-01",
      endDate: "2025-07-01"
    }
  ];

  return (
    <div>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
