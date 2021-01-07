package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class InvalidNullException extends MismatchedInputException {
    private static final long serialVersionUID = 1;
    protected final PropertyName _propertyName;

    protected InvalidNullException(DeserializationContext deserializationContext, String str, PropertyName propertyName) {
        super(deserializationContext.getParser(), str);
        this._propertyName = propertyName;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0015: APUT  (r1v0 java.lang.Object[]), (0 ??[int, short, byte, char]), (r0v1 java.lang.String) */
    public static InvalidNullException from(DeserializationContext deserializationContext, PropertyName propertyName, JavaType javaType) {
        String str;
        Object[] objArr = new Object[1];
        int i = ClassUtil.a;
        if (propertyName == null) {
            str = "<UNKNOWN>";
        } else {
            str = String.format("\"%s\"", propertyName);
        }
        objArr[0] = str;
        InvalidNullException invalidNullException = new InvalidNullException(deserializationContext, String.format("Invalid `null` value encountered for property %s", objArr), propertyName);
        if (javaType != null) {
            invalidNullException._targetType = javaType.getRawClass();
        }
        return invalidNullException;
    }
}
