package defpackage;

import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.d;
import com.google.android.exoplayer2.util.g;
import java.util.Collections;
import java.util.List;

/* renamed from: qp  reason: default package */
final class qp implements d {
    public static final qp b = new qp();
    private final List<a> a;

    public qp(a aVar) {
        this.a = Collections.singletonList(aVar);
    }

    @Override // com.google.android.exoplayer2.text.d
    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.text.d
    public List<a> g(long j) {
        return j >= 0 ? this.a : Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.text.d
    public long h(int i) {
        g.a(i == 0);
        return 0;
    }

    @Override // com.google.android.exoplayer2.text.d
    public int i() {
        return 1;
    }

    private qp() {
        this.a = Collections.emptyList();
    }
}
