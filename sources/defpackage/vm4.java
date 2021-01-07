package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: vm4  reason: default package */
public class vm4 implements Parcelable {
    public static final Parcelable.Creator<vm4> CREATOR = new a();
    private final String a;
    private final String b;
    private final String c;
    private final Uri f;
    private final Uri n;

    /* renamed from: vm4$a */
    static class a implements Parcelable.Creator<vm4> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public vm4 createFromParcel(Parcel parcel) {
            return new vm4(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public vm4[] newArray(int i) {
            return new vm4[i];
        }
    }

    public vm4(String str, String str2, String str3, Uri uri, Uri uri2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = uri;
        this.n = uri2;
    }

    public Uri a() {
        return this.f;
    }

    public Uri b() {
        return this.n;
    }

    public String c() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Uri.writeToParcel(parcel, this.f);
        Uri.writeToParcel(parcel, this.n);
    }

    public vm4(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.f = (Uri) Uri.CREATOR.createFromParcel(parcel);
        this.n = (Uri) Uri.CREATOR.createFromParcel(parcel);
    }
}
