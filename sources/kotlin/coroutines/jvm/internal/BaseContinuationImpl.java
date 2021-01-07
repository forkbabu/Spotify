package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.coroutines.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.f;
import kotlin.jvm.internal.h;

public abstract class BaseContinuationImpl implements a<Object>, Object {
    private final a<Object> completion;

    public BaseContinuationImpl(a<Object> aVar) {
        this.completion = aVar;
    }

    @Override // kotlin.coroutines.a
    public final void a(Object obj) {
        BaseContinuationImpl baseContinuationImpl = this;
        while (true) {
            h.e(baseContinuationImpl, "frame");
            a<Object> aVar = baseContinuationImpl.completion;
            h.c(aVar);
            try {
                obj = baseContinuationImpl.f(obj);
                if (obj == CoroutineSingletons.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = yif.m(th);
            }
            baseContinuationImpl.g();
            if (aVar instanceof BaseContinuationImpl) {
                baseContinuationImpl = (BaseContinuationImpl) aVar;
            } else {
                aVar.a(obj);
                return;
            }
        }
    }

    public a<f> d(Object obj, a<?> aVar) {
        h.e(aVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final a<Object> e() {
        return this.completion;
    }

    /* access modifiers changed from: protected */
    public abstract Object f(Object obj);

    /* access modifiers changed from: protected */
    public void g() {
    }

    @Override // java.lang.Object
    public String toString() {
        int i;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        h.e(this, "$this$getStackTraceElementImpl");
        b bVar = (b) getClass().getAnnotation(b.class);
        Object obj = null;
        if (bVar != null) {
            int v = bVar.v();
            if (v <= 1) {
                int i2 = -1;
                try {
                    Field declaredField = getClass().getDeclaredField("label");
                    h.d(declaredField, "field");
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(this);
                    if (obj2 instanceof Integer) {
                        obj = obj2;
                    }
                    Integer num = (Integer) obj;
                    i = (num != null ? num.intValue() : 0) - 1;
                } catch (Exception unused) {
                    i = -1;
                }
                if (i >= 0) {
                    i2 = bVar.l()[i];
                }
                String a = c.c.a(this);
                if (a == null) {
                    str = bVar.c();
                } else {
                    str = a + '/' + bVar.c();
                }
                obj = new StackTraceElement(str, bVar.m(), bVar.f(), i2);
            } else {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
            }
        }
        if (obj == null) {
            obj = getClass().getName();
        }
        sb.append(obj);
        return sb.toString();
    }
}
