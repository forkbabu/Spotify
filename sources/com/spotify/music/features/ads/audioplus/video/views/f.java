package com.spotify.music.features.ads.audioplus.video.views;

import com.spotify.music.features.ads.audioplus.video.views.VideoPlayPauseButton;

public interface f {
    boolean getIsPlaying();

    void setIsPlaying(boolean z);

    void setPlayPauseListener(VideoPlayPauseButton.a aVar);

    void setVideoRequest(String str);
}
