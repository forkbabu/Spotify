package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* access modifiers changed from: package-private */
public final class o implements Comparable<o>, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();
    private final Calendar a;
    private final String b;
    final int c;
    final int f;
    final int n;
    final int o;
    final long p;

    static class a implements Parcelable.Creator<o> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public o createFromParcel(Parcel parcel) {
            return o.h(parcel.readInt(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public o[] newArray(int i) {
            return new o[i];
        }
    }

    private o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = v.b(calendar);
        this.a = b2;
        this.c = b2.get(2);
        this.f = b2.get(1);
        this.n = b2.getMaximum(7);
        this.o = b2.getActualMaximum(5);
        this.b = v.h().format(b2.getTime());
        this.p = b2.getTimeInMillis();
    }

    static o h(int i, int i2) {
        Calendar f2 = v.f();
        f2.set(1, i);
        f2.set(2, i2);
        return new o(f2);
    }

    static o i(long j) {
        Calendar f2 = v.f();
        f2.setTimeInMillis(j);
        return new o(f2);
    }

    static o k() {
        return new o(v.e());
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
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.c == oVar.c && this.f == oVar.f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int compareTo(o oVar) {
        return this.a.compareTo(oVar.a);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.f)});
    }

    /* access modifiers changed from: package-private */
    public int l() {
        int firstDayOfWeek = this.a.get(7) - this.a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.n : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    public long m(int i) {
        Calendar b2 = v.b(this.a);
        b2.set(5, i);
        return b2.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public String n() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public long p() {
        return this.a.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    public o q(int i) {
        Calendar b2 = v.b(this.a);
        b2.add(2, i);
        return new o(b2);
    }

    /* access modifiers changed from: package-private */
    public int r(o oVar) {
        if (this.a instanceof GregorianCalendar) {
            return (oVar.c - this.c) + ((oVar.f - this.f) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
        parcel.writeInt(this.c);
    }
}
