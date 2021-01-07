package defpackage;

import com.google.android.exoplayer2.text.a;
import com.google.android.exoplayer2.text.d;
import java.util.List;

/* renamed from: dp  reason: default package */
final class dp implements d {
    private final List<a> a;

    public dp(List<a> list) {
        this.a = list;
    }

    @Override // com.google.android.exoplayer2.text.d
    public int d(long j) {
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.d
    public List<a> g(long j) {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.text.d
    public long h(int i) {
        return 0;
    }

    @Override // com.google.android.exoplayer2.text.d
    public int i() {
        return 1;
    }
}
