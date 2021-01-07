package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<a> CREATOR = new s();
    private final String a;
    private final String b;
    private final long c;
    private final String f;
    private final String n;
    private final String o;
    private String p;
    private String q;
    private String r;
    private final long s;
    private final String t;
    private final q u;
    private JSONObject v;

    a(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, q qVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.f = str3;
        this.n = str4;
        this.o = str5;
        this.p = str6;
        this.q = str7;
        this.r = str8;
        this.s = j2;
        this.t = str9;
        this.u = qVar;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.v = new JSONObject(str6);
            } catch (JSONException e) {
                String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage());
                this.p = null;
                this.v = new JSONObject();
            }
        } else {
            this.v = new JSONObject();
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return com.google.android.gms.cast.internal.a.d(this.a, aVar.a) && com.google.android.gms.cast.internal.a.d(this.b, aVar.b) && this.c == aVar.c && com.google.android.gms.cast.internal.a.d(this.f, aVar.f) && com.google.android.gms.cast.internal.a.d(this.n, aVar.n) && com.google.android.gms.cast.internal.a.d(this.o, aVar.o) && com.google.android.gms.cast.internal.a.d(this.p, aVar.p) && com.google.android.gms.cast.internal.a.d(this.q, aVar.q) && com.google.android.gms.cast.internal.a.d(this.r, aVar.r) && this.s == aVar.s && com.google.android.gms.cast.internal.a.d(this.t, aVar.t) && com.google.android.gms.cast.internal.a.d(this.u, aVar.u);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.f, this.n, this.o, this.p, this.q, this.r, Long.valueOf(this.s), this.t, this.u});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.P(parcel, 4, this.c);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.T(parcel, 6, this.n, false);
        SafeParcelReader.T(parcel, 7, this.o, false);
        SafeParcelReader.T(parcel, 8, this.p, false);
        SafeParcelReader.T(parcel, 9, this.q, false);
        SafeParcelReader.T(parcel, 10, this.r, false);
        SafeParcelReader.P(parcel, 11, this.s);
        SafeParcelReader.T(parcel, 12, this.t, false);
        SafeParcelReader.S(parcel, 13, this.u, i, false);
        SafeParcelReader.m(parcel, a2);
    }
}
