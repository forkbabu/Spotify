package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0107a();
    private final o a;
    private final o b;
    private final o c;
    private final c f;
    private final int n;
    private final int o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    public static class C0107a implements Parcelable.Creator<a> {
        C0107a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a((o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (o) parcel.readParcelable(o.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public static final class b {
        static final long e = v.a(o.h(1900, 0).p);
        static final long f = v.a(o.h(2100, 11).p);
        private long a = e;
        private long b = f;
        private Long c;
        private c d = e.a(Long.MIN_VALUE);

        b(a aVar) {
            this.a = aVar.a.p;
            this.b = aVar.b.p;
            this.c = Long.valueOf(aVar.c.p);
            this.d = aVar.f;
        }

        public a a() {
            if (this.c == null) {
                int i = MaterialDatePicker.L0;
                long j = o.k().p;
                long j2 = this.a;
                if (j2 > j || j > this.b) {
                    j = j2;
                }
                this.c = Long.valueOf(j);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.d);
            return new a(o.i(this.a), o.i(this.b), o.i(this.c.longValue()), (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean s0(long j);
    }

    a(o oVar, o oVar2, o oVar3, c cVar, C0107a aVar) {
        this.a = oVar;
        this.b = oVar2;
        this.c = oVar3;
        this.f = cVar;
        if (oVar.compareTo(oVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (oVar3.compareTo(oVar2) <= 0) {
            this.o = oVar.r(oVar2) + 1;
            this.n = (oVar2.f - oVar.f) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b) || !this.c.equals(aVar.c) || !this.f.equals(aVar.f)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public o f(o oVar) {
        if (oVar.compareTo(this.a) < 0) {
            return this.a;
        }
        return oVar.compareTo(this.b) > 0 ? this.b : oVar;
    }

    public c g() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public o h() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.f});
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.o;
    }

    /* access modifiers changed from: package-private */
    public o j() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public o k() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.f, 0);
    }
}
