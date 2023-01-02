// import logo from './logo.svg';
import './App.css';
import React from 'react';
import axios from 'axios';

class App extends React.Component {
  componentDidMount(){
    axios.get("/visual/queryProvinceExpenditure")
    .then(res => {
      console.log(res)
    })
  }
  render(){
    return(
      <div></div>
    );
  }
}

export default App;
