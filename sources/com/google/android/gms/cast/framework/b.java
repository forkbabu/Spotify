package com.google.android.gms.cast.framework;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.a;
import com.google.android.gms.cast.h;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.cast.zzen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<b> CREATOR = new u();
    private String a;
    private final List<String> b;
    private boolean c;
    private h f;
    private final boolean n;
    private final com.google.android.gms.cast.framework.media.a o;
    private final boolean p;
    private final double q;
    private final boolean r;

    public static final class a {
        private String a;
        private List<String> b = new ArrayList();
        private boolean c;
        private h d = new h();
        private boolean e = true;
        private zzen<com.google.android.gms.cast.framework.media.a> f = null;
        private boolean g = true;
        private double h = 0.05000000074505806d;

        public final b a() {
            com.google.android.gms.cast.framework.media.a aVar;
            zzen<com.google.android.gms.cast.framework.media.a> zzen = this.f;
            if (zzen != null) {
                aVar = zzen.b();
            } else {
                aVar = new a.C0092a().a();
            }
            return new b(this.a, this.b, this.c, this.d, this.e, aVar, this.g, this.h, false);
        }

        public final a b(com.google.android.gms.cast.framework.media.a aVar) {
            this.f = zzen.a(null);
            return this;
        }

        public final a c(boolean z) {
            this.g = z;
            return this;
        }

        public final a d(h hVar) {
            this.d = hVar;
            return this;
        }

        public final a e(String str) {
            this.a = str;
            return this;
        }

        public final a f(boolean z) {
            this.e = z;
            return this;
        }

        public final a g(boolean z) {
            this.c = z;
            return this;
        }
    }

    b(String str, List<String> list, boolean z, h hVar, boolean z2, com.google.android.gms.cast.framework.media.a aVar, boolean z3, double d, boolean z4) {
        int i;
        this.a = TextUtils.isEmpty(str) ? "" : str;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        ArrayList arrayList = new ArrayList(i);
        this.b = arrayList;
        if (i > 0) {
            arrayList.addAll(list);
        }
        this.c = z;
        this.f = hVar == null ? new h() : hVar;
        this.n = z2;
        this.o = aVar;
        this.p = z3;
        this.q = d;
        this.r = z4;
    }

    public com.google.android.gms.cast.framework.media.a I1() {
        return this.o;
    }

    public boolean Q1() {
        return this.p;
    }

    public String o2() {
        return this.a;
    }

    public boolean p2() {
        return this.n;
    }

    public List<String> q2() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.V(parcel, 3, q2(), false);
        SafeParcelReader.C(parcel, 4, this.c);
        SafeParcelReader.S(parcel, 5, this.f, i, false);
        SafeParcelReader.C(parcel, 6, this.n);
        SafeParcelReader.S(parcel, 7, this.o, i, false);
        SafeParcelReader.C(parcel, 8, this.p);
        SafeParcelReader.H(parcel, 9, this.q);
        SafeParcelReader.C(parcel, 10, this.r);
        SafeParcelReader.m(parcel, a2);
    }
}
