import React from 'react';
import './BookCard.css'; 

const BookCard = ({ title, author, description, publicationYear }) => {
  return (
    <div className="book-card">
      <h3>{title}</h3>
      <p><strong>Author:</strong> {author}</p>
      <p><strong>Description:</strong> {description}</p>
      <p><strong>Published:</strong> {publicationYear}</p>
    </div>
  );
};

export default BookCard;
