package com.spotify.music.mainactivity;

/* compiled from: java-style lambda group */
public final class i<V> implements fa2<ia2> {
    public static final i b = new i(0);
    public static final i c = new i(1);
    public final /* synthetic */ int a;

    public i(int i) {
        this.a = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.fa2
    public final ia2 get() {
        int i = this.a;
        if (i == 0) {
            return new ha2();
        }
        if (i == 1) {
            return new ha2();
        }
        throw null;
    }
}
