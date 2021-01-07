package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInAccount extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new f();
    private static b w = d.b();
    private final int a;
    private String b;
    private String c;
    private String f;
    private String n;
    private Uri o;
    private String p;
    private long q;
    private String r;
    private List<Scope> s;
    private String t;
    private String u;
    private Set<Scope> v = new HashSet();

    GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.n = str4;
        this.o = uri;
        this.p = str5;
        this.q = j;
        this.r = str6;
        this.s = list;
        this.t = str7;
        this.u = str8;
    }

    @RecentlyNullable
    public static GoogleSignInAccount p2(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        Long valueOf = Long.valueOf(parseLong);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (valueOf == null) {
            ((d) w).getClass();
            valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        long longValue = valueOf.longValue();
        g.i(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.p = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    @RecentlyNullable
    public Account G1() {
        if (this.f == null) {
            return null;
        }
        return new Account(this.f, "com.google");
    }

    @RecentlyNullable
    public String I1() {
        return this.f;
    }

    public Set<Scope> Q1() {
        HashSet hashSet = new HashSet(this.s);
        hashSet.addAll(this.v);
        return hashSet;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.r.equals(this.r) && googleSignInAccount.Q1().equals(Q1());
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Q1().hashCode() + je.Y0(this.r, 527, 31);
    }

    @RecentlyNullable
    public String o2() {
        return this.p;
    }

    public final String q2() {
        return this.r;
    }

    @RecentlyNonNull
    public final String r2() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.b;
            if (str != null) {
                jSONObject.put("id", str);
            }
            String str2 = this.c;
            if (str2 != null) {
                jSONObject.put("tokenId", str2);
            }
            String str3 = this.f;
            if (str3 != null) {
                jSONObject.put("email", str3);
            }
            String str4 = this.n;
            if (str4 != null) {
                jSONObject.put("displayName", str4);
            }
            String str5 = this.t;
            if (str5 != null) {
                jSONObject.put("givenName", str5);
            }
            String str6 = this.u;
            if (str6 != null) {
                jSONObject.put("familyName", str6);
            }
            Uri uri = this.o;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str7 = this.p;
            if (str7 != null) {
                jSONObject.put("serverAuthCode", str7);
            }
            jSONObject.put("expirationTime", this.q);
            jSONObject.put("obfuscatedIdentifier", this.r);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.s;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, e.a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.I1());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.T(parcel, 2, this.b, false);
        SafeParcelReader.T(parcel, 3, this.c, false);
        SafeParcelReader.T(parcel, 4, this.f, false);
        SafeParcelReader.T(parcel, 5, this.n, false);
        SafeParcelReader.S(parcel, 6, this.o, i, false);
        SafeParcelReader.T(parcel, 7, this.p, false);
        SafeParcelReader.P(parcel, 8, this.q);
        SafeParcelReader.T(parcel, 9, this.r, false);
        SafeParcelReader.X(parcel, 10, this.s, false);
        SafeParcelReader.T(parcel, 11, this.t, false);
        SafeParcelReader.T(parcel, 12, this.u, false);
        SafeParcelReader.m(parcel, a2);
    }
}
