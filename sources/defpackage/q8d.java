package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.e0;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.sociallistening.models.Session;
import com.spotify.music.sociallistening.models.SessionUpdateReason;
import defpackage.n8d;
import defpackage.o8d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: q8d  reason: default package */
public final class q8d {
    private static final void a(r8d r8d, boolean z, ImmutableSet.Builder<n8d> builder) {
        boolean m = r8d.m();
        if (z != m) {
            builder.mo53add((ImmutableSet.Builder<n8d>) new n8d.f(m));
        }
    }

    public static final e0<r8d, n8d> b(r8d r8d, o8d o8d) {
        ImmutableSet.Builder builder;
        boolean z;
        String str;
        String str2;
        ImmutableSet.Builder builder2;
        r8d r8d2;
        r8d r8d3 = r8d;
        h.e(r8d3, "model");
        h.e(o8d, "event");
        boolean z2 = false;
        if (o8d instanceof o8d.k) {
            if (!((o8d.k) o8d).a()) {
                e0<r8d, n8d> g = e0.g(r8d.b(r8d, false, 0, null, false, true, false, false, false, false, null, null, null, null, false, false, false, 65519), d.G(n8d.c.a));
                h.d(g, "next(\n                mo…entSession)\n            )");
                return g;
            } else if (r8d.q()) {
                Logger.d("social listening impl: Tried to obtain session while obtaining is already in progress", new Object[0]);
                e0<r8d, n8d> h = e0.h();
                h.d(h, "noChange()");
                return h;
            } else if (r8d.p()) {
                Logger.b("social listening impl: Obtain session while a join session in progress, skipping obtain.", new Object[0]);
                e0<r8d, n8d> h2 = e0.h();
                h.d(h2, "noChange()");
                return h2;
            } else {
                e0<r8d, n8d> g2 = e0.g(r8d.b(r8d, false, 0, null, false, true, false, false, false, false, null, null, null, null, false, false, false, 65167), d.G(n8d.b.a));
                h.d(g2, "next(\n                mo…NewSession)\n            )");
                return g2;
            }
        } else if (o8d instanceof o8d.f) {
            o8d.f fVar = (o8d.f) o8d;
            if (r8d.p()) {
                e0<r8d, n8d> h3 = e0.h();
                h.d(h3, "noChange()");
                return h3;
            }
            String x0 = je.x0("spotify:socialsession:", fVar.c());
            if (h.a(x0, r8d.f())) {
                Logger.b("social listening impl: Tried to join current session", new Object[0]);
                e0<r8d, n8d> h4 = e0.h();
                h.d(h4, "noChange()");
                return h4;
            }
            int i = ImmutableSet.a;
            ImmutableSet.Builder builder3 = new ImmutableSet.Builder();
            r8d b = r8d.b(r8d, false, 0, null, false, false, false, true, false, false, fVar.c(), x0, null, null, false, false, false, 63935);
            builder3.mo53add((ImmutableSet.Builder) new n8d.d(fVar.c(), fVar.b(), fVar.a()));
            e0<r8d, n8d> g3 = e0.g(b, builder3.build());
            h.d(g3, "next(newModel, effectsBuilder.build())");
            return g3;
        } else {
            boolean z3 = true;
            if (o8d instanceof o8d.h) {
                String j = r8d.j();
                if (!(j == null || j.length() == 0)) {
                    z3 = false;
                }
                if (z3 || r8d.r()) {
                    Logger.d("social listening impl: Cannot leave session with current outstanding backend requests", new Object[0]);
                    e0<r8d, n8d> h5 = e0.h();
                    h.d(h5, "noChange()");
                    return h5;
                }
                boolean m = r8d.m();
                int i2 = ImmutableSet.a;
                ImmutableSet.Builder builder4 = new ImmutableSet.Builder();
                if (r8d.n()) {
                    builder4.mo53add((ImmutableSet.Builder) new n8d.a(r8d.j()));
                } else {
                    builder4.mo53add((ImmutableSet.Builder) new n8d.e(r8d.j()));
                }
                r8d b2 = r8d.b(r8d, false, 0, null, false, false, false, false, true, false, null, null, null, null, false, false, false, 65407);
                h.d(builder4, "effectsBuilder");
                a(b2, m, builder4);
                e0<r8d, n8d> g4 = e0.g(b2, builder4.build());
                h.d(g4, "next(newModel, effectsBuilder.build())");
                return g4;
            } else if (o8d instanceof o8d.j) {
                o8d.j jVar = (o8d.j) o8d;
                if (r8d.k() || !h.a(jVar.a(), r8d.e())) {
                    e0<r8d, n8d> h6 = e0.h();
                    h.d(h6, "noChange()");
                    return h6;
                }
                e0<r8d, n8d> f = e0.f(r8d.b(r8d, false, 0, null, false, false, false, false, false, false, null, null, null, null, true, false, false, 57343));
                h.d(f, "next(model.copy(sessionShared = true))");
                return f;
            } else if (o8d instanceof o8d.l) {
                e0<r8d, n8d> f2 = e0.f(r8d.b(r8d, false, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65279));
                h.d(f2, "next(model.copy(sessionDeleted = false))");
                return f2;
            } else if (o8d instanceof o8d.m) {
                o8d.m mVar = (o8d.m) o8d;
                Session session = mVar.a().getSession();
                if (session == null) {
                    session = Session.EMPTY;
                }
                Long timestamp = session.getTimestamp();
                if (r8d.l() > (timestamp != null ? timestamp.longValue() : 0)) {
                    e0<r8d, n8d> h7 = e0.h();
                    h.d(h7, "noChange()");
                    return h7;
                } else if (r8d.p() || r8d.q() || r8d.r()) {
                    e0<r8d, n8d> h8 = e0.h();
                    h.d(h8, "noChange()");
                    return h8;
                } else {
                    SessionUpdateReason reason = mVar.a().getReason();
                    if (reason == null) {
                        reason = SessionUpdateReason.UNKNOWN_UPDATE_TYPE;
                    }
                    if (reason == SessionUpdateReason.YOU_JOINED || reason == SessionUpdateReason.NEW_SESSION || !(true ^ h.a(r8d.j(), session.getSessionId()))) {
                        boolean m2 = r8d.m();
                        int i3 = ImmutableSet.a;
                        ImmutableSet.Builder builder5 = new ImmutableSet.Builder();
                        switch (reason.ordinal()) {
                            case 0:
                                Logger.b("social listening impl: Unknown update type.", new Object[0]);
                                r8d3 = c(r8d3, session);
                                break;
                            case 1:
                            case 2:
                            case 7:
                                r8d3 = r8d.b(c(r8d3, session), true, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65534);
                                break;
                            case 3:
                                r8d3 = c(r8d3, session);
                                break;
                            case 4:
                                r8d3 = r8d.b(r8d.a(), false, 0, null, false, false, false, false, false, true, null, null, null, null, false, false, false, 65279);
                                break;
                            case 5:
                                Logger.b("social listening impl: We left the session.", new Object[0]);
                                r8d3 = r8d.a();
                                break;
                            case 6:
                                Logger.b("social listening impl: We were kicked out of the session.", new Object[0]);
                                r8d3 = r8d.a();
                                break;
                        }
                        h.d(builder5, "effectsBuilder");
                        a(r8d3, m2, builder5);
                        e0<r8d, n8d> g5 = e0.g(r8d3, builder5.build());
                        h.d(g5, "next(newModel, effectsBuilder.build())");
                        return g5;
                    }
                    Logger.b("social listening impl: Ignoring notification from other session", new Object[0]);
                    e0<r8d, n8d> h9 = e0.h();
                    h.d(h9, "noChange()");
                    return h9;
                }
            } else if (o8d instanceof o8d.a) {
                String c = r8d.c();
                String a = ((o8d.a) o8d).a();
                if ((c == null || c.length() == 0) || !(!h.a(c, a))) {
                    boolean m3 = r8d.m();
                    int i4 = ImmutableSet.a;
                    ImmutableSet.Builder builder6 = new ImmutableSet.Builder();
                    String j2 = r8d.j();
                    if (!(j2 == null || j2.length() == 0)) {
                        List<Participant> h10 = r8d.h();
                        if (!(h10 instanceof Collection) || !h10.isEmpty()) {
                            Iterator<T> it = h10.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (h.a(a, it.next().getUsername())) {
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!z2) {
                            r8d2 = r8d.b(r8d.a(), false, 0, null, false, false, false, false, false, false, null, null, null, a, false, false, false, 61439);
                            str = "next(newModel, effectsBuilder.build())";
                            z = m3;
                            builder2 = builder6;
                            str2 = "effectsBuilder";
                            h.d(builder2, str2);
                            a(r8d2, z, builder2);
                            e0<r8d, n8d> g6 = e0.g(r8d2, builder2.build());
                            h.d(g6, str);
                            return g6;
                        }
                    }
                    str = "next(newModel, effectsBuilder.build())";
                    z = m3;
                    r8d2 = r8d.b(r8d, false, 0, null, false, false, false, false, false, false, null, null, d.J(r8d.h(), new p8d(a)), a, false, false, false, 59391);
                    builder2 = builder6;
                    str2 = "effectsBuilder";
                    h.d(builder2, str2);
                    a(r8d2, z, builder2);
                    e0<r8d, n8d> g62 = e0.g(r8d2, builder2.build());
                    h.d(g62, str);
                    return g62;
                }
                e0<r8d, n8d> f3 = e0.f(new r8d(false, 0, null, false, false, false, false, false, false, null, null, null, a, false, false, false, 61439));
                h.d(f3, "next(SocialListeningImpl…tUsername = newUsername))");
                return f3;
            } else if (o8d instanceof o8d.c) {
                o8d.c cVar = (o8d.c) o8d;
                if (!r8d.q()) {
                    e0<r8d, n8d> h11 = e0.h();
                    h.d(h11, "noChange()");
                    return h11;
                }
                boolean m4 = r8d.m();
                int i5 = ImmutableSet.a;
                ImmutableSet.Builder builder7 = new ImmutableSet.Builder();
                r8d b3 = r8d.b(r8d, true, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65518);
                Session a2 = cVar.a();
                if (a2 == Session.EMPTY) {
                    builder = builder7;
                    builder.mo53add((ImmutableSet.Builder) n8d.j.a);
                } else {
                    builder = builder7;
                    b3 = c(b3, a2);
                    builder.mo53add((ImmutableSet.Builder) n8d.k.a);
                }
                h.d(builder, "effectsBuilder");
                a(b3, m4, builder);
                e0<r8d, n8d> g7 = e0.g(b3, builder.build());
                h.d(g7, "next(newModel, effectsBuilder.build())");
                return g7;
            } else if (o8d instanceof o8d.e) {
                o8d.e eVar = (o8d.e) o8d;
                if (!r8d.q()) {
                    e0<r8d, n8d> h12 = e0.h();
                    h.d(h12, "noChange()");
                    return h12;
                }
                Session a3 = eVar.a();
                if (a3 == Session.EMPTY) {
                    Logger.b("social listening impl: no session available", new Object[0]);
                    e0<r8d, n8d> f4 = e0.f(r8d.b(r8d.a(), true, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65534));
                    h.d(f4, "next(newModel.clearSessi…py(isInitialized = true))");
                    return f4;
                }
                r8d b4 = r8d.b(r8d, true, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65486);
                boolean m5 = b4.m();
                int i6 = ImmutableSet.a;
                ImmutableSet.Builder builder8 = new ImmutableSet.Builder();
                r8d c2 = c(b4, a3);
                h.d(builder8, "effectsBuilder");
                a(c2, m5, builder8);
                e0<r8d, n8d> g8 = e0.g(c2, builder8.build());
                h.d(g8, "next(newModel, effectsBuilder.build())");
                return g8;
            } else if (o8d instanceof o8d.d) {
                e0<r8d, n8d> f5 = e0.f(r8d.b(r8d, true, 0, null, false, false, true, false, false, false, null, null, null, null, false, false, false, 65486));
                h.d(f5, "next(\n                mo…          )\n            )");
                return f5;
            } else if (o8d instanceof o8d.g) {
                o8d.g gVar = (o8d.g) o8d;
                if (!r8d.p()) {
                    e0<r8d, n8d> h13 = e0.h();
                    h.d(h13, "noChange()");
                    return h13;
                }
                r8d b5 = r8d.b(r8d, true, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65470);
                boolean m6 = r8d.m();
                int i7 = ImmutableSet.a;
                ImmutableSet.Builder builder9 = new ImmutableSet.Builder();
                v<Session> a4 = gVar.a();
                if (a4 == null || a4.b() != 403) {
                    if ((a4 != null ? a4.a() : null) == null || !a4.f()) {
                        Logger.d("social listening impl: joining failed", new Object[0]);
                        builder9.mo53add((ImmutableSet.Builder) new n8d.h(false));
                    } else {
                        Logger.b("social listening impl: joining successful", new Object[0]);
                        Session a5 = a4.a();
                        if (a5 != null) {
                            h.d(a5, "it");
                            b5 = c(b5, a5);
                        }
                    }
                } else {
                    Logger.d("social listening impl: joining failed - session is full", new Object[0]);
                    builder9.mo53add((ImmutableSet.Builder) new n8d.h(true));
                }
                h.d(builder9, "effectsBuilder");
                a(b5, m6, builder9);
                e0<r8d, n8d> g9 = e0.g(b5, builder9.build());
                h.d(g9, "next(newModel, effectsBuilder.build())");
                return g9;
            } else if (o8d instanceof o8d.i) {
                o8d.i iVar = (o8d.i) o8d;
                if (r8d.q()) {
                    e0<r8d, n8d> f6 = e0.f(r8d.b(r8d, false, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65407));
                    h.d(f6, "next(model.copy(isTerminatingSession = false))");
                    return f6;
                } else if (iVar.a()) {
                    e0<r8d, n8d> f7 = e0.f(r8d.a());
                    h.d(f7, "next(model.clearSession())");
                    return f7;
                } else {
                    e0<r8d, n8d> g10 = e0.g(r8d.b(r8d, false, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65407), d.G(n8d.i.a));
                    h.d(g10, "next(\n                mo…aveSession)\n            )");
                    return g10;
                }
            } else if (o8d instanceof o8d.b) {
                o8d.b bVar = (o8d.b) o8d;
                if (r8d.q()) {
                    e0<r8d, n8d> f8 = e0.f(r8d.b(r8d, false, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65407));
                    h.d(f8, "next(model.copy(isTerminatingSession = false))");
                    return f8;
                } else if (bVar.a()) {
                    e0<r8d, n8d> f9 = e0.f(r8d.a());
                    h.d(f9, "next(model.clearSession())");
                    return f9;
                } else {
                    e0<r8d, n8d> g11 = e0.g(r8d.b(r8d, false, 0, null, false, false, false, false, false, false, null, null, null, null, false, false, false, 65407), d.G(n8d.g.a));
                    h.d(g11, "next(\n                mo…EndSession)\n            )");
                    return g11;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0112 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final defpackage.r8d c(defpackage.r8d r27, com.spotify.music.sociallistening.models.Session r28) {
        /*
        // Method dump skipped, instructions count: 453
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8d.c(r8d, com.spotify.music.sociallistening.models.Session):r8d");
    }
}
