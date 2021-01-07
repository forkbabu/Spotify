package com.spotify.offline;

import com.spotify.offline.data.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class OfflineUtilImpl$subscribeAllOfflineResources$1 extends FunctionReferenceImpl implements nmf<hrd, b> {
    public static final OfflineUtilImpl$subscribeAllOfflineResources$1 a = new OfflineUtilImpl$subscribeAllOfflineResources$1();

    OfflineUtilImpl$subscribeAllOfflineResources$1() {
        super(1, d.class, "toOfflineResources", "toOfflineResources(Lcom/spotify/offline/responses/OfflineResourcesResponse;)Lcom/spotify/offline/data/OfflineResources;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public b invoke(hrd hrd) {
        hrd hrd2 = hrd;
        h.e(hrd2, "p1");
        return d.a(hrd2);
    }
}
