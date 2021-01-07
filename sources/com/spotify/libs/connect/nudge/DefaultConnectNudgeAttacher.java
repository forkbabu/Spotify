package com.spotify.libs.connect.nudge;

import android.view.View;
import androidx.appcompat.app.g;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.spotify.libs.nudges.api.options.c;
import com.spotify.music.C0707R;
import com.spotify.rxjava2.q;
import io.reactivex.functions.n;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class DefaultConnectNudgeAttacher implements b, m {
    private final q a = new q();
    private View b;
    private g c;
    private final c f;
    private final qv0 n;
    private final pv0 o;
    private final d p;
    private final y q;
    private final boolean r;
    private final com.spotify.libs.connect.instrumentation.c s;

    /* compiled from: java-style lambda group */
    static final class a<T> implements n<Boolean> {
        public static final a b = new a(0);
        public static final a c = new a(1);
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public final boolean test(Boolean bool) {
            int i = this.a;
            if (i == 0) {
                Boolean bool2 = bool;
                h.e(bool2, "it");
                return bool2.booleanValue();
            } else if (i == 1) {
                Boolean bool3 = bool;
                h.e(bool3, "it");
                return bool3.booleanValue();
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements io.reactivex.functions.g<Boolean> {
        final /* synthetic */ DefaultConnectNudgeAttacher a;

        b(DefaultConnectNudgeAttacher defaultConnectNudgeAttacher) {
            this.a = defaultConnectNudgeAttacher;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            View view = this.a.b;
            if (view != null) {
                ov0 b = DefaultConnectNudgeAttacher.b(this.a);
                b.c(new DefaultConnectNudgeAttacher$onStart$2$$special$$inlined$let$lambda$1(this));
                this.a.n.a(b, view);
            }
        }
    }

    static final class c<T> implements io.reactivex.functions.g<Boolean> {
        final /* synthetic */ DefaultConnectNudgeAttacher a;

        c(DefaultConnectNudgeAttacher defaultConnectNudgeAttacher) {
            this.a = defaultConnectNudgeAttacher;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            this.a.n.dismiss();
        }
    }

    public DefaultConnectNudgeAttacher(g gVar, c cVar, qv0 qv0, pv0 pv0, d dVar, y yVar, boolean z, com.spotify.libs.connect.instrumentation.c cVar2) {
        h.e(gVar, "activity");
        h.e(cVar, "engine");
        h.e(qv0, "nudgeManager");
        h.e(pv0, "nudgeFactory");
        h.e(dVar, "connectNudgeNavigation");
        h.e(yVar, "mainThread");
        h.e(cVar2, "instrumentation");
        this.c = gVar;
        this.f = cVar;
        this.n = qv0;
        this.o = pv0;
        this.p = dVar;
        this.q = yVar;
        this.r = z;
        this.s = cVar2;
        this.c.A().a(this);
    }

    public static final ov0 b(DefaultConnectNudgeAttacher defaultConnectNudgeAttacher) {
        pv0 pv0 = defaultConnectNudgeAttacher.o;
        com.spotify.libs.nudges.api.options.c cVar = new com.spotify.libs.nudges.api.options.c();
        String string = defaultConnectNudgeAttacher.c.getString(C0707R.string.connect_nudge_text);
        h.d(string, "activity.getString(R.string.connect_nudge_text)");
        cVar.d(new c.a(string, 0, new DefaultConnectNudgeAttacher$createConnectNudge$1(defaultConnectNudgeAttacher), 2));
        cVar.b(new DefaultConnectNudgeAttacher$createConnectNudge$2(defaultConnectNudgeAttacher));
        return pv0.a(cVar);
    }

    @Override // com.spotify.libs.connect.nudge.b
    public void a(View view) {
        h.e(view, "view");
        this.b = view;
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.f.c(false);
    }

    @w(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.f.c(true);
    }

    @w(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (this.r) {
            this.f.c(true);
            this.a.a(this.f.a().o0(this.q).Q(a.b).subscribe(new b(this)));
            this.a.a(this.f.e().o0(this.q).Q(a.c).subscribe(new c(this)));
        }
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.f.c(false);
        this.a.c();
    }
}
