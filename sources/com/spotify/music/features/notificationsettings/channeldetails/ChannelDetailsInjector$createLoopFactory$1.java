package com.spotify.music.features.notificationsettings.channeldetails;

import com.spotify.mobius.e0;
import com.spotify.music.features.notificationsettings.channeldetails.g;
import com.spotify.music.features.notificationsettings.channeldetails.h;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ChannelDetailsInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<o, h, e0<o, g>> {
    public static final ChannelDetailsInjector$createLoopFactory$1 a = new ChannelDetailsInjector$createLoopFactory$1();

    ChannelDetailsInjector$createLoopFactory$1() {
        super(2, f.class, "update", "update(Lcom/spotify/music/features/notificationsettings/channeldetails/ChannelDetailsModel;Lcom/spotify/music/features/notificationsettings/channeldetails/ChannelDetailsEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<o, g> invoke(o oVar, h hVar) {
        e0<o, g> e0Var;
        o oVar2 = oVar;
        h hVar2 = hVar;
        h.e(oVar2, "p1");
        h.e(hVar2, "p2");
        h.e(oVar2, "model");
        h.e(hVar2, "event");
        if (hVar2 instanceof h.b.C0235b) {
            e0<o, g> h = e0.h();
            kotlin.jvm.internal.h.d(h, "noChange()");
            return h;
        }
        T t = null;
        if (hVar2 instanceof h.a) {
            h.a aVar = (h.a) hVar2;
            if (aVar.b()) {
                Iterator<T> it = oVar2.a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (kotlin.jvm.internal.h.a(next.c(), aVar.a().c())) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    t2.b().add(oVar2.b());
                }
                e0Var = e0.g(oVar2, d.H(new g.b(aVar.a(), oVar2.b()), new g.a(aVar.c(), aVar.a(), oVar2.b(), aVar.b())));
            } else {
                Iterator<T> it2 = oVar2.a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (kotlin.jvm.internal.h.a(next2.c(), aVar.a().c())) {
                        t = next2;
                        break;
                    }
                }
                T t3 = t;
                if (t3 != null) {
                    t3.b().remove(oVar2.b());
                }
                e0Var = e0.g(oVar2, d.H(new g.c(aVar.a(), oVar2.b()), new g.a(aVar.c(), aVar.a(), oVar2.b(), aVar.b())));
            }
            kotlin.jvm.internal.h.d(e0Var, "if (event.enabled) {\n   …          )\n            }");
            return e0Var;
        } else if (hVar2 instanceof h.b.a) {
            Iterator<T> it3 = oVar2.a().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                T next3 = it3.next();
                if (kotlin.jvm.internal.h.a(next3.c(), ((h.b.a) hVar2).a().c())) {
                    t = next3;
                    break;
                }
            }
            T t4 = t;
            if (t4 != null) {
                if (((h.b.a) hVar2).b()) {
                    t4.b().remove(oVar2.b());
                } else {
                    t4.b().add(oVar2.b());
                }
            }
            e0<o, g> f = e0.f(oVar2);
            kotlin.jvm.internal.h.d(f, "next(\n            model.…}\n            }\n        )");
            return f;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
