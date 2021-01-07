package defpackage;

import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.f0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: op  reason: default package */
final class op implements d {
    private final lp a;
    private final long[] b;
    private final Map<String, np> c;
    private final Map<String, mp> f;
    private final Map<String, String> n;

    public op(lp lpVar, Map<String, np> map, Map<String, mp> map2, Map<String, String> map3) {
        this.a = lpVar;
        this.f = map2;
        this.n = map3;
        this.c = Collections.unmodifiableMap(map);
        this.b = lpVar.h();
    }

    @Override // com.google.android.exoplayer2.text.d
    public int d(long j) {
        int b2 = f0.b(this.b, j, false, false);
        if (b2 < this.b.length) {
            return b2;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.d
    public List<a> g(long j) {
        return this.a.f(j, this.c, this.f, this.n);
    }

    @Override // com.google.android.exoplayer2.text.d
    public long h(int i) {
        return this.b[i];
    }

    @Override // com.google.android.exoplayer2.text.d
    public int i() {
        return this.b.length;
    }
}
