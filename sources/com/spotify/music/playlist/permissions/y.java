package com.spotify.music.playlist.permissions;

import com.spotify.music.playlist.permissions.v;
import kotlin.jvm.internal.h;

public final class y implements fjf<String> {
    private final wlf<PlaylistPermissionsBottomSheetFragment> a;

    public y(wlf<PlaylistPermissionsBottomSheetFragment> wlf) {
        this.a = wlf;
    }

    public static String a(PlaylistPermissionsBottomSheetFragment playlistPermissionsBottomSheetFragment) {
        v.a aVar = v.a;
        h.e(playlistPermissionsBottomSheetFragment, "fragment");
        String string = playlistPermissionsBottomSheetFragment.k4().getString("playlist_uri", "");
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
