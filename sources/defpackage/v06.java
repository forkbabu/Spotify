package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistallsongs.i;
import com.spotify.music.playlist.ui.l0;
import com.spotify.music.podcastentityrow.b0;
import defpackage.u06;

/* renamed from: v06  reason: default package */
public final class v06 implements u06.a {
    private final wlf<l0.a<t06>> a;
    private final wlf<b0> b;

    public v06(wlf<l0.a<t06>> wlf, wlf<b0> wlf2) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.u06.a
    public u06 a(b4<t06> b4Var, u06.b bVar, i iVar) {
        l0.a<t06> aVar = this.a.get();
        b(aVar, 1);
        l0.a<t06> aVar2 = aVar;
        b0 b0Var = this.b.get();
        b(b0Var, 2);
        b(b4Var, 3);
        b(bVar, 4);
        return new u06(aVar2, b0Var, b4Var, bVar, iVar);
    }
}
