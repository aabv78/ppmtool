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
            throw new ProjectException("Project: " + project.getProjectIdentifier() + " already exists");
        }

    }


}
