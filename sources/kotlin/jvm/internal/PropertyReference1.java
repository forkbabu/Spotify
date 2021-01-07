package kotlin.jvm.internal;

import kotlin.reflect.b;
import kotlin.reflect.g;

public abstract class PropertyReference1 extends PropertyReference implements g {
    public PropertyReference1() {
    }

    @Override // kotlin.reflect.g
    public g.a b() {
        return ((g) getReflected()).b();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public b computeReflected() {
        j.e(this);
        return this;
    }

    @Override // defpackage.nmf
    public Object invoke(Object obj) {
        return get(obj);
    }

    public PropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
