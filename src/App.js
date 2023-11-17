import React from 'react'
import './App.css'
import { Route, Routes } from "react-router-dom";
import Welcome from "./pages/welecome/Welcome";


const App = () => {
  return (
    <div className="App">
    <Routes>
      <Route path="/" element={<Welcome />} />
    </Routes>
  </div>
  )
}

export default App
