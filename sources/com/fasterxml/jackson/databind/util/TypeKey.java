package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;

public class TypeKey {
    protected Class<?> _class;
    protected int _hashCode;
    protected boolean _isTyped;
    protected JavaType _type;

    public TypeKey() {
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != TypeKey.class) {
            return false;
        }
        TypeKey typeKey = (TypeKey) obj;
        if (typeKey._isTyped != this._isTyped) {
            return false;
        }
        Class<?> cls = this._class;
        if (cls == null) {
            return this._type.equals(typeKey._type);
        }
        if (typeKey._class == cls) {
            return true;
        }
        return false;
    }

    public Class<?> getRawType() {
        return this._class;
    }

    public JavaType getType() {
        return this._type;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public boolean isTyped() {
        return this._isTyped;
    }

    public final String toString() {
        if (this._class != null) {
            StringBuilder V0 = je.V0("{class: ");
            V0.append(this._class.getName());
            V0.append(", typed? ");
            return je.P0(V0, this._isTyped, "}");
        }
        StringBuilder V02 = je.V0("{type: ");
        V02.append(this._type);
        V02.append(", typed? ");
        return je.P0(V02, this._isTyped, "}");
    }

    public TypeKey(Class<?> cls, boolean z) {
        int i;
        this._class = cls;
        this._type = null;
        this._isTyped = z;
        if (z) {
            i = cls.getName().hashCode() + 1;
        } else {
            i = cls.getName().hashCode();
        }
        this._hashCode = i;
    }

    public TypeKey(JavaType javaType, boolean z) {
        int i;
        this._type = javaType;
        this._class = null;
        this._isTyped = z;
        if (z) {
            i = javaType.hashCode() - 2;
        } else {
            i = javaType.hashCode() - 1;
        }
        this._hashCode = i;
    }
}
