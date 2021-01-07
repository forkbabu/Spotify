package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.g;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class MediaTrack extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new i1();
    private long a;
    private int b;
    private String c;
    private String f;
    private String n;
    private String o;
    private int p;
    private final List<String> q;
    private String r;
    private JSONObject s;

    public static class a {
        private String a;
        private String b;
        private int c = 0;

        public a(long j, int i) {
        }

        public MediaTrack a() {
            return new MediaTrack(-1, 1, this.a, null, this.b, null, this.c, null, null);
        }

        public a b(String str) {
            this.a = str;
            return this;
        }

        public a c(String str) {
            this.b = str;
            return this;
        }

        public a d(int i) {
            if (i < -1 || i > 5) {
                throw new IllegalArgumentException(je.f0(27, "invalid subtype ", i));
            }
            this.c = i;
            return this;
        }
    }

    MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List<String> list, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.f = str2;
        this.n = str3;
        this.o = str4;
        this.p = i2;
        this.q = list;
        this.s = jSONObject;
    }

    public final long I1() {
        return this.a;
    }

    public final String Q1() {
        return this.o;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.s;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.s;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || g.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && com.google.android.gms.cast.internal.a.d(this.c, mediaTrack.c) && com.google.android.gms.cast.internal.a.d(this.f, mediaTrack.f) && com.google.android.gms.cast.internal.a.d(this.n, mediaTrack.n) && com.google.android.gms.cast.internal.a.d(this.o, mediaTrack.o) && this.p == mediaTrack.p && com.google.android.gms.cast.internal.a.d(this.q, mediaTrack.q);
    }

    public final String getName() {
        return this.n;
    }

    public final int getType() {
        return this.b;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.f, this.n, this.o, Integer.valueOf(this.p), this.q, String.valueOf(this.s)});
    }

    public final int o2() {
        return this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.s;
        this.r = jSONObject == null ? null : jSONObject.toString();
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.P(parcel, 2, this.a);
        SafeParcelReader.M(parcel, 3, this.b);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.T(parcel, 6, this.n, false);
        SafeParcelReader.T(parcel, 7, this.o, false);
        SafeParcelReader.M(parcel, 8, this.p);
        SafeParcelReader.V(parcel, 9, this.q, false);
        SafeParcelReader.T(parcel, 10, this.r, false);
        SafeParcelReader.m(parcel, a2);
    }
}
