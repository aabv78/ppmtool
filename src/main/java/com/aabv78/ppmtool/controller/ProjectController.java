package com.aabv78.ppmtool.controller;

import com.aabv78.ppmtool.domain.Project;
import com.aabv78.ppmtool.service.MapErrorService;
import com.aabv78.ppmtool.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private MapErrorService mapErrorService;

    @PostMapping
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){

        ResponseEntity<?> errorMap = mapErrorService.mapResult(result);
        if (errorMap!=null) return errorMap;

        Project newProject =  projectService.saveOrUpdateProject(project);
        return new ResponseEntity<>(newProject, HttpStatus.CREATED);
    }

    @GetMapping("/{projectIdentifier}")
    public ResponseEntity<?> findByProjectIdentifier(@PathVariable String projectIdentifier){

        Project newProject =  projectService.findByProjectIdentifier(projectIdentifier);
        return new ResponseEntity<>(newProject, HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Project> findAllProjects(){
        return projectService.findAllProjects();
    }

    @DeleteMapping("/{projectIdentifier}")
    public ResponseEntity<?> deleteByProjectIdentifier(@PathVariable String projectIdentifier){
        projectService.deleteByProjectIdentifier(projectIdentifier);
        return new ResponseEntity<>("Project '"+ projectIdentifier +"' deleted", HttpStatus.OK);

    }


}
