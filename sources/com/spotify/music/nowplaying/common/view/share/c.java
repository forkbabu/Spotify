package com.spotify.music.nowplaying.common.view.share;

import com.google.common.base.Predicate;
import com.spotify.player.model.PlayerState;
import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.playlist.formatlisttype.a;

public class c implements Predicate<PlayerState> {
    private final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    /* renamed from: a */
    public boolean apply(PlayerState playerState) {
        FormatListType a2 = this.a.a(playerState.contextMetadata().get("format_list_type"));
        if ((playerState.track().isPresent() && kxd.k(playerState.track().get())) || (a2 != FormatListType.s && a2 != FormatListType.n)) {
            return false;
        }
        return true;
    }
}
