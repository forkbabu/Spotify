package com.spotify.mobile.android.video.exo;

import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.y;
import com.spotify.mobile.android.video.f0;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;

public class f implements f0 {
    private final WeakReference<y> a;
    private final Map<String, n0> b = gf0.b();

    public f(y yVar) {
        this.a = new WeakReference<>(yVar);
    }

    private v b(long[] jArr, boolean z, f0.a aVar) {
        y yVar = this.a.get();
        if (yVar == null || jArr.length == 0) {
            return null;
        }
        v vVar = new v();
        for (long j : jArr) {
            if (j >= 0) {
                n0 b2 = yVar.b(new a(this, aVar, j));
                String replace = UUID.randomUUID().toString().replace("-", "");
                this.b.put(replace, b2);
                vVar.a(replace);
                b2.o(replace);
                b2.n(z);
                b2.p(j);
                b2.m();
            }
        }
        return vVar;
    }

    public v a(long[] jArr, f0.a aVar) {
        return b(jArr, true, aVar);
    }

    public v c(int i, long j, f0.a aVar) {
        y yVar = this.a.get();
        if (i <= 0) {
            throw new IllegalArgumentException("Interval must be greater than 0");
        } else if (yVar == null) {
            return null;
        } else {
            long j2 = ((long) i) * 1000;
            int i2 = (int) (j / j2);
            long[] jArr = new long[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                jArr[i3] = ((long) i4) * j2;
                i3 = i4;
            }
            return b(jArr, false, aVar);
        }
    }

    public /* synthetic */ void d(f0.a aVar, long j, int i, Object obj) {
        aVar.a(j);
        this.b.remove(obj);
    }

    public void e(v vVar) {
        if (vVar != null) {
            for (String str : vVar.b()) {
                n0 remove = this.b.remove(str);
                if (remove != null) {
                    remove.b();
                }
            }
        }
    }
}
