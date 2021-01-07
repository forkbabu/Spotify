package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class i1 implements Parcelable.Creator<MediaTrack> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final MediaTrack createFromParcel(Parcel parcel) {
        JSONObject jSONObject;
        int B = SafeParcelReader.B(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList<String> arrayList = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    j = SafeParcelReader.x(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.v(parcel, readInt);
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
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 9:
                    arrayList = SafeParcelReader.i(parcel, readInt);
                    break;
                case 10:
                    str = SafeParcelReader.g(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.l(parcel, B);
        int i3 = a.b;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
            return new MediaTrack(j, i, str2, str3, str4, str5, i2, arrayList, jSONObject);
        }
        jSONObject = null;
        return new MediaTrack(j, i, str2, str3, str4, str5, i2, arrayList, jSONObject);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaTrack[] newArray(int i) {
        return new MediaTrack[i];
    }
}
