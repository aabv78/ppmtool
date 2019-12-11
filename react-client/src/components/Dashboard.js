import React, {Component} from 'react';
import ProjectItem from "./ProjectItem";

class Dashboard extends Component {
    render() {
        return (
            <div>
                <h1 className="alert alert-warning">Welcome to the Dashboard</h1>
                <ProjectItem/>
            </div>
        );
    }
}

export default Dashboard;