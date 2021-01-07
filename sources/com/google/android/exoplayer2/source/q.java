package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.g;
import java.util.List;
import java.util.Map;

final class q implements k {
    private final k a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    public interface a {
    }

    public q(k kVar, int i, a aVar) {
        g.a(i > 0);
        this.a = kVar;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public long a(m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void b(a0 a0Var) {
        this.a.b(a0Var);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Map<String, List<String>> c() {
        return this.a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public Uri getUri() {
        return this.a.getUri();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    @Override // com.google.android.exoplayer2.upstream.k
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r9, int r10, int r11) {
        /*
            r8 = this;
            int r0 = r8.e
            r1 = -1
            if (r0 != 0) goto L_0x0050
            com.google.android.exoplayer2.upstream.k r0 = r8.a
            byte[] r2 = r8.d
            r3 = 1
            r4 = 0
            int r0 = r0.read(r2, r4, r3)
            if (r0 != r1) goto L_0x0013
        L_0x0011:
            r3 = 0
            goto L_0x0048
        L_0x0013:
            byte[] r0 = r8.d
            byte r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 4
            if (r0 != 0) goto L_0x001e
            goto L_0x0048
        L_0x001e:
            byte[] r2 = new byte[r0]
            r5 = r0
            r6 = 0
        L_0x0022:
            if (r5 <= 0) goto L_0x0030
            com.google.android.exoplayer2.upstream.k r7 = r8.a
            int r7 = r7.read(r2, r6, r5)
            if (r7 != r1) goto L_0x002d
            goto L_0x0011
        L_0x002d:
            int r6 = r6 + r7
            int r5 = r5 - r7
            goto L_0x0022
        L_0x0030:
            if (r0 <= 0) goto L_0x003a
            int r4 = r0 + -1
            byte r5 = r2[r4]
            if (r5 != 0) goto L_0x003a
            r0 = r4
            goto L_0x0030
        L_0x003a:
            if (r0 <= 0) goto L_0x0048
            com.google.android.exoplayer2.source.q$a r4 = r8.c
            com.google.android.exoplayer2.util.v r5 = new com.google.android.exoplayer2.util.v
            r5.<init>(r2, r0)
            com.google.android.exoplayer2.source.x$a r4 = (com.google.android.exoplayer2.source.x.a) r4
            r4.i(r5)
        L_0x0048:
            if (r3 == 0) goto L_0x004f
            int r0 = r8.b
            r8.e = r0
            goto L_0x0050
        L_0x004f:
            return r1
        L_0x0050:
            com.google.android.exoplayer2.upstream.k r0 = r8.a
            int r2 = r8.e
            int r11 = java.lang.Math.min(r2, r11)
            int r9 = r0.read(r9, r10, r11)
            if (r9 == r1) goto L_0x0063
            int r10 = r8.e
            int r10 = r10 - r9
            r8.e = r10
        L_0x0063:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.q.read(byte[], int, int):int");
    }
}
