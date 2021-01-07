package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.hubframework.defaults.playback.ExplicitPlaybackCommandHelper;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.assistedcuration.search.utils.RestrictedPlaybackCommandHelper;
import com.spotify.music.preview.v;
import defpackage.o81;

/* renamed from: i24  reason: default package */
public class i24 implements a71 {
    private final c8b a;
    private final v b;
    private final ExplicitPlaybackCommandHelper c;
    private final RestrictedPlaybackCommandHelper f;

    public i24(c8b c8b, v vVar, ExplicitPlaybackCommandHelper explicitPlaybackCommandHelper, RestrictedPlaybackCommandHelper restrictedPlaybackCommandHelper) {
        c8b.getClass();
        this.a = c8b;
        vVar.getClass();
        this.b = vVar;
        explicitPlaybackCommandHelper.getClass();
        this.c = explicitPlaybackCommandHelper;
        this.f = restrictedPlaybackCommandHelper;
    }

    public static o81 a(String str, String str2, String str3, boolean z, boolean z2) {
        o81.a e = z81.b().e("ac:preview");
        str.getClass();
        o81.a b2 = e.b("uri", str);
        str2.getClass();
        o81.a b3 = b2.b("previewId", str2);
        str3.getClass();
        return b3.b("previewKey", str3).b("isExplicit", Boolean.valueOf(z)).b("isAgeRestricted", Boolean.valueOf(z2)).c();
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        p81 data = o81.data();
        String string = data.string("previewId");
        if (MoreObjects.isNullOrEmpty(string)) {
            Logger.d("Missing previewId", new Object[0]);
        } else {
            String string2 = data.string("uri");
            if (string2 != null) {
                if (this.c.d(data.boolValue("isExplicit", false))) {
                    this.c.e(string2, null);
                    return;
                }
                if (this.f.e(data.boolValue("isAgeRestricted", false))) {
                    this.f.f(string2);
                    return;
                }
                this.b.i(string, (String) x.n(data.string("previewKey"), ""));
            }
        }
        this.a.a();
    }
}
