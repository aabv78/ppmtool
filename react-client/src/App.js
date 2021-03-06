import React from 'react';
import './App.css';
import Dashboard from "./components/Dashboard";
import Header from "./components/Header";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/css/bootstrap.min.css";
import "@fortawesome/fontawesome-free/css/all.css";
import {BrowserRouter as Router, Route} from "react-router-dom";
import AddProject from "./components/AddProject";
import {Provider} from "react-redux";
import store from "./store";

function App() {
    return (
        <Provider store={store}>
            <Router>
                <div className="App">
                    <Header/>
                    <Route exact path={"/dashboard"} component={Dashboard}/>
                    <Route exact path={"/addProject"} component={AddProject}/>
                </div>
            </Router>
        </Provider>
    );
}

export default App;
