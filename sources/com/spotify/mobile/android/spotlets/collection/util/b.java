package com.spotify.mobile.android.spotlets.collection.util;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ String[] a;

    public /* synthetic */ b(String[] strArr) {
        this.a = strArr;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return new u3((CollectionStateProvider.Response) obj, this.a);
    }
}