package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.t;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.video.h;

final class d extends TagPayloadReader {
    private final v b = new v(t.a);
    private final v c = new v(4);
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public d(zj zjVar) {
        super(zjVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(v vVar) {
        int x = vVar.x();
        int i = (x >> 4) & 15;
        int i2 = x & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException(je.p0("Video format not supported: ", i2));
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(v vVar, long j) {
        int x = vVar.x();
        long i = (((long) vVar.i()) * 1000) + j;
        if (x == 0 && !this.e) {
            v vVar2 = new v(new byte[vVar.a()]);
            vVar.g(vVar2.a, 0, vVar.a());
            h a = h.a(vVar2);
            this.d = a.b;
            this.a.c(d0.z(null, "video/avc", null, -1, -1, a.c, a.d, -1.0f, a.a, -1, a.e, null));
            this.e = true;
            return false;
        } else if (x != 1 || !this.e) {
            return false;
        } else {
            int i2 = this.g == 1 ? 1 : 0;
            if (!this.f && i2 == 0) {
                return false;
            }
            byte[] bArr = this.c.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i3 = 4 - this.d;
            int i4 = 0;
            while (vVar.a() > 0) {
                vVar.g(this.c.a, i3, this.d);
                this.c.K(0);
                int B = this.c.B();
                this.b.K(0);
                this.a.b(this.b, 4);
                this.a.b(vVar, B);
                i4 = i4 + 4 + B;
            }
            this.a.d(i, i2, i4, 0, null);
            this.f = true;
            return true;
        }
    }
}
