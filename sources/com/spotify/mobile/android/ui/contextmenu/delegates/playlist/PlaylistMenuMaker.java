package com.spotify.mobile.android.ui.contextmenu.delegates.playlist;

import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.ui.contextmenu.x3;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.models.j;

public interface PlaylistMenuMaker extends x3<j> {

    public enum EditOption {
        NO_SHOW,
        SHOW_WHEN_CAN_MODIFY_CONTENTS,
        SHOW_WHEN_OWNED_BY_SELF
    }

    public interface a {
        PlaylistMenuMaker e(ifd ifd, c cVar, boolean z, boolean z2, EditOption editOption, s3 s3Var);
    }
}
