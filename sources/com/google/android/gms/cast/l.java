package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.cast.k;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class l extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<l> CREATOR = new e1();
    private String a;
    private String b;
    private int c;
    private String f;
    private k n;
    private int o;
    private List<m> p;
    private int q;
    private long r;

    public static class a {
        private final l a = new l(null);

        public l a() {
            return new l(this.a, null);
        }

        public final a b(JSONObject jSONObject) {
            l.I1(this.a, jSONObject);
            return this;
        }
    }

    l(String str, String str2, int i, String str3, k kVar, int i2, List<m> list, int i3, long j) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.f = str3;
        this.n = kVar;
        this.o = i2;
        this.p = list;
        this.q = i3;
        this.r = j;
    }

    static void I1(l lVar, JSONObject jSONObject) {
        lVar.clear();
        if (jSONObject != null) {
            lVar.a = jSONObject.optString("id", null);
            lVar.b = jSONObject.optString("entity", null);
            String optString = jSONObject.optString("queueType");
            optString.hashCode();
            char c2 = 65535;
            switch (optString.hashCode()) {
                case -1803151310:
                    if (optString.equals("PODCAST_SERIES")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1758903120:
                    if (optString.equals("RADIO_STATION")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1632865838:
                    if (optString.equals("PLAYLIST")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1319760993:
                    if (optString.equals("AUDIOBOOK")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1088524588:
                    if (optString.equals("TV_SERIES")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 62359119:
                    if (optString.equals("ALBUM")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 73549584:
                    if (optString.equals("MOVIE")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 393100598:
                    if (optString.equals("VIDEO_PLAYLIST")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 902303413:
                    if (optString.equals("LIVE_TV")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    lVar.c = 5;
                    break;
                case 1:
                    lVar.c = 4;
                    break;
                case 2:
                    lVar.c = 2;
                    break;
                case 3:
                    lVar.c = 3;
                    break;
                case 4:
                    lVar.c = 6;
                    break;
                case 5:
                    lVar.c = 1;
                    break;
                case 6:
                    lVar.c = 9;
                    break;
                case 7:
                    lVar.c = 7;
                    break;
                case '\b':
                    lVar.c = 8;
                    break;
            }
            lVar.f = jSONObject.optString("name", null);
            if (jSONObject.has("containerMetadata")) {
                k.a aVar = new k.a();
                aVar.b(jSONObject.optJSONObject("containerMetadata"));
                lVar.n = aVar.a();
            }
            Integer f2 = f.f(jSONObject.optString("repeatMode"));
            if (f2 != null) {
                lVar.o = f2.intValue();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                lVar.p = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        try {
                            lVar.p.add(new m(optJSONObject));
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
            lVar.q = jSONObject.optInt("startIndex", lVar.q);
            if (jSONObject.has("startTime")) {
                lVar.r = com.google.android.gms.cast.internal.a.b(jSONObject.optDouble("startTime", (double) lVar.r));
            }
        }
    }

    private final void clear() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.f = null;
        this.o = 0;
        this.p = null;
        this.q = 0;
        this.r = -1;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return TextUtils.equals(this.a, lVar.a) && TextUtils.equals(this.b, lVar.b) && this.c == lVar.c && TextUtils.equals(this.f, lVar.f) && m.a(this.n, lVar.n) && this.o == lVar.o && m.a(this.p, lVar.p) && this.q == lVar.q && this.r == lVar.r;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.f, this.n, Integer.valueOf(this.o), this.p, Integer.valueOf(this.q), Long.valueOf(this.r)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.M(parcel, 4, this.c);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.S(parcel, 6, this.n, i, false);
        SafeParcelReader.M(parcel, 7, this.o);
        List<m> list = this.p;
        SafeParcelReader.X(parcel, 8, list == null ? null : Collections.unmodifiableList(list), false);
        SafeParcelReader.M(parcel, 9, this.q);
        SafeParcelReader.P(parcel, 10, this.r);
        SafeParcelReader.m(parcel, a2);
    }

    private l() {
        clear();
    }

    l(d1 d1Var) {
        clear();
    }

    l(l lVar, d1 d1Var) {
        this.a = lVar.a;
        this.b = lVar.b;
        this.c = lVar.c;
        this.f = lVar.f;
        this.n = lVar.n;
        this.o = lVar.o;
        this.p = lVar.p;
        this.q = lVar.q;
        this.r = lVar.r;
    }
}
