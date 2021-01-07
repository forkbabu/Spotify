package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentImages;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentText;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableTarget;
import defpackage.s81;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableComponentModel implements s81, Parcelable {
    public static final Parcelable.Creator<HubsImmutableComponentModel> CREATOR = new a();
    public static final b Companion;
    private static final HubsImmutableComponentModel EMPTY;
    private final d hashCode$delegate = kotlin.a.b(new HubsImmutableComponentModel$hashCode$2(this));
    private final c impl;

    public static final class a implements Parcelable.Creator<HubsImmutableComponentModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentModel createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier = (HubsImmutableComponentIdentifier) gf0.n(parcel, HubsImmutableComponentIdentifier.CREATOR);
            HubsImmutableComponentText hubsImmutableComponentText = (HubsImmutableComponentText) gf0.n(parcel, HubsImmutableComponentText.CREATOR);
            HubsImmutableComponentImages hubsImmutableComponentImages = (HubsImmutableComponentImages) gf0.n(parcel, HubsImmutableComponentImages.CREATOR);
            Parcelable.Creator<HubsImmutableComponentBundle> creator = HubsImmutableComponentBundle.CREATOR;
            return HubsImmutableComponentModel.Companion.b(hubsImmutableComponentIdentifier, hubsImmutableComponentText, hubsImmutableComponentImages, (HubsImmutableComponentBundle) gf0.n(parcel, creator), (HubsImmutableComponentBundle) gf0.n(parcel, creator), (HubsImmutableComponentBundle) gf0.n(parcel, creator), (HubsImmutableTarget) gf0.n(parcel, HubsImmutableTarget.CREATOR), parcel.readString(), parcel.readString(), gf0.k(parcel, HubsImmutableCommandModel.CREATOR), c.i(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableComponentModel[] newArray(int i) {
            return new HubsImmutableComponentModel[i];
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final s81.a a() {
            return HubsImmutableComponentModel.EMPTY.toBuilder();
        }

        public final HubsImmutableComponentModel b(q81 q81, w81 w81, r81 r81, p81 p81, p81 p812, p81 p813, a91 a91, String str, String str2, Map<String, ? extends o81> map, List<? extends s81> list) {
            HubsImmutableComponentText hubsImmutableComponentText;
            HubsImmutableComponentImages hubsImmutableComponentImages;
            HubsImmutableComponentIdentifier b = HubsImmutableComponentIdentifier.Companion.b(q81);
            HubsImmutableComponentText.b bVar = HubsImmutableComponentText.Companion;
            bVar.getClass();
            if (w81 != null) {
                hubsImmutableComponentText = bVar.b(w81);
            } else {
                hubsImmutableComponentText = HubsImmutableComponentText.access$getEMPTY$cp();
            }
            HubsImmutableComponentImages.b bVar2 = HubsImmutableComponentImages.Companion;
            bVar2.getClass();
            if (r81 != null) {
                hubsImmutableComponentImages = bVar2.c(r81);
            } else {
                hubsImmutableComponentImages = HubsImmutableComponentImages.access$getEMPTY$cp();
            }
            HubsImmutableComponentBundle.b bVar3 = HubsImmutableComponentBundle.Companion;
            HubsImmutableComponentBundle c = bVar3.c(p81);
            HubsImmutableComponentBundle c2 = bVar3.c(p812);
            HubsImmutableComponentBundle c3 = bVar3.c(p813);
            HubsImmutableTarget.b bVar4 = HubsImmutableTarget.Companion;
            bVar4.getClass();
            return new HubsImmutableComponentModel(b, hubsImmutableComponentText, hubsImmutableComponentImages, c, c2, c3, a91 != null ? bVar4.b(a91) : null, str, str2, HubsImmutableCommandModel.Companion.a(map), c.c(list));
        }

        public final HubsImmutableComponentModel c(s81 s81) {
            h.e(s81, "other");
            if (s81 instanceof HubsImmutableComponentModel) {
                return (HubsImmutableComponentModel) s81;
            }
            return b(s81.componentId(), s81.text(), s81.images(), s81.metadata(), s81.logging(), s81.custom(), s81.target(), s81.id(), s81.group(), s81.events(), s81.children());
        }
    }

    /* access modifiers changed from: private */
    public final class c extends s81.a {
        private final HubsImmutableComponentIdentifier a;
        private final HubsImmutableComponentText b;
        private final HubsImmutableComponentImages c;
        private final HubsImmutableComponentBundle d;
        private final HubsImmutableComponentBundle e;
        private final HubsImmutableComponentBundle f;
        private final HubsImmutableTarget g;
        private final String h;
        private final String i;
        private final ImmutableMap<String, HubsImmutableCommandModel> j;
        private final ImmutableList<HubsImmutableComponentModel> k;
        final /* synthetic */ HubsImmutableComponentModel l;

        public c(HubsImmutableComponentModel hubsImmutableComponentModel, HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier, HubsImmutableComponentText hubsImmutableComponentText, HubsImmutableComponentImages hubsImmutableComponentImages, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, HubsImmutableTarget hubsImmutableTarget, String str, String str2, ImmutableMap<String, HubsImmutableCommandModel> immutableMap, ImmutableList<HubsImmutableComponentModel> immutableList) {
            h.e(hubsImmutableComponentIdentifier, "componentId");
            h.e(hubsImmutableComponentText, "text");
            h.e(hubsImmutableComponentImages, "images");
            h.e(hubsImmutableComponentBundle, "metadata");
            h.e(hubsImmutableComponentBundle2, "logging");
            h.e(hubsImmutableComponentBundle3, "custom");
            h.e(immutableMap, "events");
            h.e(immutableList, "children");
            this.l = hubsImmutableComponentModel;
            this.a = hubsImmutableComponentIdentifier;
            this.b = hubsImmutableComponentText;
            this.c = hubsImmutableComponentImages;
            this.d = hubsImmutableComponentBundle;
            this.e = hubsImmutableComponentBundle2;
            this.f = hubsImmutableComponentBundle3;
            this.g = hubsImmutableTarget;
            this.h = str;
            this.i = str2;
            this.j = immutableMap;
            this.k = immutableList;
        }

        public final ImmutableList<HubsImmutableComponentModel> A() {
            return this.k;
        }

        public final HubsImmutableComponentIdentifier B() {
            return this.a;
        }

        public final HubsImmutableComponentBundle C() {
            return this.f;
        }

        public final ImmutableMap<String, HubsImmutableCommandModel> D() {
            return this.j;
        }

        public final String E() {
            return this.i;
        }

        public final String F() {
            return this.h;
        }

        public final HubsImmutableComponentImages G() {
            return this.c;
        }

        public final HubsImmutableComponentBundle H() {
            return this.e;
        }

        public final HubsImmutableComponentBundle I() {
            return this.d;
        }

        public final HubsImmutableTarget J() {
            return this.g;
        }

        public final HubsImmutableComponentText K() {
            return this.b;
        }

        @Override // defpackage.s81.a
        public s81.a a(List<? extends s81> list) {
            h.e(list, "components");
            if (list.isEmpty()) {
                return this;
            }
            e eVar = new e(this);
            eVar.a(list);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a b(s81... s81Arr) {
            h.e(s81Arr, "components");
            if (s81Arr.length == 0) {
                return this;
            }
            e eVar = new e(this);
            eVar.a(kotlin.collections.d.c(s81Arr));
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a c(p81 p81) {
            h.e(p81, "custom");
            if (p81.keySet().isEmpty()) {
                return this;
            }
            e eVar = new e(this);
            eVar.c(p81);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a d(String str, Serializable serializable) {
            h.e(str, "key");
            if (f91.a(this.f, str, serializable)) {
                return this;
            }
            e eVar = new e(this);
            eVar.d(str, serializable);
            return eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!rw.equal(this.a, cVar.a) || !rw.equal(this.b, cVar.b) || !rw.equal(this.c, cVar.c) || !rw.equal(this.d, cVar.d) || !rw.equal(this.e, cVar.e) || !rw.equal(this.f, cVar.f) || !rw.equal(this.g, cVar.g) || !rw.equal(this.h, cVar.h) || !rw.equal(this.i, cVar.i) || !rw.equal(this.j, cVar.j) || !rw.equal(this.k, cVar.k)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.s81.a
        public s81.a f(String str, o81 o81) {
            h.e(str, "eventName");
            h.e(o81, "command");
            ImmutableMap<String, HubsImmutableCommandModel> immutableMap = this.j;
            h.e(immutableMap, "map");
            if (rw.equal(o81, immutableMap.get(str))) {
                return this;
            }
            e eVar = new e(this);
            eVar.f(str, o81);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a g(Map<String, ? extends o81> map) {
            h.e(map, "events");
            if (map.isEmpty()) {
                return this;
            }
            e eVar = new e(this);
            eVar.g(map);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a h(p81 p81) {
            h.e(p81, "logging");
            if (p81.keySet().isEmpty()) {
                return this;
            }
            e eVar = new e(this);
            eVar.h(p81);
            return eVar;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k});
        }

        @Override // defpackage.s81.a
        public s81.a i(String str, Serializable serializable) {
            h.e(str, "key");
            if (f91.a(this.e, str, serializable)) {
                return this;
            }
            e eVar = new e(this);
            eVar.i(str, serializable);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a j(p81 p81) {
            h.e(p81, "metadata");
            if (p81.keySet().isEmpty()) {
                return this;
            }
            e eVar = new e(this);
            eVar.j(p81);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a k(String str, Serializable serializable) {
            h.e(str, "key");
            if (f91.a(this.d, str, serializable)) {
                return this;
            }
            e eVar = new e(this);
            eVar.k(str, serializable);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81 l() {
            return this.l;
        }

        @Override // defpackage.s81.a
        public s81.a m(List<? extends s81> list) {
            if (c.g(this.k, list)) {
                return this;
            }
            e eVar = new e(this);
            eVar.m(list);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a n(q81 q81) {
            boolean z;
            h.e(q81, "componentId");
            HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier = this.a;
            if (hubsImmutableComponentIdentifier == q81) {
                z = true;
            } else {
                if (hubsImmutableComponentIdentifier == null) {
                    HubsImmutableComponentIdentifier.Companion.getClass();
                    hubsImmutableComponentIdentifier = HubsImmutableComponentIdentifier.UNKNOWN;
                }
                z = h.a(hubsImmutableComponentIdentifier, q81);
            }
            if (z) {
                return this;
            }
            e eVar = new e(this);
            eVar.n(q81);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a o(String str, String str2) {
            h.e(str, "componentId");
            h.e(str2, "category");
            return n(HubsImmutableComponentIdentifier.Companion.a(str, str2));
        }

        @Override // defpackage.s81.a
        public s81.a p(p81 p81) {
            if (c.f(this.f, p81)) {
                return this;
            }
            e eVar = new e(this);
            eVar.p(p81);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a q(Map<String, ? extends o81> map) {
            if (c.h(this.j, map)) {
                return this;
            }
            e eVar = new e(this);
            eVar.q(map);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a r(String str) {
            if (rw.equal(this.i, str)) {
                return this;
            }
            e eVar = new e(this);
            eVar.r(str);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a s(String str) {
            if (rw.equal(this.h, str)) {
                return this;
            }
            e eVar = new e(this);
            eVar.s(str);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a u(r81 r81) {
            boolean z;
            r81 r812;
            HubsImmutableComponentImages hubsImmutableComponentImages = this.c;
            if (hubsImmutableComponentImages == r81) {
                z = true;
            } else {
                if (hubsImmutableComponentImages == null) {
                    HubsImmutableComponentImages.Companion.getClass();
                    hubsImmutableComponentImages = HubsImmutableComponentImages.access$getEMPTY$cp();
                }
                if (r81 != null) {
                    r812 = r81;
                } else {
                    HubsImmutableComponentImages.Companion.getClass();
                    r812 = HubsImmutableComponentImages.access$getEMPTY$cp();
                }
                z = h.a(hubsImmutableComponentImages, r812);
            }
            if (z) {
                return this;
            }
            e eVar = new e(this);
            eVar.u(r81);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a v(p81 p81) {
            if (c.f(this.e, p81)) {
                return this;
            }
            e eVar = new e(this);
            eVar.v(p81);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a w(p81 p81) {
            if (c.f(this.d, p81)) {
                return this;
            }
            e eVar = new e(this);
            eVar.w(p81);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a x(a91 a91) {
            if (rw.equal(this.g, a91)) {
                return this;
            }
            e eVar = new e(this);
            eVar.x(a91);
            return eVar;
        }

        @Override // defpackage.s81.a
        public s81.a z(w81 w81) {
            boolean z;
            w81 w812;
            HubsImmutableComponentText hubsImmutableComponentText = this.b;
            if (hubsImmutableComponentText == w81) {
                z = true;
            } else {
                if (hubsImmutableComponentText == null) {
                    HubsImmutableComponentText.Companion.getClass();
                    hubsImmutableComponentText = HubsImmutableComponentText.access$getEMPTY$cp();
                }
                if (w81 != null) {
                    w812 = w81;
                } else {
                    HubsImmutableComponentText.Companion.getClass();
                    w812 = HubsImmutableComponentText.access$getEMPTY$cp();
                }
                z = h.a(hubsImmutableComponentText, w812);
            }
            if (z) {
                return this;
            }
            e eVar = new e(this);
            eVar.z(w81);
            return eVar;
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = bVar.b(null, null, null, null, null, null, null, null, null, null, null);
    }

    protected HubsImmutableComponentModel(HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier, HubsImmutableComponentText hubsImmutableComponentText, HubsImmutableComponentImages hubsImmutableComponentImages, HubsImmutableComponentBundle hubsImmutableComponentBundle, HubsImmutableComponentBundle hubsImmutableComponentBundle2, HubsImmutableComponentBundle hubsImmutableComponentBundle3, HubsImmutableTarget hubsImmutableTarget, String str, String str2, ImmutableMap<String, HubsImmutableCommandModel> immutableMap, ImmutableList<HubsImmutableComponentModel> immutableList) {
        h.e(hubsImmutableComponentIdentifier, "componentId");
        h.e(hubsImmutableComponentText, "text");
        h.e(hubsImmutableComponentImages, "images");
        h.e(hubsImmutableComponentBundle, "metadata");
        h.e(hubsImmutableComponentBundle2, "logging");
        h.e(hubsImmutableComponentBundle3, "custom");
        h.e(immutableMap, "events");
        h.e(immutableList, "children");
        this.impl = new c(this, hubsImmutableComponentIdentifier, hubsImmutableComponentText, hubsImmutableComponentImages, hubsImmutableComponentBundle, hubsImmutableComponentBundle2, hubsImmutableComponentBundle3, hubsImmutableTarget, str, str2, immutableMap, immutableList);
    }

    public static final s81.a builder() {
        return Companion.a();
    }

    public static final HubsImmutableComponentModel create(q81 q81, w81 w81, r81 r81, p81 p81, p81 p812, p81 p813, a91 a91, String str, String str2, Map<String, ? extends o81> map, List<? extends s81> list) {
        return Companion.b(q81, w81, r81, p81, p812, p813, a91, str, str2, map, list);
    }

    public static final HubsImmutableComponentModel empty() {
        Companion.getClass();
        return EMPTY;
    }

    private final int getHashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    public static final HubsImmutableComponentModel immutable(s81 s81) {
        return Companion.c(s81);
    }

    @Override // defpackage.s81
    public List<HubsImmutableComponentModel> childGroup(String str) {
        return v81.b(children(), str);
    }

    @Override // defpackage.s81
    public List<HubsImmutableComponentModel> children() {
        return this.impl.A();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HubsImmutableComponentModel)) {
            return false;
        }
        return rw.equal(this.impl, ((HubsImmutableComponentModel) obj).impl);
    }

    @Override // defpackage.s81
    public Map<String, HubsImmutableCommandModel> events() {
        return this.impl.D();
    }

    public s81 findChildById(String str) {
        return v81.a(children(), str);
    }

    @Override // defpackage.s81
    public String group() {
        return this.impl.E();
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getHashCode();
    }

    @Override // defpackage.s81
    public String id() {
        return this.impl.F();
    }

    @Override // defpackage.s81
    public s81.a toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier;
        boolean z2;
        HubsImmutableComponentText hubsImmutableComponentText;
        HubsImmutableComponentImages hubsImmutableComponentImages;
        HubsImmutableComponentBundle hubsImmutableComponentBundle;
        HubsImmutableComponentBundle hubsImmutableComponentBundle2;
        h.e(parcel, "dest");
        HubsImmutableComponentIdentifier B = this.impl.B();
        boolean z3 = true;
        if (B == null) {
            z = true;
        } else {
            HubsImmutableComponentIdentifier.Companion.getClass();
            z = h.a(B, HubsImmutableComponentIdentifier.UNKNOWN);
        }
        HubsImmutableComponentBundle hubsImmutableComponentBundle3 = null;
        if (z) {
            hubsImmutableComponentIdentifier = null;
        } else {
            hubsImmutableComponentIdentifier = this.impl.B();
        }
        gf0.v(parcel, hubsImmutableComponentIdentifier, i);
        HubsImmutableComponentText K = this.impl.K();
        if (K == null) {
            z2 = true;
        } else {
            HubsImmutableComponentText.Companion.getClass();
            z2 = h.a(K, HubsImmutableComponentText.access$getEMPTY$cp());
        }
        if (z2) {
            hubsImmutableComponentText = null;
        } else {
            hubsImmutableComponentText = this.impl.K();
        }
        gf0.v(parcel, hubsImmutableComponentText, i);
        HubsImmutableComponentImages G = this.impl.G();
        if (G != null) {
            HubsImmutableComponentImages.Companion.getClass();
            z3 = h.a(G, HubsImmutableComponentImages.access$getEMPTY$cp());
        }
        if (z3) {
            hubsImmutableComponentImages = null;
        } else {
            hubsImmutableComponentImages = this.impl.G();
        }
        gf0.v(parcel, hubsImmutableComponentImages, i);
        if (c.f(this.impl.I(), null)) {
            hubsImmutableComponentBundle = null;
        } else {
            hubsImmutableComponentBundle = this.impl.I();
        }
        gf0.v(parcel, hubsImmutableComponentBundle, i);
        if (c.f(this.impl.H(), null)) {
            hubsImmutableComponentBundle2 = null;
        } else {
            hubsImmutableComponentBundle2 = this.impl.H();
        }
        gf0.v(parcel, hubsImmutableComponentBundle2, i);
        if (!c.f(this.impl.C(), null)) {
            hubsImmutableComponentBundle3 = this.impl.C();
        }
        gf0.v(parcel, hubsImmutableComponentBundle3, i);
        gf0.v(parcel, this.impl.J(), i);
        parcel.writeString(this.impl.F());
        parcel.writeString(this.impl.E());
        gf0.r(parcel, this.impl.D(), zf0.c(), zf0.a(), 0);
        c.j(parcel, this.impl.A());
    }

    @Override // defpackage.s81
    public HubsImmutableComponentIdentifier componentId() {
        return this.impl.B();
    }

    @Override // defpackage.s81
    public HubsImmutableComponentBundle custom() {
        return this.impl.C();
    }

    @Override // defpackage.s81
    public HubsImmutableComponentImages images() {
        return this.impl.G();
    }

    @Override // defpackage.s81
    public HubsImmutableComponentBundle logging() {
        return this.impl.H();
    }

    @Override // defpackage.s81
    public HubsImmutableComponentBundle metadata() {
        return this.impl.I();
    }

    @Override // defpackage.s81
    public HubsImmutableTarget target() {
        return this.impl.J();
    }

    @Override // defpackage.s81
    public HubsImmutableComponentText text() {
        return this.impl.K();
    }
}
