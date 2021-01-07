package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: xj1  reason: default package */
public class xj1 extends wj1 {
    public static final Parcelable.Creator<xj1> CREATOR = new a();
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final String o;
    private final String p;
    private final int q;

    /* renamed from: xj1$a */
    static class a implements Parcelable.Creator<xj1> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public xj1 createFromParcel(Parcel parcel) {
            return new xj1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public xj1[] newArray(int i) {
            return new xj1[i];
        }
    }

    public xj1(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        super(str6);
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.n = str4;
        this.o = str5;
        this.p = str7;
        this.q = i;
    }

    public String a() {
        return this.n;
    }

    public String b() {
        return this.o;
    }

    public String c() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(getUri());
        parcel.writeString(this.p);
        parcel.writeInt(this.q);
    }
}
