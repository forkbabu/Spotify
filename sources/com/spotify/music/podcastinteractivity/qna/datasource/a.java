package com.spotify.music.podcastinteractivity.qna.datasource;

import com.spotify.mobius.rx2.o;

/* compiled from: java-style lambda group */
public final class a<V> implements fa2<ia2> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.fa2
    public final ia2 get() {
        int i = this.a;
        if (i == 0) {
            return new o(((c) this.b).i);
        }
        if (i == 1) {
            return new o(((c) this.b).h);
        }
        throw null;
    }
}
