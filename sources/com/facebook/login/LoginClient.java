package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new a();
    p[] a;
    int b = -1;
    Fragment c;
    c f;
    b n;
    boolean o;
    d p;
    Map<String, String> q;
    Map<String, String> r;
    private n s;

    static class a implements Parcelable.Creator<LoginClient> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    interface b {
    }

    public interface c {
    }

    public LoginClient(Fragment fragment) {
        this.c = fragment;
    }

    private void a(String str, String str2, boolean z) {
        if (this.q == null) {
            this.q = new HashMap();
        }
        if (this.q.containsKey(str) && z) {
            str2 = je.J0(new StringBuilder(), this.q.get(str), ",", str2);
        }
        this.q.put(str, str2);
    }

    static String h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    private n i() {
        n nVar = this.s;
        if (nVar == null || !nVar.a().equals(this.p.a())) {
            this.s = new n(f(), this.p.a());
        }
        return this.s;
    }

    public static int j() {
        return CallbackManagerImpl.RequestCodeOffset.Login.d();
    }

    private void k(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.p == null) {
            i().g("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            i().b(this.p.b(), str, str2, str3, str4, map);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (this.o) {
            return true;
        }
        if (f().checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            androidx.fragment.app.c f2 = f();
            c(Result.b(this.p, f2.getString(C0707R.string.com_facebook_internet_permission_error_title), f2.getString(C0707R.string.com_facebook_internet_permission_error_message)));
            return false;
        }
        this.o = true;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void c(Result result) {
        p g = g();
        if (g != null) {
            k(g.f(), result.a.d(), result.c, result.f, g.a);
        }
        Map<String, String> map = this.q;
        if (map != null) {
            result.o = map;
        }
        Map<String, String> map2 = this.r;
        if (map2 != null) {
            result.p = map2;
        }
        this.a = null;
        this.b = -1;
        this.p = null;
        this.q = null;
        c cVar = this.f;
        if (cVar != null) {
            LoginFragment.K4(LoginFragment.this, result);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public void e(Result result) {
        Result result2;
        if (result.b == null || !com.facebook.a.p()) {
            c(result);
        } else if (result.b != null) {
            com.facebook.a e = com.facebook.a.e();
            com.facebook.a aVar = result.b;
            if (!(e == null || aVar == null)) {
                try {
                    if (e.o().equals(aVar.o())) {
                        result2 = Result.e(this.p, result.b);
                        c(result2);
                    }
                } catch (Exception e2) {
                    c(Result.b(this.p, "Caught exception", e2.getMessage()));
                    return;
                }
            }
            result2 = Result.b(this.p, "User logged in as different Facebook user.", null);
            c(result2);
        } else {
            throw new FacebookException("Can't validate without a token");
        }
    }

    /* access modifiers changed from: package-private */
    public androidx.fragment.app.c f() {
        return this.c.B2();
    }

    /* access modifiers changed from: package-private */
    public p g() {
        int i = this.b;
        if (i >= 0) {
            return this.a[i];
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        int i;
        boolean z;
        if (this.b >= 0) {
            k(g().f(), "skipped", null, null, g().a);
        }
        do {
            p[] pVarArr = this.a;
            if (pVarArr == null || (i = this.b) >= pVarArr.length - 1) {
                d dVar = this.p;
                if (dVar != null) {
                    c(Result.b(dVar, "Login attempt failed.", null));
                    return;
                }
                return;
            }
            this.b = i + 1;
            p g = g();
            if (!g.h() || b()) {
                boolean k = g.k(this.p);
                if (k) {
                    i().d(this.p.b(), g.f());
                } else {
                    i().c(this.p.b(), g.f());
                    a("not_tried", g.f(), true);
                }
                z = k;
                continue;
            } else {
                z = false;
                a("no_internet_permission", "1", false);
                continue;
            }
        } while (!z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.p, i);
        f0.U(parcel, this.q);
        f0.U(parcel, this.r);
    }

    public LoginClient(Parcel parcel) {
        Parcelable[] readParcelableArray = parcel.readParcelableArray(p.class.getClassLoader());
        this.a = new p[readParcelableArray.length];
        for (int i = 0; i < readParcelableArray.length; i++) {
            p[] pVarArr = this.a;
            pVarArr[i] = (p) readParcelableArray[i];
            p pVar = pVarArr[i];
            if (pVar.b == null) {
                pVar.b = this;
            } else {
                throw new FacebookException("Can't set LoginClient if it is already set.");
            }
        }
        this.b = parcel.readInt();
        this.p = (d) parcel.readParcelable(d.class.getClassLoader());
        this.q = f0.O(parcel);
        this.r = f0.O(parcel);
    }

    public static class Result implements Parcelable {
        public static final Parcelable.Creator<Result> CREATOR = new a();
        final Code a;
        final com.facebook.a b;
        final String c;
        final String f;
        final d n;
        public Map<String, String> o;
        public Map<String, String> p;

        /* access modifiers changed from: package-private */
        public enum Code {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR(AppProtocol.LogMessage.SEVERITY_ERROR);
            
            private final String loggingValue;

            private Code(String str) {
                this.loggingValue = str;
            }

            /* access modifiers changed from: package-private */
            public String d() {
                return this.loggingValue;
            }
        }

        static class a implements Parcelable.Creator<Result> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public Result createFromParcel(Parcel parcel) {
                return new Result(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public Result[] newArray(int i) {
                return new Result[i];
            }
        }

        Result(d dVar, Code code, com.facebook.a aVar, String str, String str2) {
            h0.f(code, "code");
            this.n = dVar;
            this.b = aVar;
            this.c = str;
            this.a = code;
            this.f = str2;
        }

        static Result a(d dVar, String str) {
            return new Result(dVar, Code.CANCEL, null, str, null);
        }

        static Result b(d dVar, String str, String str2) {
            return c(dVar, str, str2, null);
        }

        static Result c(d dVar, String str, String str2, String str3) {
            String[] strArr = {str, str2};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str4 = strArr[i];
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            return new Result(dVar, Code.ERROR, null, TextUtils.join(": ", arrayList), str3);
        }

        static Result e(d dVar, com.facebook.a aVar) {
            return new Result(dVar, Code.SUCCESS, aVar, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a.name());
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.f);
            parcel.writeParcelable(this.n, i);
            f0.U(parcel, this.o);
            f0.U(parcel, this.p);
        }

        Result(Parcel parcel, a aVar) {
            this.a = Code.valueOf(parcel.readString());
            this.b = (com.facebook.a) parcel.readParcelable(com.facebook.a.class.getClassLoader());
            this.c = parcel.readString();
            this.f = parcel.readString();
            this.n = (d) parcel.readParcelable(d.class.getClassLoader());
            this.o = f0.O(parcel);
            this.p = f0.O(parcel);
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        private final LoginBehavior a;
        private Set<String> b;
        private final DefaultAudience c;
        private final String f;
        private final String n;
        private boolean o = false;
        private String p;
        private String q;
        private String r;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        d(LoginBehavior loginBehavior, Set<String> set, DefaultAudience defaultAudience, String str, String str2, String str3) {
            this.a = loginBehavior;
            this.b = set == null ? new HashSet<>() : set;
            this.c = defaultAudience;
            this.q = str;
            this.f = str2;
            this.n = str3;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            return this.f;
        }

        /* access modifiers changed from: package-private */
        public String b() {
            return this.n;
        }

        /* access modifiers changed from: package-private */
        public String c() {
            return this.q;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public DefaultAudience e() {
            return this.c;
        }

        /* access modifiers changed from: package-private */
        public String f() {
            return this.r;
        }

        /* access modifiers changed from: package-private */
        public String g() {
            return this.p;
        }

        /* access modifiers changed from: package-private */
        public LoginBehavior h() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public Set<String> i() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            for (String str : this.b) {
                if (o.c(str)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean k() {
            return this.o;
        }

        /* access modifiers changed from: package-private */
        public void l(String str) {
            this.p = str;
        }

        /* access modifiers changed from: package-private */
        public void m(Set<String> set) {
            h0.f(set, "permissions");
            this.b = set;
        }

        /* access modifiers changed from: package-private */
        public void n(boolean z) {
            this.o = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            LoginBehavior loginBehavior = this.a;
            String str = null;
            parcel.writeString(loginBehavior != null ? loginBehavior.name() : null);
            parcel.writeStringList(new ArrayList(this.b));
            DefaultAudience defaultAudience = this.c;
            if (defaultAudience != null) {
                str = defaultAudience.name();
            }
            parcel.writeString(str);
            parcel.writeString(this.f);
            parcel.writeString(this.n);
            parcel.writeByte(this.o ? (byte) 1 : 0);
            parcel.writeString(this.p);
            parcel.writeString(this.q);
            parcel.writeString(this.r);
        }

        d(Parcel parcel, a aVar) {
            boolean z = false;
            String readString = parcel.readString();
            DefaultAudience defaultAudience = null;
            this.a = readString != null ? LoginBehavior.valueOf(readString) : null;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.b = new HashSet(arrayList);
            String readString2 = parcel.readString();
            this.c = readString2 != null ? DefaultAudience.valueOf(readString2) : defaultAudience;
            this.f = parcel.readString();
            this.n = parcel.readString();
            this.o = parcel.readByte() != 0 ? true : z;
            this.p = parcel.readString();
            this.q = parcel.readString();
            this.r = parcel.readString();
        }
    }
}
