package com.spotify.mobile.android.hubframework.model.immutable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import defpackage.b91;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

public class HubsImmutableViewModel implements b91, Parcelable {
    public static final Parcelable.Creator<HubsImmutableViewModel> CREATOR = new a();
    public static final b Companion;
    public static final HubsImmutableViewModel EMPTY;
    private final d hashCode$delegate = kotlin.a.b(new HubsImmutableViewModel$hashCode$2(this));
    private final c impl;

    public static final class a implements Parcelable.Creator<HubsImmutableViewModel> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableViewModel createFromParcel(Parcel parcel) {
            h.e(parcel, "in");
            return new HubsImmutableViewModel(parcel.readString(), parcel.readString(), (HubsImmutableComponentModel) gf0.n(parcel, HubsImmutableComponentModel.CREATOR), c.i(parcel), c.i(parcel), parcel.readString(), HubsImmutableComponentBundle.Companion.c((p81) gf0.n(parcel, HubsImmutableComponentBundle.CREATOR)));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public HubsImmutableViewModel[] newArray(int i) {
            return new HubsImmutableViewModel[i];
        }
    }

    public static final class b {
        public b(f fVar) {
        }

        public final b91.a a() {
            return HubsImmutableViewModel.EMPTY.toBuilder();
        }

        public final HubsImmutableViewModel b(String str, String str2, s81 s81, List<? extends s81> list, List<? extends s81> list2, String str3, p81 p81) {
            HubsImmutableComponentModel hubsImmutableComponentModel;
            if (s81 == null) {
                hubsImmutableComponentModel = null;
            } else {
                hubsImmutableComponentModel = HubsImmutableComponentModel.Companion.c(s81);
            }
            return new HubsImmutableViewModel(str, str2, hubsImmutableComponentModel, c.c(list), c.c(list2), str3, HubsImmutableComponentBundle.Companion.c(p81));
        }

        public final HubsImmutableViewModel c(b91 b91) {
            h.e(b91, "other");
            if (b91 instanceof HubsImmutableViewModel) {
                return (HubsImmutableViewModel) b91;
            }
            return b(b91.id(), b91.title(), b91.header(), b91.body(), b91.overlays(), b91.extension(), b91.custom());
        }
    }

    /* access modifiers changed from: private */
    public final class c extends b91.a {
        private final String a;
        private final String b;
        private final HubsImmutableComponentModel c;
        private final ImmutableList<HubsImmutableComponentModel> d;
        private final ImmutableList<HubsImmutableComponentModel> e;
        private final String f;
        private final HubsImmutableComponentBundle g;
        final /* synthetic */ HubsImmutableViewModel h;

        public c(HubsImmutableViewModel hubsImmutableViewModel, String str, String str2, HubsImmutableComponentModel hubsImmutableComponentModel, ImmutableList<HubsImmutableComponentModel> immutableList, ImmutableList<HubsImmutableComponentModel> immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
            h.e(immutableList, "body");
            h.e(immutableList2, "overlays");
            h.e(hubsImmutableComponentBundle, "custom");
            this.h = hubsImmutableViewModel;
            this.a = str;
            this.b = str2;
            this.c = hubsImmutableComponentModel;
            this.d = immutableList;
            this.e = immutableList2;
            this.f = str3;
            this.g = hubsImmutableComponentBundle;
        }

        @Override // defpackage.b91.a
        public b91.a a(List<? extends s81> list) {
            h.e(list, "components");
            if (list.isEmpty()) {
                return this;
            }
            h hVar = new h(this);
            hVar.a(list);
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91.a b(s81... s81Arr) {
            h.e(s81Arr, "components");
            if (s81Arr.length == 0) {
                return this;
            }
            h hVar = new h(this);
            hVar.a(kotlin.collections.d.c(s81Arr));
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91.a c(p81 p81) {
            h.e(p81, "custom");
            if (p81.keySet().isEmpty()) {
                return this;
            }
            h hVar = new h(this);
            hVar.c(p81);
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91.a d(String str, Serializable serializable) {
            h.e(str, "key");
            if (f91.a(this.g, str, serializable)) {
                return this;
            }
            h hVar = new h(this);
            hVar.d(str, serializable);
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91.a e(List<? extends s81> list) {
            if (c.g(this.d, list)) {
                return this;
            }
            h hVar = new h(this);
            hVar.e(list);
            return hVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!rw.equal(this.a, cVar.a) || !rw.equal(this.b, cVar.b) || !rw.equal(this.c, cVar.c) || !rw.equal(this.d, cVar.d) || !rw.equal(this.e, cVar.e) || !rw.equal(this.f, cVar.f) || !rw.equal(this.g, cVar.g)) {
                return false;
            }
            return true;
        }

        @Override // defpackage.b91.a
        public b91.a f(s81... s81Arr) {
            h.e(s81Arr, "components");
            if (s81Arr.length == 0) {
                return e(ImmutableList.of());
            }
            h hVar = new h(this);
            hVar.e(kotlin.collections.d.c(s81Arr));
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91 g() {
            return this.h;
        }

        @Override // defpackage.b91.a
        public b91.a h(p81 p81) {
            if (c.f(this.g, p81)) {
                return this;
            }
            h hVar = new h(this);
            hVar.h(p81);
            return hVar;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
        }

        @Override // defpackage.b91.a
        public b91.a i(String str) {
            if (rw.equal(this.f, str)) {
                return this;
            }
            h hVar = new h(this);
            hVar.i(str);
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91.a j(s81 s81) {
            if (c.d(this.c, s81)) {
                return this;
            }
            h hVar = new h(this);
            hVar.j(s81);
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91.a k(String str) {
            if (rw.equal(this.a, str)) {
                return this;
            }
            h hVar = new h(this);
            hVar.k(str);
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91.a l(s81... s81Arr) {
            h.e(s81Arr, "components");
            if (s81Arr.length == 0) {
                return u(ImmutableList.of());
            }
            h hVar = new h(this);
            hVar.n(kotlin.collections.d.c(s81Arr));
            return hVar;
        }

        @Override // defpackage.b91.a
        public b91.a m(String str) {
            if (rw.equal(this.b, str)) {
                return this;
            }
            h hVar = new h(this);
            hVar.m(str);
            return hVar;
        }

        public final ImmutableList<HubsImmutableComponentModel> n() {
            return this.d;
        }

        public final HubsImmutableComponentBundle o() {
            return this.g;
        }

        public final String p() {
            return this.f;
        }

        public final HubsImmutableComponentModel q() {
            return this.c;
        }

        public final String r() {
            return this.a;
        }

        public final ImmutableList<HubsImmutableComponentModel> s() {
            return this.e;
        }

        public final String t() {
            return this.b;
        }

        public b91.a u(List<? extends s81> list) {
            if (c.g(this.e, list)) {
                return this;
            }
            h hVar = new h(this);
            hVar.n(list);
            return hVar;
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = bVar.b(null, null, null, null, null, null, null);
    }

    protected HubsImmutableViewModel(String str, String str2, HubsImmutableComponentModel hubsImmutableComponentModel, ImmutableList<HubsImmutableComponentModel> immutableList, ImmutableList<HubsImmutableComponentModel> immutableList2, String str3, HubsImmutableComponentBundle hubsImmutableComponentBundle) {
        h.e(immutableList, "body");
        h.e(immutableList2, "overlays");
        h.e(hubsImmutableComponentBundle, "custom");
        this.impl = new c(this, str, str2, hubsImmutableComponentModel, immutableList, immutableList2, str3, hubsImmutableComponentBundle);
    }

    public static final b91.a builder() {
        return Companion.a();
    }

    public static final HubsImmutableViewModel create(String str, String str2, s81 s81, List<? extends s81> list, List<? extends s81> list2, String str3, p81 p81) {
        return Companion.b(str, str2, s81, list, list2, str3, p81);
    }

    private final int getHashCode() {
        return ((Number) this.hashCode$delegate.getValue()).intValue();
    }

    public static final HubsImmutableViewModel immutable(b91 b91) {
        return Companion.c(b91);
    }

    @Override // defpackage.b91
    public List<HubsImmutableComponentModel> body() {
        return this.impl.n();
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
        if (!(obj instanceof HubsImmutableViewModel)) {
            return false;
        }
        return rw.equal(this.impl, ((HubsImmutableViewModel) obj).impl);
    }

    @Override // defpackage.b91
    public String extension() {
        return this.impl.p();
    }

    @Override // java.lang.Object
    public int hashCode() {
        return getHashCode();
    }

    @Override // defpackage.b91
    public String id() {
        return this.impl.r();
    }

    @Override // defpackage.b91
    public List<HubsImmutableComponentModel> overlays() {
        return this.impl.s();
    }

    @Override // defpackage.b91
    public String title() {
        return this.impl.t();
    }

    @Override // defpackage.b91
    public b91.a toBuilder() {
        return this.impl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        h.e(parcel, "dest");
        parcel.writeString(this.impl.r());
        parcel.writeString(this.impl.t());
        HubsImmutableComponentBundle hubsImmutableComponentBundle = null;
        gf0.v(parcel, c.d(this.impl.q(), null) ? null : this.impl.q(), i);
        c.j(parcel, this.impl.n());
        c.j(parcel, this.impl.s());
        parcel.writeString(this.impl.p());
        if (!c.f(this.impl.o(), null)) {
            hubsImmutableComponentBundle = this.impl.o();
        }
        gf0.v(parcel, hubsImmutableComponentBundle, i);
    }

    @Override // defpackage.b91
    public HubsImmutableComponentBundle custom() {
        return this.impl.o();
    }

    @Override // defpackage.b91
    public HubsImmutableComponentModel header() {
        return this.impl.q();
    }
}
