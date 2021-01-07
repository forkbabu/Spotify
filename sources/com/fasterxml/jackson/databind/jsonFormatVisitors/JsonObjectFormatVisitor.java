package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;

public interface JsonObjectFormatVisitor {
    void optionalProperty(BeanProperty beanProperty);

    void property(BeanProperty beanProperty);

    void property(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
