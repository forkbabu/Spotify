package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.offline.x;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.t0;
import java.util.List;

public interface s extends c0 {

    public interface a extends c0.a<s> {
        void j(s sVar);
    }

    @Override // com.google.android.exoplayer2.source.c0
    long a();

    @Override // com.google.android.exoplayer2.source.c0
    boolean b(long j);

    @Override // com.google.android.exoplayer2.source.c0
    long c();

    @Override // com.google.android.exoplayer2.source.c0
    void e(long j);

    long f(gq[] gqVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j);

    List<x> h(List<gq> list);

    @Override // com.google.android.exoplayer2.source.c0
    boolean isLoading();

    long k(long j);

    long l(long j, t0 t0Var);

    long m();

    void n(a aVar, long j);

    void r();

    f0 t();

    void u(long j, boolean z);
}
