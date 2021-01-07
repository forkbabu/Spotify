package defpackage;

import com.spotify.music.features.renameplaylist.RenamePlaylistLogger;
import com.spotify.playlist.endpoints.i;
import defpackage.q48;
import io.reactivex.y;

/* renamed from: s48  reason: default package */
public final class s48 implements q48.a {
    private final wlf<RenamePlaylistLogger> a;
    private final wlf<y> b;
    private final wlf<i> c;
    private final wlf<n48> d;

    public s48(wlf<RenamePlaylistLogger> wlf, wlf<y> wlf2, wlf<i> wlf3, wlf<n48> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public q48 b() {
        RenamePlaylistLogger renamePlaylistLogger = this.a.get();
        a(renamePlaylistLogger, 1);
        y yVar = this.b.get();
        a(yVar, 2);
        i iVar = this.c.get();
        a(iVar, 3);
        n48 n48 = this.d.get();
        a(n48, 4);
        return new r48(renamePlaylistLogger, yVar, iVar, n48);
    }
}
