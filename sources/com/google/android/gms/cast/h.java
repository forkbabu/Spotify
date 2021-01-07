package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.Arrays;
import java.util.Locale;

public class h extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<h> CREATOR = new w0();
    private boolean a;
    private String b;
    private boolean c;
    private g f;

    public static final class a {
        private h a = new h();

        public final h a() {
            return this.a;
        }

        public final a b(boolean z) {
            this.a.I1(z);
            return this;
        }
    }

    h(boolean z, String str, boolean z2, g gVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.f = gVar;
    }

    public void I1(boolean z) {
        this.a = z;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && com.google.android.gms.cast.internal.a.d(this.b, hVar.b) && this.c == hVar.c && com.google.android.gms.cast.internal.a.d(this.f, hVar.f);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.f});
    }

    @Override // java.lang.Object
    public String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", Boolean.valueOf(this.a), this.b, Boolean.valueOf(this.c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.C(parcel, 2, this.a);
        SafeParcelReader.T(parcel, 3, this.b, false);
        SafeParcelReader.C(parcel, 4, this.c);
        SafeParcelReader.S(parcel, 5, this.f, i, false);
        SafeParcelReader.m(parcel, a2);
    }

    public h() {
        Locale locale = Locale.getDefault();
        int i = com.google.android.gms.cast.internal.a.b;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        String sb2 = sb.toString();
        this.a = false;
        this.b = sb2;
        this.c = false;
        this.f = null;
    }
}
