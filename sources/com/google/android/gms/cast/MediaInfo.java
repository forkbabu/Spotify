package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.g;
import com.google.android.gms.internal.cast.s0;
import com.google.android.gms.internal.cast.zzeu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MediaInfo extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = new y0();
    private String a;
    private int b;
    private String c;
    private j f;
    private long n;
    private List<MediaTrack> o;
    private p p;
    private String q;
    private List<b> r;
    private List<a> s;
    private String t;
    private q u;
    private long v;
    private String w;
    private String x;
    private JSONObject y;
    private final a z;

    public class a {
        public a() {
        }
    }

    MediaInfo(String str, int i, String str2, j jVar, long j, List<MediaTrack> list, p pVar, String str3, List<b> list2, List<a> list3, String str4, q qVar, long j2, String str5, String str6) {
        this.z = new a();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.f = jVar;
        this.n = j;
        this.o = list;
        this.p = pVar;
        this.q = str3;
        if (str3 != null) {
            try {
                this.y = new JSONObject(this.q);
            } catch (JSONException unused) {
                this.y = null;
                this.q = null;
            }
        } else {
            this.y = null;
        }
        this.r = list2;
        this.s = list3;
        this.t = str4;
        this.u = qVar;
        this.v = j2;
        this.w = str5;
        this.x = str6;
    }

    public List<MediaTrack> I1() {
        return this.o;
    }

    public j Q1() {
        return this.f;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaInfo)) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        JSONObject jSONObject = this.y;
        boolean z2 = jSONObject == null;
        JSONObject jSONObject2 = mediaInfo.y;
        if (z2 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || g.a(jSONObject, jSONObject2)) && com.google.android.gms.cast.internal.a.d(this.a, mediaInfo.a) && this.b == mediaInfo.b && com.google.android.gms.cast.internal.a.d(this.c, mediaInfo.c) && com.google.android.gms.cast.internal.a.d(this.f, mediaInfo.f) && this.n == mediaInfo.n && com.google.android.gms.cast.internal.a.d(this.o, mediaInfo.o) && com.google.android.gms.cast.internal.a.d(this.p, mediaInfo.p) && com.google.android.gms.cast.internal.a.d(this.r, mediaInfo.r) && com.google.android.gms.cast.internal.a.d(this.s, mediaInfo.s) && com.google.android.gms.cast.internal.a.d(this.t, mediaInfo.t) && com.google.android.gms.cast.internal.a.d(this.u, mediaInfo.u) && this.v == mediaInfo.v && com.google.android.gms.cast.internal.a.d(this.w, mediaInfo.w) && com.google.android.gms.cast.internal.a.d(this.x, mediaInfo.x);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.f, Long.valueOf(this.n), String.valueOf(this.y), this.o, this.p, this.r, this.s, this.t, this.u, Long.valueOf(this.v), this.w});
    }

    public long o2() {
        return this.n;
    }

    public int p2() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f A[LOOP:0: B:3:0x0022->B:25:0x009f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017a A[LOOP:2: B:30:0x00c5->B:60:0x017a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0183 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q2(org.json.JSONObject r37) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.MediaInfo.q2(org.json.JSONObject):void");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.y;
        List list = null;
        this.q = jSONObject == null ? null : jSONObject.toString();
        int a2 = SafeParcelReader.a(parcel);
        SafeParcelReader.T(parcel, 2, this.a, false);
        SafeParcelReader.M(parcel, 3, this.b);
        SafeParcelReader.T(parcel, 4, this.c, false);
        SafeParcelReader.S(parcel, 5, this.f, i, false);
        SafeParcelReader.P(parcel, 6, this.n);
        SafeParcelReader.X(parcel, 7, this.o, false);
        SafeParcelReader.S(parcel, 8, this.p, i, false);
        SafeParcelReader.T(parcel, 9, this.q, false);
        List<b> list2 = this.r;
        SafeParcelReader.X(parcel, 10, list2 == null ? null : Collections.unmodifiableList(list2), false);
        List<a> list3 = this.s;
        if (list3 != null) {
            list = Collections.unmodifiableList(list3);
        }
        SafeParcelReader.X(parcel, 11, list, false);
        SafeParcelReader.T(parcel, 12, this.t, false);
        SafeParcelReader.S(parcel, 13, this.u, i, false);
        SafeParcelReader.P(parcel, 14, this.v);
        SafeParcelReader.T(parcel, 15, this.w, false);
        SafeParcelReader.T(parcel, 16, this.x, false);
        SafeParcelReader.m(parcel, a2);
    }

    MediaInfo(JSONObject jSONObject) {
        this(jSONObject.optString("contentId"), -1, null, null, -1, null, null, null, null, null, null, null, -1, null, null);
        MediaInfo mediaInfo;
        int i;
        int i2;
        zzeu zzeu;
        String optString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(optString)) {
            mediaInfo = this;
            mediaInfo.b = 0;
        } else {
            mediaInfo = this;
            if ("BUFFERED".equals(optString)) {
                mediaInfo.b = 1;
            } else if ("LIVE".equals(optString)) {
                mediaInfo.b = 2;
            } else {
                mediaInfo.b = -1;
            }
        }
        mediaInfo.c = jSONObject.optString("contentType", null);
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            j jVar = new j(jSONObject2.getInt("metadataType"));
            mediaInfo.f = jVar;
            jVar.Q1(jSONObject2);
        }
        mediaInfo.n = -1;
        if (jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double optDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(optDouble) && !Double.isInfinite(optDouble)) {
                mediaInfo.n = com.google.android.gms.cast.internal.a.b(optDouble);
            }
        }
        if (jSONObject.has("tracks")) {
            mediaInfo.o = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                long j = jSONObject3.getLong("trackId");
                String optString2 = jSONObject3.optString("type");
                if ("TEXT".equals(optString2)) {
                    i = 1;
                } else if ("AUDIO".equals(optString2)) {
                    i = 2;
                } else {
                    i = "VIDEO".equals(optString2) ? 3 : 0;
                }
                String optString3 = jSONObject3.optString("trackContentId", null);
                String optString4 = jSONObject3.optString("trackContentType", null);
                String optString5 = jSONObject3.optString("name", null);
                String optString6 = jSONObject3.optString("language", null);
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i2 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i2 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i2 = 3;
                    } else {
                        i2 = "CHAPTERS".equals(string) ? 4 : "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i2 = 0;
                }
                if (jSONObject3.has("roles")) {
                    int i4 = zzeu.c;
                    s0 s0Var = new s0();
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                        s0Var.a(jSONArray2.optString(i5));
                    }
                    zzeu = s0Var.b();
                } else {
                    zzeu = null;
                }
                mediaInfo.o.add(new MediaTrack(j, i, optString3, optString4, optString5, optString6, i2, zzeu, jSONObject3.optJSONObject("customData")));
            }
        } else {
            mediaInfo.o = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            p pVar = new p(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            pVar.I1(jSONObject4);
            mediaInfo.p = pVar;
        } else {
            mediaInfo.p = null;
        }
        q2(jSONObject);
        mediaInfo.y = jSONObject.optJSONObject("customData");
        mediaInfo.t = jSONObject.optString("entity", null);
        mediaInfo.w = jSONObject.optString("atvEntity", null);
        mediaInfo.u = q.I1(jSONObject.optJSONObject("vmapAdsRequest"));
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double optDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(optDouble2) && !Double.isInfinite(optDouble2) && optDouble2 >= 0.0d) {
                mediaInfo.v = com.google.android.gms.cast.internal.a.b(optDouble2);
            }
        }
        if (jSONObject.has("contentUrl")) {
            mediaInfo.x = jSONObject.optString("contentUrl");
        }
    }
}
