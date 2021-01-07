package com.spotify.music.features.podcast.notifications;

import com.spotify.mobius.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class NotificationsBottomDrawerInjector$createLoopFactory$1 extends FunctionReferenceImpl implements rmf<ig7, gg7, e0<ig7, fg7>> {
    public static final NotificationsBottomDrawerInjector$createLoopFactory$1 a = new NotificationsBottomDrawerInjector$createLoopFactory$1();

    NotificationsBottomDrawerInjector$createLoopFactory$1() {
        super(2, hg7.class, "update", "update(Lcom/spotify/music/features/podcast/notifications/domain/NotificationsBottomDrawerModel;Lcom/spotify/music/features/podcast/notifications/domain/NotificationsBottomDrawerEvent;)Lcom/spotify/mobius/Next;", 1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public e0<ig7, fg7> invoke(ig7 ig7, gg7 gg7) {
        ig7 ig72 = ig7;
        gg7 gg72 = gg7;
        h.e(ig72, "p1");
        h.e(gg72, "p2");
        h.e(ig72, "model");
        h.e(gg72, "event");
        if (gg72 instanceof kg7) {
            kg7 kg7 = (kg7) gg72;
            if (ig72.d() || !kg7.a()) {
                String b = ig72.c().b();
                e0<ig7, fg7> a2 = e0.a(z42.l(new wg7(b, kg7.a()), new cg7(kg7.a() ? new jg7(b) : new ng7(b))));
                h.d(a2, "dispatch(effects(UpdateO…Event(interactionEvent)))");
                return a2;
            }
            e0<ig7, fg7> g = e0.g(ig7.a(ig72, false, false, new og7(false), null, 11), z42.l(qg7.a));
            h.d(g, "next(\n            model.…stemPermission)\n        )");
            return g;
        } else if (gg72 instanceof mg7) {
            e0<ig7, fg7> f = e0.f(ig7.a(ig72, false, false, new og7(((mg7) gg72).a()), null, 11));
            h.d(f, "next(model.copy(notifica…ptedIn = event.optedIn)))");
            return f;
        } else if (gg72 instanceof lg7) {
            e0<ig7, fg7> f2 = e0.f(ig7.a(ig72, false, false, wf7.a, null, 11));
            h.d(f2, "next(model.copy(notificationOptInState = Error))");
            return f2;
        } else if (gg72 instanceof vg7) {
            String b2 = ig72.c().b();
            e0<ig7, fg7> a3 = e0.a(z42.l(new pg7(b2), new wg7(b2, false), new cg7(new ng7(b2)), new cg7(new ug7(b2)), vf7.a));
            h.d(a3, "dispatch(\n        effect…  Dismiss\n        )\n    )");
            return a3;
        } else if (gg72 instanceof tg7) {
            e0<ig7, fg7> f3 = e0.f(ig7.a(ig72, ((tg7) gg72).a(), false, null, null, 14));
            h.d(f3, "next(model.copy(systemPe…systemPermissionEnabled))");
            return f3;
        } else if (gg72 instanceof yf7) {
            e0<ig7, fg7> a4 = e0.a(z42.l(dg7.a));
            h.d(a4, "dispatch(effects(NavigateToSettings))");
            return a4;
        } else if (gg72 instanceof sg7) {
            e0<ig7, fg7> h = e0.h();
            h.d(h, "noChange()");
            return h;
        } else if (gg72 instanceof uf7) {
            uf7 uf7 = (uf7) gg72;
            if (!(ig72.b() instanceof og7)) {
                boolean a5 = uf7.a();
                if (a5) {
                    e0<ig7, fg7> g2 = e0.g(ig7.a(ig72, false, a5, bg7.a, null, 9), z42.l(new xf7(ig72.c().b())));
                    h.d(g2, "next(\n            model.…adata.showUri))\n        )");
                    return g2;
                }
                e0<ig7, fg7> f4 = e0.f(ig7.a(ig72, false, a5, zf7.a, null, 9));
                h.d(f4, "next(\n            model.…InState = Idle)\n        )");
                return f4;
            }
            e0<ig7, fg7> f5 = e0.f(ig7.a(ig72, false, uf7.a(), null, null, 13));
            h.d(f5, "next(model.copy(isOnline = event.isOnline))");
            return f5;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
