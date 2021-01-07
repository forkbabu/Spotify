package com.spotify.music.util.filterheader;

import android.os.Parcel;
import android.os.Parcelable;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    private AbstractC0352b a;
    private boolean b;
    private final int c;
    private int f;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    /* renamed from: com.spotify.music.util.filterheader.b$b  reason: collision with other inner class name */
    public interface AbstractC0352b {
        void a(b bVar);
    }

    public b(AbstractC0352b bVar, int i) {
        this.a = bVar;
        this.c = i;
        this.b = false;
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
        this.b = !this.b;
        this.a.a(this);
    }

    public void f(boolean z) {
        this.b = z;
    }

    public b g(int i) {
        this.f = i;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f);
    }

    protected b(Parcel parcel) {
        this.b = parcel.readInt() != 0;
        this.c = parcel.readInt();
        this.f = parcel.readInt();
    }
}
