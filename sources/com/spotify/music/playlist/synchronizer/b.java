package com.spotify.music.playlist.synchronizer;

import androidx.lifecycle.n;
import com.spotify.music.playlist.synchronizer.d;
import com.spotify.playlist.endpoints.i;
import io.reactivex.y;

public final class b implements d.a {
    private final wlf<i> a;
    private final wlf<y> b;

    public b(wlf<i> wlf, wlf<y> wlf2) {
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

    @Override // com.spotify.music.playlist.synchronizer.d.a
    public d a(n nVar) {
        i iVar = this.a.get();
        b(iVar, 1);
        y yVar = this.b.get();
        b(yVar, 2);
        b(nVar, 3);
        return new PlaylistCoreSynchronizer(iVar, yVar, nVar);
    }
}
