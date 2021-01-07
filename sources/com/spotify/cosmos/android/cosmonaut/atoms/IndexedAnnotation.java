package com.spotify.cosmos.android.cosmonaut.atoms;

import java.lang.annotation.Annotation;

class IndexedAnnotation<T extends Annotation> {
    final T mAnnotation;
    final int mIndex;

    IndexedAnnotation(T t, int i) {
        this.mAnnotation = t;
        this.mIndex = i;
    }
}
