package com.spotify.music.podcastinteractivity.qna.datasource;

import com.google.protobuf.GeneratedMessageLite;
import com.spotify.mobius.e0;
import com.spotify.podcastinteractivity.qna.model.proto.EducationStatus;
import com.spotify.podcastinteractivity.qna.model.proto.QAndA;
import com.spotify.podcastinteractivity.qna.model.proto.UserStatus;
import defpackage.auc;
import defpackage.wtc;
import defpackage.xtc;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class PodcastQnADataSourceImpl$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<ztc, xtc, e0<ztc, wtc>> {
    public static final PodcastQnADataSourceImpl$createLoopFactory$1 a = new PodcastQnADataSourceImpl$createLoopFactory$1();

    PodcastQnADataSourceImpl$createLoopFactory$1() {
        super(2, ytc.class, "update", "update(Lcom/spotify/music/podcastinteractivity/qna/datasource/domain/PodcastQnAModel;Lcom/spotify/music/podcastinteractivity/qna/datasource/domain/PodcastQnAEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<ztc, wtc> invoke(ztc ztc, xtc xtc) {
        e0<ztc, wtc> e0Var;
        ztc ztc2 = ztc;
        xtc xtc2 = xtc;
        h.e(ztc2, "p1");
        h.e(xtc2, "p2");
        h.e(ztc2, "model");
        h.e(xtc2, "event");
        boolean z = true;
        if (xtc2 instanceof xtc.f) {
            xtc.f fVar = (xtc.f) xtc2;
            if (!(ztc2.e() instanceof auc.c) || !h.a(fVar.a(), ztc2.d())) {
                e0<ztc, wtc> g = e0.g(new ztc(null, null, fVar.a(), null, 11), d.H(new wtc.d(fVar.a()), wtc.e.a));
                h.d(g, "next(\n            Podcas…a\n            )\n        )");
                return g;
            }
            e0<ztc, wtc> h = e0.h();
            h.d(h, "noChange()");
            return h;
        } else if (xtc2 instanceof xtc.d) {
            xtc.d dVar = (xtc.d) xtc2;
            if (dVar.a() == null) {
                e0<ztc, wtc> h2 = e0.h();
                h.d(h2, "noChange()");
                return h2;
            }
            e0<ztc, wtc> f = e0.f(ztc.a(ztc2, dVar.a(), null, null, null, 14));
            h.d(f, "next(model.copy(qnAState = event.podcastQnAState))");
            return f;
        } else if (xtc2 instanceof xtc.e) {
            e0<ztc, wtc> f2 = e0.f(ztc.a(ztc2, null, ((xtc.e) xtc2).a(), null, null, 13));
            h.d(f2, "next(model.copy(draftReply = event.draft))");
            return f2;
        } else if (xtc2 instanceof xtc.g) {
            xtc.g gVar = (xtc.g) xtc2;
            h.e(gVar, "event");
            h.e(ztc2, "model");
            if (ztc2.e() instanceof auc.c) {
                String d = ztc2.d();
                if (!(d == null || d.length() == 0)) {
                    z = false;
                }
                if (z) {
                    e0<ztc, wtc> h3 = e0.h();
                    h.d(h3, "noChange()");
                    return h3;
                }
                e0<ztc, wtc> g2 = e0.g(ztc.a(ztc2, null, gVar.a(), null, null, 13), d.G(new wtc.h(gVar.a(), ztc2.d())));
                h.d(g2, "next(\n            model.…el.episodeUri))\n        )");
                return g2;
            }
            e0<ztc, wtc> h4 = e0.h();
            h.d(h4, "noChange()");
            return h4;
        } else if (xtc2 instanceof xtc.h) {
            e0<ztc, wtc> f3 = e0.f(ztc.a(ztc2, ((xtc.h) xtc2).a(), "", null, null, 12));
            h.d(f3, "next(model.copy(qnAState…AState, draftReply = \"\"))");
            return f3;
        } else if (xtc2 instanceof xtc.i) {
            e0<ztc, wtc> f4 = e0.f(ztc.a(ztc2, null, null, null, ((xtc.i) xtc2).a(), 7));
            h.d(f4, "next(model.copy(currentU…ile = event.userProfile))");
            return f4;
        } else if (xtc2 instanceof xtc.j) {
            xtc.j jVar = (xtc.j) xtc2;
            h.e(jVar, "event");
            h.e(ztc2, "model");
            if (jVar.a() == null || !(ztc2.e() instanceof auc.c)) {
                e0<ztc, wtc> h5 = e0.h();
                h.d(h5, "noChange()");
                return h5;
            }
            QAndA.b bVar = (QAndA.b) ((auc.c) ztc2.e()).a().toBuilder();
            bVar.m(jVar.a());
            GeneratedMessageLite build = QAndA.t((QAndA) bVar.build()).build();
            h.d(build, "QAndA.newBuilder(\n      …                ).build()");
            e0<ztc, wtc> f5 = e0.f(ztc.a(ztc2, new auc.c((QAndA) build), null, null, null, 14));
            h.d(f5, "next(\n            model.…)\n            )\n        )");
            return f5;
        } else if (h.a(xtc2, xtc.b.a)) {
            h.e(ztc2, "model");
            if (!(ztc2.e() instanceof auc.c) || !((auc.c) ztc2.e()).a().s() || ztc2.d() == null) {
                e0<ztc, wtc> h6 = e0.h();
                h.d(h6, "noChange()");
                return h6;
            }
            e0<ztc, wtc> a2 = e0.a(d.G(new wtc.c(ztc2.d())));
            h.d(a2, "dispatch(setOf(PodcastQn…ponse(model.episodeUri)))");
            return a2;
        } else if (h.a(xtc2, xtc.c.a)) {
            h.e(ztc2, "model");
            if (ztc2.d() == null) {
                e0<ztc, wtc> h7 = e0.h();
                h.d(h7, "noChange()");
                return h7;
            }
            auc e = ztc2.e();
            if (!(e instanceof auc.c)) {
                e = null;
            }
            auc.c cVar = (auc.c) e;
            if (cVar != null) {
                UserStatus p = cVar.a().p();
                h.d(p, "qnaState.qna.userStatus");
                boolean z2 = p.i() == EducationStatus.COMPLETE;
                if (!cVar.a().s() && !z2) {
                    z = false;
                }
                UserStatus p2 = cVar.a().p();
                h.d(p2, "qnaState.qna.userStatus");
                boolean l = p2.l();
                if (!z || l) {
                    if (l) {
                        e0Var = e0.a(d.G(wtc.f.a));
                    } else if (!z2) {
                        e0Var = e0.a(d.G(wtc.g.a));
                    } else {
                        e0Var = e0.h();
                    }
                    h.d(e0Var, "if (isUserBlocked) {\n   …     noChange()\n        }");
                    return e0Var;
                }
                e0<ztc, wtc> a3 = e0.a(d.G(new wtc.a(ztc2.d())));
                h.d(a3, "dispatch(setOf(PodcastQn…Reply(model.episodeUri)))");
                return a3;
            }
            e0<ztc, wtc> h8 = e0.h();
            h.d(h8, "noChange()");
            return h8;
        } else if (h.a(xtc2, xtc.a.a)) {
            h.e(ztc2, "model");
            if (ztc2.d() == null) {
                e0<ztc, wtc> h9 = e0.h();
                h.d(h9, "noChange()");
                return h9;
            }
            e0<ztc, wtc> a4 = e0.a(d.G(new wtc.b(ztc2.d())));
            h.d(a4, "dispatch(setOf(PodcastQn…tions(model.episodeUri)))");
            return a4;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
