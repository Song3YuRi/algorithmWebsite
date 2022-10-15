import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Login from './Page/Login';
import SignUp from './Page/SignUp';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path='/login' element={<Login />}/>
        <Route path='/signup' element={<SignUp />}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;
