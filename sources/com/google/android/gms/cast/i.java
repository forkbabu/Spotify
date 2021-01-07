package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new z0();
    private static final b n = new b("MediaLiveSeekableRange");
    private final long a;
    private final long b;
    private final boolean c;
    private final boolean f;

    i(long j, long j2, boolean z, boolean z2) {
        this.a = Math.max(j, 0L);
        this.b = Math.max(j2, 0L);
        this.c = z;
        this.f = z2;
    }

    static i q2(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("start") && jSONObject.has("end")) {
            try {
                return new i(com.google.android.gms.cast.internal.a.b(jSONObject.getDouble("start")), com.google.android.gms.cast.internal.a.b(jSONObject.getDouble("end")), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                b bVar = n;
                String valueOf = String.valueOf(jSONObject);
                bVar.c(je.i0(valueOf.length() + 43, "Ignoring Malformed MediaLiveSeekableRange: ", valueOf), new Object[0]);
            }
        }
        return null;
    }

    public long I1() {
        return this.b;
    }

    public long Q1() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && this.c == iVar.c && this.f == iVar.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.f)});
    }

    public boolean o2() {
        return this.f;
    }

    public boolean p2() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.P(parcel, 2, this.a);
        SafeParcelReader.P(parcel, 3, this.b);
        SafeParcelReader.C(parcel, 4, this.c);
        SafeParcelReader.C(parcel, 5, this.f);
        SafeParcelReader.m(parcel, a2);
    }
}
