package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.video.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.w;
import io.reactivex.z;
import java.io.InputStream;

/* renamed from: dod  reason: default package */
public class dod {
    private final i1d a;
    private final znd b;

    /* renamed from: dod$a */
    static class a {
        private final q a;

        a(q qVar) {
            this.a = qVar;
        }

        /* access modifiers changed from: package-private */
        public InputStream a(String str) {
            return this.a.b(str);
        }
    }

    public dod(i1d i1d, znd znd) {
        this.a = i1d;
        this.b = znd;
    }

    public z<szc> a(r rVar, String str) {
        return z.R(this.b.a(str), this.a.a(rVar.g()), snd.a);
    }

    public z<w> b(r rVar, String str) {
        Logger.b("Canvas Video: %s", str);
        return z.R(this.b.a(str), this.a.a(rVar.g()), new tnd(rVar));
    }
}
