import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
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
        <Switch>
          <Route path="/" exact component={Home} />
          <Route path="/garden" component={Garden} />
          <Route path="/boxes" component={Boxes} />
          <Route path="/plants" component={Plants} />
          <Route path="/families" component={Families} />
        </Switch>
      </div>
    </Router>
  );
};

export default App
