package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.c;

public final class a implements kotlin.coroutines.a<Object> {
    public static final a a = new a();

    private a() {
    }

    @Override // kotlin.coroutines.a
    public void a(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.a
    public c getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
