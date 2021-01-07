package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ifd  reason: default package */
public class ifd implements Parcelable {
    public static final Parcelable.Creator<ifd> CREATOR = new a();
    private final String a;

    /* renamed from: ifd$a */
    static class a implements Parcelable.Creator<ifd> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ifd createFromParcel(Parcel parcel) {
            return new ifd(parcel.readString());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ifd[] newArray(int i) {
            return new ifd[i];
        }
    }

    /* renamed from: ifd$b */
    public interface b {
        ifd z1();
    }

    public ifd(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ifd) && getName().equals(((ifd) obj).getName());
    }

    public String getName() {
        return this.a;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return getName().hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
