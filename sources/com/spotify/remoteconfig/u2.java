package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsContextMenuPlaylistProperties;
import com.spotify.remoteconfig.ff;

public final /* synthetic */ class u2 implements o0e {
    public static final /* synthetic */ u2 a = new u2();

    private /* synthetic */ u2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsContextMenuPlaylistProperties.EditPlaylistOptionNftBehaviour editPlaylistOptionNftBehaviour = AndroidLibsContextMenuPlaylistProperties.EditPlaylistOptionNftBehaviour.NO_SHOW;
        ff.b bVar = new ff.b();
        bVar.b(editPlaylistOptionNftBehaviour);
        bVar.b((AndroidLibsContextMenuPlaylistProperties.EditPlaylistOptionNftBehaviour) p0e.b("android-libs-context-menu-playlist", "edit_playlist_option_nft_behaviour", editPlaylistOptionNftBehaviour));
        return bVar.a();
    }
}
