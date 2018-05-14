package com.home.jsoner;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JsonerPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        JsonerExtension jsonerExtension = project.getExtensions().create("jsonerConfig", JsonerExtension.class);

        project.getTasks().create("toJsonGeneration", JsonerTask.class, jsonerTask -> {

            System.out.println("set annotation to property " + jsonerExtension.getJsonAnnotation());

            jsonerTask.setJsonAnnotation(jsonerExtension.getJsonAnnotation());
        });
    }
}
