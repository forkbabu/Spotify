package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f0;
import com.facebook.internal.j;
import com.facebook.internal.n;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public final class FacebookRequestError implements Parcelable {
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new a();
    static final b u = new b(200, 299, null);
    private final Category a;
    private final int b;
    private final int c;
    private final int f;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final JSONObject r;
    private final Object s;
    private final FacebookException t;

    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    static class a implements Parcelable.Creator<FacebookRequestError> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel, (a) null);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        b(int i, int i2, a aVar) {
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i) {
            return 200 <= i && i <= 299;
        }
    }

    private FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        boolean z2;
        j jVar;
        Category category;
        this.b = i;
        this.c = i2;
        this.f = i3;
        this.n = str;
        this.o = str2;
        this.r = jSONObject2;
        this.s = obj;
        this.p = str3;
        this.q = str4;
        if (facebookException != null) {
            this.t = facebookException;
            z2 = true;
        } else {
            this.t = new FacebookServiceException(this, str2);
            z2 = false;
        }
        synchronized (FacebookRequestError.class) {
            n j = FetchedAppSettingsManager.j(k.e());
            if (j == null) {
                jVar = j.c();
            } else {
                jVar = j.d();
            }
        }
        if (z2) {
            category = Category.OTHER;
        } else {
            category = jVar.a(i2, i3, z);
        }
        this.a = category;
        jVar.d(category);
    }

    static FacebookRequestError a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        try {
            if (jSONObject.has("code")) {
                int i3 = jSONObject.getInt("code");
                Object s2 = f0.s(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                if (s2 != null && (s2 instanceof JSONObject)) {
                    JSONObject jSONObject2 = (JSONObject) s2;
                    boolean z2 = false;
                    if (jSONObject2.has(AppProtocol.LogMessage.SEVERITY_ERROR)) {
                        JSONObject jSONObject3 = (JSONObject) f0.s(jSONObject2, AppProtocol.LogMessage.SEVERITY_ERROR, null);
                        String optString = jSONObject3.optString("type", null);
                        String optString2 = jSONObject3.optString("message", null);
                        i2 = jSONObject3.optInt("code", -1);
                        int optInt = jSONObject3.optInt("error_subcode", -1);
                        str2 = jSONObject3.optString("error_user_msg", null);
                        str = jSONObject3.optString("error_user_title", null);
                        z = jSONObject3.optBoolean("is_transient", false);
                        str4 = optString;
                        z2 = true;
                        str3 = optString2;
                        i = optInt;
                    } else if (jSONObject2.has("error_code") || jSONObject2.has("error_msg") || jSONObject2.has("error_reason")) {
                        String optString3 = jSONObject2.optString("error_reason", null);
                        String optString4 = jSONObject2.optString("error_msg", null);
                        int optInt2 = jSONObject2.optInt("error_code", -1);
                        i = jSONObject2.optInt("error_subcode", -1);
                        str4 = optString3;
                        str3 = optString4;
                        str2 = null;
                        str = null;
                        z2 = true;
                        z = false;
                        i2 = optInt2;
                    } else {
                        str4 = null;
                        str3 = null;
                        str2 = null;
                        str = null;
                        i2 = -1;
                        i = -1;
                        z = false;
                    }
                    if (z2) {
                        return new FacebookRequestError(i3, i2, i, str4, str3, str, str2, z, jSONObject2, jSONObject, obj, httpURLConnection, null);
                    }
                }
                if (!u.a(i3)) {
                    return new FacebookRequestError(i3, -1, -1, null, null, null, null, false, jSONObject.has("body") ? (JSONObject) f0.s(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, null);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    public int b() {
        return this.c;
    }

    public String c() {
        String str = this.o;
        if (str != null) {
            return str;
        }
        return this.t.getLocalizedMessage();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.n;
    }

    public FacebookException f() {
        return this.t;
    }

    public JSONObject g() {
        return this.r;
    }

    public int h() {
        return this.b;
    }

    public int i() {
        return this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        return "{HttpStatus: " + this.b + ", errorCode: " + this.c + ", subErrorCode: " + this.f + ", errorType: " + this.n + ", errorMessage: " + c() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.f);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc));
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }

    FacebookRequestError(Parcel parcel, a aVar) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
    }
}
