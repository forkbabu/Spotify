package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: eh8  reason: default package */
public final class eh8 extends dh8 {
    public static final Parcelable.Creator<eh8> CREATOR = new a();

    /* renamed from: eh8$a */
    static class a implements Parcelable.Creator<eh8> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public eh8 createFromParcel(Parcel parcel) {
            return new eh8(parcel.readInt(), parcel.readFloat());
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public eh8[] newArray(int i) {
            return new eh8[i];
        }
    }

    eh8(int i, float f) {
        super(i, f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeFloat(b());
    }
}
