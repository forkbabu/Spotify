package defpackage;

import okhttp3.e0;
import okhttp3.w;
import okio.g;

/* renamed from: gof  reason: default package */
public final class gof extends e0 {
    private final String b;
    private final long c;
    private final g f;

    public gof(String str, long j, g gVar) {
        this.b = str;
        this.c = j;
        this.f = gVar;
    }

    @Override // okhttp3.e0
    public long f() {
        return this.c;
    }

    @Override // okhttp3.e0
    public w g() {
        String str = this.b;
        if (str != null) {
            return w.d(str);
        }
        return null;
    }

    @Override // okhttp3.e0
    public g l() {
        return this.f;
    }
}
