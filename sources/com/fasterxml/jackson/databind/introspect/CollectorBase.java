package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* access modifiers changed from: package-private */
public class CollectorBase {
    protected static final Annotation[] NO_ANNOTATIONS = new Annotation[0];
    protected static final AnnotationMap[] NO_ANNOTATION_MAPS = new AnnotationMap[0];
    protected final AnnotationIntrospector _intr;

    protected CollectorBase(AnnotationIntrospector annotationIntrospector) {
        this._intr = annotationIntrospector;
    }

    static AnnotationMap[] _emptyAnnotationMaps(int i) {
        if (i == 0) {
            return NO_ANNOTATION_MAPS;
        }
        AnnotationMap[] annotationMapArr = new AnnotationMap[i];
        for (int i2 = 0; i2 < i; i2++) {
            annotationMapArr[i2] = new AnnotationMap();
        }
        return annotationMapArr;
    }

    /* access modifiers changed from: protected */
    public final AnnotationCollector collectAnnotations(Annotation[] annotationArr) {
        AnnotationCollector annotationCollector = AnnotationCollector.EmptyCollector.instance;
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.addOrOverride(annotation);
            if (this._intr.isAnnotationBundle(annotation)) {
                annotationCollector = collectFromBundle(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    /* access modifiers changed from: protected */
    public final AnnotationCollector collectDefaultAnnotations(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.isPresent(annotation)) {
                annotationCollector = annotationCollector.addOrOverride(annotation);
                if (this._intr.isAnnotationBundle(annotation)) {
                    Annotation[] findClassAnnotations = ClassUtil.findClassAnnotations(annotation.annotationType());
                    for (Annotation annotation2 : findClassAnnotations) {
                        if (!((annotation2 instanceof Target) || (annotation2 instanceof Retention)) && !annotationCollector.isPresent(annotation2)) {
                            annotationCollector = annotationCollector.addOrOverride(annotation2);
                            if (this._intr.isAnnotationBundle(annotation2)) {
                                annotationCollector = collectFromBundle(annotationCollector, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return annotationCollector;
    }

    /* access modifiers changed from: protected */
    public final AnnotationCollector collectFromBundle(AnnotationCollector annotationCollector, Annotation annotation) {
        Annotation[] findClassAnnotations = ClassUtil.findClassAnnotations(annotation.annotationType());
        for (Annotation annotation2 : findClassAnnotations) {
            if (!((annotation2 instanceof Target) || (annotation2 instanceof Retention))) {
                if (!this._intr.isAnnotationBundle(annotation2)) {
                    annotationCollector = annotationCollector.addOrOverride(annotation2);
                } else if (!annotationCollector.isPresent(annotation2)) {
                    annotationCollector = collectFromBundle(annotationCollector.addOrOverride(annotation2), annotation2);
                }
            }
        }
        return annotationCollector;
    }

    /* access modifiers changed from: protected */
    public final AnnotationCollector collectAnnotations(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.addOrOverride(annotation);
            if (this._intr.isAnnotationBundle(annotation)) {
                annotationCollector = collectFromBundle(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }
}
