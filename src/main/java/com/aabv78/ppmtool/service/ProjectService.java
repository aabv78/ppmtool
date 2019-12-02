package com.aabv78.ppmtool.service;

import com.aabv78.ppmtool.domain.Project;
import com.aabv78.ppmtool.exception.ProjectException;
import com.aabv78.ppmtool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch (Exception e){
            throw new ProjectException("Project: " + project.getProjectIdentifier().toUpperCase() + " already exists");
        }

    }

    public Project findByProjectIdentifier(String projectIdentifier){

        projectIdentifier = projectIdentifier.toUpperCase();

        Project project = projectRepository.findByProjectIdentifier(projectIdentifier);

        if (project==null){
            throw new ProjectException("Project: " + projectIdentifier + " does not exists");
        }
        return project;
    }

    public Iterable<Project> findAllProjects(){
        return projectRepository.findAll();
    }

    public void deleteByProjectIdentifier(String projectIdentifier){

        projectIdentifier = projectIdentifier.toUpperCase();

        Project project = findByProjectIdentifier(projectIdentifier);

        if (project!=null){
            projectRepository.delete(project);
        }


    }

}
