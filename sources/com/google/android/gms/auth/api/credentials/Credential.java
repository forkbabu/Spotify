package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new h();
    private final String a;
    private final String b;
    private final Uri c;
    private final List<IdToken> f;
    private final String n;
    private final String o;
    private final String p;
    private final String q;

    public static class a {
        private final String a;
        private String b;
        private String c;

        public a(String str) {
            this.a = str;
        }

        public Credential a() {
            return new Credential(this.a, null, null, null, this.b, this.c, null, null);
        }

        public a b(String str) {
            this.c = str;
            return this;
        }

        public a c(String str) {
            this.b = str;
            return this;
        }
    }

    Credential(String str, String str2, Uri uri, List<IdToken> list, String str3, String str4, String str5, String str6) {
        List<IdToken> list2;
        g.k(str, "credential identifier cannot be null");
        String trim = str.trim();
        g.h(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || Constants.SCHEME.equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.b = str2;
                this.c = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f = list2;
                this.a = trim;
                this.n = str3;
                this.o = str4;
                this.p = str5;
                this.q = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public String I1() {
        return this.o;
    }

    public String Q1() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.a, credential.a) && TextUtils.equals(this.b, credential.b) && m.a(this.c, credential.c) && TextUtils.equals(this.n, credential.n) && TextUtils.equals(this.o, credential.o);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.n, this.o});
    }

    public String o2() {
        return this.n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 1, this.a, false);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.S(parcel, 3, this.c, i, false);
        SafeParcelReader.X(parcel, 4, this.f, false);
        SafeParcelReader.T(parcel, 5, this.n, false);
        SafeParcelReader.T(parcel, 6, this.o, false);
        SafeParcelReader.T(parcel, 9, this.p, false);
        SafeParcelReader.T(parcel, 10, this.q, false);
        SafeParcelReader.m(parcel, a2);
    }
}
