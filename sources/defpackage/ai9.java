package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import defpackage.di9;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: ai9  reason: default package */
final class ai9 extends sh9 {
    public static final Parcelable.Creator<ai9> CREATOR = new a();
    private static final di9.e r = new di9.e();
    private static final di9.c s = new di9.c();

    /* renamed from: ai9$a */
    static class a implements Parcelable.Creator<ai9> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public ai9 createFromParcel(Parcel parcel) {
            di9.e unused = ai9.r;
            ArrayList arrayList = new ArrayList();
            parcel.readTypedList(arrayList, ci9.CREATOR);
            ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() == 1;
            if (parcel.readInt() != 1) {
                z = false;
            }
            di9.c unused2 = ai9.s;
            ArrayList arrayList2 = new ArrayList();
            parcel.readTypedList(arrayList2, new ei9());
            return new ai9(copyOf, readString, readString2, readString3, z2, z, ImmutableList.copyOf((Collection) arrayList2));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public ai9[] newArray(int i) {
            return new ai9[i];
        }
    }

    ai9(ImmutableList<di9.d> immutableList, String str, String str2, String str3, boolean z, boolean z2, ImmutableList<di9.b> immutableList2) {
        super(immutableList, str, str2, str3, z, z2, immutableList2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(h());
        parcel.writeString(f());
        parcel.writeString(g());
        parcel.writeString(i());
        parcel.writeInt(e() ? 1 : 0);
        parcel.writeInt(c() ? 1 : 0);
        parcel.writeTypedList(b());
    }
}
