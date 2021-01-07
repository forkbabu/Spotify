package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new n1();
    private static final b f = new b("VideoInfo");
    private int a;
    private int b;
    private int c;

    r(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    static r I1(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("hdrType");
            char c2 = 65535;
            int hashCode = string.hashCode();
            int i = 3;
            if (hashCode != 3218) {
                if (hashCode != 103158) {
                    if (hashCode != 113729) {
                        if (hashCode == 99136405) {
                            if (string.equals("hdr10")) {
                                c2 = 1;
                            }
                        }
                    } else if (string.equals("sdr")) {
                        c2 = 3;
                    }
                } else if (string.equals("hdr")) {
                    c2 = 2;
                }
            } else if (string.equals("dv")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    i = 2;
                } else if (c2 == 2) {
                    i = 4;
                } else if (c2 != 3) {
                    f.a("Unknown HDR type: %s", string);
                    i = 0;
                } else {
                    i = 1;
                }
            }
            return new r(jSONObject.getInt("width"), jSONObject.getInt("height"), i);
        } catch (JSONException e) {
            f.a("Error while creating a VideoInfo instance from JSON: %s", e.getMessage());
            return null;
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.b == rVar.b && this.a == rVar.a && this.c == rVar.c;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 2, this.a);
        SafeParcelReader.M(parcel, 3, this.b);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.m(parcel, a2);
    }
}
