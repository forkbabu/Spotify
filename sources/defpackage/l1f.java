package defpackage;

import android.content.res.Resources;
import com.google.common.base.Optional;
import com.spotify.music.C0707R;
import defpackage.eve;
import java.util.Locale;

/* renamed from: l1f  reason: default package */
public final class l1f {
    private final Resources a;
    private eve b;

    l1f(Resources resources) {
        this.a = resources;
    }

    public r1f a(dve dve, eve.g gVar) {
        Optional optional;
        if (!gVar.n()) {
            optional = Optional.absent();
        } else if (dve.b() == null || !dve.b().toLowerCase(Locale.getDefault()).contains("recommend")) {
            optional = Optional.of(this.a.getString(C0707R.string.try_saying));
        } else {
            optional = Optional.of(this.a.getString(C0707R.string.try_saying_recommendation));
        }
        return r1f.h(optional);
    }

    public /* synthetic */ r1f b(eve.d dVar) {
        return r1f.b(this.a.getStringArray(dVar.n()));
    }

    public /* synthetic */ r1f c(eve.h hVar) {
        return r1f.a(o1f.c(this.a.getString(C0707R.string.allow_mic_title), this.a.getString(C0707R.string.allow_mic_description)));
    }

    public /* synthetic */ r1f d(dve dve, eve.i iVar) {
        return r1f.a(o1f.d(this.a.getString(C0707R.string.offline_title), this.a.getString(C0707R.string.offline_description), dve.d() ? C0707R.drawable.ic_voice_inline_error : C0707R.drawable.ic_voice_error));
    }

    public /* synthetic */ r1f e(dve dve, eve.l lVar) {
        return r1f.a(o1f.a(this.a.getString(C0707R.string.did_not_catch_title), this.a.getString(C0707R.string.did_not_catch_description), dve.d() ? C0707R.drawable.ic_voice_inline_error : C0707R.drawable.ic_mic_retry, p1f.c()));
    }

    public /* synthetic */ r1f f(dve dve, eve.a aVar) {
        return r1f.a(o1f.a(this.a.getString(C0707R.string.did_not_catch_title), this.a.getString(C0707R.string.did_not_catch_description), dve.d() ? C0707R.drawable.ic_voice_inline_error : C0707R.drawable.ic_mic_retry, p1f.d()));
    }

    public q1f g(dve dve) {
        String n = dve.n();
        eve eve = this.b;
        if (eve != null && eve.equals(dve.l())) {
            return q1f.a(r1f.f(), n);
        }
        eve l = dve.l();
        this.b = l;
        return q1f.a((r1f) l.h(d1f.a, new e1f(this, dve), z0f.a, b1f.a, k1f.a, new c1f(this), new g1f(this, dve), new h1f(this, dve), new i1f(this, dve), new a1f(dve), f1f.a, new j1f(this)), n);
    }
}
