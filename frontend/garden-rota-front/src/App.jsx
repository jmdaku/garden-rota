import React from "react";
import { Link, Route, Routes } from "react-router-dom";
import './App.css'

import Home from "../src/Home";
import Plants from "../src/Plants";
import Families from "../src/Families";
import Garden from "../src/Garden";

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
            Families
          </Link>
        </ul>
      </nav>

      
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/garden" element={<Garden />} />
        <Route path="/plant" element={<Plants />} />
        <Route path="/family" element={<Families />} />
    </Routes>
   
    </div>
  );
}
 
export default App
