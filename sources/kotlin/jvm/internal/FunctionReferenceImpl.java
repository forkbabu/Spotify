package kotlin.jvm.internal;

import kotlin.reflect.c;
import kotlin.reflect.d;

public class FunctionReferenceImpl extends FunctionReference {
    public FunctionReferenceImpl(int i, d dVar, String str, String str2) {
        super(i, CallableReference.NO_RECEIVER, ((c) dVar).c(), str, str2, !(dVar instanceof c) ? 1 : 0);
    }

    public FunctionReferenceImpl(int i, Class cls, String str, String str2, int i2) {
        super(i, CallableReference.NO_RECEIVER, cls, str, str2, i2);
    }

    public FunctionReferenceImpl(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }
}
