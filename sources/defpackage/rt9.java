package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rt9  reason: default package */
public class rt9 implements Parcelable {
    public static final Parcelable.Creator<rt9> CREATOR = new a();
    private String a;
    private String b;
    private String c = "Home Thing";
    private String f;
    private String n;

    /* renamed from: rt9$a */
    static class a implements Parcelable.Creator<rt9> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public rt9 createFromParcel(Parcel parcel) {
            return new rt9(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public rt9[] newArray(int i) {
            return new rt9[i];
        }
    }

    public rt9() {
    }

    public String a() {
        return this.n;
    }

    public String b() {
        return String.format("ssid:%s\npw:%s\nthingname:%s\ntoken:%s", this.a, this.b, this.c, this.f);
    }

    public String c() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.a;
    }

    public void f(String str) {
        this.f = str;
    }

    public void g(String str) {
        this.n = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
    }

    protected rt9(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.f = parcel.readString();
        this.n = parcel.readString();
    }
}
