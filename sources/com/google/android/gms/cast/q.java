package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;
import org.json.JSONObject;

public class q extends a {
    public static final Parcelable.Creator<q> CREATOR = new m1();
    private final String a;
    private final String b;

    q(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static q I1(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new q(jSONObject.optString("adTagUrl", null), jSONObject.optString("adsResponse", null));
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return com.google.android.gms.cast.internal.a.d(this.a, qVar.a) && com.google.android.gms.cast.internal.a.d(this.b, qVar.b);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.m(parcel, a2);
    }
}
