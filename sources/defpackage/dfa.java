package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: dfa  reason: default package */
public class dfa implements Parcelable {
    public static final Parcelable.Creator<dfa> CREATOR = new a();
    private final String a;
    private final Parcelable b;

    /* renamed from: dfa$a */
    static class a implements Parcelable.Creator<dfa> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public dfa createFromParcel(Parcel parcel) {
            return new dfa(parcel.readString(), parcel.readParcelable(dfa.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public dfa[] newArray(int i) {
            return new dfa[i];
        }
    }

    public dfa(String str, Parcelable parcelable) {
        str.getClass();
        this.a = str;
        this.b = parcelable;
    }

    public String a() {
        return this.a;
    }

    public Parcelable b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
