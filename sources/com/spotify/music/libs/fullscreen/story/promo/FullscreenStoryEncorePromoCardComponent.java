package com.spotify.music.libs.fullscreen.story.promo;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.encore.Component;
import com.spotify.encore.ComponentFactory;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.a0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.events.d0;
import com.spotify.mobile.android.video.events.e0;
import com.spotify.mobile.android.video.events.f0;
import com.spotify.mobile.android.video.events.i0;
import com.spotify.mobile.android.video.events.j0;
import com.spotify.mobile.android.video.events.y;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.g0;
import com.spotify.mobile.android.video.l0;
import com.spotify.mobile.android.video.r;
import com.spotify.mobile.android.video.s;
import com.spotify.mobile.android.video.t;
import com.spotify.mobile.android.video.u;
import com.spotify.mobile.android.video.v;
import com.spotify.music.C0707R;
import com.spotify.music.libs.fullscreen.story.promo.encore.FullscreenStoryPromoCard$Events;
import com.spotify.music.libs.fullscreen.story.promo.encore.a;
import com.spotify.music.libs.fullscreen.story.promo.encore.b;
import defpackage.s51;
import java.util.EnumSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class FullscreenStoryEncorePromoCardComponent extends qk9<Holder> {
    private final ComponentFactory<Component<b, FullscreenStoryPromoCard$Events>, a> a;
    private final f b;
    private final sg0<s81, Pair<b.a, String>> c;
    private final boolean f;
    private final l0 n;
    private final s o;
    private final u p;
    private final n q;
    private final q72 r;

    public static final class Holder extends s51.c.a<View> implements View.OnAttachStateChangeListener, r72, f0, e0 {
        private final r b;
        private String c = "";
        private final Component<b, FullscreenStoryPromoCard$Events> f;
        private final f n;
        private final sg0<s81, Pair<b.a, String>> o;
        private final boolean p;
        private final l0 q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Holder(Component<b, FullscreenStoryPromoCard$Events> component, f fVar, sg0<s81, Pair<b.a, String>> sg0, boolean z, l0 l0Var, s sVar, u uVar, final n nVar, final q72 q72) {
            super(component.getView());
            h.e(component, "card");
            h.e(fVar, "listener");
            h.e(sg0, "mapper");
            h.e(l0Var, "videoSurfaceManager");
            h.e(sVar, "betamaxPlayerBuilder");
            h.e(uVar, "betamaxStorage");
            h.e(nVar, "lifecycleOwner");
            h.e(q72, "applicationStateObservable");
            this.f = component;
            this.n = fVar;
            this.o = sg0;
            this.p = z;
            this.q = l0Var;
            sVar.c(d.t(this));
            sVar.d("com.spotify.music.libs.fullscreen-story-promo");
            sVar.i(l0Var);
            sVar.g(false);
            sVar.h(uVar);
            r a = sVar.a();
            t tVar = (t) a;
            tVar.a0(true);
            tVar.P(true);
            h.d(a, "betamaxPlayerBuilder\n   …t(true)\n                }");
            this.b = a;
            nVar.A().a(new m(this) {
                /* class com.spotify.music.libs.fullscreen.story.promo.FullscreenStoryEncorePromoCardComponent.Holder.AnonymousClass1 */
                final /* synthetic */ Holder a;

                {
                    this.a = r1;
                }

                @w(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    this.a.b.stop();
                    this.a.b.d();
                    Holder holder = this.a;
                    holder.a.removeOnAttachStateChangeListener(holder);
                    nVar.A().c(this);
                    q72.b(this.a);
                }

                @w(Lifecycle.Event.ON_PAUSE)
                public final void onPause() {
                    this.a.b.pause();
                }

                @w(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    this.a.b.resume();
                }
            });
            this.a.addOnAttachStateChangeListener(this);
            q72.c(this);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            je.h(s81, "model", aVar, "action", iArr, "indexPath");
        }

        @Override // defpackage.r72
        public void S() {
            this.b.resume();
        }

        @Override // defpackage.r72
        public void Z() {
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void a(long j) {
            d0.l(this, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void b(j0 j0Var, long j, long j2) {
            d0.x(this, j0Var, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void c(long j) {
            d0.s(this, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void d(boolean z, long j, long j2) {
            d0.b(this, z, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void e(long j, long j2) {
            d0.f(this, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void f(long j, long j2, long j3) {
            d0.u(this, j, j2, j3);
        }

        @Override // com.spotify.mobile.android.video.events.f0
        public Optional<e0> g(com.spotify.mobile.android.video.d0 d0Var, a0 a0Var, com.spotify.mobile.android.video.f0 f0Var, String str, g0 g0Var) {
            h.e(d0Var, "playbackIdentity");
            h.e(a0Var, "playOptions");
            h.e(f0Var, "playbackTimeObservable");
            h.e(str, "featureIdentifier");
            Optional<e0> of = Optional.of(this);
            h.d(of, "Optional.of(this)");
            return of;
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void h(i0 i0Var, long j) {
            d0.t(this, i0Var, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void i(EncryptionType encryptionType, long j) {
            d0.g(this, encryptionType, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void j(long j, long j2, long j3, long j4) {
            d0.d(this, j, j2, j3, j4);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void k(List list, long j) {
            d0.k(this, list, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void l(BetamaxException betamaxException, long j, long j2) {
            d0.j(this, betamaxException, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void m(boolean z, long j) {
            d0.n(this, z, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void n(com.spotify.mobile.android.video.d0 d0Var, long j) {
            d0.i(this, d0Var, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void o(BetamaxException betamaxException, long j, long j2) {
            d0.r(this, betamaxException, j, j2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f.render(new b.AbstractC0293b.a(this.q));
            this.b.resume();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.b.pause();
            this.f.render(new b.AbstractC0293b.C0294b(this.q));
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void p(v vVar, ReasonEnd reasonEnd, long j, long j2) {
            d0.o(this, vVar, reasonEnd, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public void q(StreamingType streamingType, long j, long j2) {
            h.e(streamingType, "streamingType");
            this.f.render(b.AbstractC0293b.c.a);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void r(long j) {
            d0.h(this, j);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void s(float f2, long j, long j2) {
            d0.p(this, f2, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void t(Optional optional, long j, long j2) {
            d0.v(this, optional, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void u(Optional optional, long j, long j2) {
            d0.w(this, optional, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void v(y yVar, long j, long j2) {
            d0.a(this, yVar, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void w(long j, long j2) {
            d0.c(this, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void x(long j, long j2) {
            d0.m(this, j, j2);
        }

        @Override // com.spotify.mobile.android.video.events.e0
        public /* synthetic */ void y(int i, long j) {
            d0.e(this, i, j);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x004c, code lost:
            if (kotlin.jvm.internal.h.a(r1.c, r3) != false) goto L_0x0038;
         */
        @Override // defpackage.s51.c.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void z(defpackage.s81 r2, defpackage.w51 r3, defpackage.s51.b r4) {
            /*
                r1 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.h.e(r2, r0)
                java.lang.String r0 = "config"
                kotlin.jvm.internal.h.e(r3, r0)
                java.lang.String r3 = "state"
                kotlin.jvm.internal.h.e(r4, r3)
                sg0<s81, kotlin.Pair<com.spotify.music.libs.fullscreen.story.promo.encore.b$a, java.lang.String>> r3 = r1.o
                java.lang.Object r3 = r3.apply(r2)
                kotlin.Pair r3 = (kotlin.Pair) r3
                java.lang.Object r4 = r3.a()
                com.spotify.music.libs.fullscreen.story.promo.encore.b$a r4 = (com.spotify.music.libs.fullscreen.story.promo.encore.b.a) r4
                java.lang.Object r3 = r3.b()
                java.lang.String r3 = (java.lang.String) r3
                com.spotify.encore.Component<com.spotify.music.libs.fullscreen.story.promo.encore.b, com.spotify.music.libs.fullscreen.story.promo.encore.FullscreenStoryPromoCard$Events> r0 = r1.f
                r0.render(r4)
                com.spotify.encore.Component<com.spotify.music.libs.fullscreen.story.promo.encore.b, com.spotify.music.libs.fullscreen.story.promo.encore.FullscreenStoryPromoCard$Events> r4 = r1.f
                com.spotify.music.libs.fullscreen.story.promo.FullscreenStoryEncorePromoCardComponent$Holder$onBind$1 r0 = new com.spotify.music.libs.fullscreen.story.promo.FullscreenStoryEncorePromoCardComponent$Holder$onBind$1
                r0.<init>(r1, r2)
                r4.onEvent(r0)
                boolean r2 = r1.p
                r4 = 1
                r0 = 0
                if (r2 == 0) goto L_0x003a
            L_0x0038:
                r4 = 0
                goto L_0x004f
            L_0x003a:
                int r2 = r3.length()
                if (r2 != 0) goto L_0x0042
                r2 = 1
                goto L_0x0043
            L_0x0042:
                r2 = 0
            L_0x0043:
                if (r2 == 0) goto L_0x0046
                goto L_0x0038
            L_0x0046:
                java.lang.String r2 = r1.c
                boolean r2 = kotlin.jvm.internal.h.a(r2, r3)
                if (r2 == 0) goto L_0x004f
                goto L_0x0038
            L_0x004f:
                if (r4 != 0) goto L_0x0052
                return
            L_0x0052:
                r1.c = r3
                com.spotify.mobile.android.video.r r2 = r1.b
                com.spotify.mobile.android.video.e0$a r4 = com.spotify.mobile.android.video.e0.a()
                r4.f(r3)
                r4.d(r0)
                r4.e(r0)
                com.spotify.mobile.android.video.e0 r3 = r4.b()
                java.lang.String r4 = "PlaybackRequest.builder(…\n                .build()"
                kotlin.jvm.internal.h.d(r3, r4)
                r2.K(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.libs.fullscreen.story.promo.FullscreenStoryEncorePromoCardComponent.Holder.z(s81, w51, s51$b):void");
        }
    }

    public FullscreenStoryEncorePromoCardComponent(ComponentFactory<Component<b, FullscreenStoryPromoCard$Events>, a> componentFactory, f fVar, sg0<s81, Pair<b.a, String>> sg0, boolean z, l0 l0Var, s sVar, u uVar, n nVar, q72 q72) {
        h.e(componentFactory, "cardFactory");
        h.e(fVar, "listener");
        h.e(sg0, "mapper");
        h.e(l0Var, "videoSurfaceManager");
        h.e(sVar, "videoPlayerBuilder");
        h.e(uVar, "videoStorage");
        h.e(nVar, "lifecycleOwner");
        h.e(q72, "applicationStateObservable");
        this.a = componentFactory;
        this.b = fVar;
        this.c = sg0;
        this.f = z;
        this.n = l0Var;
        this.o = sVar;
        this.p = uVar;
        this.q = nVar;
        this.r = q72;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        return new Holder(this.a.make(), this.b, this.c, this.f, this.n, this.o, this.p, this.q, this.r);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.encore_promo_card_fullscreen_story_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.TOP_ITEM);
        h.d(of, "EnumSet.of(Trait.TOP_ITEM)");
        return of;
    }
}
