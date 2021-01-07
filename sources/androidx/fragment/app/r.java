package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();
    ArrayList<u> a;
    ArrayList<String> b;
    b[] c;
    int f;
    String n = null;

    static class a implements Parcelable.Creator<r> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public r[] newArray(int i) {
            return new r[i];
        }
    }

    public r() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.f);
        parcel.writeString(this.n);
    }

    public r(Parcel parcel) {
        this.a = parcel.createTypedArrayList(u.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f = parcel.readInt();
        this.n = parcel.readString();
    }
}
