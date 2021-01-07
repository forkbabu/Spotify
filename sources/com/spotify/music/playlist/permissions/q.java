package com.spotify.music.playlist.permissions;

import com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter;
import com.spotify.music.playlist.permissions.o;

public final class q implements o.a {
    private final wlf<PlaylistPermissionsBottomSheetFragmentAdapter.b> a;

    public q(wlf<PlaylistPermissionsBottomSheetFragmentAdapter.b> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // com.spotify.music.playlist.permissions.o.a
    public o a(l lVar) {
        PlaylistPermissionsBottomSheetFragmentAdapter.b bVar = this.a.get();
        b(bVar, 1);
        b(lVar, 2);
        return new p(bVar, lVar);
    }
}
