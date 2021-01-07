package com.spotify.zero.tracker.eventsender;

import android.app.Application;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.messages.ZeroFrictionAuthentication;
import com.spotify.messages.ZeroFrictionErrorNonAuth;
import com.spotify.messages.ZeroFrictionGenericNonAuth;
import com.spotify.messages.ZeroFrictionImpressionNonAuth;
import com.spotify.messages.ZeroFrictionInteractionNonAuth;
import com.spotify.messages.ZeroFrictionScreenImpressionNonAuth;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public final class b implements xhd {
    private final f a;
    private final com.spotify.music.spotlets.tracker.identifier.a b;
    private final kx0 c;

    public static abstract class a {
        private final String a;

        /* renamed from: com.spotify.zero.tracker.eventsender.b$a$a  reason: collision with other inner class name */
        public static final class C0579a extends a {
            public static final C0579a b = new C0579a();

            private C0579a() {
                super("field", null);
            }
        }

        /* renamed from: com.spotify.zero.tracker.eventsender.b$a$b  reason: collision with other inner class name */
        public static final class C0580b extends a {
            public static final C0580b b = new C0580b();

            private C0580b() {
                super("hit", null);
            }
        }

        public a(String str, f fVar) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    public b(f fVar, com.spotify.music.spotlets.tracker.identifier.a aVar, kx0 kx0) {
        h.e(fVar, "eventSenderPublisher");
        h.e(aVar, "trackerIds");
        h.e(kx0, "requestIdProvider");
        this.a = fVar;
        this.b = aVar;
        this.c = kx0;
    }

    private final void r(EventIdentifier eventIdentifier, ScreenIdentifier screenIdentifier, Map<String, String> map) {
        ZeroFrictionGenericNonAuth.b o = ZeroFrictionGenericNonAuth.o();
        o.q(this.b.b());
        o.p(this.b.f());
        o.n(eventIdentifier.d());
        if (screenIdentifier != null) {
            o.o(screenIdentifier.d());
        }
        if (map != null) {
            o.m(map);
        }
        GeneratedMessageLite build = o.build();
        h.d(build, "ZeroFrictionGenericNonAu…      }\n        }.build()");
        this.a.c(build);
    }

    private final void s(String str, a aVar, ScreenIdentifier screenIdentifier, String str2) {
        ZeroFrictionInteractionNonAuth.b p = ZeroFrictionInteractionNonAuth.p();
        p.r(this.b.b());
        p.q(this.b.f());
        h.d(p, "this");
        p.m(str);
        p.o(aVar.a());
        p.p(screenIdentifier.d());
        if (str2 != null) {
            p.n(str2);
        }
        GeneratedMessageLite build = p.build();
        h.d(build, "ZeroFrictionInteractionN…      }\n        }.build()");
        this.a.c(build);
    }

    @Override // defpackage.xhd
    public void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        h.e(screenIdentifier, "screen");
        h.e(errorTypeIdentifier, "errorType");
        n(screenIdentifier, errorTypeIdentifier, inputFieldIdentifier, null);
    }

    @Override // defpackage.xhd
    public void b() {
    }

    @Override // defpackage.xhd
    public void c() {
    }

    @Override // defpackage.xhd
    public void d(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier) {
        h.e(screenIdentifier, "screen");
        h.e(eventIdentifier, "event");
        r(eventIdentifier, screenIdentifier, null);
    }

    @Override // defpackage.xhd
    public void e() {
    }

    @Override // defpackage.xhd
    public void f(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        h.e(screenIdentifier, "screen");
        h.e(dialogIdentifier, "dialog");
        ZeroFrictionImpressionNonAuth.b n = ZeroFrictionImpressionNonAuth.n();
        n.p(this.b.b());
        n.o(this.b.f());
        n.n(screenIdentifier.d());
        n.m(dialogIdentifier.d());
        GeneratedMessageLite build = n.build();
        h.d(build, "ZeroFrictionImpressionNo…og.type\n        }.build()");
        this.a.c(build);
    }

    @Override // defpackage.xhd
    public void g(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier) {
        h.e(screenIdentifier, "screen");
        h.e(clickIdentifier, "clicked");
        m(screenIdentifier, clickIdentifier, null);
    }

    @Override // defpackage.xhd
    public void h(khd khd) {
        h.e(khd, "method");
        ZeroFrictionAuthentication.b p = ZeroFrictionAuthentication.p();
        p.r(this.b.b());
        p.q(this.b.f());
        p.p(this.c.a());
        p.m(khd.a());
        p.n(khd.b().a());
        p.o(khd.b().b());
        GeneratedMessageLite build = p.build();
        h.d(build, "ZeroFrictionAuthenticati…tration\n        }.build()");
        this.a.b((ZeroFrictionAuthentication) build);
    }

    @Override // defpackage.xhd
    public void i(EventIdentifier eventIdentifier, ImmutableMap<String, String> immutableMap) {
        h.e(eventIdentifier, "event");
        h.e(immutableMap, "eventData");
        r(eventIdentifier, null, immutableMap);
    }

    @Override // defpackage.xhd
    public void j(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        h.e(screenIdentifier, "screen");
        h.e(inputFieldIdentifier, "inputField");
        String d = inputFieldIdentifier.d();
        h.d(d, "inputField.type");
        s(d, a.C0579a.b, screenIdentifier, null);
    }

    @Override // defpackage.xhd
    public void k(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, int i) {
        h.e(screenIdentifier, "screen");
        h.e(eventIdentifier, "event");
        r(eventIdentifier, screenIdentifier, d.x(new Pair("value", String.valueOf(i))));
    }

    @Override // defpackage.xhd
    public void l(ScreenIdentifier screenIdentifier) {
        h.e(screenIdentifier, "screen");
        ZeroFrictionScreenImpressionNonAuth.b m = ZeroFrictionScreenImpressionNonAuth.m();
        m.o(this.b.b());
        m.n(this.b.f());
        m.m(screenIdentifier.d());
        GeneratedMessageLite build = m.build();
        h.d(build, "ZeroFrictionScreenImpres…en.type\n        }.build()");
        this.a.c(build);
    }

    @Override // defpackage.xhd
    public void m(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier, DialogIdentifier dialogIdentifier) {
        h.e(screenIdentifier, "screen");
        h.e(clickIdentifier, "clicked");
        String d = clickIdentifier.d();
        h.d(d, "clicked.type");
        s(d, a.C0580b.b, screenIdentifier, dialogIdentifier != null ? dialogIdentifier.d() : null);
    }

    @Override // defpackage.xhd
    public void n(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        h.e(screenIdentifier, "screen");
        h.e(errorTypeIdentifier, "errorType");
        ZeroFrictionErrorNonAuth.b p = ZeroFrictionErrorNonAuth.p();
        p.r(this.b.b());
        p.q(this.b.f());
        p.p(screenIdentifier.d());
        p.n(errorTypeIdentifier.d());
        if (inputFieldIdentifier != null) {
            p.o(inputFieldIdentifier.d());
        }
        if (str != null) {
            p.m(str);
        }
        GeneratedMessageLite build = p.build();
        h.d(build, "ZeroFrictionErrorNonAuth…      }\n        }.build()");
        this.a.c(build);
    }

    @Override // defpackage.xhd
    public void o(Application application) {
        h.e(application, "application");
    }

    @Override // defpackage.xhd
    public void p(ScreenIdentifier screenIdentifier) {
        h.e(screenIdentifier, "screenIdentifier");
    }

    @Override // defpackage.xhd
    public void q(ScreenIdentifier screenIdentifier, String str, String str2) {
        h.e(screenIdentifier, "screen");
        h.e(str, "event");
        h.e(str2, "value");
        ZeroFrictionGenericNonAuth.b o = ZeroFrictionGenericNonAuth.o();
        o.q(this.b.b());
        o.p(this.b.f());
        o.n(str);
        o.o(screenIdentifier.d());
        o.m(d.x(new Pair("value", str2)));
        GeneratedMessageLite build = o.build();
        h.d(build, "ZeroFrictionGenericNonAu…value))\n        }.build()");
        this.a.c(build);
    }
}
