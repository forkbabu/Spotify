package com.spotify.music.nowplaying.drivingmode.view.seekbar;

import com.spotify.nowplaying.ui.components.overlay.k;

public interface e extends k {

    public interface a {
    }

    void setDuration(int i);

    void setListener(a aVar);

    void setPosition(int i);

    void setPositionText(int i);

    void setSeekingEnabled(boolean z);
}
