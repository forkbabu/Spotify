package defpackage;

import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import defpackage.ll;

/* renamed from: kl  reason: default package */
final class kl extends il {
    private a n;
    private int o;
    private boolean p;
    private ll.c q;
    private ll.a r;

    /* renamed from: kl$a */
    static final class a {
        public final ll.c a;
        public final byte[] b;
        public final ll.b[] c;
        public final int d;

        public a(ll.c cVar, ll.a aVar, byte[] bArr, ll.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = bArr;
            this.c = bVarArr;
            this.d = i;
        }
    }

    kl() {
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public void d(long j) {
        super.d(j);
        int i = 0;
        this.p = j != 0;
        ll.c cVar = this.q;
        if (cVar != null) {
            i = cVar.d;
        }
        this.o = i;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public long e(v vVar) {
        int i;
        byte[] bArr = vVar.a;
        int i2 = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        byte b = bArr[0];
        a aVar = this.n;
        if (!aVar.c[(b >> 1) & (BitmapRenderer.ALPHA_VISIBLE >>> (8 - aVar.d))].a) {
            i = aVar.a.d;
        } else {
            i = aVar.a.e;
        }
        if (this.p) {
            i2 = (this.o + i) / 4;
        }
        long j = (long) i2;
        vVar.J(vVar.c() + 4);
        vVar.a[vVar.c() - 4] = (byte) ((int) (j & 255));
        vVar.a[vVar.c() - 3] = (byte) ((int) ((j >>> 8) & 255));
        vVar.a[vVar.c() - 2] = (byte) ((int) ((j >>> 16) & 255));
        vVar.a[vVar.c() - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.p = true;
        this.o = i;
        return j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03dc  */
    @Override // defpackage.il
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(com.google.android.exoplayer2.util.v r20, long r21, defpackage.il.b r23) {
        /*
        // Method dump skipped, instructions count: 1048
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl.g(com.google.android.exoplayer2.util.v, long, il$b):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.il
    public void h(boolean z) {
        super.h(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
