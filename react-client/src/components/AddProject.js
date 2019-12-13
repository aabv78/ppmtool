import React, {Component} from 'react';

class AddProject extends Component {
    constructor(){
        super();

        this.state={
            projectName: "",
            projectIdentifier: "",
            projectDescription: "",
            projectStartDate: "",
            projectEndDate: ""
        };

        this.onChange=this.onChange.bind(this);
        this.onSubmit=this.onSubmit.bind(this);
    }

    onChange(e){
        // this.setState({projectName:e.target.value})
        this.setState({[e.target.name]:e.target.value})
    }

    onSubmit(e){
        const newProject = {
            projectName: this.state.projectName,
            projectIdentifier: this.state.projectIdentifier,
            projectDescription: this.state.projectDescription,
            projectStartDate: this.state.projectStartDate,
            projectEndDate: this.state.projectEndDate
        };
        console.log(newProject);
    }

    render() {
        return (
            <div>
                {
                    //check name attribute input fields --> fieldname HAS TO MATCH name in backend (Project.java)
                    //create constructor
                    //set state
                    //set value on input fields
                    //create onChange
                    //set onChange on each input field
                    //bind on constructor
                    //check state change in the react extension
                }

                <div className="register">
                    <div className="container">
                        <div className="row">
                            <div className="col-md-8 m-auto">
                                <h5 className="display-4 text-center">Create / Edit Project form</h5>
                                <hr/>
                                <form onSubmit={this.onSubmit}>
                                    <div className="form-group">
                                        <input type="text" className="form-control form-control-lg"
                                               placeholder="Project Name"
                                               name={"projectName"}
                                               value={this.state.projectName}
                                               onChange={this.onChange}
                                        />
                                    </div>
                                    <div className="form-group">
                                        <input type="text" className="form-control form-control-lg"
                                               placeholder="Unique Project ID"
                                               name={"projectIdentifier"}
                                               value={this.state.projectIdentifier}
                                               onChange={this.onChange}
                                        />
                                    </div>
                                    <div className="form-group">
                                        <textarea className="form-control form-control-lg"
                                                  placeholder="Project Description"
                                                  name={"projectDescription"}
                                                  value={this.state.projectDescription}
                                                  onChange={this.onChange}
                                        >
                                        </textarea>
                                    </div>
                                    <h6>Start Date</h6>
                                    <div className="form-group">
                                        <input type="date" className="form-control form-control-lg"
                                               name={"projectStartDate"}
                                               value={this.state.projectStartDate}
                                               onChange={this.onChange}
                                        />
                                    </div>
                                    <h6>Estimated End Date</h6>
                                    <div className="form-group">
                                        <input type="date" className="form-control form-control-lg"
                                               name={"projectEndDate"}
                                               value={this.state.projectEndDate}
                                               onChange={this.onChange}
                                        />
                                    </div>

                                    <input type="submit" className="btn btn-primary btn-block mt-4"/>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        );
    }
}

export default AddProject;