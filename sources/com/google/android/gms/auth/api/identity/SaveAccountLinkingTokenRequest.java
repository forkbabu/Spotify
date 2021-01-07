package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.m;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveAccountLinkingTokenRequest extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new d();
    private final PendingIntent a;
    private final String b;
    private final String c;
    private final List<String> f;
    private final String n;

    public static final class a {
        private PendingIntent a;
        private String b;
        private String c;
        private List<String> d = new ArrayList();
        private String e;

        public final SaveAccountLinkingTokenRequest a() {
            boolean z = false;
            g.d(this.a != null, "Consent PendingIntent cannot be null");
            g.d("auth_code".equals(this.b), "Invalid tokenType");
            g.d(!TextUtils.isEmpty(this.c), "serviceId cannot be null or empty");
            if (this.d != null) {
                z = true;
            }
            g.d(z, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.a, this.b, this.c, this.d, this.e);
        }

        public final a b(PendingIntent pendingIntent) {
            this.a = pendingIntent;
            return this;
        }

        public final a c(List<String> list) {
            this.d = list;
            return this;
        }

        public final a d(String str) {
            this.c = str;
            return this;
        }

        public final a e(String str) {
            this.b = str;
            return this;
        }

        public final a f(String str) {
            this.e = str;
            return this;
        }
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List<String> list, String str3) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.f = list;
        this.n = str3;
    }

    public static a I1(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        if (saveAccountLinkingTokenRequest != null) {
            a aVar = new a();
            aVar.c(saveAccountLinkingTokenRequest.f);
            aVar.d(saveAccountLinkingTokenRequest.c);
            aVar.b(saveAccountLinkingTokenRequest.a);
            aVar.e(saveAccountLinkingTokenRequest.b);
            String str = saveAccountLinkingTokenRequest.n;
            if (!TextUtils.isEmpty(str)) {
                aVar.f(str);
            }
            return aVar;
        }
        throw new NullPointerException("null reference");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        if (this.f.size() != saveAccountLinkingTokenRequest.f.size() || !this.f.containsAll(saveAccountLinkingTokenRequest.f) || !m.a(this.a, saveAccountLinkingTokenRequest.a) || !m.a(this.b, saveAccountLinkingTokenRequest.b) || !m.a(this.c, saveAccountLinkingTokenRequest.c) || !m.a(this.n, saveAccountLinkingTokenRequest.n)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.f, this.n});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.S(parcel, 1, this.a, i, false);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.T(parcel, 3, this.c, false);
        SafeParcelReader.V(parcel, 4, this.f, false);
        SafeParcelReader.T(parcel, 5, this.n, false);
        SafeParcelReader.m(parcel, a2);
    }
}
