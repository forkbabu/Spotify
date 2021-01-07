package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new j1();
    private static final b o = new b("AdBreakStatus");
    private final long a;
    private final long b;
    private final String c;
    private final String f;
    private final long n;

    c(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.f = str2;
        this.n = j3;
    }

    static c I1(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long b2 = com.google.android.gms.cast.internal.a.b((double) jSONObject.getLong("currentBreakTime"));
                long b3 = com.google.android.gms.cast.internal.a.b((double) jSONObject.getLong("currentBreakClipTime"));
                String optString = jSONObject.optString("breakId", null);
                String optString2 = jSONObject.optString("breakClipId", null);
                long optLong = jSONObject.optLong("whenSkippable", -1);
                return new c(b2, b3, optString, optString2, optLong != -1 ? com.google.android.gms.cast.internal.a.b((double) optLong) : optLong);
            } catch (JSONException e) {
                o.d(e, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && com.google.android.gms.cast.internal.a.d(this.c, cVar.c) && com.google.android.gms.cast.internal.a.d(this.f, cVar.f) && this.n == cVar.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.f, Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.P(parcel, 2, this.a);
        SafeParcelReader.P(parcel, 3, this.b);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.P(parcel, 6, this.n);
        SafeParcelReader.m(parcel, a2);
    }
}
