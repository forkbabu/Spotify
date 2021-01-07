package com.spotify.music.playlist.permissions;

import com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter;

public final class c implements PlaylistPermissionsBottomSheetFragmentAdapter.b {
    @Override // com.spotify.music.playlist.permissions.PlaylistPermissionsBottomSheetFragmentAdapter.b
    public PlaylistPermissionsBottomSheetFragmentAdapter a(PlaylistPermissionsBottomSheetFragmentAdapter.c cVar) {
        if (cVar != null) {
            return new b(cVar);
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", 1));
    }
}
