package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.util.m;

public final /* synthetic */ class b implements m.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    public /* synthetic */ b(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    @Override // com.google.android.exoplayer2.util.m.a
    public final void a(Object obj) {
        ((f.a) obj).q(this.a, this.b, this.c);
    }
}
