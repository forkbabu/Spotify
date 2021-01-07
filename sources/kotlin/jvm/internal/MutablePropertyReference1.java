package kotlin.jvm.internal;

import kotlin.reflect.b;
import kotlin.reflect.f;
import kotlin.reflect.g;

public abstract class MutablePropertyReference1 extends MutablePropertyReference implements f {
    public MutablePropertyReference1() {
    }

    @Override // kotlin.reflect.g
    public g.a b() {
        return ((f) getReflected()).b();
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.CallableReference
    public b computeReflected() {
        j.d(this);
        return this;
    }

    @Override // defpackage.nmf
    public Object invoke(Object obj) {
        return get(obj);
    }

    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
