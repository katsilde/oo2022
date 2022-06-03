import { Link, Route, Routes } from 'react-router-dom';
import './App.css';
import Navbar from './components/Navbar';
import Add from './Pages/Add';
import Cart from './Pages/Cart';
import Home from './Pages/Home';
import Maintain from './Pages/Maintain';

function App() {
  return (
    <div className="App">
      <Navbar />
      <Routes>
        <Route path="" element={ <Home />} /> 
        <Route path="Lisa" element={ <Add />} />
        <Route path="Halda" element={ <Maintain />} /> 
        <Route path="ostukorv" element={ <Cart />} /> 
      </Routes>
    </div>
  );
}

export default App;
