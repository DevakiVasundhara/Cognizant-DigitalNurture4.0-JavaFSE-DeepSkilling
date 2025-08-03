// src/App.js
import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [activeComponent, setActiveComponent] = useState('book');

  // Ternary operator rendering
  const renderComponent = () => {
    if (activeComponent === 'book') return <BookDetails />;
    else if (activeComponent === 'blog') return <BlogDetails />;
    else if (activeComponent === 'course') return <CourseDetails />;
    else return <p>No component selected</p>;
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>🧑‍💻 Blogger App - Conditional Rendering</h1>

      {/* Buttons to switch components */}
      <button onClick={() => setActiveComponent('book')}>Show Books</button>&nbsp;
      <button onClick={() => setActiveComponent('blog')}>Show Blogs</button>&nbsp;
      <button onClick={() => setActiveComponent('course')}>Show Courses</button>

      <hr />

      {/* Render based on state */}
      {renderComponent()}

      <hr />

      {/* Short Circuit rendering */}
      {activeComponent === 'book' && <p>Book component is selected ✅</p>}

      {/* Element variable rendering */}
      <p>
        {activeComponent === 'course'
          ? "You're learning Courses."
          : activeComponent === 'blog'
          ? "You're reading Blogs."
          : "You're browsing Books."}
      </p>
    </div>
  );
}

export default App;
