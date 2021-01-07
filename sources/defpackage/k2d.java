package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

/* renamed from: k2d  reason: default package */
public final class k2d {
    private final pzc a;
    private final m2d b;
    private final rzc c;
    private final List<Integer> d;
    private final List<o8e> e;
    private final g2d<szc> f;
    private final l2d g;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends o8e> */
    /* JADX WARN: Multi-variable type inference failed */
    public k2d(pzc pzc, m2d m2d, rzc rzc, List<Integer> list, List<? extends o8e> list2, g2d<szc> g2d, l2d l2d) {
        h.e(pzc, "shareData");
        h.e(m2d, "sourcePage");
        h.e(list, "excludedDestinationIds");
        this.a = pzc;
        this.b = m2d;
        this.c = rzc;
        this.d = list;
        this.e = list2;
        this.f = g2d;
        this.g = l2d;
    }

    public static k2d a(k2d k2d, pzc pzc, m2d m2d, rzc rzc, List list, List list2, g2d g2d, l2d l2d, int i) {
        List<Integer> list3 = null;
        pzc pzc2 = (i & 1) != 0 ? k2d.a : null;
        m2d m2d2 = (i & 2) != 0 ? k2d.b : null;
        rzc rzc2 = (i & 4) != 0 ? k2d.c : null;
        if ((i & 8) != 0) {
            list3 = k2d.d;
        }
        List list4 = (i & 16) != 0 ? k2d.e : list2;
        g2d g2d2 = (i & 32) != 0 ? k2d.f : g2d;
        l2d l2d2 = (i & 64) != 0 ? k2d.g : l2d;
        h.e(pzc2, "shareData");
        h.e(m2d2, "sourcePage");
        h.e(list3, "excludedDestinationIds");
        return new k2d(pzc2, m2d2, rzc2, list3, list4, g2d2, l2d2);
    }

    public final List<o8e> b() {
        return this.e;
    }

    public final List<Integer> c() {
        return this.d;
    }

    public final rzc d() {
        return this.c;
    }

    public final g2d<szc> e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2d)) {
            return false;
        }
        k2d k2d = (k2d) obj;
        return h.a(this.a, k2d.a) && h.a(this.b, k2d.b) && h.a(this.c, k2d.c) && h.a(this.d, k2d.d) && h.a(this.e, k2d.e) && h.a(this.f, k2d.f) && h.a(this.g, k2d.g);
    }

    public final pzc f() {
        return this.a;
    }

    public final l2d g() {
        return this.g;
    }

    public final m2d h() {
        return this.b;
    }

    public int hashCode() {
        pzc pzc = this.a;
        int i = 0;
        int hashCode = (pzc != null ? pzc.hashCode() : 0) * 31;
        m2d m2d = this.b;
        int hashCode2 = (hashCode + (m2d != null ? m2d.hashCode() : 0)) * 31;
        rzc rzc = this.c;
        int hashCode3 = (hashCode2 + (rzc != null ? rzc.hashCode() : 0)) * 31;
        List<Integer> list = this.d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<o8e> list2 = this.e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        g2d<szc> g2d = this.f;
        int hashCode6 = (hashCode5 + (g2d != null ? g2d.hashCode() : 0)) * 31;
        l2d l2d = this.g;
        if (l2d != null) {
            i = l2d.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShareMenuModel(shareData=");
        V0.append(this.a);
        V0.append(", sourcePage=");
        V0.append(this.b);
        V0.append(", menuResultListener=");
        V0.append(this.c);
        V0.append(", excludedDestinationIds=");
        V0.append(this.d);
        V0.append(", destinations=");
        V0.append(this.e);
        V0.append(", previewData=");
        V0.append(this.f);
        V0.append(", shareResult=");
        V0.append(this.g);
        V0.append(")");
        return V0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2d(pzc pzc, m2d m2d, rzc rzc, List list, List list2, g2d g2d, l2d l2d, int i) {
        this(pzc, m2d, (i & 4) != 0 ? null : rzc, (i & 8) != 0 ? EmptyList.a : list, null, null, null);
        int i2 = i & 16;
        int i3 = i & 32;
        int i4 = i & 64;
    }
}
