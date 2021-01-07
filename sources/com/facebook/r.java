package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import org.json.JSONException;
import org.json.JSONObject;

public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new b();
    private static final String p = r.class.getSimpleName();
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final Uri o;

    /* access modifiers changed from: package-private */
    public static class a implements f0.b {
        a() {
        }

        @Override // com.facebook.internal.f0.b
        public void a(JSONObject jSONObject) {
            String optString = jSONObject.optString("id");
            if (optString != null) {
                String optString2 = jSONObject.optString("link");
                r.e(new r(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null));
            }
        }

        @Override // com.facebook.internal.f0.b
        public void b(FacebookException facebookException) {
            String str = r.p;
            Log.e(str, "Got unexpected exception: " + facebookException);
        }
    }

    static class b implements Parcelable.Creator<r> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public r createFromParcel(Parcel parcel) {
            return new r(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public r[] newArray(int i) {
            return new r[i];
        }
    }

    public r(String str, String str2, String str3, String str4, String str5, Uri uri) {
        h0.g(str, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = str5;
        this.o = uri;
    }

    public static void b() {
        a e = a.e();
        if (!a.p()) {
            e(null);
        } else {
            f0.p(e.n(), new a());
        }
    }

    public static r c() {
        return t.b().a();
    }

    public static void e(r rVar) {
        t.b().d(rVar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.a.equals(rVar.a) || this.b != null) {
            if (!this.b.equals(rVar.b) || this.c != null) {
                if (!this.c.equals(rVar.c) || this.f != null) {
                    if (!this.f.equals(rVar.f) || this.n != null) {
                        if (!this.n.equals(rVar.n) || this.o != null) {
                            return this.o.equals(rVar.o);
                        }
                        if (rVar.o == null) {
                            return true;
                        }
                    } else if (rVar.n == null) {
                        return true;
                    }
                } else if (rVar.f == null) {
                    return true;
                }
            } else if (rVar.c == null) {
                return true;
            }
        } else if (rVar.b == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.a);
            jSONObject.put("first_name", this.b);
            jSONObject.put("middle_name", this.c);
            jSONObject.put("last_name", this.f);
            jSONObject.put("name", this.n);
            Uri uri = this.o;
            if (uri == null) {
                return jSONObject;
            }
            jSONObject.put("link_uri", uri.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getName() {
        return this.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = this.a.hashCode() + 527;
        String str = this.b;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        String str2 = this.c;
        if (str2 != null) {
            hashCode = (hashCode * 31) + str2.hashCode();
        }
        String str3 = this.f;
        if (str3 != null) {
            hashCode = (hashCode * 31) + str3.hashCode();
        }
        String str4 = this.n;
        if (str4 != null) {
            hashCode = (hashCode * 31) + str4.hashCode();
        }
        Uri uri = this.o;
        return uri != null ? (hashCode * 31) + uri.hashCode() : hashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.n);
        Uri uri = this.o;
        parcel.writeString(uri == null ? null : uri.toString());
    }

    r(JSONObject jSONObject) {
        Uri uri = null;
        this.a = jSONObject.optString("id", null);
        this.b = jSONObject.optString("first_name", null);
        this.c = jSONObject.optString("middle_name", null);
        this.f = jSONObject.optString("last_name", null);
        this.n = jSONObject.optString("name", null);
        String optString = jSONObject.optString("link_uri", null);
        this.o = optString != null ? Uri.parse(optString) : uri;
    }

    r(Parcel parcel, a aVar) {
        Uri uri;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.f = parcel.readString();
        this.n = parcel.readString();
        String readString = parcel.readString();
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.o = uri;
    }
}
