package com.google.common.collect;

public abstract class ForwardingObject {
    protected ForwardingObject() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: delegate */
    public abstract Object mo25delegate();

    @Override // java.lang.Object
    public String toString() {
        return mo25delegate().toString();
    }
}
