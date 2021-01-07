package com.spotify.music.libs.audio.focus;

public class p implements o {
    private final MediaFocusManager a;

    p(MediaFocusManager mediaFocusManager) {
        this.a = mediaFocusManager;
    }

    @Override // com.spotify.music.libs.audio.focus.o
    public void abandonAudioFocus() {
        this.a.a();
    }
}
