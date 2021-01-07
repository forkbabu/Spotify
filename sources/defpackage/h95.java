package defpackage;

import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.music.features.freetiertrack.FreeTierTrackFragment;

/* renamed from: h95  reason: default package */
public final class h95 implements fjf<String> {
    private final wlf<FreeTierTrackFragment> a;

    public h95(wlf<FreeTierTrackFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().k4().getString(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY);
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
