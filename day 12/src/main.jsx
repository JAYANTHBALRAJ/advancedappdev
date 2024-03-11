import React from 'react'
import ReactDOM from 'react-dom/client'
//import App from './App.jsx'
//import Login from './components/login.jsx'
import './assets/login.css';
//import footer from './components/footer.jsx';
import Navbar from './components/navbar.jsx';
//import Footer from './components/footer.jsx';
import HomePage from './components/Homepage.jsx';
import Footter from './components/footter.jsx';


//import Footer from './components/footer.jsx';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <Navbar/>
    {/* <Footer/> */}
    <HomePage/>
    <Footter/>
    
    
  </React.StrictMode>,
) 