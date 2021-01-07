package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.a;
import com.spotify.voiceassistant.player.models.SearchResponse;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaError extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new x0();
    private String a;
    private long b;
    private final Integer c;
    private final String f;
    private String n;
    private final JSONObject o;

    MediaError(String str, long j, Integer num, String str2, String str3) {
        JSONObject jSONObject;
        int i = com.google.android.gms.cast.internal.a.b;
        if (str3 != null) {
            try {
                jSONObject = new JSONObject(str3);
            } catch (JSONException unused) {
            }
            this.a = str;
            this.b = j;
            this.c = num;
            this.f = str2;
            this.o = jSONObject;
        }
        jSONObject = null;
        this.a = str;
        this.b = j;
        this.c = num;
        this.f = str2;
        this.o = jSONObject;
    }

    public static MediaError I1(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", SearchResponse.RESULT_ERROR), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, jSONObject.has("reason") ? jSONObject.optString("reason") : null, jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.o;
        this.n = jSONObject == null ? null : jSONObject.toString();
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.P(parcel, 3, this.b);
        SafeParcelReader.O(parcel, 4, this.c, false);
        SafeParcelReader.T(parcel, 5, this.f, false);
        SafeParcelReader.T(parcel, 6, this.n, false);
        SafeParcelReader.m(parcel, a2);
    }

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j;
        this.c = num;
        this.f = str2;
        this.o = jSONObject;
    }
}
