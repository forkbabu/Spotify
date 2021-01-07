package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.t;
import com.spotify.playlist.endpoints.v;
import com.spotify.rxjava2.q;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Collections;
import java.util.List;

/* renamed from: gu4  reason: default package */
public class gu4 implements fu4 {
    private final com.spotify.music.features.createplaylist.logger.a a;
    private final v b;
    private final y c;
    private final lu4 d;
    private final t e;
    private final l31 f;
    private final yt4 g;
    private final iu4 h;
    private final xt4 i;
    private final q j = new q();
    private final boolean k;
    private pu4 l;

    /* renamed from: gu4$a */
    public static abstract class a {

        /* renamed from: gu4$a$a  reason: collision with other inner class name */
        public interface AbstractC0595a {
        }

        public abstract String a();

        public abstract String b();
    }

    public gu4(com.spotify.music.features.createplaylist.logger.a aVar, v vVar, y yVar, lu4 lu4, t tVar, l31 l31, yt4 yt4, iu4 iu4, xt4 xt4) {
        this.a = aVar;
        this.b = vVar;
        this.c = yVar;
        this.d = lu4;
        this.e = tVar;
        this.f = l31;
        this.g = yt4;
        this.h = iu4;
        this.k = yt4.l().isEmpty();
        this.i = xt4;
    }

    @Override // defpackage.fu4
    public void a() {
        this.a.b();
        ((qu4) this.l).f();
        ((qu4) this.l).c(null);
    }

    @Override // defpackage.fu4
    public void b() {
        this.a.a();
        ((qu4) this.l).f();
    }

    @Override // defpackage.fu4
    public void c(String str) {
        if (str.isEmpty()) {
            ((qu4) this.l).m();
        } else {
            ((qu4) this.l).k();
        }
    }

    @Override // defpackage.fu4
    public void d(String str) {
        Optional optional;
        ((qu4) this.l).l(true);
        List<String> l2 = this.g.l();
        boolean z = !l2.isEmpty();
        String c2 = this.a.c(true ^ MoreObjects.isNullOrEmpty(str));
        l0 z2 = l0.z(this.g.i());
        if (z2.q() == LinkType.COLLECTION_PLAYLIST_FOLDER) {
            optional = Optional.fromNullable(z2.g());
        } else {
            optional = Optional.absent();
        }
        ((qu4) this.l).d();
        this.j.a(this.d.b(str).P().J0(new du4(this, z, l2, optional)).o0(this.c).subscribe(new zt4(this, z, c2), new cu4(this)));
    }

    @Override // defpackage.fu4
    public void e(pu4 pu4) {
        this.l = pu4;
    }

    public /* synthetic */ io.reactivex.v f(String str, Optional optional, List list) {
        return this.b.a(str, list, optional, this.i.d(), this.i.m()).P();
    }

    public io.reactivex.v g(boolean z, List list, Optional optional, String str) {
        z<List<String>> zVar;
        if (z) {
            zVar = this.f.e(list);
        } else {
            zVar = z.z(Collections.emptyList());
        }
        return zVar.P().W(new bu4(this, str, optional), false, Integer.MAX_VALUE).j0(new au4(str));
    }

    public /* synthetic */ void h(boolean z, String str, a aVar) {
        if (z) {
            this.h.a(aVar.a());
        }
        ((qu4) this.l).f();
        ((qu4) this.l).c(aVar.b());
        if (this.k) {
            this.e.b(aVar.b(), str);
        }
    }

    public /* synthetic */ void i(Throwable th) {
        Logger.e(th, "Failed to create playlist", new Object[0]);
        ((qu4) this.l).e();
        ((qu4) this.l).l(false);
    }

    @Override // defpackage.fu4
    public void stop() {
        this.j.c();
    }
}
