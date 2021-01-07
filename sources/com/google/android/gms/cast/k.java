package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class k extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<k> CREATOR = new c1();
    private int a;
    private String b;
    private List<j> c;
    private List<hr> f;
    private double n;

    public static class a {
        private final k a = new k(null);

        public k a() {
            return new k(this.a, null);
        }

        public final a b(JSONObject jSONObject) {
            k.I1(this.a, jSONObject);
            return this;
        }
    }

    k(int i, String str, List<j> list, List<hr> list2, double d) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.f = list2;
        this.n = d;
    }

    static void I1(k kVar, JSONObject jSONObject) {
        kVar.a = 0;
        kVar.b = null;
        kVar.c = null;
        kVar.f = null;
        kVar.n = 0.0d;
        if (jSONObject != null) {
            String optString = jSONObject.optString("containerType", "");
            optString.hashCode();
            if (optString.equals("AUDIOBOOK_CONTAINER")) {
                kVar.a = 1;
            } else if (optString.equals("GENERIC_CONTAINER")) {
                kVar.a = 0;
            }
            kVar.b = jSONObject.optString("title", null);
            JSONArray optJSONArray = jSONObject.optJSONArray("sections");
            if (optJSONArray != null) {
                kVar.c = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        j jVar = new j();
                        jVar.Q1(optJSONObject);
                        kVar.c.add(jVar);
                    }
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("containerImages");
            if (optJSONArray2 != null) {
                ArrayList arrayList = new ArrayList();
                kVar.f = arrayList;
                gr.a(arrayList, optJSONArray2);
            }
            kVar.n = jSONObject.optDouble("containerDuration", kVar.n);
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && TextUtils.equals(this.b, kVar.b) && m.a(this.c, kVar.c) && m.a(this.f, kVar.f) && this.n == kVar.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.f, Double.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 2, this.a);
        SafeParcelReader.T(parcel, 3, this.b, false);
        List<j> list = this.c;
        List list2 = null;
        SafeParcelReader.X(parcel, 4, list == null ? null : Collections.unmodifiableList(list), false);
        List<hr> list3 = this.f;
        if (list3 != null) {
            list2 = Collections.unmodifiableList(list3);
        }
        SafeParcelReader.X(parcel, 5, list2, false);
        SafeParcelReader.H(parcel, 6, this.n);
        SafeParcelReader.m(parcel, a2);
    }

    private k() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.f = null;
        this.n = 0.0d;
    }

    k(b1 b1Var) {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.f = null;
        this.n = 0.0d;
    }

    k(k kVar, b1 b1Var) {
        this.a = kVar.a;
        this.b = kVar.b;
        this.c = kVar.c;
        this.f = kVar.f;
        this.n = kVar.n;
    }
}
