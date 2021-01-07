package com.spotify.music.builtinauth.model;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.Assertion;

public class FieldValidator {

    public static class ValidationException extends Exception {
        private static final long serialVersionUID = 0;

        public ValidationException(String str) {
            super(str);
        }

        public ValidationException(String str, Throwable th) {
            super(str, th);
        }
    }

    public void a(String[] strArr, String str) {
        if (strArr == null || strArr.length == 0) {
            throw new ValidationException('\"' + str + "\" can not be empty");
        }
    }

    public void b(Object obj, Object obj2, String str) {
        if (!obj.equals(obj2)) {
            throw new ValidationException("Expected \"" + str + "\" to be " + obj + ", but was " + obj2);
        }
    }

    public void c(Object obj, String str, String str2) {
        try {
            try {
                if (obj.getClass().getField(str).get(obj) == null) {
                    throw new ValidationException('\"' + str2 + "\" has no value for key \"" + str + '\"');
                }
            } catch (IllegalAccessException e) {
                Assertion.g(" Error validating " + str2);
                throw new ValidationException('\"' + str2 + "\" has no value for key \"" + str + '\"', e);
            }
        } catch (NoSuchFieldException e2) {
            Assertion.g(" Error validating " + str2);
            throw new ValidationException('\"' + str2 + "\" has no value for key \"" + str + '\"', e2);
        }
    }

    public void d(String str, String str2) {
        if (MoreObjects.isNullOrEmpty(str)) {
            throw new ValidationException('\"' + str2 + "\" can not be empty");
        }
    }

    public void e(Object obj, String str) {
        if (obj == null) {
            throw new ValidationException(je.x0(str, " can't be null"));
        }
    }

    public void f(int i, int i2, int i3, String str) {
        if (i3 < i || i3 > i2) {
            throw new ValidationException('\"' + str + "\" " + i3 + " is not within range " + i + " to " + i2);
        }
    }
}
