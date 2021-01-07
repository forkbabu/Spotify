package com.google.common.collect;

import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
public final class Serialization$FieldSetter<T> {
    private final Field field;

    Serialization$FieldSetter(Field field2, Serialization$1 serialization$1) {
        this.field = field2;
        field2.setAccessible(true);
    }

    /* access modifiers changed from: package-private */
    public void set(T t, Object obj) {
        try {
            this.field.set(t, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    public void set(T t, int i) {
        try {
            this.field.set(t, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
