package com.spotify.libs.connect.nudge;

import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.libs.connect.providers.m;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import defpackage.ru0;
import io.reactivex.functions.j;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import kotlin.Pair;

public final class DefaultConnectNudgeEngine implements ru0.a, c {
    private final s<PlayerState> a;
    private final p b = new p();
    private final io.reactivex.subjects.a<Boolean> c;
    private final io.reactivex.subjects.a<Boolean> d;
    private final io.reactivex.subjects.a<Boolean> e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final h j;
    private final com.spotify.libs.connect.instrumentation.a k;
    private final m l;
    private final a m;
    private final boolean n;

    static final class a<T1, T2, T3, T4, T5, R> implements j<Optional<GaiaDevice>, Pair<? extends Boolean, ? extends Boolean>, Boolean, PlayerState, Boolean, Boolean> {
        final /* synthetic */ DefaultConnectNudgeEngine a;

        a(DefaultConnectNudgeEngine defaultConnectNudgeEngine) {
            this.a = defaultConnectNudgeEngine;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.j
        public Boolean a(Optional<GaiaDevice> optional, Pair<? extends Boolean, ? extends Boolean> pair, Boolean bool, PlayerState playerState, Boolean bool2) {
            Optional<GaiaDevice> optional2 = optional;
            Pair<? extends Boolean, ? extends Boolean> pair2 = pair;
            Boolean bool3 = bool;
            PlayerState playerState2 = playerState;
            Boolean bool4 = bool2;
            kotlin.jvm.internal.h.e(optional2, "activeDevice");
            kotlin.jvm.internal.h.e(pair2, "appBackgroundStates");
            kotlin.jvm.internal.h.e(bool3, "isHeadsetPlugged");
            kotlin.jvm.internal.h.e(playerState2, "playerState");
            kotlin.jvm.internal.h.e(bool4, "isMainBarShown");
            return Boolean.valueOf(DefaultConnectNudgeEngine.f(this.a, playerState2, pair2, optional2, bool3.booleanValue(), bool4.booleanValue()));
        }
    }

    public DefaultConnectNudgeEngine(h hVar, com.spotify.libs.connect.instrumentation.a aVar, m mVar, a aVar2, g<PlayerState> gVar, boolean z) {
        kotlin.jvm.internal.h.e(hVar, "activeDeviceProvider");
        kotlin.jvm.internal.h.e(aVar, "applicationStateProvider");
        kotlin.jvm.internal.h.e(mVar, "devicesListProvider");
        kotlin.jvm.internal.h.e(aVar2, "connectHeadsetPluggedStatusProvider");
        kotlin.jvm.internal.h.e(gVar, "playerState");
        this.j = hVar;
        this.k = aVar;
        this.l = mVar;
        this.m = aVar2;
        this.n = z;
        this.a = new v(gVar);
        io.reactivex.subjects.a<Boolean> h1 = io.reactivex.subjects.a.h1();
        kotlin.jvm.internal.h.d(h1, "BehaviorSubject.create()");
        this.c = h1;
        io.reactivex.subjects.a<Boolean> h12 = io.reactivex.subjects.a.h1();
        kotlin.jvm.internal.h.d(h12, "BehaviorSubject.create()");
        this.d = h12;
        io.reactivex.subjects.a<Boolean> h13 = io.reactivex.subjects.a.h1();
        kotlin.jvm.internal.h.d(h13, "BehaviorSubject.create()");
        this.e = h13;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a0 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean f(com.spotify.libs.connect.nudge.DefaultConnectNudgeEngine r3, com.spotify.player.model.PlayerState r4, kotlin.Pair r5, com.google.common.base.Optional r6, boolean r7, boolean r8) {
        /*
            r3.getClass()
            java.lang.Object r0 = r5.c()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r5 = r5.d()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001f
            if (r5 == 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            if (r5 == 0) goto L_0x0028
            r3.f = r2
            boolean r5 = r3.g
            r3.h = r5
        L_0x0028:
            if (r0 == 0) goto L_0x0037
            r3.g = r2
            io.reactivex.subjects.a<java.lang.Boolean> r5 = r3.e
            boolean r0 = r3.f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.onNext(r0)
        L_0x0037:
            if (r8 == 0) goto L_0x00a7
            boolean r5 = r3.i
            if (r5 == 0) goto L_0x004b
            boolean r5 = r4.isPlaying()
            if (r5 == 0) goto L_0x004b
            boolean r5 = r4.isPaused()
            if (r5 != 0) goto L_0x004b
            r5 = 1
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            boolean r8 = r4.isPlaying()
            if (r8 == 0) goto L_0x005b
            boolean r4 = r4.isPaused()
            if (r4 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r4 = 0
            goto L_0x005c
        L_0x005b:
            r4 = 1
        L_0x005c:
            r3.i = r4
            if (r5 == 0) goto L_0x00a7
            boolean r4 = r6.isPresent()
            if (r4 == 0) goto L_0x0079
            java.lang.Object r4 = r6.get()
            java.lang.String r5 = "activeDevice.get()"
            kotlin.jvm.internal.h.d(r4, r5)
            com.spotify.libs.connect.model.GaiaDevice r4 = (com.spotify.libs.connect.model.GaiaDevice) r4
            boolean r4 = r4.isSelf()
            if (r4 == 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            com.spotify.libs.connect.providers.m r5 = r3.l
            java.util.List r5 = r5.b()
            if (r5 == 0) goto L_0x0087
            int r5 = r5.size()
            goto L_0x0088
        L_0x0087:
            r5 = 0
        L_0x0088:
            if (r5 <= r1) goto L_0x008c
            r5 = 1
            goto L_0x008d
        L_0x008c:
            r5 = 0
        L_0x008d:
            boolean r6 = r3.f
            if (r6 == 0) goto L_0x0092
            goto L_0x009b
        L_0x0092:
            boolean r6 = r3.g
            if (r6 == 0) goto L_0x0097
            goto L_0x009b
        L_0x0097:
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x009d
        L_0x009b:
            r3 = 0
            goto L_0x009e
        L_0x009d:
            r3 = 1
        L_0x009e:
            if (r3 == 0) goto L_0x00a7
            if (r7 != 0) goto L_0x00a7
            if (r4 == 0) goto L_0x00a7
            if (r5 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r1 = 0
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.connect.nudge.DefaultConnectNudgeEngine.f(com.spotify.libs.connect.nudge.DefaultConnectNudgeEngine, com.spotify.player.model.PlayerState, kotlin.Pair, com.google.common.base.Optional, boolean, boolean):boolean");
    }

    @Override // com.spotify.libs.connect.nudge.c
    public s a() {
        return this.c;
    }

    @Override // com.spotify.libs.connect.nudge.c
    public void b() {
        this.f = true;
    }

    @Override // com.spotify.libs.connect.nudge.c
    public void c(boolean z) {
        this.d.onNext(Boolean.valueOf(z));
    }

    @Override // com.spotify.libs.connect.nudge.c
    public void d() {
        this.g = true;
        this.e.onNext(true);
    }

    @Override // com.spotify.libs.connect.nudge.c
    public s e() {
        return this.e;
    }

    @Override // defpackage.ru0.a
    public void onStart() {
        if (this.n) {
            this.f = false;
            this.g = false;
            this.b.b(s.k(this.j.a(), this.k.a().j0(g.a).x0(h.a), this.m.a(), this.a, this.d, new a(this)).subscribe(new f(new DefaultConnectNudgeEngine$onStart$2(this.c))));
        }
    }

    @Override // defpackage.ru0.a
    public void onStop() {
        this.b.a();
    }
}
