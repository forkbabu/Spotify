package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0064a();
    private static final Date u;
    private static final Date v;
    private static final Date w = new Date();
    private static final AccessTokenSource x = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
    private final Date a;
    private final Set<String> b;
    private final Set<String> c;
    private final Set<String> f;
    private final String n;
    private final AccessTokenSource o;
    private final Date p;
    private final String q;
    private final String r;
    private final Date s;
    private final String t;

    /* renamed from: com.facebook.a$a  reason: collision with other inner class name */
    static class C0064a implements Parcelable.Creator {
        C0064a() {
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

    public interface b {
        void a(FacebookException facebookException);

        void b(a aVar);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        u = date;
        v = date;
    }

    public a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, null);
    }

    static a a(JSONObject jSONObject) {
        Collection collection;
        if (jSONObject.getInt("version") <= 1) {
            String string = jSONObject.getString("token");
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            AccessTokenSource valueOf = AccessTokenSource.valueOf(jSONObject.getString("source"));
            String string2 = jSONObject.getString("application_id");
            String string3 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
            String optString = jSONObject.optString("graph_domain", null);
            List<String> F = f0.F(jSONArray);
            List<String> F2 = f0.F(jSONArray2);
            if (optJSONArray == null) {
                collection = new ArrayList();
            } else {
                collection = f0.F(optJSONArray);
            }
            return new a(string, string2, string3, F, F2, collection, valueOf, date, date2, date3, optString);
        }
        throw new FacebookException("Unknown AccessToken serialization format.");
    }

    static void b() {
        a e = d.f().e();
        if (e != null) {
            r(new a(e.n, e.q, e.r, e.b, e.c, e.f, e.o, new Date(), new Date(), e.s));
        }
    }

    public static a e() {
        return d.f().e();
    }

    public static boolean p() {
        a e = d.f().e();
        return e != null && !e.q();
    }

    public static void r(a aVar) {
        d.f().j(aVar);
    }

    public String c() {
        return this.q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.f.equals(aVar.f) && this.n.equals(aVar.n) && this.o == aVar.o && this.p.equals(aVar.p) && ((str = this.q) != null ? str.equals(aVar.q) : aVar.q == null) && this.r.equals(aVar.r) && this.s.equals(aVar.s)) {
            String str2 = this.t;
            String str3 = aVar.t;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
            } else if (str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    public Date f() {
        return this.s;
    }

    public Set<String> g() {
        return this.c;
    }

    public Set<String> h() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.p.hashCode() + ((this.o.hashCode() + je.Y0(this.n, je.c(this.f, je.c(this.c, je.c(this.b, (this.a.hashCode() + 527) * 31, 31), 31), 31), 31)) * 31)) * 31;
        String str = this.q;
        int i = 0;
        int hashCode2 = (this.s.hashCode() + je.Y0(this.r, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        String str2 = this.t;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public Date i() {
        return this.a;
    }

    public String j() {
        return this.t;
    }

    public Date k() {
        return this.p;
    }

    public Set<String> l() {
        return this.b;
    }

    public AccessTokenSource m() {
        return this.o;
    }

    public String n() {
        return this.n;
    }

    public String o() {
        return this.r;
    }

    public boolean q() {
        return new Date().after(this.a);
    }

    /* access modifiers changed from: package-private */
    public JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.n);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f));
        jSONObject.put("last_refresh", this.p.getTime());
        jSONObject.put("source", this.o.name());
        jSONObject.put("application_id", this.q);
        jSONObject.put("user_id", this.r);
        jSONObject.put("data_access_expiration_time", this.s.getTime());
        String str = this.t;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // java.lang.Object
    public String toString() {
        String str;
        StringBuilder Z0 = je.Z0("{AccessToken", " token:");
        if (this.n == null) {
            str = "null";
        } else {
            k.v(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
            str = "ACCESS_TOKEN_REMOVED";
        }
        Z0.append(str);
        Z0.append(" permissions:");
        if (this.b == null) {
            Z0.append("null");
        } else {
            Z0.append("[");
            Z0.append(TextUtils.join(", ", this.b));
            Z0.append("]");
        }
        Z0.append("}");
        return Z0.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a.getTime());
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeStringList(new ArrayList(this.c));
        parcel.writeStringList(new ArrayList(this.f));
        parcel.writeString(this.n);
        parcel.writeString(this.o.name());
        parcel.writeLong(this.p.getTime());
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeLong(this.s.getTime());
        parcel.writeString(this.t);
    }

    public a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        h0.g(str, "accessToken");
        h0.g(str2, "applicationId");
        h0.g(str3, "userId");
        this.a = date == null ? v : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        this.b = Collections.unmodifiableSet(hashSet);
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        this.c = Collections.unmodifiableSet(hashSet2);
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        this.f = Collections.unmodifiableSet(hashSet3);
        this.n = str;
        this.o = accessTokenSource == null ? x : accessTokenSource;
        this.p = date2 == null ? w : date2;
        this.q = str2;
        this.r = str3;
        this.s = (date3 == null || date3.getTime() == 0) ? v : date3;
        this.t = str4;
    }

    a(Parcel parcel) {
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.b = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.c = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f = Collections.unmodifiableSet(new HashSet(arrayList));
        this.n = parcel.readString();
        this.o = AccessTokenSource.valueOf(parcel.readString());
        this.p = new Date(parcel.readLong());
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = new Date(parcel.readLong());
        this.t = parcel.readString();
    }
}
