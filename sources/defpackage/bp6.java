package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.instrumentation.a;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import defpackage.ep6;
import defpackage.zo6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: bp6  reason: default package */
public final class bp6 implements ap6 {
    private final List<zo6.a> a;
    private final rp6 b;
    private zo6 c;

    public bp6(yo6 yo6) {
        h.e(yo6, "accepts");
        List<zo6.a> a2 = yo6.a();
        this.a = a2;
        MoreObjects.checkArgument((a2.isEmpty() ^ true) && (a2.get(a2.size() + -1) instanceof sp6), "Vanilla mode must be last in the modes list.", new Object[0]);
        zo6 create = a2.get(a2.size() - 1).b().create();
        if (create != null) {
            this.b = (rp6) create;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.music.features.playlistentity.plugin.VanillaMode");
    }

    @Override // defpackage.ap6
    public a a(zo6 zo6, LicenseLayout licenseLayout) {
        h.e(zo6, "activeMode");
        h.e(licenseLayout, "licenseLayout");
        Optional<a> g = zo6.g(licenseLayout);
        if (g.isPresent()) {
            a aVar = g.get();
            h.d(aVar, "activeModePageIdentifier.get()");
            return aVar;
        }
        Optional<a> g2 = this.b.g(licenseLayout);
        MoreObjects.checkArgument(g2.isPresent(), "No mode could provides a PageIdentifier. There must always be a mode providing a present page identifier, and the Vanilla Mode is such a mode. Has the vanilla mode been added last in the mode list and does it provide a present PageIdentifier?", new Object[0]);
        a aVar2 = g2.get();
        h.d(aVar2, "vanillaPageIdentifier.get()");
        return aVar2;
    }

    @Override // defpackage.ap6
    public np6 b(zo6 zo6) {
        h.e(zo6, "activeMode");
        if (zo6.c().isPresent()) {
            return zo6;
        }
        MoreObjects.checkArgument(this.b.f().isPresent(), "Vanilla mode must provide a default ItemList", new Object[0]);
        return this.b;
    }

    @Override // defpackage.ap6
    public lp6 c(zo6 zo6) {
        h.e(zo6, "activeMode");
        if (zo6.d().isPresent()) {
            return zo6;
        }
        MoreObjects.checkArgument(this.b.f().isPresent(), "Vanilla mode must provide a default Header", new Object[0]);
        return this.b;
    }

    @Override // defpackage.ap6
    public gp6 d(zo6 zo6) {
        h.e(zo6, "activeMode");
        if (zo6.e().isPresent()) {
            return zo6;
        }
        MoreObjects.checkArgument(this.b.f().isPresent(), "Vanilla mode must provide a default PlaylistComponent", new Object[0]);
        return this.b;
    }

    @Override // defpackage.ap6
    public ip6 e(zo6 zo6) {
        h.e(zo6, "activeMode");
        if (zo6.f().isPresent()) {
            return zo6;
        }
        MoreObjects.checkArgument(this.b.f().isPresent(), "Vanilla mode must provide a default Configurations", new Object[0]);
        return this.b;
    }

    @Override // defpackage.ap6
    public pp6 f(zo6 zo6) {
        h.e(zo6, "activeMode");
        if (zo6.a().isPresent()) {
            return zo6;
        }
        MoreObjects.checkArgument(this.b.f().isPresent(), "Vanilla mode must provide a default Toolbar", new Object[0]);
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007a, code lost:
        if ((!kotlin.jvm.internal.h.a(r6, r3.c())) != false) goto L_0x007c;
     */
    @Override // defpackage.ap6
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.zo6 g(defpackage.zo6.b r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "conditions"
            kotlin.jvm.internal.h.e(r6, r0)
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0012
            int r2 = r7.length()
            if (r2 != 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r2 = 0
            goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            r3 = 0
            if (r2 != 0) goto L_0x003b
            java.util.List<zo6$a> r6 = r5.a
            java.util.Iterator r6 = r6.iterator()
        L_0x001c:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0038
            java.lang.Object r2 = r6.next()
            r4 = r2
            zo6$a r4 = (defpackage.zo6.a) r4
            java.lang.Class r4 = r4.c()
            java.lang.String r4 = r4.getName()
            boolean r4 = kotlin.jvm.internal.h.a(r4, r7)
            if (r4 == 0) goto L_0x001c
            r3 = r2
        L_0x0038:
            zo6$a r3 = (defpackage.zo6.a) r3
            goto L_0x0057
        L_0x003b:
            java.util.List<zo6$a> r7 = r5.a
            java.util.Iterator r7 = r7.iterator()
        L_0x0041:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0055
            java.lang.Object r2 = r7.next()
            r4 = r2
            zo6$a r4 = (defpackage.zo6.a) r4
            boolean r4 = r4.a(r6)
            if (r4 == 0) goto L_0x0041
            r3 = r2
        L_0x0055:
            zo6$a r3 = (defpackage.zo6.a) r3
        L_0x0057:
            if (r3 == 0) goto L_0x005b
            r6 = 1
            goto L_0x005c
        L_0x005b:
            r6 = 0
        L_0x005c:
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r0 = "No mode could be found. There must always be a matching mode, and the Vanilla Mode is such a mode. Has the vanilla mode been added last in the mode list?"
            com.google.common.base.MoreObjects.checkArgument(r6, r0, r7)
            zo6 r6 = r5.c
            if (r6 == 0) goto L_0x007c
            kotlin.jvm.internal.h.c(r6)
            java.lang.Class r6 = r6.getClass()
            kotlin.jvm.internal.h.c(r3)
            java.lang.Class r7 = r3.c()
            boolean r6 = kotlin.jvm.internal.h.a(r6, r7)
            r6 = r6 ^ r1
            if (r6 == 0) goto L_0x0089
        L_0x007c:
            kotlin.jvm.internal.h.c(r3)
            zo6$c r6 = r3.b()
            zo6 r6 = r6.create()
            r5.c = r6
        L_0x0089:
            zo6 r6 = r5.c
            if (r6 == 0) goto L_0x008e
            return r6
        L_0x008e:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type com.spotify.music.features.playlistentity.plugin.PlaylistEntityMode"
            r6.<init>(r7)
            goto L_0x0097
        L_0x0096:
            throw r6
        L_0x0097:
            goto L_0x0096
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp6.g(zo6$b, java.lang.String):zo6");
    }

    @Override // defpackage.ap6
    public Map<AdditionalAdapter.Position, List<ep6>> h(zo6 zo6) {
        List list;
        h.e(zo6, "activeMode");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdditionalAdapter.Position[] positionArr = AdditionalAdapter.i;
        for (AdditionalAdapter.Position position : positionArr) {
            ep6.a b2 = zo6.b(position);
            ep6.a b3 = this.b.b(position);
            ep6.a.b bVar = ep6.a.b.a;
            if (h.a(b3, bVar) && h.a(b2, bVar)) {
                linkedHashMap.put(position, EmptyList.a);
            } else if (h.a(b3, bVar)) {
                linkedHashMap.put(position, d.t(zo6));
            } else if (h.a(b2, bVar)) {
                linkedHashMap.put(position, d.t(this.b));
            } else {
                ep6.a b4 = zo6.b(position);
                if (b4 instanceof ep6.a.d) {
                    list = d.t(zo6);
                } else if (b4 instanceof ep6.a.C0592a) {
                    list = d.u(this.b, zo6);
                } else if (b4 instanceof ep6.a.c) {
                    list = d.u(zo6, this.b);
                } else {
                    list = d.t(this.b);
                }
                linkedHashMap.put(position, list);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.ap6
    public zo6 i(zo6.b bVar) {
        h.e(bVar, "conditions");
        h.e(bVar, "conditions");
        return g(bVar, null);
    }

    @Override // defpackage.ap6
    public List<Class<? extends zo6>> j() {
        List<zo6.a> list = this.a;
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }
}
