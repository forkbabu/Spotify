package com.spotify.music.features.album.encore;

import com.spotify.encore.consumer.elements.playbutton.PlayState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class AlbumHeaderTransformer$apply$1 extends FunctionReferenceImpl implements smf<b91, Boolean, PlayState, b91> {
    AlbumHeaderTransformer$apply$1(AlbumHeaderTransformer albumHeaderTransformer) {
        super(3, albumHeaderTransformer, AlbumHeaderTransformer.class, "combine", "combine(Lcom/spotify/mobile/android/hubframework/model/HubsViewModel;ZLcom/spotify/encore/consumer/elements/playbutton/PlayState;)Lcom/spotify/mobile/android/hubframework/model/HubsViewModel;", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public b91 c(b91 b91, Boolean bool, PlayState playState) {
        T t;
        b91 b912 = b91;
        boolean booleanValue = bool.booleanValue();
        PlayState playState2 = playState;
        h.e(b912, "p1");
        h.e(playState2, "p3");
        ((AlbumHeaderTransformer) this.receiver).getClass();
        Iterator<T> it = b912.body().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (je.C(t, "freetier:entityTopContainer")) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null) {
            return b912;
        }
        List<? extends s81> body = b912.body();
        ArrayList arrayList = new ArrayList();
        for (T t3 : body) {
            if (!h.a(t3, t2)) {
                arrayList.add(t3);
            }
        }
        return b912.toBuilder().e(arrayList).j(t2.toBuilder().o("encore:albumHeader", t2.componentId().category()).d("playState", playState2.name()).d("isLiked", Boolean.valueOf(booleanValue)).l()).g();
    }
}
