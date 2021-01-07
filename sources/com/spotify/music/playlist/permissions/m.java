package com.spotify.music.playlist.permissions;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.playlist.permissions.j;
import com.spotify.music.playlist.permissions.l;
import io.reactivex.y;

public final class m implements l.a {
    private final wlf<s> a;
    private final wlf<y> b;
    private final wlf<a> c;
    private final wlf<SnackbarManager> d;

    public m(wlf<s> wlf, wlf<y> wlf2, wlf<a> wlf3, wlf<SnackbarManager> wlf4) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.playlist.permissions.l.a
    public l a(e eVar, j.b bVar) {
        s sVar = this.a.get();
        b(sVar, 1);
        s sVar2 = sVar;
        y yVar = this.b.get();
        b(yVar, 2);
        y yVar2 = yVar;
        a aVar = this.c.get();
        b(aVar, 3);
        a aVar2 = aVar;
        SnackbarManager snackbarManager = this.d.get();
        b(snackbarManager, 4);
        b(eVar, 5);
        b(bVar, 6);
        return new PlaylistPermissionsBottomSheetFragmentPresenterImpl(sVar2, yVar2, aVar2, snackbarManager, eVar, bVar);
    }
}
