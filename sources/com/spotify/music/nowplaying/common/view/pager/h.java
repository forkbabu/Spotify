package com.spotify.music.nowplaying.common.view.pager;

import com.spotify.player.model.ContextTrack;
import java.util.List;

public interface h {

    public interface a {
        void a();

        void b();
    }

    void d(List<ContextTrack> list, ContextTrack contextTrack, List<ContextTrack> list2);

    void setDisallowPeekLeft(boolean z);

    void setDisallowPeekRight(boolean z);

    void setDisallowScrollLeft(boolean z);

    void setDisallowScrollRight(boolean z);

    void setListener(a aVar);

    void setScrollLock(boolean z);
}
