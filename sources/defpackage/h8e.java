package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: h8e  reason: default package */
public final class h8e extends e8e {
    public static final Parcelable.Creator<h8e> CREATOR = new a();

    /* renamed from: h8e$a */
    static class a implements Parcelable.Creator<h8e> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public h8e createFromParcel(Parcel parcel) {
            return new h8e(parcel.readArrayList(k8e.class.getClassLoader()));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public h8e[] newArray(int i) {
            return new h8e[i];
        }
    }

    h8e(List<String> list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(b());
    }
}
