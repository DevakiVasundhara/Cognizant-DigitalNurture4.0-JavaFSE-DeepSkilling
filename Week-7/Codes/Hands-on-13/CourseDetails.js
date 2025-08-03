// src/components/CourseDetails.js
import React from 'react';

const CourseDetails = () => {
  const courses = [
    { id: 'c1', name: "React JS", duration: "30 Days" },
    { id: 'c2', name: "JavaScript", duration: "45 Days" },
    { id: 'c3', name: "Node.js", duration: "40 Days" }
  ];

  return (
    <div>
      <h2>🎓 Course Details</h2>
      <ul>
        {courses.map(course => (
          <li key={course.id}>
            {course.name} - Duration: {course.duration}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default CourseDetails;
