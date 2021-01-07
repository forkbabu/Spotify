package com.google.android.exoplayer2.text;

import java.nio.ByteBuffer;

public abstract class b extends hj<g, h, SubtitleDecoderException> implements e {
    protected b(String str) {
        super(new g[2], new h[2]);
        n(1024);
    }

    @Override // com.google.android.exoplayer2.text.e
    public void a(long j) {
    }

    /* Return type fixed from 'gj' to match base method */
    /* access modifiers changed from: protected */
    @Override // defpackage.hj
    public h g() {
        return new c(this);
    }

    /* Return type fixed from 'java.lang.Exception' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [fj, gj, boolean] */
    /* access modifiers changed from: protected */
    @Override // defpackage.hj
    public SubtitleDecoderException h(g gVar, h hVar, boolean z) {
        g gVar2 = gVar;
        h hVar2 = hVar;
        try {
            ByteBuffer byteBuffer = gVar2.b;
            byteBuffer.getClass();
            hVar2.k(gVar2.c, o(byteBuffer.array(), byteBuffer.limit(), z), gVar2.o);
            hVar2.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    /* access modifiers changed from: protected */
    public abstract d o(byte[] bArr, int i, boolean z);

    /* access modifiers changed from: protected */
    public final void p(h hVar) {
        m(hVar);
    }
}
