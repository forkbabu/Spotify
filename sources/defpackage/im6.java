package defpackage;

import com.spotify.music.connection.l;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.limitedofflineendpoints.api.UserMixDataSource;
import com.spotify.music.offlinetrials.limited.logging.c;
import defpackage.ao6;
import defpackage.hm6;
import defpackage.lh6;
import io.reactivex.y;

/* renamed from: im6  reason: default package */
public final class im6 implements hm6.a {
    private final wlf<ao6.a> a;
    private final wlf<lh6.a> b;
    private final wlf<UserMixDataSource> c;
    private final wlf<y> d;
    private final wlf<c> e;
    private final wlf<l> f;
    private final wlf<com.spotify.music.offlinetrials.limited.uicomponents.y> g;

    public im6(wlf<ao6.a> wlf, wlf<lh6.a> wlf2, wlf<UserMixDataSource> wlf3, wlf<y> wlf4, wlf<c> wlf5, wlf<l> wlf6, wlf<com.spotify.music.offlinetrials.limited.uicomponents.y> wlf7) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
        b(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.hm6.a
    public hm6 a(ItemListConfiguration itemListConfiguration) {
        ao6.a aVar = this.a.get();
        b(aVar, 1);
        ao6.a aVar2 = aVar;
        lh6.a aVar3 = this.b.get();
        b(aVar3, 2);
        lh6.a aVar4 = aVar3;
        UserMixDataSource userMixDataSource = this.c.get();
        b(userMixDataSource, 3);
        UserMixDataSource userMixDataSource2 = userMixDataSource;
        y yVar = this.d.get();
        b(yVar, 4);
        y yVar2 = yVar;
        c cVar = this.e.get();
        b(cVar, 5);
        c cVar2 = cVar;
        l lVar = this.f.get();
        b(lVar, 6);
        l lVar2 = lVar;
        com.spotify.music.offlinetrials.limited.uicomponents.y yVar3 = this.g.get();
        b(yVar3, 7);
        b(itemListConfiguration, 8);
        return new hm6(aVar2, aVar4, userMixDataSource2, yVar2, cVar2, lVar2, yVar3, itemListConfiguration);
    }
}
