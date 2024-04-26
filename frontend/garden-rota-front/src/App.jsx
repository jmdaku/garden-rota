import React from "react";
import { Link, Route, Routes } from "react-router-dom";
import './App.css'

import Home from "../src/Home";
import Courses from "../src/Plants";
import Live from "../src/Families";
import Contact from "../src/Garden";

function App() {
  return (
    <div className="container">
      <nav>
        <ul>
          <Link to="/" class="list">
            Home
          </Link>
          <Link to="/garden" class="list">
            Garden
          </Link>
          <Link to="/plant" class="list">
            Plants
          </Link>
          <Link to="/family" class="list">
            Plant Families
          </Link>
        </ul>
      </nav>

      
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/garden" element={<Garden />} />
        <Route path="/plant" element={<Plants />} />
        <Route path="/family" element={<Plant Families />} />
    </Routes>
   
    </div>
  );
}
 
export default App
