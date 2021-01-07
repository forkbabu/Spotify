package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.g;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class m extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<m> CREATOR = new f1();
    private MediaInfo a;
    private int b;
    private boolean c;
    private double f;
    private double n;
    private double o;
    private long[] p;
    private String q;
    private JSONObject r;

    m(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.f = Double.NaN;
        this.a = mediaInfo;
        this.b = i;
        this.c = z;
        this.f = d;
        this.n = d2;
        this.o = d3;
        this.p = jArr;
        this.q = str;
        if (str != null) {
            try {
                this.r = new JSONObject(this.q);
            } catch (JSONException unused) {
                this.r = null;
                this.q = null;
            }
        } else {
            this.r = null;
        }
    }

    public boolean I1(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4 = false;
        if (jSONObject.has("media")) {
            this.a = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.b != (i = jSONObject.getInt("itemId"))) {
            this.b = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.c != (z3 = jSONObject.getBoolean("autoplay"))) {
            this.c = z3;
            z = true;
        }
        double optDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(optDouble) == Double.isNaN(this.f) && (Double.isNaN(optDouble) || Math.abs(optDouble - this.f) <= 1.0E-7d)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            this.f = optDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.n) > 1.0E-7d) {
                this.n = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.o) > 1.0E-7d) {
                this.o = d2;
                z = true;
            }
        }
        long[] jArr = null;
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            long[] jArr2 = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr2[i2] = jSONArray.getLong(i2);
            }
            long[] jArr3 = this.p;
            if (jArr3 != null && jArr3.length == length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        jArr = jArr2;
                        break;
                    } else if (this.p[i3] != jArr2[i3]) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            jArr = jArr2;
            z4 = true;
        }
        if (z4) {
            this.p = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.r = jSONObject.getJSONObject("customData");
        return true;
    }

    public int Q1() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        JSONObject jSONObject = this.r;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mVar.r;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || g.a(jSONObject, jSONObject2)) && com.google.android.gms.cast.internal.a.d(this.a, mVar.a) && this.b == mVar.b && this.c == mVar.c && ((Double.isNaN(this.f) && Double.isNaN(mVar.f)) || this.f == mVar.f) && this.n == mVar.n && this.o == mVar.o && Arrays.equals(this.p, mVar.p);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.f), Double.valueOf(this.n), Double.valueOf(this.o), Integer.valueOf(Arrays.hashCode(this.p)), String.valueOf(this.r)});
    }

    public MediaInfo o2() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final void p2() {
        if (this.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        } else if (!Double.isNaN(this.f) && this.f < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        } else if (Double.isNaN(this.n)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        } else if (Double.isNaN(this.o) || this.o < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.r;
        this.q = jSONObject == null ? null : jSONObject.toString();
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 2, this.a, i, false);
        SafeParcelReader.M(parcel, 3, this.b);
        SafeParcelReader.C(parcel, 4, this.c);
        SafeParcelReader.H(parcel, 5, this.f);
        SafeParcelReader.H(parcel, 6, this.n);
        SafeParcelReader.H(parcel, 7, this.o);
        SafeParcelReader.Q(parcel, 8, this.p, false);
        SafeParcelReader.T(parcel, 9, this.q, false);
        SafeParcelReader.m(parcel, a2);
    }

    public static class a {
        private final m a;

        public a(MediaInfo mediaInfo) {
            m mVar = new m(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
            if (mediaInfo != null) {
                this.a = mVar;
                return;
            }
            throw new IllegalArgumentException("media cannot be null.");
        }

        public m a() {
            this.a.p2();
            return this.a;
        }

        public a(JSONObject jSONObject) {
            this.a = new m(jSONObject);
        }
    }

    public m(JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        I1(jSONObject);
    }
}
