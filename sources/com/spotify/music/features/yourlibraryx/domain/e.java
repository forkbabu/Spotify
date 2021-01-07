package com.spotify.music.features.yourlibraryx.domain;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobius.e0;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.domain.c;
import com.spotify.music.features.yourlibraryx.domain.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.collections.d;
import kotlin.collections.k;
import kotlin.jvm.internal.h;

public final class e {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final boolean a(java.util.List<? extends com.spotify.music.features.yourlibraryx.domain.b> r5, com.spotify.music.features.yourlibraryx.domain.b r6) {
        /*
            java.lang.Class r0 = r6.getClass()
            kotlin.reflect.c r0 = kotlin.jvm.internal.j.b(r0)
            boolean r1 = r5 instanceof java.util.Collection
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0017
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x0017
        L_0x0014:
            r2 = 0
            goto L_0x008d
        L_0x0017:
            java.util.Iterator r5 = r5.iterator()
        L_0x001b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0014
            java.lang.Object r1 = r5.next()
            com.spotify.music.features.yourlibraryx.domain.b r1 = (com.spotify.music.features.yourlibraryx.domain.b) r1
            r4 = r0
            kotlin.jvm.internal.d r4 = (kotlin.jvm.internal.d) r4
            boolean r4 = r4.a(r1)
            if (r4 != 0) goto L_0x008a
            com.spotify.music.features.yourlibraryx.domain.b$d r4 = com.spotify.music.features.yourlibraryx.domain.b.d.a
            boolean r4 = kotlin.jvm.internal.h.a(r1, r4)
            if (r4 == 0) goto L_0x003a
        L_0x0038:
            r1 = 0
            goto L_0x007f
        L_0x003a:
            boolean r4 = r1 instanceof com.spotify.music.features.yourlibraryx.domain.b.e
            if (r4 == 0) goto L_0x0049
            com.spotify.music.features.yourlibraryx.domain.b$e r1 = (com.spotify.music.features.yourlibraryx.domain.b.e) r1
            java.util.List r1 = r1.a()
            boolean r1 = a(r1, r6)
            goto L_0x007f
        L_0x0049:
            boolean r4 = r1 instanceof com.spotify.music.features.yourlibraryx.domain.b.C0269b
            if (r4 == 0) goto L_0x0058
            com.spotify.music.features.yourlibraryx.domain.b$b r1 = (com.spotify.music.features.yourlibraryx.domain.b.C0269b) r1
            java.util.List r1 = r1.a()
            boolean r1 = a(r1, r6)
            goto L_0x007f
        L_0x0058:
            boolean r4 = r1 instanceof com.spotify.music.features.yourlibraryx.domain.b.a
            if (r4 == 0) goto L_0x0067
            com.spotify.music.features.yourlibraryx.domain.b$a r1 = (com.spotify.music.features.yourlibraryx.domain.b.a) r1
            java.util.List r1 = r1.a()
            boolean r1 = a(r1, r6)
            goto L_0x007f
        L_0x0067:
            boolean r4 = r1 instanceof com.spotify.music.features.yourlibraryx.domain.b.f
            if (r4 == 0) goto L_0x0076
            com.spotify.music.features.yourlibraryx.domain.b$f r1 = (com.spotify.music.features.yourlibraryx.domain.b.f) r1
            java.util.List r1 = r1.a()
            boolean r1 = a(r1, r6)
            goto L_0x007f
        L_0x0076:
            com.spotify.music.features.yourlibraryx.domain.b$c r4 = com.spotify.music.features.yourlibraryx.domain.b.c.a
            boolean r1 = kotlin.jvm.internal.h.a(r1, r4)
            if (r1 == 0) goto L_0x0084
            goto L_0x0038
        L_0x007f:
            if (r1 == 0) goto L_0x0082
            goto L_0x008a
        L_0x0082:
            r1 = 0
            goto L_0x008b
        L_0x0084:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L_0x008a:
            r1 = 1
        L_0x008b:
            if (r1 == 0) goto L_0x001b
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.domain.e.a(java.util.List, com.spotify.music.features.yourlibraryx.domain.b):boolean");
    }

    public static final jnf b(int i, jnf jnf) {
        h.e(jnf, "visibleRange");
        int e = i - ((jnf.e() - jnf.d()) + 1);
        if (e <= 0) {
            return jnf;
        }
        int max = Math.max(0, jnf.d() - (e / 2));
        return knf.e(max, jnf.e() + (e - (jnf.d() - max)) + 1);
    }

    public static final e0<f, c> c(YourLibraryXEvent.d dVar) {
        h.e(dVar, "event");
        e0<f, c> a = e0.a(z42.l(new c.g(dVar.c(), dVar.b(), dVar.a())));
        h.d(a, "dispatch(\n        effect…        )\n        )\n    )");
        return a;
    }

    public static final e0<f, c> d(f fVar, YourLibraryXEvent.f fVar2) {
        jnf jnf;
        h.e(fVar, "model");
        h.e(fVar2, "event");
        if (h.a(fVar.g(), fVar2.b().f())) {
            jnf jnf2 = jnf.n;
            jnf = jnf.f;
        } else {
            jnf = fVar.g();
        }
        f a = f.a(fVar, null, null, null, null, d.a(fVar.c(), null, fVar2.b().b(), null, 5), null, 0, 0, fVar2.b(), fVar2.a(), jnf, null, false, null, null, 30959);
        e0<f, c> g = e0.g(a, z42.l(j(a)));
        h.d(g, "Next.next(newModel, effe…nizePlaylists(newModel)))");
        return g;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00bb: APUT  
      (r2v9 com.spotify.music.features.yourlibraryx.domain.c$m[])
      (0 ??[int, short, byte, char])
      (wrap: com.spotify.music.features.yourlibraryx.domain.c$m : 0x00b8: CONSTRUCTOR  (r4v1 com.spotify.music.features.yourlibraryx.domain.c$m) = 
      (wrap: com.spotify.music.features.yourlibraryx.domain.k : 0x00b1: CONSTRUCTOR  (r0v1 com.spotify.music.features.yourlibraryx.domain.k) = 
      (r5v1 com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption)
      (r6v1 com.spotify.music.features.yourlibraryx.domain.d)
      (r7v3 jnf)
      (null java.util.List)
     call: com.spotify.music.features.yourlibraryx.domain.k.<init>(com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption, com.spotify.music.features.yourlibraryx.domain.d, jnf, java.util.List):void type: CONSTRUCTOR)
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x00b4: INVOKE  (r5v2 com.spotify.music.features.yourlibraryx.domain.a) = (r19v0 com.spotify.music.features.yourlibraryx.domain.f) type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.f.e():com.spotify.music.features.yourlibraryx.domain.a)
     call: com.spotify.music.features.yourlibraryx.domain.c.m.<init>(com.spotify.music.features.yourlibraryx.domain.k, com.spotify.music.features.yourlibraryx.domain.a):void type: CONSTRUCTOR)
     */
    public static final e0<f, c> e(f fVar, YourLibraryXEvent.n nVar) {
        jnf jnf;
        h.e(fVar, "model");
        h.e(nVar, "event");
        jnf a = nVar.a();
        if (a.isEmpty()) {
            e0<f, c> h = e0.h();
            h.d(h, "Next.noChange()");
            return h;
        }
        jnf b = b(fVar.i(), a);
        if (h.a(b, fVar.g())) {
            e0<f, c> h2 = e0.h();
            h.d(h2, "Next.noChange()");
            return h2;
        } else if (fVar.g().isEmpty() || !fVar.g().i(a.d()) || !fVar.g().i(a.e())) {
            f a2 = f.a(fVar, null, null, null, null, null, null, 0, 0, null, null, b, null, false, null, null, 31743);
            c.m[] mVarArr = new c.m[1];
            h.e(a2, "model");
            YourLibraryXSortOption n = a2.n();
            d c = a2.c();
            if (a2.g().isEmpty()) {
                jnf = a2.f().f();
            } else {
                jnf = a2.g();
            }
            mVarArr[0] = new c.m(new k(n, c, jnf, null), fVar.e());
            e0<f, c> g = e0.g(a2, z42.l(mVarArr));
            h.d(g, "Next.next(\n        nextM…        )\n        )\n    )");
            return g;
        } else {
            e0<f, c> h3 = e0.h();
            h.d(h3, "Next.noChange()");
            return h3;
        }
    }

    public static final e0<f, c> f(f fVar, YourLibraryXEvent.q qVar) {
        h.e(fVar, "model");
        h.e(qVar, "event");
        e0<f, c> f = e0.f(f.a(fVar, null, null, null, null, null, null, 0, 0, null, null, null, null, false, qVar.a(), null, 24575));
        h.d(f, "Next.next(model.copy(playingUri = event.uri))");
        return f;
    }

    public static final e0<f, c> g(String str) {
        h.e(str, "uri");
        e0<f, c> a = e0.a(z42.l(new c.h(str)));
        h.d(a, "dispatch(effects(PinItem(uri)))");
        return a;
    }

    public static final e0<f, c> h(String str) {
        h.e(str, "uri");
        e0<f, c> a = e0.a(z42.l(new c.o(str)));
        h.d(a, "dispatch(effects(UnpinItem(uri)))");
        return a;
    }

    public static final e0<f, c> i(f fVar, YourLibraryXEvent.a0 a0Var) {
        h.e(fVar, "model");
        h.e(a0Var, "event");
        if (h.a(fVar.p(), a0Var.a())) {
            e0<f, c> h = e0.h();
            h.d(h, "Next.noChange()");
            return h;
        }
        f a = f.a(fVar, null, null, null, null, null, null, 0, 0, null, null, null, a0Var.a(), false, null, null, 30719);
        e0<f, c> g = e0.g(a, z42.l(j(a)));
        h.d(g, "Next.next(newModel, effe…nizePlaylists(newModel)))");
        return g;
    }

    private static final c.n j(f fVar) {
        jnf p = fVar.p();
        jnf f = fVar.f().f();
        if (p.isEmpty() || f.isEmpty() || !f.i(p.d()) || !f.i(p.e())) {
            return new c.n(EmptySet.a);
        }
        ArrayList arrayList = new ArrayList(d.e(p, 10));
        Iterator<Integer> it = p.iterator();
        while (((inf) it).hasNext()) {
            arrayList.add(fVar.f().c().get(((k) it).a() - f.d()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((YourLibraryResponseProto$YourLibraryResponseEntity) next).l() == YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase.PLAYLIST) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(d.e(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            YourLibraryResponseProto$YourLibraryEntityInfo m = ((YourLibraryResponseProto$YourLibraryResponseEntity) it3.next()).m();
            h.d(m, "it.entityInfo");
            arrayList3.add(m.p());
        }
        return new c.n(d.Z(arrayList3));
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0171: APUT  
      (r1v69 com.spotify.music.features.yourlibraryx.domain.c[])
      (0 ??[int, short, byte, char])
      (wrap: com.spotify.music.features.yourlibraryx.domain.c$m : 0x016d: CONSTRUCTOR  (r2v43 com.spotify.music.features.yourlibraryx.domain.c$m) = 
      (r3v21 com.spotify.music.features.yourlibraryx.domain.k)
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x016a: CONSTRUCTOR  (r4v26 com.spotify.music.features.yourlibraryx.domain.a) = 
      (wrap: int : 0x0167: ARITH  (r5v19 int) = (wrap: int : 0x0162: INVOKE  (r5v18 int) = 
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x015e: INVOKE  (r5v17 com.spotify.music.features.yourlibraryx.domain.a) = (r0v50 com.spotify.music.features.yourlibraryx.domain.f) type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.f.e():com.spotify.music.features.yourlibraryx.domain.a)
     type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.a.a():int) + (1 int))
      (r14v0 com.spotify.music.features.yourlibraryx.domain.SubscriptionType)
      true
      true
     call: com.spotify.music.features.yourlibraryx.domain.a.<init>(int, com.spotify.music.features.yourlibraryx.domain.SubscriptionType, boolean, boolean):void type: CONSTRUCTOR)
     call: com.spotify.music.features.yourlibraryx.domain.c.m.<init>(com.spotify.music.features.yourlibraryx.domain.k, com.spotify.music.features.yourlibraryx.domain.a):void type: CONSTRUCTOR)
     */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0284: APUT  
      (r2v37 com.spotify.music.features.yourlibraryx.domain.c$m[])
      (0 ??[int, short, byte, char])
      (wrap: com.spotify.music.features.yourlibraryx.domain.c$m : 0x0280: CONSTRUCTOR  (r3v19 com.spotify.music.features.yourlibraryx.domain.c$m) = 
      (r4v23 com.spotify.music.features.yourlibraryx.domain.k)
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x027d: CONSTRUCTOR  (r5v14 com.spotify.music.features.yourlibraryx.domain.a) = 
      (wrap: int : 0x027a: ARITH  (r6v23 int) = (wrap: int : 0x0276: INVOKE  (r6v22 int) = 
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x0272: INVOKE  (r6v21 com.spotify.music.features.yourlibraryx.domain.a) = (r0v42 com.spotify.music.features.yourlibraryx.domain.f) type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.f.e():com.spotify.music.features.yourlibraryx.domain.a)
     type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.a.a():int) + (1 int))
      (r14v0 com.spotify.music.features.yourlibraryx.domain.SubscriptionType)
      true
      true
     call: com.spotify.music.features.yourlibraryx.domain.a.<init>(int, com.spotify.music.features.yourlibraryx.domain.SubscriptionType, boolean, boolean):void type: CONSTRUCTOR)
     call: com.spotify.music.features.yourlibraryx.domain.c.m.<init>(com.spotify.music.features.yourlibraryx.domain.k, com.spotify.music.features.yourlibraryx.domain.a):void type: CONSTRUCTOR)
     */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0348: APUT  
      (r2v24 com.spotify.music.features.yourlibraryx.domain.c$m[])
      (0 ??[int, short, byte, char])
      (wrap: com.spotify.music.features.yourlibraryx.domain.c$m : 0x0344: CONSTRUCTOR  (r3v16 com.spotify.music.features.yourlibraryx.domain.c$m) = 
      (r4v21 com.spotify.music.features.yourlibraryx.domain.k)
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x0341: CONSTRUCTOR  (r5v11 com.spotify.music.features.yourlibraryx.domain.a) = 
      (wrap: int : 0x033e: ARITH  (r6v18 int) = (wrap: int : 0x033a: INVOKE  (r6v17 int) = 
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x0336: INVOKE  (r6v16 com.spotify.music.features.yourlibraryx.domain.a) = (r0v37 com.spotify.music.features.yourlibraryx.domain.f) type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.f.e():com.spotify.music.features.yourlibraryx.domain.a)
     type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.a.a():int) + (1 int))
      (r14v0 com.spotify.music.features.yourlibraryx.domain.SubscriptionType)
      true
      true
     call: com.spotify.music.features.yourlibraryx.domain.a.<init>(int, com.spotify.music.features.yourlibraryx.domain.SubscriptionType, boolean, boolean):void type: CONSTRUCTOR)
     call: com.spotify.music.features.yourlibraryx.domain.c.m.<init>(com.spotify.music.features.yourlibraryx.domain.k, com.spotify.music.features.yourlibraryx.domain.a):void type: CONSTRUCTOR)
     */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x03e0: APUT  
      (r2v19 com.spotify.music.features.yourlibraryx.domain.c$m[])
      (0 ??[int, short, byte, char])
      (wrap: com.spotify.music.features.yourlibraryx.domain.c$m : 0x03dd: CONSTRUCTOR  (r3v9 com.spotify.music.features.yourlibraryx.domain.c$m) = 
      (r5v8 com.spotify.music.features.yourlibraryx.domain.k)
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x03da: CONSTRUCTOR  (r4v18 com.spotify.music.features.yourlibraryx.domain.a) = 
      (wrap: int : 0x03d7: ARITH  (r6v13 int) = (wrap: int : 0x03d3: INVOKE  (r6v12 int) = 
      (wrap: com.spotify.music.features.yourlibraryx.domain.a : 0x03cf: INVOKE  (r6v11 com.spotify.music.features.yourlibraryx.domain.a) = (r0v34 com.spotify.music.features.yourlibraryx.domain.f) type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.f.e():com.spotify.music.features.yourlibraryx.domain.a)
     type: VIRTUAL call: com.spotify.music.features.yourlibraryx.domain.a.a():int) + (1 int))
      (r14v0 com.spotify.music.features.yourlibraryx.domain.SubscriptionType)
      true
      true
     call: com.spotify.music.features.yourlibraryx.domain.a.<init>(int, com.spotify.music.features.yourlibraryx.domain.SubscriptionType, boolean, boolean):void type: CONSTRUCTOR)
     call: com.spotify.music.features.yourlibraryx.domain.c.m.<init>(com.spotify.music.features.yourlibraryx.domain.k, com.spotify.music.features.yourlibraryx.domain.a):void type: CONSTRUCTOR)
     */
    public static final e0<f, c> k(f fVar, YourLibraryXEvent yourLibraryXEvent) {
        jnf jnf;
        jnf jnf2;
        List list;
        jnf jnf3;
        jnf jnf4;
        b.d dVar = b.d.a;
        SubscriptionType subscriptionType = SubscriptionType.LIBRARY;
        h.e(fVar, "model");
        h.e(yourLibraryXEvent, "event");
        if (yourLibraryXEvent instanceof YourLibraryXEvent.g) {
            e0<f, c> a = e0.a(z42.l(c.C0270c.a));
            h.d(a, "dispatch(effects(NavigateToCreatePlaylist))");
            return a;
        } else if (yourLibraryXEvent instanceof YourLibraryXEvent.v) {
            e0<f, c> a2 = e0.a(z42.l(new c.e(((YourLibraryXEvent.v) yourLibraryXEvent).a())));
            h.d(a2, "dispatch(effects(Navigat… = event.interactionId)))");
            return a2;
        } else if (yourLibraryXEvent instanceof YourLibraryXEvent.s) {
            e0<f, c> a3 = e0.a(z42.l(new c.f(((YourLibraryXEvent.s) yourLibraryXEvent).a())));
            h.d(a3, "dispatch(effects(Navigat… = event.interactionId)))");
            return a3;
        } else if (yourLibraryXEvent instanceof YourLibraryXEvent.m) {
            e0<f, c> a4 = e0.a(z42.l(new c.q(l.a.a)));
            h.d(a4, "dispatch(effects(ViewEffect(ScrollToTop)))");
            return a4;
        } else if (yourLibraryXEvent instanceof YourLibraryXEvent.e) {
            YourLibraryXEvent.e eVar = (YourLibraryXEvent.e) yourLibraryXEvent;
            e0<f, c> a5 = e0.a(z42.l(new c.d(eVar.a(), eVar.b())));
            h.d(a5, "dispatch(\n        effect…        )\n        )\n    )");
            return a5;
        } else if (yourLibraryXEvent instanceof YourLibraryXEvent.d) {
            return c((YourLibraryXEvent.d) yourLibraryXEvent);
        } else {
            if (yourLibraryXEvent instanceof YourLibraryXEvent.f) {
                return d(fVar, (YourLibraryXEvent.f) yourLibraryXEvent);
            }
            if (yourLibraryXEvent instanceof YourLibraryXEvent.x) {
                e0<f, c> a6 = e0.a(z42.l(new c.l(new j(fVar.n(), fVar.b()))));
                h.d(a6, "dispatch(effects(ShowSor…ickerData = pickerData)))");
                return a6;
            } else if (yourLibraryXEvent instanceof YourLibraryXEvent.w) {
                YourLibraryXEvent.w wVar = (YourLibraryXEvent.w) yourLibraryXEvent;
                f a7 = f.a(fVar, null, null, wVar.a(), null, null, null, 0, 0, null, null, knf.e(0, fVar.i()), null, false, null, null, 31739);
                c[] cVarArr = new c[2];
                h.e(a7, "model");
                YourLibraryXSortOption n = a7.n();
                d c = a7.c();
                if (a7.g().isEmpty()) {
                    jnf4 = a7.f().f();
                } else {
                    jnf4 = a7.g();
                }
                k kVar = new k(n, c, jnf4, null);
                h.e(a7, "model");
                cVarArr[0] = new c.m(kVar, new a(a7.e().a() + 1, subscriptionType, true, true));
                cVarArr[1] = new c.j(wVar.a());
                e0<f, c> g = e0.g(a7, z42.l(cVarArr));
                h.d(g, "next(\n        newModel,\n…rtOption)\n        )\n    )");
                return g;
            } else if (yourLibraryXEvent instanceof YourLibraryXEvent.i) {
                YourLibraryXEvent.i iVar = (YourLibraryXEvent.i) yourLibraryXEvent;
                if (!a(fVar.c().b(), iVar.a())) {
                    StringBuilder V0 = je.V0("FilterSelected sent for filter (");
                    V0.append(iVar.a());
                    V0.append(") that ");
                    V0.append("was not part of the model (");
                    V0.append(fVar.c().b());
                    V0.append(')');
                    Assertion.g(V0.toString());
                    e0<f, c> h = e0.h();
                    h.d(h, "noChange()");
                    return h;
                }
                if (fVar.c().c().get(0) instanceof b.d) {
                    list = d.t(iVar.a());
                } else {
                    list = d.D(fVar.c().c(), iVar.a());
                }
                f a8 = f.a(fVar, null, null, null, null, d.a(fVar.c(), list, null, null, 6), null, 0, 0, null, null, knf.e(0, fVar.i()), null, false, null, null, 31727);
                c.m[] mVarArr = new c.m[1];
                h.e(a8, "model");
                YourLibraryXSortOption n2 = a8.n();
                d c2 = a8.c();
                if (a8.g().isEmpty()) {
                    jnf3 = a8.f().f();
                } else {
                    jnf3 = a8.g();
                }
                k kVar2 = new k(n2, c2, jnf3, null);
                h.e(a8, "model");
                mVarArr[0] = new c.m(kVar2, new a(a8.e().a() + 1, subscriptionType, true, true));
                e0<f, c> g2 = e0.g(a8, z42.l(mVarArr));
                h.d(g2, "next(\n        newModel,\n…        )\n        )\n    )");
                return g2;
            } else if (yourLibraryXEvent instanceof YourLibraryXEvent.h) {
                int indexOf = fVar.c().c().indexOf(((YourLibraryXEvent.h) yourLibraryXEvent).a());
                if (indexOf < 0) {
                    Assertion.g("FilterDeselected sent when filter was not selected");
                    e0<f, c> h2 = e0.h();
                    h.d(h2, "noChange()");
                    return h2;
                }
                List<b> subList = fVar.c().c().subList(0, indexOf);
                d c3 = fVar.c();
                if (subList.isEmpty()) {
                    subList = d.t(dVar);
                }
                f a9 = f.a(fVar, null, null, null, null, d.a(c3, subList, null, null, 6), null, 0, 0, null, null, knf.e(0, fVar.i()), null, false, null, null, 31727);
                c.m[] mVarArr2 = new c.m[1];
                h.e(a9, "model");
                YourLibraryXSortOption n3 = a9.n();
                d c4 = a9.c();
                if (a9.g().isEmpty()) {
                    jnf2 = a9.f().f();
                } else {
                    jnf2 = a9.g();
                }
                k kVar3 = new k(n3, c4, jnf2, null);
                h.e(a9, "model");
                mVarArr2[0] = new c.m(kVar3, new a(a9.e().a() + 1, subscriptionType, true, true));
                e0<f, c> g3 = e0.g(a9, z42.l(mVarArr2));
                h.d(g3, "next(\n        newModel,\n…        )\n        )\n    )");
                return g3;
            } else if (yourLibraryXEvent instanceof YourLibraryXEvent.k) {
                f a10 = f.a(fVar, null, null, null, null, d.a(fVar.c(), d.t(dVar), null, null, 6), null, 0, 0, null, null, knf.e(0, fVar.i()), null, false, null, null, 31727);
                c.m[] mVarArr3 = new c.m[1];
                h.e(a10, "model");
                YourLibraryXSortOption n4 = a10.n();
                d c5 = a10.c();
                if (a10.g().isEmpty()) {
                    jnf = a10.f().f();
                } else {
                    jnf = a10.g();
                }
                k kVar4 = new k(n4, c5, jnf, null);
                h.e(a10, "model");
                mVarArr3[0] = new c.m(kVar4, new a(a10.e().a() + 1, subscriptionType, true, true));
                e0<f, c> g4 = e0.g(a10, z42.l(mVarArr3));
                h.d(g4, "next(\n        newModel,\n…        )\n        )\n    )");
                return g4;
            } else if (yourLibraryXEvent instanceof YourLibraryXEvent.j) {
                YourLibraryXEvent.j jVar = (YourLibraryXEvent.j) yourLibraryXEvent;
                if (h.a(fVar.c().b(), null)) {
                    e0<f, c> h3 = e0.h();
                    h.d(h3, "noChange()");
                    return h3;
                }
                d a11 = d.a(fVar.c(), null, null, null, 5);
                e0<f, c> g5 = e0.g(f.a(fVar, null, null, null, null, a11, null, 0, 0, null, null, null, null, false, null, null, 32751), z42.l(new c.p(a11.b())));
                h.d(g5, "next(newModel, effects(U…Filters.contentFilters)))");
                return g5;
            } else if (yourLibraryXEvent instanceof YourLibraryXEvent.n) {
                return e(fVar, (YourLibraryXEvent.n) yourLibraryXEvent);
            } else {
                if (yourLibraryXEvent instanceof YourLibraryXEvent.a0) {
                    return i(fVar, (YourLibraryXEvent.a0) yourLibraryXEvent);
                }
                if (yourLibraryXEvent instanceof YourLibraryXEvent.r) {
                    YourLibraryXEvent.r rVar = (YourLibraryXEvent.r) yourLibraryXEvent;
                    h.e(fVar, "model");
                    h.e(rVar, "event");
                    e0<f, c> f = e0.f(f.a(fVar, null, null, null, null, null, rVar.a(), 0, 0, null, null, null, null, false, null, null, 32735));
                    h.d(f, "Next.next(model.copy(pro…ata = event.profileData))");
                    return f;
                } else if (yourLibraryXEvent instanceof YourLibraryXEvent.l) {
                    YourLibraryXViewMode g6 = fVar.o().g();
                    e0<f, c> g7 = e0.g(f.a(fVar, null, g6, null, null, null, null, 0, 0, null, null, null, null, false, null, null, 32765), z42.l(new c.k(g6)));
                    h.d(g7, "next(model.copy(viewDens…iewDensity(viewDensity)))");
                    return g7;
                } else if (yourLibraryXEvent instanceof YourLibraryXEvent.a) {
                    YourLibraryXEvent.a aVar = (YourLibraryXEvent.a) yourLibraryXEvent;
                    e0<f, c> f2 = e0.f(f.a(fVar, null, null, null, null, null, null, 0, 0, null, null, null, null, false, null, null, 32766));
                    h.d(f2, "next(model.copy(appMode = event.appMode))");
                    return f2;
                } else if (yourLibraryXEvent instanceof YourLibraryXEvent.o) {
                    e0<f, c> f3 = e0.f(f.a(fVar, null, null, null, null, null, null, 0, 0, null, null, null, null, ((YourLibraryXEvent.o) yourLibraryXEvent).a(), null, null, 28671));
                    h.d(f3, "next(model.copy(onDemand…= event.onDemandEnabled))");
                    return f3;
                } else if (yourLibraryXEvent instanceof YourLibraryXEvent.q) {
                    return f(fVar, (YourLibraryXEvent.q) yourLibraryXEvent);
                } else {
                    if (yourLibraryXEvent instanceof YourLibraryXEvent.y) {
                        return g(((YourLibraryXEvent.y) yourLibraryXEvent).a());
                    }
                    if (yourLibraryXEvent instanceof YourLibraryXEvent.z) {
                        return h(((YourLibraryXEvent.z) yourLibraryXEvent).a());
                    }
                    if (yourLibraryXEvent instanceof YourLibraryXEvent.p) {
                        e0<f, c> h4 = e0.h();
                        h.d(h4, "noChange()");
                        return h4;
                    }
                    e0<f, c> h5 = e0.h();
                    h.d(h5, "noChange()");
                    return h5;
                }
            }
        }
    }
}
