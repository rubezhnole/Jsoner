package com.home.jsoner;

public class JsonerExtension {

    private Class<?> jsonAnnotation;

    public JsonerExtension() {

    }

    public Class<?> getJsonAnnotation() {
        return jsonAnnotation;
    }

    public void setJsonAnnotation(Class<?> jsonAnnotation) {
        this.jsonAnnotation = jsonAnnotation;
    }
}
