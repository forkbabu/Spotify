package retrofit2.adapter.rxjava2;

import io.reactivex.y;
import java.lang.reflect.Type;
import retrofit2.c;

final class f<R> implements c<R, Object> {
    private final Type a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    f(Type type, y yVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = type;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    @Override // retrofit2.c
    public Type a() {
        return this.a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    @Override // retrofit2.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(retrofit2.b<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto L_0x000a
            retrofit2.adapter.rxjava2.b r0 = new retrofit2.adapter.rxjava2.b
            r0.<init>(r2)
            goto L_0x000f
        L_0x000a:
            retrofit2.adapter.rxjava2.c r0 = new retrofit2.adapter.rxjava2.c
            r0.<init>(r2)
        L_0x000f:
            boolean r2 = r1.c
            if (r2 == 0) goto L_0x001a
            retrofit2.adapter.rxjava2.e r2 = new retrofit2.adapter.rxjava2.e
            r2.<init>(r0)
        L_0x0018:
            r0 = r2
            goto L_0x0024
        L_0x001a:
            boolean r2 = r1.d
            if (r2 == 0) goto L_0x0024
            retrofit2.adapter.rxjava2.a r2 = new retrofit2.adapter.rxjava2.a
            r2.<init>(r0)
            goto L_0x0018
        L_0x0024:
            boolean r2 = r1.e
            if (r2 == 0) goto L_0x002f
            io.reactivex.BackpressureStrategy r2 = io.reactivex.BackpressureStrategy.LATEST
            io.reactivex.g r2 = r0.Y0(r2)
            return r2
        L_0x002f:
            boolean r2 = r1.f
            if (r2 == 0) goto L_0x0038
            io.reactivex.z r2 = r0.B0()
            return r2
        L_0x0038:
            boolean r2 = r1.g
            if (r2 == 0) goto L_0x0042
            io.reactivex.internal.operators.observable.l0 r2 = new io.reactivex.internal.operators.observable.l0
            r2.<init>(r0)
            return r2
        L_0x0042:
            boolean r2 = r1.h
            if (r2 == 0) goto L_0x004c
            io.reactivex.internal.operators.observable.z r2 = new io.reactivex.internal.operators.observable.z
            r2.<init>(r0)
            return r2
        L_0x004c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.f.b(retrofit2.b):java.lang.Object");
    }
}
