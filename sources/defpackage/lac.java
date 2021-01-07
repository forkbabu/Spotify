package defpackage;

import android.net.Uri;
import com.google.common.collect.FluentIterable;
import com.spotify.base.java.logging.Logger;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: lac  reason: default package */
public class lac {
    private final o61 a;
    private final v9c b;
    private final jrd c;
    private boolean d;
    private final y e;

    public lac(o61 o61, v9c v9c, jrd jrd, y yVar) {
        this.a = o61;
        this.b = v9c;
        this.c = jrd;
        this.e = yVar;
    }

    public z<Boolean> a(b91 b91, String str, String str2, Uri uri) {
        Logger.b("FreeTierTrack trackUri- %s, ShareId- %s, ExternalReferrer- %s", str, str2, uri);
        s81 s81 = (s81) FluentIterable.from(b91.body()).transform(cac.a).firstMatch(fac.a).orNull();
        if (s81 == null) {
            Logger.d("Can't find shuffle button view model.", new Object[0]);
        }
        if (this.d || s81 == null || !this.b.c(str2)) {
            this.d = true;
            return z.z(Boolean.FALSE);
        }
        this.d = true;
        return this.c.b(str, str2, uri).B(this.e).p(new eac(this, s81));
    }

    public void b(s81 s81, Boolean bool) {
        if (bool.booleanValue()) {
            this.a.a(n61.b("click", s81));
        }
    }
}
