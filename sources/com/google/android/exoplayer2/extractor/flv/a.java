package com.google.android.exoplayer2.extractor.flv;

import android.util.Pair;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.j;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.v;
import java.util.Collections;

final class a extends TagPayloadReader {
    private static final int[] e = {5512, 11025, 22050, 44100};
    private boolean b;
    private boolean c;
    private int d;

    public a(zj zjVar) {
        super(zjVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(v vVar) {
        if (!this.b) {
            int x = vVar.x();
            int i = (x >> 4) & 15;
            this.d = i;
            if (i == 2) {
                this.a.c(d0.o(null, "audio/mpeg", null, -1, -1, 1, e[(x >> 2) & 3], null, null, 0, null));
                this.c = true;
            } else if (i == 7 || i == 8) {
                this.a.c(d0.n(null, i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", null, -1, -1, 1, 8000, (x & 1) == 1 ? 2 : 3, null, null, 0, null));
                this.c = true;
            } else if (i != 10) {
                StringBuilder V0 = je.V0("Audio format not supported: ");
                V0.append(this.d);
                throw new TagPayloadReader.UnsupportedFormatException(V0.toString());
            }
            this.b = true;
        } else {
            vVar.L(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(v vVar, long j) {
        if (this.d == 2) {
            int a = vVar.a();
            this.a.b(vVar, a);
            this.a.d(j, 1, a, 0, null);
            return true;
        }
        int x = vVar.x();
        if (x == 0 && !this.c) {
            int a2 = vVar.a();
            byte[] bArr = new byte[a2];
            vVar.g(bArr, 0, a2);
            Pair<Integer, Integer> c2 = j.c(new u(bArr), false);
            this.a.c(d0.o(null, "audio/mp4a-latm", null, -1, -1, ((Integer) c2.second).intValue(), ((Integer) c2.first).intValue(), Collections.singletonList(bArr), null, 0, null));
            this.c = true;
            return false;
        } else if (this.d == 10 && x != 1) {
            return false;
        } else {
            int a3 = vVar.a();
            this.a.b(vVar, a3);
            this.a.d(j, 1, a3, 0, null);
            return true;
        }
    }
}
