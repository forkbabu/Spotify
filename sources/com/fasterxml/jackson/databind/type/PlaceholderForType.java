package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;

public class PlaceholderForType extends TypeBase {
    private static final long serialVersionUID = 1;
    protected JavaType _actualType;
    protected final int _ordinal;

    public PlaceholderForType(int i) {
        super(Object.class, TypeBindings.emptyBindings(), TypeFactory.unknownType(), null, 1, null, null, false);
        this._ordinal = i;
    }

    private <T> T _unsupported() {
        StringBuilder V0 = je.V0("Operation should not be attempted on ");
        V0.append(getClass().getName());
        throw new UnsupportedOperationException(V0.toString());
    }

    /* access modifiers changed from: protected */
    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String buildCanonicalName() {
        return toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType, java.lang.Object
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder getGenericSignature(StringBuilder sb) {
        sb.append('$');
        sb.append(this._ordinal + 1);
        return sb;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean isContainerType() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType refine(Class<?> cls, TypeBindings typeBindings, JavaType javaType, JavaType[] javaTypeArr) {
        _unsupported();
        throw null;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [('$' char), (wrap: int : 0x000c: ARITH  (r1v2 int) = (wrap: int : 0x000a: IGET  (r1v1 int) = (r2v0 'this' com.fasterxml.jackson.databind.type.PlaceholderForType A[IMMUTABLE_TYPE, THIS]) com.fasterxml.jackson.databind.type.PlaceholderForType._ordinal int) + (1 int))] */
    @Override // com.fasterxml.jackson.databind.JavaType, java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        sb.append(this._ordinal + 1);
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentType(JavaType javaType) {
        _unsupported();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentTypeHandler(Object obj) {
        _unsupported();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withContentValueHandler(Object obj) {
        _unsupported();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withStaticTyping() {
        _unsupported();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withTypeHandler(Object obj) {
        _unsupported();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType withValueHandler(Object obj) {
        _unsupported();
        throw null;
    }
}
