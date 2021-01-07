package defpackage;

import com.spotify.mobile.android.util.l0;
import kotlin.jvm.internal.h;

/* renamed from: z27  reason: default package */
public final class z27 implements b37 {
    @Override // defpackage.b37
    public String a(String str) {
        h.e(str, "uri");
        l0 z = l0.z(str);
        h.d(z, "SpotifyLink.of(uri)");
        String i = z.i();
        h.d(i, "SpotifyLink.of(uri).id");
        return i;
    }
}
