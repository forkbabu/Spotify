package com.google.android.gms.cast.framework.media;

import android.util.LruCache;
import com.google.android.gms.cast.m;

final class m0 extends LruCache<Integer, m> {
    private final /* synthetic */ d a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m0(d dVar, int i) {
        super(i);
        this.a = dVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Object, java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.util.LruCache
    public final /* synthetic */ void entryRemoved(boolean z, Integer num, m mVar, m mVar2) {
        Integer num2 = num;
        if (z) {
            this.a.g.add(num2);
        }
    }
}
