package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.music.features.fullscreen.story.FullscreenStoryFragment;

/* renamed from: ta5  reason: default package */
public final class ta5 implements fjf<String> {
    private final wlf<FullscreenStoryFragment> a;

    public ta5(wlf<FullscreenStoryFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().D2().getString("fullscreen_story_playlist_uri");
        MoreObjects.checkNotNull(string, "Playlist uri not set.");
        return string;
    }
}
