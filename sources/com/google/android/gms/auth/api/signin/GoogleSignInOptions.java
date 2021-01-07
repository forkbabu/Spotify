package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.auth.api.signin.internal.b;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GoogleSignInOptions extends com.google.android.gms.common.internal.safeparcel.a implements a.d, ReflectedParcelable {
    private static Comparator<Scope> A = new g();
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new h();
    @RecentlyNonNull
    public static final Scope u = new Scope("profile");
    @RecentlyNonNull
    public static final Scope v = new Scope("email");
    @RecentlyNonNull
    public static final Scope w = new Scope("openid");
    @RecentlyNonNull
    public static final Scope x;
    @RecentlyNonNull
    public static final Scope y = new Scope("https://www.googleapis.com/auth/games");
    @RecentlyNonNull
    public static final GoogleSignInOptions z;
    private final int a;
    private final ArrayList<Scope> b;
    private Account c;
    private boolean f;
    private final boolean n;
    private final boolean o;
    private String p;
    private String q;
    private ArrayList<com.google.android.gms.auth.api.signin.internal.a> r;
    private String s;
    private Map<Integer, com.google.android.gms.auth.api.signin.internal.a> t;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        x = scope;
        a aVar = new a();
        aVar.c();
        aVar.d();
        z = aVar.a();
        a aVar2 = new a();
        aVar2.e(scope, new Scope[0]);
        aVar2.a();
    }

    GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, ArrayList<com.google.android.gms.auth.api.signin.internal.a> arrayList2, String str3) {
        this(i, arrayList, account, z2, z3, z4, str, str2, r2(arrayList2), str3);
    }

    @RecentlyNullable
    public static GoogleSignInOptions Q1(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z2 = jSONObject.getBoolean("idTokenRequested");
        boolean z3 = jSONObject.getBoolean("serverAuthRequested");
        boolean z4 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z2, z3, z4, optString2, str2, new HashMap(), (String) null);
    }

    /* access modifiers changed from: private */
    public static Map<Integer, com.google.android.gms.auth.api.signin.internal.a> r2(List<com.google.android.gms.auth.api.signin.internal.a> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (com.google.android.gms.auth.api.signin.internal.a aVar : list) {
            hashMap.put(Integer.valueOf(aVar.getType()), aVar);
        }
        return hashMap;
    }

    @RecentlyNonNull
    public ArrayList<Scope> I1() {
        return new ArrayList<>(this.b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r1.equals(r4.c) != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r3.p.equals(r4.p) != false) goto L_0x0060;
     */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r3.r     // Catch:{ ClassCastException -> 0x007e }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r1 > 0) goto L_0x007e
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.a> r1 = r4.r     // Catch:{ ClassCastException -> 0x007e }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r1 <= 0) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.b     // Catch:{ ClassCastException -> 0x007e }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList r2 = r4.I1()     // Catch:{ ClassCastException -> 0x007e }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r2) goto L_0x007e
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.b     // Catch:{ ClassCastException -> 0x007e }
            java.util.ArrayList r2 = r4.I1()     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != 0) goto L_0x0034
            goto L_0x007e
        L_0x0034:
            android.accounts.Account r1 = r3.c     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != 0) goto L_0x003d
            android.accounts.Account r1 = r4.c     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != 0) goto L_0x007e
            goto L_0x0045
        L_0x003d:
            android.accounts.Account r2 = r4.c     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 == 0) goto L_0x007e
        L_0x0045:
            java.lang.String r1 = r3.p     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.p     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 == 0) goto L_0x007e
            goto L_0x0060
        L_0x0056:
            java.lang.String r1 = r3.p     // Catch:{ ClassCastException -> 0x007e }
            java.lang.String r2 = r4.p     // Catch:{ ClassCastException -> 0x007e }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x007e }
            if (r1 == 0) goto L_0x007e
        L_0x0060:
            boolean r1 = r3.o     // Catch:{ ClassCastException -> 0x007e }
            boolean r2 = r4.o     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r2) goto L_0x007e
            boolean r1 = r3.f     // Catch:{ ClassCastException -> 0x007e }
            boolean r2 = r4.f     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r2) goto L_0x007e
            boolean r1 = r3.n     // Catch:{ ClassCastException -> 0x007e }
            boolean r2 = r4.n     // Catch:{ ClassCastException -> 0x007e }
            if (r1 != r2) goto L_0x007e
            java.lang.String r1 = r3.s     // Catch:{ ClassCastException -> 0x007e }
            java.lang.String r4 = r4.s     // Catch:{ ClassCastException -> 0x007e }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x007e }
            if (r4 == 0) goto L_0x007e
            r4 = 1
            return r4
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @Override // java.lang.Object
    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.I1());
        }
        Collections.sort(arrayList);
        b bVar = new b();
        bVar.a(arrayList);
        bVar.a(this.c);
        bVar.a(this.p);
        bVar.c(this.o);
        bVar.c(this.f);
        bVar.c(this.n);
        bVar.a(this.s);
        return bVar.b();
    }

    @RecentlyNonNull
    public final String o2() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.b, A);
            ArrayList<Scope> arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Scope scope = arrayList.get(i);
                i++;
                jSONArray.put(scope.I1());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f);
            jSONObject.put("forceCodeForRefreshToken", this.o);
            jSONObject.put("serverAuthRequested", this.n);
            if (!TextUtils.isEmpty(this.p)) {
                jSONObject.put("serverClientId", this.p);
            }
            if (!TextUtils.isEmpty(this.q)) {
                jSONObject.put("hostedDomain", this.q);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.M(parcel, 1, this.a);
        SafeParcelReader.X(parcel, 2, I1(), false);
        SafeParcelReader.S(parcel, 3, this.c, i, false);
        SafeParcelReader.C(parcel, 4, this.f);
        SafeParcelReader.C(parcel, 5, this.n);
        SafeParcelReader.C(parcel, 6, this.o);
        SafeParcelReader.T(parcel, 7, this.p, false);
        SafeParcelReader.T(parcel, 8, this.q, false);
        SafeParcelReader.X(parcel, 9, this.r, false);
        SafeParcelReader.T(parcel, 10, this.s, false);
        SafeParcelReader.m(parcel, a2);
    }

    public static final class a {
        private Set<Scope> a = new HashSet();
        private boolean b;
        private boolean c;
        private boolean d;
        private String e;
        private Account f;
        private String g;
        private Map<Integer, com.google.android.gms.auth.api.signin.internal.a> h = new HashMap();
        private String i;

        public a() {
        }

        @RecentlyNonNull
        public final GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.y)) {
                Set<Scope> set = this.a;
                Scope scope = GoogleSignInOptions.x;
                if (set.contains(scope)) {
                    this.a.remove(scope);
                }
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                this.a.add(GoogleSignInOptions.w);
            }
            return new GoogleSignInOptions(new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i);
        }

        @RecentlyNonNull
        public final a b() {
            this.a.add(GoogleSignInOptions.v);
            return this;
        }

        @RecentlyNonNull
        public final a c() {
            this.a.add(GoogleSignInOptions.w);
            return this;
        }

        @RecentlyNonNull
        public final a d() {
            this.a.add(GoogleSignInOptions.u);
            return this;
        }

        @RecentlyNonNull
        public final a e(@RecentlyNonNull Scope scope, @RecentlyNonNull Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @RecentlyNonNull
        public final a f(@RecentlyNonNull String str) {
            boolean z = true;
            this.b = true;
            g.i(str);
            String str2 = this.e;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            g.d(z, "two different server client ids provided");
            this.e = str;
            this.c = false;
            return this;
        }

        @RecentlyNonNull
        public final a g(@RecentlyNonNull String str) {
            this.i = str;
            return this;
        }

        public a(@RecentlyNonNull GoogleSignInOptions googleSignInOptions) {
            if (googleSignInOptions != null) {
                this.a = new HashSet(googleSignInOptions.b);
                this.b = googleSignInOptions.n;
                this.c = googleSignInOptions.o;
                this.d = googleSignInOptions.f;
                this.e = googleSignInOptions.p;
                this.f = googleSignInOptions.c;
                this.g = googleSignInOptions.q;
                this.h = GoogleSignInOptions.r2(googleSignInOptions.r);
                this.i = googleSignInOptions.s;
                return;
            }
            throw new NullPointerException("null reference");
        }
    }

    private GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map<Integer, com.google.android.gms.auth.api.signin.internal.a> map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.f = z2;
        this.n = z3;
        this.o = z4;
        this.p = str;
        this.q = str2;
        this.r = new ArrayList<>(map.values());
        this.t = map;
        this.s = str3;
    }

    /* synthetic */ GoogleSignInOptions(ArrayList arrayList, Account account, boolean z2, boolean z3, boolean z4, String str, String str2, Map map, String str3) {
        this(3, arrayList, account, z2, z3, z4, str, str2, map, str3);
    }
}
