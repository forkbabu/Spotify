package defpackage;

import com.google.common.base.Charsets;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.lyrics.core.experience.model.LyricsWrapper;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: tcb  reason: default package */
public final class tcb {
    private final ocb a;
    private final jfb b;
    private final kcb c;

    public tcb(ocb ocb, jfb jfb, kcb kcb) {
        h.e(ocb, "lyricsEndpoint");
        h.e(jfb, "vocalRemovalConfiguration");
        h.e(kcb, "lyricsConfiguration");
        this.a = ocb;
        this.b = jfb;
        this.c = kcb;
    }

    public final z<LyricsWrapper> a(String str, String str2) {
        h.e(str, "trackId");
        if (str2 == null || str2.length() == 0) {
            ocb ocb = this.a;
            l0 z = l0.z(str);
            h.d(z, "SpotifyLink.of(trackId)");
            String i = z.i();
            h.d(i, "SpotifyLink.of(trackId).id");
            return ocb.b(i, this.b.a(), this.c.a());
        }
        ocb ocb2 = this.a;
        l0 z2 = l0.z(str);
        h.d(z2, "SpotifyLink.of(trackId)");
        String i2 = z2.i();
        h.d(i2, "SpotifyLink.of(trackId).id");
        String d = gf0.d(str2, Charsets.UTF_8);
        h.d(d, "URLEncoderUtil.encode(\n …s.UTF_8\n                )");
        return ocb2.a(i2, d, this.b.a(), this.c.a());
    }
}
