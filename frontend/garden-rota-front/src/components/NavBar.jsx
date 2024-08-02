import React from 'react';
import { Link } from 'react-router-dom'; 
import './NavBar.css';

const NavBar = () => {
  return (
    <nav className="navbar">
      <ul className="navbar-menu">
        <li><Link to="/">Home</Link></li>
        <li><Link to="/garden">Garden</Link></li>
        <li><Link to="/boxes">Garden Boxes</Link></li>
        <li><Link to="/plants">Plants</Link></li>
        <li><Link to="/families">Plant Families</Link></li>
      </ul>
    </nav>
  );
};

export default NavBar;