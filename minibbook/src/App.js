import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'; // <-- add these imports
import Homepage from '../src/Page/Homepage/Homepage.jsx'; // adjust the path as needed
import Books from '../src/Page/Book/Book.jsx';       // adjust the path as needed

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Homepage />} />
        <Route path="/books" element={<Books />} /> 
      </Routes>
    </Router>
  );
}

export default App;
