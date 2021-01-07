package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new r1();
    private String a;
    private String b;
    private InetAddress c;
    private String f;
    private String n;
    private String o;
    private int p;
    private List<hr> q;
    private int r;
    private int s;
    private String t;
    private String u;
    private int v;
    private String w;
    private byte[] x;
    private String y;

    CastDevice(String str, String str2, String str3, String str4, String str5, int i, List<hr> list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9) {
        List<hr> list2;
        String str10 = "";
        this.a = str == null ? str10 : str;
        String str11 = str2 == null ? str10 : str2;
        this.b = str11;
        if (!TextUtils.isEmpty(str11)) {
            try {
                this.c = InetAddress.getByName(this.b);
            } catch (UnknownHostException e) {
                String str12 = this.b;
                String message = e.getMessage();
                String.valueOf(str12).length();
                String.valueOf(message).length();
            }
        }
        this.f = str3 == null ? str10 : str3;
        this.n = str4 == null ? str10 : str4;
        this.o = str5 == null ? str10 : str5;
        this.p = i;
        if (list != null) {
            list2 = list;
        } else {
            list2 = new ArrayList<>();
        }
        this.q = list2;
        this.r = i2;
        this.s = i3;
        this.t = str6 != null ? str6 : str10;
        this.u = str7;
        this.v = i4;
        this.w = str8;
        this.x = bArr;
        this.y = str9;
    }

    public static CastDevice o2(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public String I1() {
        if (this.a.startsWith("__cast_nearby__")) {
            return this.a.substring(16);
        }
        return this.a;
    }

    public String Q1() {
        return this.f;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.a;
        return str == null ? castDevice.a == null : com.google.android.gms.cast.internal.a.d(str, castDevice.a) && com.google.android.gms.cast.internal.a.d(this.c, castDevice.c) && com.google.android.gms.cast.internal.a.d(this.n, castDevice.n) && com.google.android.gms.cast.internal.a.d(this.f, castDevice.f) && com.google.android.gms.cast.internal.a.d(this.o, castDevice.o) && this.p == castDevice.p && com.google.android.gms.cast.internal.a.d(this.q, castDevice.q) && this.r == castDevice.r && this.s == castDevice.s && com.google.android.gms.cast.internal.a.d(this.t, castDevice.t) && com.google.android.gms.cast.internal.a.d(Integer.valueOf(this.v), Integer.valueOf(castDevice.v)) && com.google.android.gms.cast.internal.a.d(this.w, castDevice.w) && com.google.android.gms.cast.internal.a.d(this.u, castDevice.u) && com.google.android.gms.cast.internal.a.d(this.o, castDevice.o) && this.p == castDevice.p && (((bArr = this.x) == null && castDevice.x == null) || Arrays.equals(bArr, castDevice.x)) && com.google.android.gms.cast.internal.a.d(this.y, castDevice.y);
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public InetAddress p2() {
        return this.c;
    }

    public String q2() {
        return this.n;
    }

    public boolean r2(int i) {
        return (this.r & i) == i;
    }

    public boolean s2() {
        return !this.a.startsWith("__cast_nearby__");
    }

    public final String t2() {
        return this.u;
    }

    @Override // java.lang.Object
    public String toString() {
        return String.format("\"%s\" (%s)", this.f, this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.T(parcel, 4, this.f, false);
        SafeParcelReader.T(parcel, 5, this.n, false);
        SafeParcelReader.T(parcel, 6, this.o, false);
        SafeParcelReader.M(parcel, 7, this.p);
        SafeParcelReader.X(parcel, 8, Collections.unmodifiableList(this.q), false);
        SafeParcelReader.M(parcel, 9, this.r);
        SafeParcelReader.M(parcel, 10, this.s);
        SafeParcelReader.T(parcel, 11, this.t, false);
        SafeParcelReader.T(parcel, 12, this.u, false);
        SafeParcelReader.M(parcel, 13, this.v);
        SafeParcelReader.T(parcel, 14, this.w, false);
        SafeParcelReader.G(parcel, 15, this.x, false);
        SafeParcelReader.T(parcel, 16, this.y, false);
        SafeParcelReader.m(parcel, a2);
    }
}
