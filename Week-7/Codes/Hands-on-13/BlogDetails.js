// src/components/BlogDetails.js
import React from 'react';

const BlogDetails = () => {
  const blogs = [
    { id: 101, title: "React Hooks", date: "Aug 1" },
    { id: 102, title: "State vs Props", date: "Aug 2" },
    { id: 103, title: "React Lifecycle", date: "Aug 3" }
  ];

  return (
    <div>
      <h2>📝 Blog Posts</h2>
      <ul>
        {blogs.map(blog => (
          <li key={blog.id}>
            {blog.title} - <i>{blog.date}</i>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BlogDetails;
