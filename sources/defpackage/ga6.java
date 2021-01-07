package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.e;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.w;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.subjects.CompletableSubject;
import io.reactivex.subjects.a;
import io.reactivex.y;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: ga6  reason: default package */
public class ga6 {
    private final q a = new q();
    private oo6 b;
    private final ba6 c;
    private final v d;
    private final e e;
    private final ea6 f;
    private final String g;
    private final w h;
    private final y i;
    private final CompletableSubject j = CompletableSubject.R();
    private final a<h76> k = a.h1();
    private final q l = new q();
    private final SnackbarManager m;
    private final Context n;
    private boolean o;
    private ka6 p;
    private Boolean q;
    private h76 r;

    public ga6(ba6 ba6, v vVar, ea6 ea6, w wVar, String str, y yVar, SnackbarManager snackbarManager, Context context, e eVar) {
        this.c = ba6;
        this.d = vVar;
        this.e = eVar;
        this.f = ea6;
        this.g = str;
        this.h = wVar;
        this.i = yVar;
        this.m = snackbarManager;
        this.n = context;
    }

    public static void d(ga6 ga6, boolean z) {
        boolean c2 = ga6.e.a().c();
        if (ga6.e.a().e() || !z) {
            ((la6) ga6.p).K(c2);
        } else {
            ((la6) ga6.p).J(c2);
        }
        ga6.o = z;
    }

    public static void e(ga6 ga6, h76 h76) {
        ga6.r = h76;
        j l2 = h76.l();
        ((la6) ga6.p).G(l2.t());
        ((la6) ga6.p).I(ga6.f.a(h76, ga6.e.c()));
        String str = "";
        if (h76.n()) {
            ((la6) ga6.p).N(str);
        } else {
            ((la6) ga6.p).N(l2.j());
        }
        Map<String, String> f2 = h76.l().f();
        String str2 = f2.get("primary_color");
        if (str2 == null) {
            str2 = "#FFFFFF";
        }
        int parseColor = Color.parseColor(str2);
        ((la6) ga6.p).L(parseColor, f2.get("image_url"), com.spotify.playlist.models.q.c(l2.c(), Covers.Size.LARGE));
        String str3 = f2.get(ContextTrack.Metadata.KEY_SUBTITLE);
        String d2 = l2.d();
        ka6 ka6 = ga6.p;
        CharSequence charSequence = str;
        if (d2 != null) {
            charSequence = z42.m(d2);
        }
        ((la6) ka6).H(charSequence, str3);
        ((la6) ga6.p).M(parseColor);
    }

    public void a(ka6 ka6) {
        this.p = ka6;
        if (ka6 != null) {
            Boolean bool = this.q;
            if (bool != null) {
                ((la6) ka6).E(bool.booleanValue());
                this.q = null;
            }
            this.l.a(this.k.subscribe(new m96(this)));
            this.l.a(this.h.b().o0(this.i).subscribe(new l96(this), t96.a));
            if (this.e.d()) {
                this.l.a(this.b.b().o0(this.i).subscribe(new k96(this)));
                return;
            }
            return;
        }
        this.l.c();
    }

    public void b() {
        io.reactivex.a aVar;
        boolean t = this.r.l().t();
        this.c.c(this.g, t);
        if (!t) {
            aVar = this.d.c(this.g);
        } else {
            aVar = this.d.d(this.g);
        }
        this.a.a(aVar.subscribe(new n96(this, t), j96.a));
    }

    public io.reactivex.a c() {
        return this.j;
    }

    public /* synthetic */ void f(w.b bVar) {
        ((la6) this.p).y(this.h.d(bVar));
    }

    public /* synthetic */ void g(boolean z) {
        this.m.show(SnackbarConfiguration.builder(this.n.getString(!z ? C0707R.string.playlist_header_snackbar_follow_playlist : C0707R.string.playlist_header_snackbar_unfollow_playlist, this.r.l().j())).build());
    }

    public /* synthetic */ void h(h76 h76) {
        this.k.onNext(h76);
        this.j.onComplete();
    }

    public void i() {
        String str;
        io.reactivex.a aVar;
        boolean b2 = this.e.a().b();
        if (this.e.a().e()) {
            String b3 = this.c.b(this.g);
            q qVar = this.a;
            if (b2) {
                aVar = this.b.h(b3);
            } else {
                aVar = this.b.j(b3);
            }
            qVar.a(aVar.subscribe(o96.a, q96.a));
            return;
        }
        if (this.o) {
            str = this.c.a(this.g);
        } else {
            str = this.c.b(this.g);
        }
        this.a.a(this.b.a(b2, str).subscribe(r96.a, s96.a));
    }

    public void j(Bundle bundle) {
        if (bundle != null) {
            this.q = Boolean.valueOf(bundle.getBoolean(ga6.class.getName()));
        }
    }

    public void k(Bundle bundle) {
        if (this.p != null) {
            bundle.putBoolean(ga6.class.getName(), ((la6) this.p).F());
        }
    }

    public void l(t.b bVar) {
        this.b = bVar.b();
        this.a.c();
        q qVar = this.a;
        s<h76> o0 = bVar.a().b().E().o0(this.i);
        p96 p96 = new p96(this);
        CompletableSubject completableSubject = this.j;
        completableSubject.getClass();
        qVar.a(o0.subscribe(p96, new z96(completableSubject)));
    }

    public void m() {
        this.a.c();
    }
}
