package defpackage;

import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.datasource.sorting.b;
import com.spotify.music.settings.a;
import com.spotify.playlist.endpoints.d;
import defpackage.b76;
import defpackage.ffc;

/* access modifiers changed from: package-private */
/* renamed from: e76  reason: default package */
public final class e76 implements b76.a {
    private final wlf<d> a;
    private final wlf<String> b;
    private final wlf<a> c;
    private final wlf<b> d;
    private final wlf<ffc.a> e;
    private final wlf<c0> f;

    e76(wlf<d> wlf, wlf<String> wlf2, wlf<a> wlf3, wlf<b> wlf4, wlf<ffc.a> wlf5, wlf<c0> wlf6) {
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
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.b76.a
    public b76 a(PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
        d dVar = this.a.get();
        b(dVar, 1);
        d dVar2 = dVar;
        String str = this.b.get();
        b(str, 2);
        String str2 = str;
        a aVar = this.c.get();
        b(aVar, 3);
        a aVar2 = aVar;
        b bVar = this.d.get();
        b(bVar, 4);
        b bVar2 = bVar;
        ffc.a aVar3 = this.e.get();
        b(aVar3, 5);
        ffc.a aVar4 = aVar3;
        c0 c0Var = this.f.get();
        b(c0Var, 6);
        b(playlistDataSourceConfiguration, 7);
        return new d76(dVar2, str2, aVar2, bVar2, aVar4, c0Var, playlistDataSourceConfiguration);
    }
}
