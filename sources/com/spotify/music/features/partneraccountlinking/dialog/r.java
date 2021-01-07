package com.spotify.music.features.partneraccountlinking.dialog;

public class r {
    private static final long[] c = {604800000, 1209600000};
    private final p a;
    private final cqe b;

    r(p pVar, cqe cqe) {
        this.a = pVar;
        this.b = cqe;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int b2 = this.a.b();
        if (b2 == 0) {
            this.a.e(this.b.d());
        }
        this.a.f(b2 + 1);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        long a2 = this.a.a();
        int b2 = this.a.b();
        if (b2 == 0) {
            return true;
        }
        long[] jArr = c;
        if (b2 > jArr.length || a2 + jArr[b2 - 1] >= this.b.d()) {
            return false;
        }
        return true;
    }
}
