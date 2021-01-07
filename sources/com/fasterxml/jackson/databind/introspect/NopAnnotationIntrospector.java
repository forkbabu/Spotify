package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import java.io.Serializable;

public abstract class NopAnnotationIntrospector extends AnnotationIntrospector implements Serializable {
    public static final NopAnnotationIntrospector instance = new NopAnnotationIntrospector() {
        /* class com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector.AnonymousClass1 */
        private static final long serialVersionUID = 1;
    };
    private static final long serialVersionUID = 1;
}
