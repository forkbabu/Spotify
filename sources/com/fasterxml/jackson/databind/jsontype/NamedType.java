package com.fasterxml.jackson.databind.jsontype;

import java.io.Serializable;

public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _class;
    protected final int _hashCode;
    protected String _name;

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode();
        this._name = (str == null || str.length() == 0) ? null : str;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == NamedType.class && this._class == ((NamedType) obj)._class) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getType() {
        return this._class;
    }

    public boolean hasName() {
        return this._name != null;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this._hashCode;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("[NamedType, class ");
        V0.append(this._class.getName());
        V0.append(", name: ");
        return je.I0(V0, this._name == null ? "null" : je.I0(je.V0("'"), this._name, "'"), "]");
    }
}
