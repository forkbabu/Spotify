package com.google.android.gms.cast;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.util.g;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new l1();
    private float a;
    private int b;
    private int c;
    private int f;
    private int n;
    private int o;
    private int p;
    private int q;
    private String r;
    private int s;
    private int t;
    private String u;
    private JSONObject v;

    p(float f2, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f2;
        this.b = i;
        this.c = i2;
        this.f = i3;
        this.n = i4;
        this.o = i5;
        this.p = i6;
        this.q = i7;
        this.r = str;
        this.s = i8;
        this.t = i9;
        this.u = str2;
        if (str2 != null) {
            try {
                this.v = new JSONObject(this.u);
            } catch (JSONException unused) {
                this.v = null;
                this.u = null;
            }
        } else {
            this.v = null;
        }
    }

    private static int Q1(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public final void I1(JSONObject jSONObject) {
        this.a = (float) jSONObject.optDouble("fontScale", 1.0d);
        this.b = Q1(jSONObject.optString("foregroundColor"));
        this.c = Q1(jSONObject.optString("backgroundColor"));
        if (jSONObject.has("edgeType")) {
            String string = jSONObject.getString("edgeType");
            if ("NONE".equals(string)) {
                this.f = 0;
            } else if ("OUTLINE".equals(string)) {
                this.f = 1;
            } else if ("DROP_SHADOW".equals(string)) {
                this.f = 2;
            } else if ("RAISED".equals(string)) {
                this.f = 3;
            } else if ("DEPRESSED".equals(string)) {
                this.f = 4;
            }
        }
        this.n = Q1(jSONObject.optString("edgeColor"));
        if (jSONObject.has("windowType")) {
            String string2 = jSONObject.getString("windowType");
            if ("NONE".equals(string2)) {
                this.o = 0;
            } else if ("NORMAL".equals(string2)) {
                this.o = 1;
            } else if ("ROUNDED_CORNERS".equals(string2)) {
                this.o = 2;
            }
        }
        this.p = Q1(jSONObject.optString("windowColor"));
        if (this.o == 2) {
            this.q = jSONObject.optInt("windowRoundedCornerRadius", 0);
        }
        this.r = jSONObject.optString("fontFamily", null);
        if (jSONObject.has("fontGenericFamily")) {
            String string3 = jSONObject.getString("fontGenericFamily");
            if ("SANS_SERIF".equals(string3)) {
                this.s = 0;
            } else if ("MONOSPACED_SANS_SERIF".equals(string3)) {
                this.s = 1;
            } else if ("SERIF".equals(string3)) {
                this.s = 2;
            } else if ("MONOSPACED_SERIF".equals(string3)) {
                this.s = 3;
            } else if ("CASUAL".equals(string3)) {
                this.s = 4;
            } else if ("CURSIVE".equals(string3)) {
                this.s = 5;
            } else if ("SMALL_CAPITALS".equals(string3)) {
                this.s = 6;
            }
        }
        if (jSONObject.has("fontStyle")) {
            String string4 = jSONObject.getString("fontStyle");
            if ("NORMAL".equals(string4)) {
                this.t = 0;
            } else if ("BOLD".equals(string4)) {
                this.t = 1;
            } else if ("ITALIC".equals(string4)) {
                this.t = 2;
            } else if ("BOLD_ITALIC".equals(string4)) {
                this.t = 3;
            }
        }
        this.v = jSONObject.optJSONObject("customData");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        JSONObject jSONObject = this.v;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = pVar.v;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || g.a(jSONObject, jSONObject2)) && this.a == pVar.a && this.b == pVar.b && this.c == pVar.c && this.f == pVar.f && this.n == pVar.n && this.o == pVar.o && this.q == pVar.q && com.google.android.gms.cast.internal.a.d(this.r, pVar.r) && this.s == pVar.s && this.t == pVar.t;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.n), Integer.valueOf(this.o), Integer.valueOf(this.p), Integer.valueOf(this.q), this.r, Integer.valueOf(this.s), Integer.valueOf(this.t), String.valueOf(this.v)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.v;
        this.u = jSONObject == null ? null : jSONObject.toString();
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.J(parcel, 2, this.a);
        SafeParcelReader.M(parcel, 3, this.b);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.M(parcel, 5, this.f);
        SafeParcelReader.M(parcel, 6, this.n);
        SafeParcelReader.M(parcel, 7, this.o);
        SafeParcelReader.M(parcel, 8, this.p);
        SafeParcelReader.M(parcel, 9, this.q);
        SafeParcelReader.T(parcel, 10, this.r, false);
        SafeParcelReader.M(parcel, 11, this.s);
        SafeParcelReader.M(parcel, 12, this.t);
        SafeParcelReader.T(parcel, 13, this.u, false);
        SafeParcelReader.m(parcel, a2);
    }

    public p() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }
}
