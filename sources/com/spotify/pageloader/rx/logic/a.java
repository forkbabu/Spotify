package com.spotify.pageloader.rx.logic;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import com.spotify.pageloader.NetworkErrorReason;
import com.spotify.pageloader.l0;
import com.spotify.pageloader.m0;
import defpackage.hud;
import defpackage.iud;
import defpackage.jud;
import defpackage.kud;
import io.reactivex.r;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class a<T, S> implements g0<lud<T>, kud<? extends T, ? extends S>, jud<? extends T, ? extends S>> {
    @Override // com.spotify.mobius.g0
    public e0 a(Object obj, Object obj2) {
        l0 l0Var;
        lud lud = (lud) obj;
        kud kud = (kud) obj2;
        h.e(lud, "model");
        h.e(kud, "event");
        if (kud instanceof kud.a) {
            r<T> a = ((kud.a) kud).a();
            hud c = lud.c();
            if (c instanceof hud.c) {
                hud hud = hud.b.a;
                if (a.h()) {
                    T e = a.e();
                    h.c(e);
                    e0 g = e0.g(lud.a(lud, hud, false, new iud.c(e), 2), z42.l(new jud.b(hud, a)));
                    h.d(g, "next(\n                mo…          )\n            )");
                    return g;
                }
                if (a.g()) {
                    Throwable d = a.d();
                    h.c(d);
                    l0Var = m0.b(d);
                } else {
                    l0Var = l0.h(new NoSuchElementException("source completed without emitting anything"));
                }
                h.d(l0Var, AppProtocol.LogMessage.SEVERITY_ERROR);
                h.e(l0Var, "$this$asInternalLoadState");
                if (l0Var instanceof l0.c) {
                    hud = hud.c.a;
                } else if (!(l0Var instanceof l0.b)) {
                    if (l0Var instanceof l0.e) {
                        hud = hud.e.a;
                    } else if (l0Var instanceof l0.a) {
                        hud = hud.a.a;
                    } else if (l0Var instanceof l0.d) {
                        l0.d dVar = (l0.d) l0Var;
                        Throwable i = dVar.i();
                        h.d(i, "error()");
                        NetworkErrorReason j = dVar.j();
                        h.d(j, "reason()");
                        hud = new hud.d(i, j);
                    } else if (l0Var instanceof l0.f) {
                        Throwable i2 = ((l0.f) l0Var).i();
                        h.d(i2, "error()");
                        hud = new hud.f(i2);
                    } else {
                        throw new IllegalStateException("unknown state");
                    }
                }
                e0 g2 = e0.g(lud.a(lud, hud, false, null, 4), z42.l(new jud.a(hud)));
                h.d(g2, "next(\n            model.…)\n            )\n        )");
                return g2;
            } else if (!(c instanceof hud.b)) {
                e0 h = e0.h();
                h.d(h, "noChange()");
                return h;
            } else if (a.h()) {
                T e2 = a.e();
                h.c(e2);
                e0 g3 = e0.g(lud.a(lud, null, false, new iud.c(e2), 3), z42.l(new jud.c(a)));
                h.d(g3, "next(\n                  …ation))\n                )");
                return g3;
            } else if (a.f()) {
                if (lud.b() instanceof iud.c) {
                    e0 g4 = e0.g(lud.a(lud, null, false, new iud.a(((iud.c) lud.b()).a()), 1), z42.l(new jud.c(a)));
                    h.d(g4, "next(\n                  …ation))\n                )");
                    return g4;
                }
                throw new IllegalStateException();
            } else if (lud.b() instanceof iud.c) {
                Object a2 = ((iud.c) lud.b()).a();
                Throwable d2 = a.d();
                h.c(d2);
                h.d(d2, "notification.error!!");
                e0 g5 = e0.g(lud.a(lud, null, false, new iud.b(a2, d2), 1), z42.l(new jud.c(a)));
                h.d(g5, "next(\n                  …ation))\n                )");
                return g5;
            } else {
                throw new IllegalStateException();
            }
        } else if (kud instanceof kud.b) {
            kud.b bVar = (kud.b) kud;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ObservableLoadableLogic$handleNewSubscriber$1 observableLoadableLogic$handleNewSubscriber$1 = new ObservableLoadableLogic$handleNewSubscriber$1(lud, linkedHashSet);
            iud<T> b = lud.b();
            if (b != null) {
                if (b instanceof iud.c) {
                    observableLoadableLogic$handleNewSubscriber$1.invoke();
                    Object a3 = bVar.a();
                    r c2 = r.c(((iud.c) b).a());
                    h.d(c2, "Notification.createOnNext(it.value)");
                    linkedHashSet.add(new jud.d(a3, c2));
                } else if (b instanceof iud.b) {
                    observableLoadableLogic$handleNewSubscriber$1.invoke();
                    Object a4 = bVar.a();
                    iud.b bVar2 = (iud.b) b;
                    r c3 = r.c(bVar2.b());
                    h.d(c3, "Notification.createOnNext(it.lastValue)");
                    r b2 = r.b(bVar2.a());
                    h.d(b2, "Notification.createOnError(it.error)");
                    linkedHashSet.add(new jud.d(a4, c3, b2));
                } else if (b instanceof iud.a) {
                    Object a5 = bVar.a();
                    r c4 = r.c(((iud.a) b).a());
                    h.d(c4, "Notification.createOnNext(it.lastValue)");
                    r a6 = r.a();
                    h.d(a6, "Notification.createOnComplete()");
                    linkedHashSet.add(new jud.d(a5, c4, a6));
                }
            }
            e0 g6 = e0.g(lud.a(lud, null, true, null, 5), linkedHashSet);
            h.d(g6, "next(model.copy(isSubscribed = true), effects)");
            return g6;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
