package com.spotify.music.playlist.permissions;

import android.os.Bundle;
import androidx.fragment.app.o;
import kotlin.jvm.internal.h;

public final class a0 implements z {
    private final o a;

    public a0(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    @Override // com.spotify.music.playlist.permissions.z
    public void a(String str) {
        h.e(str, "playlistUri");
        h.e(str, "playlistUri");
        Bundle bundle = new Bundle();
        bundle.putString("playlist_uri", str);
        PlaylistPermissionsBottomSheetFragment playlistPermissionsBottomSheetFragment = new PlaylistPermissionsBottomSheetFragment();
        playlistPermissionsBottomSheetFragment.r4(bundle);
        playlistPermissionsBottomSheetFragment.Y4(this.a, "playlist-permissions-bottom-sheet");
    }
}
