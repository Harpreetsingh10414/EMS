import logo from './logo.svg';
import './App.css';
import Header from "./pages/header/Header"
import { Route, Routes } from 'react-router-dom';
import Dashboard from './pages/dashboard/Dashboard';
import PostUser from './pages/employee/PostUser';
import ErrorFour from './pages/buffer/ErrorFour';
import SignUp from './pages/SignOpt/SignUp';

function App() {
  return (
   <>
   <Header />
   <Routes>
    <Route  path="/" element={<Dashboard/>} />
    <Route  path="/employee" element={<PostUser/>} />  
    <Route  path="/signup" element={<SignUp/>} />  
    <Route  path="*" element={<ErrorFour/>} />  


   </Routes>
   </>
  );
}

export default App;
