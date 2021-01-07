package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

public final class d implements Parcelable.Creator<SaveAccountLinkingTokenRequest> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final SaveAccountLinkingTokenRequest createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ArrayList<String> arrayList = null;
        String str3 = null;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                pendingIntent = (PendingIntent) SafeParcelReader.f(parcel, readInt, PendingIntent.CREATOR);
            } else if (i == 2) {
                str = SafeParcelReader.g(parcel, readInt);
            } else if (i == 3) {
                str2 = SafeParcelReader.g(parcel, readInt);
            } else if (i == 4) {
                arrayList = SafeParcelReader.i(parcel, readInt);
            } else if (i != 5) {
                SafeParcelReader.A(parcel, readInt);
            } else {
                str3 = SafeParcelReader.g(parcel, readInt);
            }
        }
        SafeParcelReader.l(parcel, B);
        return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SaveAccountLinkingTokenRequest[] newArray(int i) {
        return new SaveAccountLinkingTokenRequest[i];
    }
}
