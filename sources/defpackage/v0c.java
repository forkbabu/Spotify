package defpackage;

import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import kotlin.jvm.internal.h;

/* renamed from: v0c  reason: default package */
public final class v0c implements p0c {
    v0c() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(String str) {
        String str2 = str;
        h.e(str2, "p1");
        h.e(str2, "uri");
        l0 z = l0.z(str2);
        h.d(z, "SpotifyLink.of(uri)");
        return Boolean.valueOf(z.q() == LinkType.SHOW_EPISODE);
    }
}
