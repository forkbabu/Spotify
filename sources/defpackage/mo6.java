package defpackage;

import com.spotify.music.features.playlistentity.configuration.f;
import com.spotify.player.model.PlayOrigin;

/* access modifiers changed from: package-private */
/* renamed from: mo6  reason: default package */
public class mo6 {
    private final wlf<PlayOrigin> a;

    mo6(wlf<PlayOrigin> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public lo6 b(a76 a76, f fVar, bre bre) {
        PlayOrigin playOrigin = this.a.get();
        a(playOrigin, 1);
        a(a76, 2);
        a(fVar, 3);
        a(bre, 4);
        return new lo6(playOrigin, a76, fVar, bre);
    }
}
