package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.video.q;
import com.spotify.music.canvas.model.CanvasContentType;
import com.spotify.music.canvas.model.b;
import com.spotify.player.model.ContextTrack;

/* renamed from: vl2  reason: default package */
public class vl2 {
    private final pl2 a;
    private final nl2 b;
    private final q c;
    private final rl2 d;

    public vl2(nl2 nl2, pl2 pl2, q qVar, rl2 rl2) {
        this.a = pl2;
        this.b = nl2;
        this.c = qVar;
        this.d = rl2;
    }

    public boolean a(ContextTrack contextTrack) {
        String str;
        if (!this.a.d(contextTrack) || !this.b.b()) {
            return false;
        }
        if (!this.d.c()) {
            CanvasContentType b2 = this.a.b(contextTrack);
            if (b2 == CanvasContentType.VIDEO || b2 == CanvasContentType.VIDEO_LOOPING || b2 == CanvasContentType.VIDEO_LOOPING_RANDOM) {
                b a2 = this.a.a(contextTrack);
                if (MoreObjects.isNullOrEmpty(a2.d())) {
                    str = a2.f();
                } else {
                    str = String.format("%s://%s", "spotify-video", a2.d());
                }
                return this.c.c(str);
            }
        }
        return true;
    }
}
