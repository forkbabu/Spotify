package com.fasterxml.jackson.core.type;

public abstract class ResolvedType {
    /* renamed from: getReferencedType */
    public abstract ResolvedType mo21getReferencedType();

    public boolean isReferenceType() {
        return mo21getReferencedType() != null;
    }

    public abstract String toCanonical();
}
