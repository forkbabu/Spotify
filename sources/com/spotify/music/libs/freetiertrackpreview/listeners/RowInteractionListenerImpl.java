package com.spotify.music.libs.freetiertrackpreview.listeners;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.common.base.MoreObjects;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.libs.freetiertrackpreview.logging.c;
import com.spotify.music.preview.v;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class RowInteractionListenerImpl implements a, m {
    private boolean a;
    private final p b = new p();
    private final v c;
    private final ExplicitContentFacade f;
    private final y n;
    private final String o;
    private final s7a p;
    private final t8a q;
    private final c r;
    private final nfa s;
    private final sfa t;

    static final class a<T> implements g<Boolean> {
        final /* synthetic */ RowInteractionListenerImpl a;

        a(RowInteractionListenerImpl rowInteractionListenerImpl) {
            this.a = rowInteractionListenerImpl;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            this.a.a = bool.booleanValue();
        }
    }

    public RowInteractionListenerImpl(v vVar, ExplicitContentFacade explicitContentFacade, y yVar, String str, s7a s7a, t8a t8a, c cVar, nfa nfa, sfa sfa) {
        h.e(vVar, "mPreviewPlayer");
        h.e(explicitContentFacade, "mExplicitContentFacade");
        h.e(yVar, "mIoScheduler");
        h.e(str, "mContextUri");
        h.e(s7a, "mBannedContent");
        h.e(t8a, "mLikedContent");
        h.e(cVar, "trackPreviewUserInteractionLogging");
        h.e(nfa, "trackPreviewAutoPlayHelper");
        h.e(sfa, "upsellSnackbarEducationManager");
        this.c = vVar;
        this.f = explicitContentFacade;
        this.n = yVar;
        this.o = str;
        this.p = s7a;
        this.q = t8a;
        this.r = cVar;
        this.s = nfa;
        this.t = sfa;
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.listeners.a
    public void a(rfa rfa, p81 p81) {
        h.e(rfa, "trackItem");
        h.e(p81, "logging");
        if (rfa.f()) {
            this.q.f(rfa.c(), true);
            this.r.f(p81, rfa.c());
            return;
        }
        this.q.a(rfa.c(), this.o, true);
        this.r.e(p81, rfa.c());
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.listeners.a
    public void b(rfa rfa, p81 p81) {
        h.e(rfa, "trackItem");
        h.e(p81, "logging");
        if (!this.a || !rfa.e()) {
            String a2 = rfa.a();
            if (!MoreObjects.isNullOrEmpty(a2)) {
                this.s.c();
                this.r.b(p81, rfa.c());
                v vVar = this.c;
                vVar.i(a2, rfa.a() + rfa.c());
                v vVar2 = this.c;
                if (vVar2.a(rfa.a() + rfa.c())) {
                    this.t.a();
                    return;
                }
                return;
            }
            return;
        }
        this.f.e(rfa.c(), this.o);
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.listeners.a
    public void c(rfa rfa, p81 p81) {
        h.e(rfa, "trackItem");
        h.e(p81, "logging");
        if (rfa.d()) {
            this.p.b(rfa.c(), this.o, true);
            this.r.c(p81, rfa.c());
            return;
        }
        this.p.a(rfa.c(), this.o, true);
        v vVar = this.c;
        vVar.e(rfa.a() + rfa.c());
        this.r.a(p81, rfa.c());
    }

    @Override // com.spotify.music.libs.freetiertrackpreview.listeners.a
    public void d(p81 p81) {
        h.e(p81, "logging");
        this.r.d(p81);
    }

    @w(Lifecycle.Event.ON_START)
    public final void onStart() {
        this.b.b(this.f.c().I0(this.n).subscribe(new a(this)));
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.b.a();
    }
}
