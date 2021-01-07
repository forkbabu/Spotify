package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.connection.l;
import com.spotify.music.features.yourlibrary.musicpages.datasource.w3;
import com.spotify.music.features.yourlibrary.musicpages.item.m;
import com.spotify.music.libs.viewuri.c;
import io.reactivex.y;

/* renamed from: yd9  reason: default package */
public class yd9 {
    private final wlf<n1a> a;
    private final wlf<CollectionStateProvider> b;
    private final wlf<c> c;
    private final wlf<m> d;
    private final wlf<l> e;
    private final wlf<y> f;

    public yd9(wlf<n1a> wlf, wlf<CollectionStateProvider> wlf2, wlf<c> wlf3, wlf<m> wlf4, wlf<l> wlf5, wlf<y> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public xd9 b(w3 w3Var, String str, int i) {
        a(w3Var, 1);
        a(str, 2);
        n1a n1a = this.a.get();
        a(n1a, 4);
        n1a n1a2 = n1a;
        CollectionStateProvider collectionStateProvider = this.b.get();
        a(collectionStateProvider, 5);
        CollectionStateProvider collectionStateProvider2 = collectionStateProvider;
        c cVar = this.c.get();
        a(cVar, 6);
        c cVar2 = cVar;
        m mVar = this.d.get();
        a(mVar, 7);
        m mVar2 = mVar;
        l lVar = this.e.get();
        a(lVar, 8);
        l lVar2 = lVar;
        y yVar = this.f.get();
        a(yVar, 9);
        return new xd9(w3Var, str, i, n1a2, collectionStateProvider2, cVar2, mVar2, lVar2, yVar);
    }
}
