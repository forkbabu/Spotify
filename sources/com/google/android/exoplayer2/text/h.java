package com.google.android.exoplayer2.text;

import java.util.List;

public abstract class h extends gj implements d {
    private d a;
    private long b;

    @Override // defpackage.bj
    public void clear() {
        super.clear();
        this.a = null;
    }

    @Override // com.google.android.exoplayer2.text.d
    public int d(long j) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(j - this.b);
    }

    @Override // com.google.android.exoplayer2.text.d
    public List<a> g(long j) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.g(j - this.b);
    }

    @Override // com.google.android.exoplayer2.text.d
    public long h(int i) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.h(i) + this.b;
    }

    @Override // com.google.android.exoplayer2.text.d
    public int i() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.i();
    }

    public void k(long j, d dVar, long j2) {
        this.timeUs = j;
        this.a = dVar;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.b = j;
    }
}
