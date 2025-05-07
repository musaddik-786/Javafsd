
// import { Link } from "react-router-dom";
// import './NormalHeader.css'; 
// import { Menu, Button } from 'semantic-ui-react';
// import { useNavigate } from 'react-router-dom';
// import React from 'react';

// const NormalHeader = () => {
//   const navigate = useNavigate();

//   const handleLogout = () => {
//     localStorage.removeItem('token');
//     localStorage.removeItem('role');
//     navigate('/user/login');
//   };

//   const handleRegisterClick = () => {
//     navigate('/register');
//   };

//   return (
//     <header className="header">
//       <div className="logo">
//         <h1>Book Management</h1>
//       </div>
     
//       <div className="ui menu">
//         <Button as={Link} to="/" basic>
//           Home
//         </Button>

//         <Button as={Link} to="/books" basic>
//           View Books
//         </Button>
        
//         <Button basic onClick={handleRegisterClick}>
//           Register
//         </Button>

//         <Button as={Link} to="/user/login" basic>
//           Login
//         </Button>

//         <Button onClick={handleLogout} as={Link} to="/user/login" basic>
//           Logout
//         </Button>
        
//       </div>
//     </header>
//   );
// };

// export default NormalHeader;



import { Link } from "react-router-dom";
import './NormalHeader.css'; 
import { useNavigate } from 'react-router-dom';
import React from 'react';

const NormalHeader = () => {
  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem('token');
    localStorage.removeItem('role');
    navigate('/user/login');
  };

  const handleRegisterClick = () => {
    navigate('/register');
  };

  return (
    <header className="header">
      <div className="logo">
        <h1>Book Management</h1>
      </div>
     
      <div className="menu">
        <Link to="/">
          <button className="btn">Home</button>
        </Link>

        <Link to="/books">
          <button className="btn">View Books</button>
        </Link>
        
        <button className="btn" onClick={handleRegisterClick}>
          Register
        </button>

        <Link to="/user/login">
          <button className="btn">Login</button>
        </Link>

        <Link to="/user/login">
          <button className="btn" onClick={handleLogout}>
            Logout
          </button>
        </Link>
      </div>
    </header>
  );
};

export default NormalHeader;
