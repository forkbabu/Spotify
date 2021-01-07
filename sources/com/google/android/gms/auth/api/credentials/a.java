package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class a extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<a> CREATOR = new j();
    private final int a;
    private final boolean b;
    private final String[] c;
    private final CredentialPickerConfig f;
    private final CredentialPickerConfig n;
    private final boolean o;
    private final String p;
    private final String q;
    private final boolean r;

    /* renamed from: com.google.android.gms.auth.api.credentials.a$a  reason: collision with other inner class name */
    public static final class C0090a {
        private boolean a;
        private String[] b;

        public final a a() {
            if (this.b == null) {
                this.b = new String[0];
            }
            if (this.a || this.b.length != 0) {
                return new a(4, this.a, this.b, null, null, false, null, null, false);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public final C0090a b(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            this.b = strArr;
            return this;
        }

        public final C0090a c(boolean z) {
            this.a = z;
            return this;
        }
    }

    a(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.a = i;
        this.b = z;
        if (strArr != null) {
            this.c = strArr;
            this.f = credentialPickerConfig == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig;
            this.n = credentialPickerConfig2 == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig2;
            if (i < 3) {
                this.o = true;
                this.p = null;
                this.q = null;
            } else {
                this.o = z2;
                this.p = str;
                this.q = str2;
            }
            this.r = z3;
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.C(parcel, 1, this.b);
        SafeParcelReader.U(parcel, 2, this.c, false);
        SafeParcelReader.S(parcel, 3, this.f, i, false);
        SafeParcelReader.S(parcel, 4, this.n, i, false);
        SafeParcelReader.C(parcel, 5, this.o);
        SafeParcelReader.T(parcel, 6, this.p, false);
        SafeParcelReader.T(parcel, 7, this.q, false);
        SafeParcelReader.C(parcel, 8, this.r);
        SafeParcelReader.M(parcel, Constants.ONE_SECOND, this.a);
        SafeParcelReader.m(parcel, a2);
    }
}
