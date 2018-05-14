package com.home.jsoner;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class JsonerTask extends DefaultTask {

    private Class<?> jsonAnnotation;

    public Class<?> getJsonAnnotation() {
        return jsonAnnotation;
    }

    public void setJsonAnnotation(Class<?> jsonAnnotation) {
        this.jsonAnnotation = jsonAnnotation;
    }

    @TaskAction
    public void generate() {

        System.out.println("Jsoner task is run. Annotation is " + getJsonAnnotation());

    }
}
