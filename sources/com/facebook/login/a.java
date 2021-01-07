package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessTokenSource;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.e;
import com.facebook.internal.f;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.k;
import com.facebook.login.LoginClient;
import com.spotify.music.features.ads.model.Ad;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;

public class a extends v {
    public static final Parcelable.Creator<a> CREATOR = new C0073a();
    public static boolean p = false;
    private String f;
    private String n;
    private String o;

    /* renamed from: com.facebook.login.a$a  reason: collision with other inner class name */
    static class C0073a implements Parcelable.Creator {
        C0073a() {
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new a[i];
        }
    }

    a(LoginClient loginClient) {
        super(loginClient);
        this.o = "";
        this.n = new BigInteger(100, new Random()).toString(32);
        p = false;
        if (h0.b(k.d(), super.m())) {
            this.o = super.m();
        } else if (h0.b(k.d(), f.b())) {
            this.o = f.b();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public String f() {
        return "custom_tab";
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8  */
    @Override // com.facebook.login.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean i(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 == r0) goto L_0x0005
            return r1
        L_0x0005:
            com.facebook.login.LoginClient r7 = r6.b
            com.facebook.login.LoginClient$d r7 = r7.p
            r2 = 0
            r3 = -1
            if (r8 != r3) goto L_0x00e6
            java.lang.String r8 = com.facebook.CustomTabMainActivity.o
            java.lang.String r8 = r9.getStringExtra(r8)
            if (r8 == 0) goto L_0x00e5
            java.lang.String r9 = "fbconnect://cct."
            boolean r9 = r8.startsWith(r9)
            if (r9 != 0) goto L_0x0027
            java.lang.String r9 = super.m()
            boolean r9 = r8.startsWith(r9)
            if (r9 == 0) goto L_0x00e5
        L_0x0027:
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r9 = r8.getQuery()
            android.os.Bundle r9 = com.facebook.internal.f0.J(r9)
            java.lang.String r8 = r8.getFragment()
            android.os.Bundle r8 = com.facebook.internal.f0.J(r8)
            r9.putAll(r8)
            java.lang.String r8 = "state"
            java.lang.String r8 = r9.getString(r8)     // Catch:{ JSONException -> 0x0059 }
            if (r8 != 0) goto L_0x0047
            goto L_0x005a
        L_0x0047:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0059 }
            r4.<init>(r8)     // Catch:{ JSONException -> 0x0059 }
            java.lang.String r8 = "7_challenge"
            java.lang.String r8 = r4.getString(r8)     // Catch:{ JSONException -> 0x0059 }
            java.lang.String r4 = r6.n     // Catch:{ JSONException -> 0x0059 }
            boolean r1 = r8.equals(r4)     // Catch:{ JSONException -> 0x0059 }
            goto L_0x005a
        L_0x0059:
        L_0x005a:
            if (r1 != 0) goto L_0x0068
            com.facebook.FacebookException r8 = new com.facebook.FacebookException
            java.lang.String r9 = "Invalid state parameter"
            r8.<init>(r9)
            r6.o(r7, r2, r8)
            goto L_0x00e5
        L_0x0068:
            java.lang.String r8 = "error"
            java.lang.String r8 = r9.getString(r8)
            if (r8 != 0) goto L_0x0076
            java.lang.String r8 = "error_type"
            java.lang.String r8 = r9.getString(r8)
        L_0x0076:
            java.lang.String r1 = "error_msg"
            java.lang.String r1 = r9.getString(r1)
            if (r1 != 0) goto L_0x0084
            java.lang.String r1 = "error_message"
            java.lang.String r1 = r9.getString(r1)
        L_0x0084:
            if (r1 != 0) goto L_0x008c
            java.lang.String r1 = "error_description"
            java.lang.String r1 = r9.getString(r1)
        L_0x008c:
            java.lang.String r4 = "error_code"
            java.lang.String r4 = r9.getString(r4)
            boolean r5 = com.facebook.internal.f0.C(r4)
            if (r5 != 0) goto L_0x009d
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x009d }
            goto L_0x009e
        L_0x009d:
            r4 = -1
        L_0x009e:
            boolean r5 = com.facebook.internal.f0.C(r8)
            if (r5 == 0) goto L_0x00b0
            boolean r5 = com.facebook.internal.f0.C(r1)
            if (r5 == 0) goto L_0x00b0
            if (r4 != r3) goto L_0x00b0
            r6.o(r7, r9, r2)
            goto L_0x00e5
        L_0x00b0:
            if (r8 == 0) goto L_0x00cb
            java.lang.String r9 = "access_denied"
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x00c2
            java.lang.String r9 = "OAuthAccessDeniedException"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00cb
        L_0x00c2:
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            r6.o(r7, r2, r8)
            goto L_0x00e5
        L_0x00cb:
            r9 = 4201(0x1069, float:5.887E-42)
            if (r4 != r9) goto L_0x00d8
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            r6.o(r7, r2, r8)
            goto L_0x00e5
        L_0x00d8:
            com.facebook.FacebookRequestError r9 = new com.facebook.FacebookRequestError
            r9.<init>(r4, r8, r1)
            com.facebook.FacebookServiceException r8 = new com.facebook.FacebookServiceException
            r8.<init>(r9, r1)
            r6.o(r7, r2, r8)
        L_0x00e5:
            return r0
        L_0x00e6:
            com.facebook.FacebookOperationCanceledException r8 = new com.facebook.FacebookOperationCanceledException
            r8.<init>()
            r6.o(r7, r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.a.i(int, int, android.content.Intent):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.login.p
    public void j(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.n);
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.p
    public boolean k(LoginClient.d dVar) {
        String str = this.f;
        if (str == null) {
            str = f.a();
            this.f = str;
        }
        if (!(str != null && !this.o.isEmpty())) {
            return false;
        }
        Bundle l = l(dVar);
        l.putString("redirect_uri", this.o);
        l.putString("client_id", dVar.a());
        l.putString("e2e", LoginClient.h());
        l.putString("response_type", "token,signed_request,graph_domain");
        l.putString("return_scopes", "true");
        l.putString("auth_type", dVar.c());
        l.putString("login_behavior", dVar.h().name());
        Locale locale = Locale.ROOT;
        boolean z = k.n;
        l.putString("sdk", String.format(locale, "android-%s", "7.1.0"));
        l.putString("sso", "chrome_custom_tab");
        l.putString("cct_prefetching", k.n ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        if (p) {
            l.putString("cct_over_app_switch", "1");
        }
        if (k.n) {
            b.d(e.a("oauth", l));
        }
        Intent intent = new Intent(this.b.f(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.c, "oauth");
        intent.putExtra(CustomTabMainActivity.f, l);
        String str2 = CustomTabMainActivity.n;
        String str3 = this.f;
        if (str3 == null) {
            str3 = f.a();
            this.f = str3;
        }
        intent.putExtra(str2, str3);
        this.b.c.H4(intent, 1, null);
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.facebook.login.v
    public AccessTokenSource n() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    @Override // com.facebook.login.p, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f0.U(parcel, this.a);
        parcel.writeString(this.n);
    }

    a(Parcel parcel) {
        super(parcel);
        this.o = "";
        this.n = parcel.readString();
    }
}
