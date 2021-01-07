package defpackage;

import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.spotify.music.features.fullscreen.story.FullscreenStoryFragment;

/* renamed from: ua5  reason: default package */
public final class ua5 implements fjf<p62> {
    private final wlf<FullscreenStoryFragment> a;

    public ua5(wlf<FullscreenStoryFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Parcelable parcelable = this.a.get().D2().getParcelable("fullscreen_story_video_configuration");
        MoreObjects.checkNotNull(parcelable, "Fullscreen story video configuration is not set.");
        return (p62) parcelable;
    }
}
