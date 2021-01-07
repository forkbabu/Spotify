package defpackage;

import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: ulb  reason: default package */
public final class ulb implements wlb {
    @Override // defpackage.wlb
    public List<NowPlayingWidget.Type> a() {
        List<Iterable> u = d.u(d.u(NowPlayingWidget.Type.LYRICS, NowPlayingWidget.Type.STORYLINES, NowPlayingWidget.Type.BEHIND_THE_LYRICS), d.u(NowPlayingWidget.Type.PODCAST_QNA, NowPlayingWidget.Type.PODCAST_POLLS, NowPlayingWidget.Type.UP_NEXT, NowPlayingWidget.Type.PODCAST_MORE_FOR_YOU));
        h.e(u, "$this$flatten");
        ArrayList arrayList = new ArrayList();
        for (Iterable iterable : u) {
            d.a(arrayList, iterable);
        }
        return arrayList;
    }
}
