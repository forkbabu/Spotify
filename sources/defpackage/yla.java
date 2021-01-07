package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yla  reason: default package */
public final class yla implements Parcelable {
    public static final Parcelable.Creator<yla> CREATOR = new a();
    private final String a;
    private final String b;
    private final long c;

    /* renamed from: yla$a */
    static class a implements Parcelable.Creator<yla> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public yla createFromParcel(Parcel parcel) {
            return new yla(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public yla[] newArray(int i) {
            return new yla[i];
        }
    }

    public yla(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
    }

    yla(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readLong();
    }
}
