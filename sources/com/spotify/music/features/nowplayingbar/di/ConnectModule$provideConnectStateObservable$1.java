package com.spotify.music.features.nowplayingbar.di;

import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.picker.view.d;
import com.spotify.music.features.nowplayingbar.domain.a;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ConnectModule$provideConnectStateObservable$1 extends FunctionReferenceImpl implements rmf<d, List<? extends GaiaDevice>, a> {
    public static final ConnectModule$provideConnectStateObservable$1 a = new ConnectModule$provideConnectStateObservable$1();

    ConnectModule$provideConnectStateObservable$1() {
        super(2, a.class, "<init>", "<init>(Lcom/spotify/libs/connect/picker/view/ConnectButtonState;Ljava/util/List;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public a invoke(d dVar, List<? extends GaiaDevice> list) {
        d dVar2 = dVar;
        List<? extends GaiaDevice> list2 = list;
        h.e(dVar2, "p1");
        h.e(list2, "p2");
        return new a(dVar2, list2);
    }
}
