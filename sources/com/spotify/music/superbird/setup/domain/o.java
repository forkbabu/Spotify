package com.spotify.music.superbird.setup.domain;

import android.bluetooth.BluetoothAdapter;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import com.spotify.music.superbird.setup.domain.d;
import com.spotify.music.superbird.setup.domain.f;
import com.spotify.superbird.ota.model.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class o implements g0<p, f, d> {
    public static final o a = new o();

    private o() {
    }

    private final e0<p, d> b(p pVar) {
        e0<p, d> g = e0.g(p.a(pVar, SetupStep.NONE, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.a)));
        h.d(g, "Next.next(\n            m…nEvent.CANCEL))\n        )");
        return g;
    }

    private final e0<p, d> c(p pVar) {
        e0<p, d> g = e0.g(p.a(pVar, SetupStep.CHECK_FOR_UPDATES, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.q)));
        h.d(g, "Next.next(\n            m…K_FOR_UPDATES))\n        )");
        return g;
    }

    private final e0<p, d> d(p pVar) {
        e0<p, d> g = e0.g(p.a(pVar, SetupStep.CONNECT_TO_CAR, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.p)));
        h.d(g, "Next.next(\n            m…ONNECT_TO_CAR))\n        )");
        return g;
    }

    private final e0<p, d> e(p pVar) {
        e0<p, d> g = e0.g(p.a(pVar, SetupStep.CONNECTED, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.n)));
        h.d(g, "Next.next(\n            m…_TO_CONNECTED))\n        )");
        return g;
    }

    private final e0<p, d> f(p pVar) {
        e0<p, d> g = e0.g(p.a(pVar, SetupStep.EVERYTHING_CONNECTED, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.o)));
        h.d(g, "Next.next(\n            m…ING_CONNECTED))\n        )");
        return g;
    }

    private final e0<p, d> g(p pVar) {
        e0<p, d> g = e0.g(p.a(pVar, SetupStep.MOUNT_SELECTION, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.t)));
        h.d(g, "Next.next(\n            m…UNT_SELECTION))\n        )");
        return g;
    }

    private final e0<p, d> h(p pVar) {
        e0<p, d> g = e0.g(p.a(pVar, SetupStep.WELCOME, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.c)));
        h.d(g, "Next.next(\n            m…TE_TO_WELCOME))\n        )");
        return g;
    }

    private final e0<p, d> i(p pVar, f.p pVar2) {
        p a2 = p.a(pVar, null, false, false, false, false, false, new c(pVar2.a(), null, false, false), false, false, null, 959);
        if (a2.f() == SetupStep.CHECK_FOR_UPDATES) {
            return d(a2);
        }
        e0<p, d> f = e0.f(a2);
        h.d(f, "Next.next(newModel)");
        return f;
    }

    /* renamed from: j */
    public e0<p, d> a(p pVar, f fVar) {
        p pVar2;
        d.n nVar = d.n.a;
        d.k kVar = d.k.a;
        d.m mVar = d.m.a;
        SetupStep setupStep = SetupStep.DOWNLOADED;
        SetupStep setupStep2 = SetupStep.SEARCHING;
        SetupStep setupStep3 = SetupStep.RECONNECTING;
        h.e(pVar, "model");
        h.e(fVar, "event");
        if (fVar instanceof f.o) {
            int ordinal = pVar.f().ordinal();
            if (ordinal != 3) {
                if (ordinal == 4) {
                    e0<p, d> g = e0.g(p.a(pVar, SetupStep.TEST_SOUND, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.r)));
                    h.d(g, "Next.next(\n            m…TO_TEST_SOUND))\n        )");
                    return g;
                } else if (ordinal == 5) {
                    return f(pVar);
                } else {
                    if (ordinal == 6) {
                        return d(pVar);
                    }
                    if (ordinal != 11) {
                        if (ordinal == 12) {
                            return g(pVar);
                        }
                        if (ordinal != 15) {
                            e0<p, d> h = e0.h();
                            h.d(h, "Next.noChange()");
                            return h;
                        }
                        e0<p, d> g2 = e0.g(p.a(pVar, SetupStep.READY, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.s)));
                        h.d(g2, "Next.next(\n            m…GATE_TO_READY))\n        )");
                        return g2;
                    } else if (pVar.g()) {
                        return e(pVar);
                    } else {
                        e0<p, d> f = e0.f(p.a(pVar, setupStep3, false, false, false, false, false, null, false, false, null, 1022));
                        h.d(f, "Next.next(model.copy(ste… SetupStep.RECONNECTING))");
                        return f;
                    }
                }
            } else if (pVar.b() == null) {
                return c(pVar);
            } else {
                if (pVar.b().c() == null) {
                    return d(pVar);
                }
                if (pVar.b().e()) {
                    return d(pVar);
                }
                if (pVar.b().d()) {
                    return d(pVar);
                }
                return c(pVar);
            }
        } else if (fVar instanceof f.x) {
            f.x xVar = (f.x) fVar;
            if ((pVar.f() == setupStep2 || pVar.f() == setupStep3) && xVar.a()) {
                e0<p, d> f2 = e0.f(p.a(pVar, SetupStep.CONNECTED, false, xVar.a(), false, false, false, null, false, false, null, 1018));
                h.d(f2, "Next.next(\n             …          )\n            )");
                return f2;
            }
            e0<p, d> f3 = e0.f(p.a(pVar, null, false, xVar.a(), false, false, false, null, false, false, null, 1019));
            h.d(f3, "Next.next(\n            m…nt.isConnected)\n        )");
            return f3;
        } else if (fVar instanceof f.a) {
            int ordinal2 = pVar.f().ordinal();
            switch (ordinal2) {
                case 1:
                    return b(pVar);
                case 2:
                    return h(pVar);
                case 3:
                    return h(pVar);
                case 4:
                    return e(pVar);
                case 5:
                    return d(pVar);
                case 6:
                    return e(pVar);
                case 7:
                    return c(pVar);
                default:
                    switch (ordinal2) {
                        case 13:
                            e0<p, d> f4 = e0.f(p.a(pVar, setupStep, false, false, false, false, false, null, false, false, null, 1022));
                            h.d(f4, "Next.next(model.copy(step = SetupStep.DOWNLOADED))");
                            return f4;
                        case 14:
                            return f(pVar);
                        case 15:
                            return g(pVar);
                        default:
                            e0<p, d> h2 = e0.h();
                            h.d(h2, "Next.noChange()");
                            return h2;
                    }
            }
        } else if (fVar instanceof f.C0350f) {
            return b(pVar);
        } else {
            if (fVar instanceof f.d) {
                e0<p, d> f5 = e0.f(p.a(pVar, null, true, false, false, false, false, null, false, false, null, 1021));
                h.d(f5, "Next.next(model.copy(bluetoothEnabled = true))");
                return f5;
            } else if (fVar instanceof f.c) {
                e0<p, d> f6 = e0.f(p.a(pVar, null, false, false, false, false, false, null, false, false, null, 1021));
                h.d(f6, "Next.next(model.copy(bluetoothEnabled = false))");
                return f6;
            } else if (fVar instanceof f.b) {
                if (pVar.g()) {
                    return e(pVar);
                }
                if (!pVar.j()) {
                    e0<p, d> a2 = e0.a(z42.l(d.b.a));
                    h.d(a2, "Next.dispatch(effects(Se…DisplayConnectionDialog))");
                    return a2;
                } else if (pVar.c()) {
                    e0<p, d> g3 = e0.g(p.a(pVar, setupStep2, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.f)));
                    h.d(g3, "Next.next(\n            m…_TO_SEARCHING))\n        )");
                    return g3;
                } else {
                    e0<p, d> a3 = e0.a(z42.l(d.g.a));
                    h.d(a3, "Next.dispatch(effects(Se….RequestEnableBluetooth))");
                    return a3;
                }
            } else if (fVar instanceof f.a0) {
                f.a0 a0Var = (f.a0) fVar;
                p a4 = p.a(pVar, null, false, false, false, false, false, new c(a0Var.a(), a0Var.b(), a0Var.c(), a0Var.d()), false, false, null, 959);
                c b = a4.b();
                if (((b != null ? b.c() : null) == null || a4.b().d()) && a4.f() == SetupStep.CHECK_FOR_UPDATES) {
                    return d(a4);
                }
                e0<p, d> f7 = e0.f(a4);
                h.d(f7, "Next.next(newModel)");
                return f7;
            } else if (fVar instanceof f.p) {
                return i(pVar, (f.p) fVar);
            } else {
                if (fVar instanceof f.e) {
                    f.e eVar = (f.e) fVar;
                    return i(pVar, new f.p(null));
                } else if (fVar instanceof f.i) {
                    e0<p, d> f8 = e0.f(p.a(pVar, null, false, false, ((f.i) fVar).a(), false, false, null, false, false, null, 1015));
                    h.d(f8, "Next.next(model.copy(isOnline = event.isOnline))");
                    return f8;
                } else if (fVar instanceof f.v) {
                    e0<p, d> g4 = e0.g(p.a(pVar, SetupStep.NONE, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.b), d.h.a));
                    h.d(g4, "Next.next(\n            m…d\n            )\n        )");
                    return g4;
                } else if (fVar instanceof f.q) {
                    e0<p, d> g5 = e0.g(p.a(pVar, null, false, false, false, false, false, null, false, false, null, ContentMediaFormat.PREVIEW_GENERIC), z42.l(mVar));
                    h.d(g5, "Next.next(model.copy(sup…tupEffect.StartScanning))");
                    return g5;
                } else if (fVar instanceof f.u) {
                    if (pVar.h()) {
                        e0<p, d> h3 = e0.h();
                        h.d(h3, "Next.noChange()");
                        return h3;
                    }
                    e0<p, d> a5 = e0.a(z42.l(kVar));
                    h.d(a5, "Next.dispatch(effects(Se…ect.ShowScanningFailure))");
                    return a5;
                } else if (fVar instanceof f.t) {
                    e0<p, d> g6 = e0.g(p.a(pVar, null, false, false, false, false, false, null, false, false, null, ContentMediaFormat.PREVIEW_GENERIC), z42.l(kVar));
                    h.d(g6, "Next.next(\n            m…canningFailure)\n        )");
                    return g6;
                } else if (fVar instanceof f.s) {
                    e0<p, d> g7 = e0.g(p.a(pVar, null, false, false, false, false, false, null, false, false, null, ContentMediaFormat.PREVIEW_GENERIC), z42.l(mVar));
                    h.d(g7, "Next.next(\n            m…as SetupEffect)\n        )");
                    return g7;
                } else if (fVar instanceof f.w) {
                    e0<p, d> a6 = e0.a(z42.l(nVar));
                    h.d(a6, "Next.dispatch(effects(SetupEffect.StopScanning))");
                    return a6;
                } else if (fVar instanceof f.y) {
                    e0<p, d> g8 = e0.g(p.a(pVar, null, false, false, false, true, false, null, false, false, null, ContentMediaFormat.PREVIEW_GENERIC), z42.l(new d.j(((f.y) fVar).a())));
                    h.d(g8, "Next.next(\n            m…ooserLauncher))\n        )");
                    return g8;
                } else if (fVar instanceof f.z) {
                    f.z zVar = (f.z) fVar;
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    h.d(defaultAdapter, "BluetoothAdapter.getDefaultAdapter()");
                    if (defaultAdapter.getBondedDevices().contains(zVar.a())) {
                        e0<p, d> a7 = e0.a(z42.l(new d.o(zVar.a())));
                        h.d(a7, "Next.dispatch(effects(Se…r(event.selectedDevice)))");
                        return a7;
                    }
                    e0<p, d> a8 = e0.a(z42.l(new d.f(zVar.a())));
                    h.d(a8, "Next.dispatch(effects(Se…r(event.selectedDevice)))");
                    return a8;
                } else if (fVar instanceof f.h) {
                    e0<p, d> a9 = e0.a(z42.l(d.i.a, nVar));
                    h.d(a9, "Next.dispatch(effects(Se…etupEffect.StopScanning))");
                    return a9;
                } else if (fVar instanceof f.b0) {
                    e0<p, d> f9 = e0.f(p.a(pVar, null, false, false, false, false, ((f.b0) fVar).a(), null, false, false, null, 991));
                    h.d(f9, "Next.next(model.copy(isW…= event.isWifiConnected))");
                    return f9;
                } else if (fVar instanceof f.l) {
                    p a10 = p.a(pVar, SetupStep.CONNECT_TO_CAR, false, false, false, false, false, null, false, false, null, 766);
                    c b2 = pVar.b();
                    h.c(b2);
                    g c = b2.c();
                    h.c(c);
                    e0<p, d> g9 = e0.g(a10, z42.l(new d.c(c), d.a.a));
                    h.d(g9, "Next.next(\n            m…i\n            )\n        )");
                    return g9;
                } else if (fVar instanceof f.g) {
                    p a11 = p.a(pVar, SetupStep.CONNECT_TO_WIFI, false, false, false, false, false, null, false, true, null, 766);
                    c b3 = pVar.b();
                    h.c(b3);
                    g c2 = b3.c();
                    h.c(c2);
                    e0<p, d> g10 = e0.g(a11, z42.l(new d.C0349d(c2)));
                    h.d(g10, "Next.next(\n            m…datableItem!!))\n        )");
                    return g10;
                } else if (fVar instanceof f.j) {
                    f.j jVar = (f.j) fVar;
                    c b4 = pVar.b();
                    if ((b4 != null ? b4.c() : null) != null && h.a(jVar.a(), b4.c().hash()) && h.a(jVar.b(), b4.c().packageName()) && jVar.d() == b4.c().sizeBytes() && h.a(jVar.e(), b4.c().version()) && h.a(jVar.c(), b4.b())) {
                        c b5 = pVar.b();
                        pVar2 = p.a(pVar, null, false, false, false, false, false, b5 != null ? c.a(b5, null, null, false, true, 7) : null, false, false, null, 959);
                    } else {
                        pVar2 = pVar;
                    }
                    if (!pVar.d() || !pVar.i()) {
                        e0<p, d> f10 = e0.f(p.a(pVar2, null, false, false, false, false, false, null, false, false, null, 895));
                        h.d(f10, "Next.next(newModel.copy(isDownloading = false))");
                        return f10;
                    }
                    e0<p, d> f11 = e0.f(p.a(pVar2, setupStep, false, false, false, false, false, null, false, false, null, 894));
                    h.d(f11, "Next.next(newModel.copy(… = SetupStep.DOWNLOADED))");
                    return f11;
                } else if (fVar instanceof f.k) {
                    return c(p.a(pVar, null, false, false, false, false, false, null, false, false, null, 895));
                } else {
                    if (fVar instanceof f.m) {
                        if (pVar.d()) {
                            e0<p, d> f12 = e0.f(p.a(pVar, SetupStep.DOWNLOADING, false, false, false, false, false, null, true, false, null, 894));
                            h.d(f12, "Next.next(model.copy(isD…= SetupStep.DOWNLOADING))");
                            return f12;
                        }
                        e0<p, d> f13 = e0.f(p.a(pVar, null, false, false, false, false, false, null, true, false, null, 895));
                        h.d(f13, "Next.next(model.copy(isDownloading = true))");
                        return f13;
                    } else if (fVar instanceof f.r) {
                        e0<p, d> a12 = e0.a(z42.l(d.l.a));
                        h.d(a12, "Next.dispatch(effects(Se…ct.StartInterAppService))");
                        return a12;
                    } else if (fVar instanceof f.n) {
                        e0<p, d> g11 = e0.g(p.a(p.a(pVar, null, false, false, false, false, false, null, false, false, ((f.n) fVar).a(), 511), SetupStep.MOUNT_INSTRUCTIONS, false, false, false, false, false, null, false, false, null, 1022), z42.l(new d.e(SetupSubscriptionEvent.u)));
                        h.d(g11, "Next.next(\n            m…_INSTRUCTIONS))\n        )");
                        return g11;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }
}
