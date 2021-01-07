package com.spotify.mobile.android.spotlets.collection.util;

import io.reactivex.functions.l;
import java.util.HashMap;

public final /* synthetic */ class d implements l {
    public final /* synthetic */ CollectionStateProvider a;

    public /* synthetic */ d(CollectionStateProvider collectionStateProvider) {
        this.a = collectionStateProvider;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        u3 u3Var = (u3) obj;
        this.a.getClass();
        F f = u3Var.a;
        f.getClass();
        F f2 = f;
        S s = u3Var.b;
        s.getClass();
        String[] strArr = (String[]) s;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < strArr.length; i++) {
            hashMap.put(strArr[i], new e(f2.isInCollection()[i], f2.isBanned()[i]));
        }
        return hashMap;
    }
}
