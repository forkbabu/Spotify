package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class HintRequest extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new l();
    private final int a;
    private final CredentialPickerConfig b;
    private final boolean c;
    private final boolean f;
    private final String[] n;
    private final boolean o;
    private final String p;
    private final String q;

    public static final class a {
        private boolean a;
        private String[] b;
        private CredentialPickerConfig c = new CredentialPickerConfig.a().a();

        public final HintRequest a() {
            if (this.b == null) {
                this.b = new String[0];
            }
            if (this.a || this.b.length != 0) {
                return new HintRequest(2, this.c, this.a, false, this.b, false, null, null);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public final a b(boolean z) {
            this.a = z;
            return this;
        }

        public final a c(CredentialPickerConfig credentialPickerConfig) {
            this.c = credentialPickerConfig;
            return this;
        }
    }

    HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.a = i;
        if (credentialPickerConfig != null) {
            this.b = credentialPickerConfig;
            this.c = z;
            this.f = z2;
            if (strArr != null) {
                this.n = strArr;
                if (i < 2) {
                    this.o = true;
                    this.p = null;
                    this.q = null;
                    return;
                }
                this.o = z3;
                this.p = str;
                this.q = str2;
                return;
            }
            throw new NullPointerException("null reference");
        }
        throw new NullPointerException("null reference");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 1, this.b, i, false);
        SafeParcelReader.C(parcel, 2, this.c);
        SafeParcelReader.C(parcel, 3, this.f);
        SafeParcelReader.U(parcel, 4, this.n, false);
        SafeParcelReader.C(parcel, 5, this.o);
        SafeParcelReader.T(parcel, 6, this.p, false);
        SafeParcelReader.T(parcel, 7, this.q, false);
        SafeParcelReader.M(parcel, Constants.ONE_SECOND, this.a);
        SafeParcelReader.m(parcel, a2);
    }
}
