package com.spotify.music.nowplaying.drivingmode.view.showvoiceviewbutton;

public interface DrivingShowVoiceViewButtonViewBinder {

    public enum Type {
        UNKNOWN,
        NOW_PLAYING,
        HOME_FEED
    }

    public interface a {
    }

    void setListener(a aVar);

    void setMicButtonEnabled(boolean z);
}
