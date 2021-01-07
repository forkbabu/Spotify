package com.spotify.music.features.video;

import com.spotify.mobile.android.video.y;

public final /* synthetic */ class c implements l72 {
    public final /* synthetic */ ajf a;

    public /* synthetic */ c(ajf ajf) {
        this.a = ajf;
    }

    @Override // defpackage.l72
    public final String a(String str) {
        if (((y) this.a.get()).a()) {
            return String.format("https://spclient.wg.spotify.com/manifests/v6/hls/sources/%s/master.m3u8?supports_drm&gzip&filetype=mp4", str);
        }
        return String.format("%s://%s", "spotify-video", str);
    }
}
