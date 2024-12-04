// import React, {useEffect, useState} from "react";
// import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
// import Home from "./Home";
// import List from "./List";
// function App() {
//     const [state, setState] = useState([]);
//
//     return (
//             <Router>
//                 <Routes>
//                     <Route path="/" element={<Home />} />
//                     <Route path="/list" element={<List />} />
//                 </Routes>
//             </Router>
//     );
// }
//
// export default App;

import React from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Home from "./Home";
import List from "./List";

function App() {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/list" element={<List />} />
            </Routes>
        </Router>
    );
}

export default App;