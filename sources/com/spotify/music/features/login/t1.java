package com.spotify.music.features.login;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import com.spotify.ubi.specification.factories.b;
import defpackage.ce0;
import defpackage.de0;
import defpackage.ee0;
import defpackage.fe0;
import defpackage.je0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class t1 implements ae0 {
    private final xhd a;
    private final ere b;

    public t1(xhd xhd, ere ere) {
        h.e(xhd, "mUserTracker");
        h.e(ere, "userBehaviourEventLogger");
        this.a = xhd;
        this.b = ere;
    }

    @Override // defpackage.ae0
    public void a(ce0 ce0) {
        h.e(ce0, "event");
        if (ce0 instanceof ce0.k) {
            this.a.l(((ce0.k) ce0).a().a());
        } else if (ce0 instanceof ce0.l) {
            this.a.d(((ce0.l) ce0).a().a(), EventIdentifier.RETURN_TO_SCREEN);
        } else if (ce0 instanceof ce0.h) {
            ce0.h hVar = (ce0.h) ce0;
            this.a.j(hVar.b().a(), hVar.a().a());
        } else if (ce0 instanceof ce0.c) {
            ce0.c cVar = (ce0.c) ce0;
            if (h.a(cVar.a(), fe0.l.b) && h.a(cVar.c(), je0.o.b)) {
                this.b.b(new b().b().a(""));
            }
            this.a.m(cVar.c().a(), cVar.a().a(), cVar.b().a());
        } else if (ce0 instanceof ce0.f) {
            ce0.f fVar = (ce0.f) ce0;
            this.a.n(fVar.d().a(), fVar.b().a(), fVar.c().a(), fVar.a());
        } else if (ce0 instanceof ce0.e) {
            ce0.e eVar = (ce0.e) ce0;
            this.a.f(eVar.b().a(), eVar.a().a());
        } else if (ce0 instanceof ce0.b) {
            this.a.p(((ce0.b) ce0).a().a());
        } else if (ce0 instanceof ce0.m) {
            ce0.m mVar = (ce0.m) ce0;
            if (mVar.b() instanceof de0.a) {
                xhd xhd = this.a;
                ScreenIdentifier a2 = mVar.a().a();
                EventIdentifier a3 = ((de0.a) mVar.b()).a();
                de0 b2 = mVar.b();
                if (b2 != null) {
                    xhd.k(a2, a3, ((de0.a) b2).b());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.authtracker.SmartlockEvents.GooglePlayServicesStatus");
            }
            this.a.d(mVar.a().a(), mVar.b().a());
        } else if (ce0 instanceof ce0.d) {
            xhd xhd2 = this.a;
            EventIdentifier eventIdentifier = EventIdentifier.DEVICE_YEAR_CLASS;
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.mo51put("year", String.valueOf(((ce0.d) ce0).a()));
            xhd2.i(eventIdentifier, builder.build());
        } else if (ce0 instanceof ce0.n) {
            xhd xhd3 = this.a;
            EventIdentifier eventIdentifier2 = EventIdentifier.SPOTIFY_ID_MAPPING;
            ImmutableMap.Builder builder2 = ImmutableMap.builder();
            builder2.mo51put("installationId", ((ce0.n) ce0).a());
            xhd3.i(eventIdentifier2, builder2.build());
        } else if (ce0 instanceof ce0.j) {
            ce0.j jVar = (ce0.j) ce0;
            xhd xhd4 = this.a;
            EventIdentifier eventIdentifier3 = EventIdentifier.CALL_STARTED;
            ImmutableMap.Builder builder3 = ImmutableMap.builder();
            builder3.mo51put("source", jVar.a().a());
            builder3.mo51put("timestamp", String.valueOf(jVar.c()));
            builder3.mo51put("attempt_id", jVar.b());
            xhd4.i(eventIdentifier3, builder3.build());
        } else if (ce0 instanceof ce0.i) {
            ce0.i iVar = (ce0.i) ce0;
            ImmutableMap.Builder builder4 = ImmutableMap.builder();
            builder4.mo51put("source", iVar.b().a());
            builder4.mo51put("timestamp", String.valueOf(iVar.d()));
            builder4.mo51put("attempt_id", iVar.c());
            builder4.mo51put("error_code", String.valueOf(iVar.a()));
            this.a.i(EventIdentifier.CALL_COMPLETED, builder4.build());
        } else if (ce0 instanceof ce0.p) {
            ce0.p pVar = (ce0.p) ce0;
            this.a.d(pVar.a().a(), pVar.b().a());
        } else if (ce0 instanceof ce0.a) {
            xhd xhd5 = this.a;
            EventIdentifier eventIdentifier4 = EventIdentifier.ACCESSIBILITY_STATUS;
            ImmutableMap.Builder builder5 = ImmutableMap.builder();
            builder5.mo51put("status", ((ce0.a) ce0).a() ? "enabled" : "disabled");
            xhd5.i(eventIdentifier4, builder5.build());
        } else if (ce0 instanceof ce0.g) {
            ce0.g gVar = (ce0.g) ce0;
            this.a.q(gVar.b().a(), gVar.a(), gVar.c());
        } else if (ce0 instanceof ce0.o) {
            ce0.o oVar = (ce0.o) ce0;
            ScreenIdentifier screenIdentifier = ScreenIdentifier.START;
            ee0 a4 = oVar.a();
            if (a4 instanceof ee0.b) {
                xhd xhd6 = this.a;
                EventIdentifier eventIdentifier5 = EventIdentifier.START_SCREEN_IMAGE;
                ImmutableMap.Builder builder6 = ImmutableMap.builder();
                builder6.mo51put("status", "loading");
                ee0 a5 = oVar.a();
                if (a5 != null) {
                    builder6.mo51put("screen_width", String.valueOf(((ee0.b) a5).b()));
                    ee0 a6 = oVar.a();
                    if (a6 != null) {
                        builder6.mo51put("image_url", ((ee0.b) a6).a());
                        xhd6.i(eventIdentifier5, builder6.build());
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.spotify.authtracker.StartScreenImageEvents.StartLoadingImage");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.authtracker.StartScreenImageEvents.StartLoadingImage");
            } else if (h.a(a4, ee0.a.b.a)) {
                this.a.d(screenIdentifier, EventIdentifier.START_SCREEN_IMAGE_INTERACTION_TAP);
            } else if (h.a(a4, ee0.a.C0591a.a)) {
                this.a.d(screenIdentifier, EventIdentifier.START_SCREEN_IMAGE_INTERACTION_SWIPE);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
