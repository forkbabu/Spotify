package defpackage;

import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import defpackage.n25;
import defpackage.o25;
import defpackage.t25;
import defpackage.u25;
import defpackage.v25;
import defpackage.x25;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: q25  reason: default package */
public final class q25 {
    private static final Set<n25> a(List<? extends p25> list) {
        if (!list.isEmpty()) {
            Set<n25> l = z42.l(new n25.i(((p25) list.get(0)).a()));
            h.d(l, "effects(FeedEffect.Regis…tItemViewed(items[0].id))");
            return l;
        }
        Set<n25> l2 = z42.l(new n25[0]);
        h.d(l2, "effects()");
        return l2;
    }

    public static final s<r25, n25> b(r25 r25, boolean z) {
        h.e(r25, "model");
        s<r25, n25> c = s.c(r25.a(r25, null, false, null, null, false, z, false, 95), a(r25.e()));
        h.d(c, "first(\n        model.cop…rItems(model.items)\n    )");
        return c;
    }

    public static final e0<r25, n25> c(r25 r25, o25 o25) {
        u25 u25;
        boolean z;
        u25 u252;
        x25 x25;
        u25 u253;
        T t;
        v25.b bVar = v25.b.a;
        h.e(r25, "model");
        h.e(o25, "event");
        if (o25 instanceof o25.l) {
            List C = d.C(r25.e(), ((o25.l) o25).a());
            e0<r25, n25> g = e0.g(r25.a(r25, C, false, bVar, null, false, false, false, 122), a(C));
            h.d(g, "next(updatedModel, getRe…ctForItems(updatedItems))");
            return g;
        } else if (o25 instanceof o25.k) {
            e0<r25, n25> f = e0.f(r25.a(r25, null, false, bVar, null, false, false, false, 123));
            h.d(f, "next(model.copy(loadingStatus = Idle))");
            return f;
        } else {
            String str = null;
            if (!(o25 instanceof o25.j)) {
                int i = 0;
                if (o25 instanceof o25.a) {
                    o25.a aVar = (o25.a) o25;
                    e0<r25, n25> a = e0.a(z42.l(new n25.g(aVar.a()), new n25.a(aVar.a(), true), new n25.f(new u25.h(aVar.c(), aVar.b(), aVar.a()))));
                    h.d(a, "dispatch(\n        effect…        )\n        )\n    )");
                    return a;
                } else if (o25 instanceof o25.b) {
                    o25.b bVar2 = (o25.b) o25;
                    e0<r25, n25> a2 = e0.a(z42.l(new n25.g(bVar2.b()), new n25.a(bVar2.b(), false), new n25.f(new u25.d(bVar2.c(), bVar2.a(), bVar2.b()))));
                    h.d(a2, "dispatch(\n        effect…        )\n        )\n    )");
                    return a2;
                } else if (o25 instanceof o25.q) {
                    o25.q qVar = (o25.q) o25;
                    e0<r25, n25> a3 = e0.a(z42.l(new n25.j(qVar.a()), new n25.f(new u25.g(qVar.c(), qVar.b()))));
                    h.d(a3, "dispatch(\n        effect…        )\n        )\n    )");
                    return a3;
                } else if (o25 instanceof o25.f) {
                    o25.f fVar = (o25.f) o25;
                    ArrayList arrayList = new ArrayList();
                    for (T t2 : r25.e()) {
                        if (!h.a(t2.a(), fVar.b()) || !(t2 instanceof w25)) {
                            arrayList.add(t2);
                        } else {
                            arrayList.add(w25.b(t2, null, null, null, null, null, null, null, null, false, true, false, false, false, null, 15871));
                        }
                    }
                    e0<r25, n25> g2 = e0.g(r25.a(r25, arrayList, false, null, null, false, false, false, 126), z42.l(new n25.g(fVar.a()), new n25.f(new u25.l(fVar.c(), fVar.a()))));
                    h.d(g2, "next(\n        model.copy…tityUri))\n        )\n    )");
                    return g2;
                } else {
                    String str2 = "";
                    if (o25 instanceof o25.r) {
                        o25.r rVar = (o25.r) o25;
                        if (!r25.c().containsKey(rVar.b())) {
                            String b = rVar.b();
                            if (r25.d()) {
                                List<p25> e = r25.e();
                                ArrayList arrayList2 = new ArrayList();
                                for (T t3 : e) {
                                    if (h.a(t3.a(), b)) {
                                        arrayList2.add(t3);
                                    }
                                }
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (next instanceof w25) {
                                        arrayList3.add(next);
                                    }
                                }
                                Iterator<T> it2 = ((w25) d.j(arrayList3)).l().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it2.next();
                                    if (!t.c()) {
                                        break;
                                    }
                                }
                                T t4 = t;
                                if (t4 != null) {
                                    str = t4.f();
                                }
                            }
                            if (str == null) {
                                str = rVar.d();
                            }
                            x25 = new x25.b(rVar.a(), str);
                            u252 = new u25.n(rVar.c(), rVar.a(), str);
                            z = true;
                        } else {
                            String str3 = r25.c().get(rVar.b());
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (r25.g()) {
                                x25 = x25.a.a;
                                u253 = new u25.m(rVar.c(), rVar.a(), str2);
                            } else {
                                x25 = x25.c.a;
                                u253 = new u25.o(rVar.c(), rVar.a(), str2);
                            }
                            u252 = u253;
                            z = !r25.g();
                        }
                        e0<r25, n25> g3 = e0.g(r25.a(r25, null, false, null, null, z, false, false, 111), z42.l(new n25.h(x25), new n25.f(u252)));
                        h.d(g3, "next(\n        model.copy…ionEvent)\n        )\n    )");
                        return g3;
                    } else if (o25 instanceof o25.g) {
                        o25.g gVar = (o25.g) o25;
                        e0<r25, n25> a4 = e0.a(z42.l(new n25.k(gVar.b(), gVar.a(), r25.b()), new n25.f(new u25.j(gVar.c(), gVar.b()))));
                        h.d(a4, "dispatch(\n        effect…        )\n        )\n    )");
                        return a4;
                    } else if (o25 instanceof o25.v) {
                        o25.v vVar = (o25.v) o25;
                        e0<r25, n25> a5 = e0.a(z42.l(new n25.l(vVar.e(), vVar.c(), r25.b()), new n25.f(new u25.p(vVar.b(), vVar.a(), vVar.d(), vVar.e()))));
                        h.d(a5, "dispatch(\n        effect…        )\n        )\n    )");
                        return a5;
                    } else if (o25 instanceof o25.w) {
                        o25.w wVar = (o25.w) o25;
                        e0<r25, n25> a6 = e0.a(z42.l(new n25.l(wVar.e(), wVar.c(), r25.b()), new n25.f(new u25.r(wVar.b(), wVar.a(), wVar.d(), wVar.e()))));
                        h.d(a6, "dispatch(\n        effect…        )\n        )\n    )");
                        return a6;
                    } else if (o25 instanceof o25.u) {
                        o25.u uVar = (o25.u) o25;
                        e0<r25, n25> g4 = e0.g(r25.a(r25, null, false, null, d.A(new Pair(uVar.b(), uVar.e())), true, false, false, 103), z42.l(new n25.h(new x25.b(uVar.a(), uVar.e())), new n25.f(new u25.q(uVar.c(), uVar.a(), uVar.d(), uVar.e()))));
                        h.d(g4, "next(\n        model.copy…        )\n        )\n    )");
                        return g4;
                    } else if (o25 instanceof o25.m) {
                        o25.m mVar = (o25.m) o25;
                        y25 d = d(r25.e(), mVar.a());
                        e0<r25, n25> g5 = e0.g(r25.a(r25, d.c(), false, null, null, false, false, false, 126), z42.l(new n25.d(mVar.a()), new n25.f(new u25.f(d.a(), d.b(), mVar.a()))));
                        h.d(g5, "next(\n        model.copy…        )\n        )\n    )");
                        return g5;
                    } else if (o25 instanceof o25.o) {
                        e0<r25, n25> h = e0.h();
                        h.d(h, "noChange()");
                        return h;
                    } else if (o25 instanceof o25.n) {
                        e0<r25, n25> h2 = e0.h();
                        h.d(h2, "noChange()");
                        return h2;
                    } else if (o25 instanceof o25.e) {
                        o25.e eVar = (o25.e) o25;
                        y25 d2 = d(r25.e(), eVar.a());
                        e0<r25, n25> g6 = e0.g(r25.a(r25, d2.c(), false, null, null, false, false, false, 126), z42.l(new n25.b(eVar.a()), new n25.f(new u25.e(d2.a(), d2.b(), eVar.a()))));
                        h.d(g6, "next(\n        model.copy…        )\n        )\n    )");
                        return g6;
                    } else if (o25 instanceof o25.s) {
                        c35 a7 = ((o25.s) o25).a();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        ArrayList arrayList4 = new ArrayList();
                        for (T t5 : r25.e()) {
                            if (t5 instanceof w25) {
                                T t6 = t5;
                                String m = t6.m();
                                String a8 = a7.a();
                                if (a8 == null) {
                                    a8 = str2;
                                }
                                boolean z2 = h.a(m, a8) && a7.b();
                                List<b35> l = t6.l();
                                ArrayList arrayList5 = new ArrayList();
                                String c = a7.c();
                                if (c == null) {
                                    c = str2;
                                }
                                boolean z3 = false;
                                for (T t7 : l) {
                                    if (h.a(c, t7.f())) {
                                        z3 = true;
                                    }
                                    arrayList5.add(b35.a(t7, null, null, h.a(c, t7.f()), false, null, 27));
                                }
                                m25 m25 = new m25(z3, arrayList5);
                                if (m25.b()) {
                                    String a9 = t5.a();
                                    String c2 = a7.c();
                                    if (c2 == null) {
                                        c2 = str2;
                                    }
                                    linkedHashMap.put(a9, c2);
                                }
                                arrayList4.add(w25.b(t6, null, null, null, null, null, null, null, null, false, false, z2, m25.b(), false, m25.a(), 5119));
                            } else {
                                arrayList4.add(t5);
                            }
                        }
                        e0<r25, n25> f2 = e0.f(r25.a(r25, arrayList4, false, null, linkedHashMap, a7.b(), false, false, 102));
                        h.d(f2, "next(\n        model.copy…lyPlaying\n        )\n    )");
                        return f2;
                    } else if (o25 instanceof o25.d) {
                        o25.d dVar = (o25.d) o25;
                        e0<r25, n25> f3 = e0.f(r25.a(r25, null, false, null, null, false, false, false, 125));
                        h.d(f3, "next(model.copy(online = event.online))");
                        return f3;
                    } else if (o25 instanceof o25.t) {
                        if (r25.f() instanceof v25.a) {
                            e0<r25, n25> h3 = e0.h();
                            h.d(h3, "noChange()");
                            return h3;
                        }
                        e0<r25, n25> g7 = e0.g(r25.a(r25, null, false, v25.a.a, null, false, false, false, 123), z42.l(new n25.c(r25.e().get(r25.e().size() - 1).a())));
                        h.d(g7, "next(\n            model.…entLastItemId))\n        )");
                        return g7;
                    } else if (o25 instanceof o25.h) {
                        o25.h hVar = (o25.h) o25;
                        ArrayList arrayList6 = new ArrayList();
                        int i2 = -1;
                        int i3 = 0;
                        for (T t8 : r25.e()) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                T t9 = t8;
                                if ((t9 instanceof w25) && h.a(hVar.b(), t9.a())) {
                                    T t10 = t9;
                                    str2 = t10.m();
                                    t9 = w25.b(t10, null, null, null, null, null, null, null, null, false, false, false, false, hVar.a(), null, 12287);
                                    i2 = i3;
                                }
                                arrayList6.add(t9);
                                i3 = i4;
                            } else {
                                d.L();
                                throw null;
                            }
                        }
                        if (hVar.a()) {
                            u25 = new u25.k(i2, str2);
                        } else {
                            u25 = new u25.i(i2, str2);
                        }
                        e0<r25, n25> g8 = e0.g(r25.a(r25, arrayList6, false, null, null, false, false, false, 126), z42.l(new n25.f(u25)));
                        h.d(g8, "next(\n        model.copy…(interactionEvent))\n    )");
                        return g8;
                    } else if (o25 instanceof o25.x) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        List<p25> e2 = r25.e();
                        Iterator<T> it3 = ((o25.x) o25).a().iterator();
                        while (it3.hasNext()) {
                            int intValue = it3.next().intValue();
                            p25 p25 = e2.get(intValue);
                            if (p25 instanceof w25) {
                                linkedHashSet.add(new n25.e(new t25.e(intValue, ((w25) p25).m())));
                            } else if (p25 instanceof s25) {
                                linkedHashSet.add(new n25.e(new t25.d(intValue)));
                            } else if (p25 instanceof k25) {
                                linkedHashSet.add(new n25.e(new t25.a(intValue, ((k25) p25).d().d())));
                            }
                        }
                        e0<r25, n25> a10 = e0.a(linkedHashSet);
                        h.d(a10, "dispatch(effects)");
                        return a10;
                    } else if (o25 instanceof o25.p) {
                        o25.p pVar = (o25.p) o25;
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        for (T t11 : r25.e()) {
                            int i5 = i + 1;
                            if (i >= 0) {
                                T t12 = t11;
                                if (t12 instanceof s25) {
                                    Iterator<T> it4 = pVar.a().iterator();
                                    while (it4.hasNext()) {
                                        int intValue2 = it4.next().intValue();
                                        linkedHashSet2.add(new n25.e(new t25.c(i, intValue2, t12.c().get(intValue2).c())));
                                    }
                                }
                                i = i5;
                            } else {
                                d.L();
                                throw null;
                            }
                        }
                        e0<r25, n25> a11 = e0.a(linkedHashSet2);
                        h.d(a11, "dispatch(effects)");
                        return a11;
                    } else if (o25 instanceof o25.i) {
                        e0<r25, n25> f4 = e0.f(r25.a(r25, null, false, null, null, false, false, ((o25.i) o25).a(), 63));
                        h.d(f4, "next(model.copy(explicit…explicitContentDisabled))");
                        return f4;
                    } else if (o25 instanceof o25.c) {
                        o25.c cVar = (o25.c) o25;
                        e0<r25, n25> a12 = e0.a(z42.l(new n25.g(cVar.a()), new n25.f(new u25.a(cVar.b(), cVar.a()))));
                        h.d(a12, "dispatch(\n        effect…        )\n        )\n    )");
                        return a12;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                o25.j jVar = (o25.j) o25;
                r25.a(r25, null, false, bVar, null, false, false, false, 122);
                throw null;
            }
        }
    }

    private static final y25 d(List<? extends p25> list, String str) {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        for (T t : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                T t2 = t;
                if (t2 instanceof s25) {
                    T t3 = t2;
                    List<j25> c = t3.c();
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = -1;
                    int i6 = 0;
                    for (T t4 : c) {
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            T t5 = t4;
                            if (h.a(t5.c(), str)) {
                                i5 = i6;
                            } else {
                                arrayList2.add(t5);
                            }
                            i6 = i7;
                        } else {
                            d.L();
                            throw null;
                        }
                    }
                    z25 z25 = new z25(i5, arrayList2);
                    i2 = z25.a();
                    List<j25> b = z25.b();
                    if (!(!b.isEmpty())) {
                        b = null;
                    }
                    if (b != null) {
                        arrayList.add(s25.b(t3, null, null, b, 3));
                    }
                    i = i3;
                } else {
                    arrayList.add(t2);
                }
                i3 = i4;
            } else {
                d.L();
                throw null;
            }
        }
        return new y25(i, i2, arrayList);
    }
}
