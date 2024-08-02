import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import NavBar from './components/NavBar';
import Home from './pages/Home';
import Boxes from './pages/Boxes';
import Plants from './pages/Plants';
import Families from './pages/Families';
import Garden from './pages/Garden';

import './App.css'


const App = () => {
  return (
    <Router>
      <div>
        <NavBar />
        <Routes>
          <Route path="/" element={Home} />
          <Route path="/garden" element={Garden} />
          <Route path="/boxes" element={Boxes} />
          <Route path="/plants" element={Plants} />
          <Route path="/families" element={Families} />
        </Routes>
      </div>
    </Router>
  );
};

export default App
