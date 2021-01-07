package defpackage;

import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.music.premiummini.k;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: pi5  reason: default package */
public final class pi5 implements w<RecentlyPlayedItems, RecentlyPlayedItems> {
    private final k a;

    /* renamed from: pi5$a */
    static final class a<T, R> implements l<RecentlyPlayedItems, RecentlyPlayedItems> {
        final /* synthetic */ pi5 a;

        a(pi5 pi5) {
            this.a = pi5;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public RecentlyPlayedItems apply(RecentlyPlayedItems recentlyPlayedItems) {
            RecentlyPlayedItems recentlyPlayedItems2 = recentlyPlayedItems;
            h.e(recentlyPlayedItems2, "it");
            return pi5.a(this.a, recentlyPlayedItems2);
        }
    }

    public pi5(k kVar) {
        h.e(kVar, "mPremiumMiniProperties");
        this.a = kVar;
    }

    public static final RecentlyPlayedItems a(pi5 pi5, RecentlyPlayedItems recentlyPlayedItems) {
        if (pi5.a.a()) {
            return recentlyPlayedItems;
        }
        List<RecentlyPlayedItem> list = recentlyPlayedItems.items;
        h.d(list, "recentlyPlayedItems\n                .items");
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (!h.a("spotify:playlist:37i9dQZF1EGfvr6Ga3L7Ne", t.link)) {
                arrayList.add(t);
            }
        }
        return new RecentlyPlayedItems(arrayList.size(), recentlyPlayedItems.loaded, arrayList);
    }

    @Override // io.reactivex.w
    public v<RecentlyPlayedItems> apply(s<RecentlyPlayedItems> sVar) {
        h.e(sVar, "upstream");
        s<R> j0 = sVar.j0(new a(this));
        h.d(j0, "upstream.map { filterPremiumMiniPlaylist(it) }");
        return j0;
    }
}
