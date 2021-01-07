package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.ads.rules.AdRules;
import com.spotify.music.features.playlistentity.t;
import com.spotify.rxjava2.p;
import io.reactivex.a;
import io.reactivex.subjects.CompletableSubject;

/* access modifiers changed from: package-private */
/* renamed from: vs6  reason: default package */
public final class vs6 implements us6, ts6 {
    private static final int v = vs6.class.hashCode();
    private final String a;
    private final eu3 b;
    private final AdRules c;
    private final rs6 f;
    private final Context n;
    private final txc o;
    private final p p = new p();
    private final CompletableSubject q = CompletableSubject.R();
    private twd r;
    private Optional<du3> s = Optional.absent();
    private Bundle t;
    private boolean u;

    public vs6(String str, eu3 eu3, AdRules adRules, rs6 rs6, txc txc, Context context) {
        this.b = eu3;
        this.c = adRules;
        this.f = rs6;
        this.n = context;
        this.a = str;
        this.o = txc;
    }

    @Override // defpackage.ts6
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd) {
        this.r = twd;
        Optional<du3> fromNullable = Optional.fromNullable((du3) this.b.a(this.n, this.u, this.a));
        this.s = fromNullable;
        if (fromNullable.isPresent()) {
            du3 du3 = this.s.get();
            du3.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            v02 v02 = new v02(du3, true);
            int i = v;
            twd.Z(v02, i);
            twd.i0(i);
        }
    }

    public /* synthetic */ void b(Boolean bool) {
        this.u = bool.booleanValue();
        this.q.onComplete();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
        if (this.s.isPresent()) {
            this.s.get().h(bundle);
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
        this.t = bundle;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        if (this.s.isPresent()) {
            this.c.c(AdRules.StateType.ON_SPONSORED_PAGE, false);
        }
        this.f.a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public a g() {
        return a.y(ImmutableList.of((CompletableSubject) this.f.b(), this.q));
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        if (this.s.isPresent()) {
            this.c.c(AdRules.StateType.ON_SPONSORED_PAGE, true);
            this.s.get().g(this.t);
        }
        this.f.a(this);
    }

    public void i(boolean z) {
        if (z) {
            this.r.l0(v);
        } else {
            this.r.i0(v);
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.f.e(bVar);
        this.p.b(this.o.a("ads").j0(qs6.a).subscribe(new ps6(this)));
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.f.f();
        this.p.a();
    }
}
