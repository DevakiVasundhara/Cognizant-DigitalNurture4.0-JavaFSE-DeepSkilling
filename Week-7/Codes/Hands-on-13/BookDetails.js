// src/components/BookDetails.js
import React from 'react';

const BookDetails = () => {
  const books = [
    { id: 1, title: "React Simplified", author: "Max", price: 499 },
    { id: 2, title: "JavaScript Guide", author: "Kyle", price: 399 },
    { id: 3, title: "Design Patterns", author: "GOF", price: 599 }
  ];

  return (
    <div>
      <h2>📘 Book Details</h2>
      <ul>
        {books.map(book => (
          <li key={book.id}>
            <strong>{book.title}</strong> by {book.author} - ₹{book.price}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BookDetails;
