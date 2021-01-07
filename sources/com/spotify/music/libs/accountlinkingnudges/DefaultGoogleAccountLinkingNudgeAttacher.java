package com.spotify.music.libs.accountlinkingnudges;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.g;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.spotify.base.java.logging.Logger;
import com.spotify.glue.dialogs.f;
import com.spotify.libs.connect.providers.h;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.C0707R;
import com.spotify.music.libs.googleassistantaccountlinking.l;
import com.spotify.rxjava2.d;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public final class DefaultGoogleAccountLinkingNudgeAttacher implements l, m {
    private final cqe A;
    private final y B;
    private final ay9 C;
    private final PublishSubject<Boolean> a;
    private final p b = new p();
    private final p c = new p();
    private final LayoutInflater f;
    private View n;
    private final g o;
    private final boolean p;
    private final boolean q;
    private final h r;
    private final io.reactivex.g<rga> s;
    private final qv0 t;
    private final pv0 u;
    private final cy9 v;
    private final SpSharedPreferences<Object> w;
    private final com.spotify.music.libs.googleassistantaccountlinking.g x;
    private final my9 y;
    private final com.spotify.glue.dialogs.g z;

    static final class a<T> implements io.reactivex.functions.g<Boolean> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            Logger.b("Should nudge user: %b", bool);
        }
    }

    static final class b<T> implements io.reactivex.functions.g<Boolean> {
        final /* synthetic */ DefaultGoogleAccountLinkingNudgeAttacher a;

        b(DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher) {
            this.a = defaultGoogleAccountLinkingNudgeAttacher;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Boolean bool) {
            Boolean bool2 = bool;
            DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher = this.a;
            kotlin.jvm.internal.h.d(bool2, "it");
            DefaultGoogleAccountLinkingNudgeAttacher.g(defaultGoogleAccountLinkingNudgeAttacher, bool2.booleanValue());
        }
    }

    static final class c<T> implements io.reactivex.functions.g<Throwable> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            Logger.e(th2, th2.getMessage(), new Object[0]);
        }
    }

    public DefaultGoogleAccountLinkingNudgeAttacher(g gVar, boolean z2, boolean z3, h hVar, io.reactivex.g<rga> gVar2, qv0 qv0, pv0 pv0, cy9 cy9, SpSharedPreferences<Object> spSharedPreferences, com.spotify.music.libs.googleassistantaccountlinking.g gVar3, my9 my9, com.spotify.glue.dialogs.g gVar4, cqe cqe, y yVar, ay9 ay9) {
        kotlin.jvm.internal.h.e(gVar, "activity");
        kotlin.jvm.internal.h.e(hVar, "activeDeviceProvider");
        kotlin.jvm.internal.h.e(gVar2, "googleAssistantLinkState");
        kotlin.jvm.internal.h.e(qv0, "nudgeManager");
        kotlin.jvm.internal.h.e(pv0, "nudgeFactory");
        kotlin.jvm.internal.h.e(cy9, "instrumentation");
        kotlin.jvm.internal.h.e(spSharedPreferences, "preferences");
        kotlin.jvm.internal.h.e(gVar3, "googleAssistantLinker");
        kotlin.jvm.internal.h.e(my9, "accountLinkingSnackBar");
        kotlin.jvm.internal.h.e(gVar4, "glueDialogBuilderFactory");
        kotlin.jvm.internal.h.e(cqe, "clock");
        kotlin.jvm.internal.h.e(yVar, "mainThread");
        kotlin.jvm.internal.h.e(ay9, "debugTools");
        this.o = gVar;
        this.p = z2;
        this.q = z3;
        this.r = hVar;
        this.s = gVar2;
        this.t = qv0;
        this.u = pv0;
        this.v = cy9;
        this.w = spSharedPreferences;
        this.x = gVar3;
        this.y = my9;
        this.z = gVar4;
        this.A = cqe;
        this.B = yVar;
        this.C = ay9;
        PublishSubject<Boolean> h1 = PublishSubject.h1();
        kotlin.jvm.internal.h.d(h1, "PublishSubject.create<Boolean>()");
        this.a = h1;
        if (z2) {
            gVar.A().a(this);
        }
        LayoutInflater from = LayoutInflater.from(gVar);
        kotlin.jvm.internal.h.d(from, "LayoutInflater.from(activity)");
        this.f = from;
        kotlin.jvm.internal.h.e(spSharedPreferences, "<set-?>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean d(com.spotify.music.libs.accountlinkingnudges.DefaultGoogleAccountLinkingNudgeAttacher r4, com.spotify.libs.connect.model.GaiaDevice r5) {
        /*
            r4.getClass()
            boolean r0 = r5.isSelf()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0039
            boolean r0 = r5.isVoiceEnabled()
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = r5.getBrandName()
            java.lang.String r3 = "Google"
            boolean r0 = kotlin.text.e.f(r0, r3, r2)
            if (r0 == 0) goto L_0x0039
            boolean r4 = r4.q
            if (r4 == 0) goto L_0x0035
            java.lang.String r4 = r5.getModelName()
            java.lang.String r5 = "device.modelName"
            kotlin.jvm.internal.h.d(r4, r5)
            java.lang.String r5 = "Chromecast"
            boolean r4 = kotlin.text.e.b(r4, r5, r2)
            if (r4 != 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r4 = 0
            goto L_0x0036
        L_0x0035:
            r4 = 1
        L_0x0036:
            if (r4 == 0) goto L_0x0039
            r1 = 1
        L_0x0039:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.accountlinkingnudges.DefaultGoogleAccountLinkingNudgeAttacher.d(com.spotify.music.libs.accountlinkingnudges.DefaultGoogleAccountLinkingNudgeAttacher, com.spotify.libs.connect.model.GaiaDevice):boolean");
    }

    public static final void e(DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher) {
        defaultGoogleAccountLinkingNudgeAttacher.getClass();
        Logger.b("Link now clicked", new Object[0]);
        defaultGoogleAccountLinkingNudgeAttacher.v.c();
        defaultGoogleAccountLinkingNudgeAttacher.c.b(defaultGoogleAccountLinkingNudgeAttacher.x.c(defaultGoogleAccountLinkingNudgeAttacher.o).F(l.a.a).B(defaultGoogleAccountLinkingNudgeAttacher.B).subscribe(new c(defaultGoogleAccountLinkingNudgeAttacher), d.a));
    }

    public static final void f(DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher) {
        f c2 = defaultGoogleAccountLinkingNudgeAttacher.z.c(defaultGoogleAccountLinkingNudgeAttacher.o.getString(C0707R.string.google_linking_error_title), defaultGoogleAccountLinkingNudgeAttacher.o.getString(C0707R.string.google_linking_error_error));
        c2.f(defaultGoogleAccountLinkingNudgeAttacher.o.getString(C0707R.string.google_linking_error_try_again), new f(defaultGoogleAccountLinkingNudgeAttacher));
        c2.e(defaultGoogleAccountLinkingNudgeAttacher.o.getString(C0707R.string.google_linking_error_dismiss), g.a);
        c2.a(true);
        c2.b().a();
    }

    public static final void g(DefaultGoogleAccountLinkingNudgeAttacher defaultGoogleAccountLinkingNudgeAttacher, boolean z2) {
        defaultGoogleAccountLinkingNudgeAttacher.getClass();
        if (z2) {
            long j = defaultGoogleAccountLinkingNudgeAttacher.w.j(h.a(), -1);
            if (j == -1) {
                SpSharedPreferences.a<Object> b2 = defaultGoogleAccountLinkingNudgeAttacher.w.b();
                b2.e(h.a(), defaultGoogleAccountLinkingNudgeAttacher.A.d());
                b2.i();
                defaultGoogleAccountLinkingNudgeAttacher.h();
                return;
            }
            long d = defaultGoogleAccountLinkingNudgeAttacher.A.d();
            if (defaultGoogleAccountLinkingNudgeAttacher.w.j(h.b(), -1) == -1) {
                if (j + 691200000 <= d) {
                    SpSharedPreferences.a<Object> b3 = defaultGoogleAccountLinkingNudgeAttacher.w.b();
                    b3.e(h.b(), d);
                    b3.i();
                    defaultGoogleAccountLinkingNudgeAttacher.h();
                }
            } else if (defaultGoogleAccountLinkingNudgeAttacher.w.j(h.c(), -1) == -1 && j + 1900800000 <= d) {
                SpSharedPreferences.a<Object> b4 = defaultGoogleAccountLinkingNudgeAttacher.w.b();
                b4.e(h.c(), d);
                b4.i();
                defaultGoogleAccountLinkingNudgeAttacher.h();
            }
        }
    }

    private final void h() {
        View view = this.n;
        if (view != null) {
            Logger.b("Google Account Linking nudge shown", new Object[0]);
            qv0 qv0 = this.t;
            View inflate = this.f.inflate(C0707R.layout.google_assistant_nudge, (ViewGroup) null);
            pv0 pv0 = this.u;
            com.spotify.libs.nudges.api.options.b bVar = new com.spotify.libs.nudges.api.options.b();
            kotlin.jvm.internal.h.d(inflate, "content");
            bVar.d(inflate);
            ov0 a2 = pv0.a(bVar);
            ((Button) inflate.findViewById(C0707R.id.google_nudge_link_button)).setOnClickListener(new a(0, this, a2));
            ((Button) inflate.findViewById(C0707R.id.google_nudge_cancel_button)).setOnClickListener(new a(1, this, a2));
            a2.c(new DefaultGoogleAccountLinkingNudgeAttacher$createRichNudge$3(this));
            qv0.a(a2, view);
        }
    }

    @Override // com.spotify.music.libs.accountlinkingnudges.l
    public void a(View view) {
        kotlin.jvm.internal.h.e(view, "anchorView");
        this.n = view;
    }

    @w(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.c.a();
    }

    @w(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.a.onNext(Boolean.FALSE);
    }

    @w(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.a.onNext(Boolean.TRUE);
    }

    @w(Lifecycle.Event.ON_START)
    public final void onStart() {
        p pVar = this.b;
        PublishSubject<Boolean> a2 = this.C.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.getClass();
        s<Boolean> D = a2.D(5000, timeUnit, io.reactivex.schedulers.a.a(), false);
        PublishSubject<Boolean> publishSubject = this.a;
        io.reactivex.g<rga> gVar = this.s;
        s j0 = je.Z(gVar, gVar).j0(d.a);
        s<R> A2 = this.r.a().j0(new b(this)).A((R) Boolean.FALSE);
        kotlin.jvm.internal.h.d(A2, "activeDeviceProvider.get…   .defaultIfEmpty(false)");
        s k0 = s.k0(D, s.m(publishSubject, j0, A2, e.a));
        kotlin.jvm.internal.h.d(k0, "Observable.merge(\n      …}\n            )\n        )");
        pVar.b(k0.o0(this.B).N(a.a).subscribe(new b(this), c.a));
    }

    @w(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.b.a();
    }
}
