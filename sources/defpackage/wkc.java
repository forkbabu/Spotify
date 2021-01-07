package defpackage;

import com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.a;
import com.spotify.pageloader.s0;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: wkc  reason: default package */
final class wkc<I, O> implements sg0<s<ryd>, s0> {
    final /* synthetic */ a.AbstractC0327a a;

    wkc(a.AbstractC0327a aVar) {
        this.a = aVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.sg0
    public s0 apply(s<ryd> sVar) {
        s<ryd> sVar2 = sVar;
        a.AbstractC0327a aVar = this.a;
        h.d(sVar2, "data");
        return aVar.a(sVar2);
    }
}
