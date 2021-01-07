package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: ow  reason: default package */
public final class ow implements Parcelable.Creator<nw> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final nw createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 8:
                    str6 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 9:
                    b = SafeParcelReader.p(parcel, readInt);
                    break;
                case 10:
                    b2 = SafeParcelReader.p(parcel, readInt);
                    break;
                case 11:
                    b3 = SafeParcelReader.p(parcel, readInt);
                    break;
                case 12:
                    b4 = SafeParcelReader.p(parcel, readInt);
                    break;
                case 13:
                    str7 = SafeParcelReader.g(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        return new nw(i, str, str2, str3, str4, str5, str6, b, b2, b3, b4, str7);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ nw[] newArray(int i) {
        return new nw[i];
    }
}
