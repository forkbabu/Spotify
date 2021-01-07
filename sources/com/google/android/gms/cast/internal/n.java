package com.google.android.gms.cast.internal;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.i;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.o;
import com.spotify.voiceassistant.player.models.ParsedQuery;
import com.spotify.voiceassistant.player.models.SearchResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class n extends w {
    public static final String B = a.h("com.google.cast.media");
    private final r A;
    private long e;
    private o f;
    private Long g;
    private o h;
    private final r i;
    private final r j;
    private final r k;
    private final r l;
    private final r m;
    private final r n;
    private final r o;
    private final r p;
    private final r q;
    private final r r;
    private final r s;
    private final r t;
    private final r u;
    private final r v;
    private final r w;
    private final r x = new r(86400000);
    private final r y;
    private final r z;

    public n() {
        super(B, "MediaControlChannel");
        r rVar = new r(86400000);
        this.i = rVar;
        r rVar2 = new r(86400000);
        this.j = rVar2;
        r rVar3 = new r(86400000);
        this.k = rVar3;
        r rVar4 = new r(86400000);
        this.l = rVar4;
        r rVar5 = new r(10000);
        this.m = rVar5;
        r rVar6 = new r(86400000);
        this.n = rVar6;
        r rVar7 = new r(86400000);
        this.o = rVar7;
        r rVar8 = new r(86400000);
        this.p = rVar8;
        r rVar9 = new r(86400000);
        this.q = rVar9;
        r rVar10 = new r(86400000);
        this.r = rVar10;
        r rVar11 = new r(86400000);
        this.s = rVar11;
        r rVar12 = new r(86400000);
        this.t = rVar12;
        r rVar13 = new r(86400000);
        this.u = rVar13;
        r rVar14 = new r(86400000);
        this.v = rVar14;
        r rVar15 = new r(86400000);
        this.w = rVar15;
        r rVar16 = new r(86400000);
        this.y = rVar16;
        r rVar17 = new r(86400000);
        this.z = rVar17;
        r rVar18 = new r(86400000);
        this.A = rVar18;
        c(rVar);
        c(rVar2);
        c(rVar3);
        c(rVar4);
        c(rVar5);
        c(rVar6);
        c(rVar7);
        c(rVar8);
        c(rVar9);
        c(rVar10);
        c(rVar11);
        c(rVar12);
        c(rVar13);
        c(rVar14);
        c(rVar15);
        c(rVar16);
        c(rVar16);
        c(rVar17);
        c(rVar18);
        C();
    }

    private static int[] B(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            iArr[i2] = jSONArray.getInt(i2);
        }
        return iArr;
    }

    private final void C() {
        this.e = 0;
        this.f = null;
        for (r rVar : f()) {
            rVar.e();
        }
    }

    private static q D(JSONObject jSONObject) {
        MediaError I1 = MediaError.I1(jSONObject);
        q qVar = new q();
        qVar.a = jSONObject.optJSONObject("customData");
        qVar.b = I1;
        return qVar;
    }

    private final long E() {
        o oVar = this.f;
        if (oVar != null) {
            return oVar.E2();
        }
        throw new zzal();
    }

    private final void n() {
        o oVar = this.h;
        if (oVar != null) {
            oVar.e();
        }
    }

    private final long o(double d, long j2, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j2;
        }
        double d2 = (double) elapsedRealtime;
        Double.isNaN(d2);
        long j4 = j2 + ((long) (d2 * d));
        if (j3 > 0 && j4 > j3) {
            return j3;
        }
        if (j4 < 0) {
            return 0;
        }
        return j4;
    }

    public final long A(s sVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long g2 = g();
        try {
            jSONObject2.put("requestId", g2);
            jSONObject2.put("type", ParsedQuery.INTENT_PLAY);
            jSONObject2.put("mediaSessionId", E());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), g2, null);
        this.k.c(g2, sVar);
        return g2;
    }

    public final void F(String str) {
        char c;
        int i2;
        o oVar;
        o oVar2;
        o oVar3;
        o oVar4;
        int[] B2;
        this.a.a("message received: %s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long optLong = jSONObject.optLong("requestId", -1);
            char c2 = 65535;
            switch (string.hashCode()) {
                case -1830647528:
                    if (string.equals("LOAD_CANCELLED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1790231854:
                    if (string.equals("QUEUE_ITEMS")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1125000185:
                    if (string.equals("INVALID_REQUEST")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -262628938:
                    if (string.equals("LOAD_FAILED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 66247144:
                    if (string.equals(SearchResponse.RESULT_ERROR)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 154411710:
                    if (string.equals("QUEUE_CHANGE")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 431600379:
                    if (string.equals("INVALID_PLAYER_STATE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 823510221:
                    if (string.equals("MEDIA_STATUS")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2107149050:
                    if (string.equals("QUEUE_ITEM_IDS")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean a = this.i.a(optLong);
                        int i3 = ((!this.n.g() || this.n.a(optLong)) && (!this.o.g() || this.o.a(optLong))) ? 0 : 1;
                        if (a || (oVar4 = this.f) == null) {
                            o oVar5 = new o(null, 0, 0, 0.0d, 0, 0, 0, 0, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                            oVar5.B2(jSONObject2, 0);
                            this.f = oVar5;
                            this.e = SystemClock.elapsedRealtime();
                            i2 = 127;
                        } else {
                            i2 = oVar4.B2(jSONObject2, i3);
                        }
                        if ((i2 & 1) != 0) {
                            this.e = SystemClock.elapsedRealtime();
                            n();
                        }
                        if ((i2 & 2) != 0) {
                            this.e = SystemClock.elapsedRealtime();
                            n();
                        }
                        if ((i2 & 128) != 0) {
                            this.e = SystemClock.elapsedRealtime();
                        }
                        if (!((i2 & 4) == 0 || (oVar3 = this.h) == null)) {
                            oVar3.b();
                        }
                        if (!((i2 & 8) == 0 || (oVar2 = this.h) == null)) {
                            oVar2.c();
                        }
                        if (!((i2 & 16) == 0 || (oVar = this.h) == null)) {
                            oVar.d();
                        }
                        if ((i2 & 32) != 0) {
                            this.e = SystemClock.elapsedRealtime();
                            o oVar6 = this.h;
                            if (oVar6 != null) {
                                oVar6.a();
                            }
                        }
                        if ((i2 & 64) != 0) {
                            this.e = SystemClock.elapsedRealtime();
                            n();
                        }
                    } else {
                        this.f = null;
                        n();
                        o oVar7 = this.h;
                        if (oVar7 != null) {
                            oVar7.b();
                        }
                        o oVar8 = this.h;
                        if (oVar8 != null) {
                            oVar8.c();
                        }
                        o oVar9 = this.h;
                        if (oVar9 != null) {
                            oVar9.d();
                        }
                    }
                    for (r rVar : f()) {
                        rVar.f(optLong, 0, null);
                    }
                    return;
                case 1:
                    this.a.f("received unexpected error: Invalid Player State.", new Object[0]);
                    for (r rVar2 : f()) {
                        rVar2.f(optLong, 2100, D(jSONObject));
                    }
                    return;
                case 2:
                    this.i.f(optLong, 2100, D(jSONObject));
                    return;
                case 3:
                    this.i.f(optLong, 2101, D(jSONObject));
                    return;
                case 4:
                    this.a.f("received unexpected error: Invalid Request.", new Object[0]);
                    for (r rVar3 : f()) {
                        rVar3.f(optLong, 2100, D(jSONObject));
                    }
                    return;
                case 5:
                    for (r rVar4 : f()) {
                        rVar4.f(optLong, 2100, D(jSONObject));
                    }
                    if (this.h != null) {
                        this.h.j(MediaError.I1(jSONObject));
                        return;
                    }
                    return;
                case 6:
                    this.w.f(optLong, 0, null);
                    if (!(this.h == null || (B2 = B(jSONObject.getJSONArray("itemIds"))) == null)) {
                        this.h.h(B2);
                        return;
                    }
                    return;
                case 7:
                    this.y.f(optLong, 0, null);
                    if (this.h != null) {
                        String string2 = jSONObject.getString("changeType");
                        int[] B3 = B(jSONObject.getJSONArray("itemIds"));
                        int optInt = jSONObject.optInt("insertBefore", 0);
                        if (B3 != null) {
                            switch (string2.hashCode()) {
                                case -2130463047:
                                    if (string2.equals("INSERT")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case -1881281404:
                                    if (string2.equals("REMOVE")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case -1785516855:
                                    if (string2.equals("UPDATE")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                                case 1122976047:
                                    if (string2.equals("ITEMS_CHANGE")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 1395699694:
                                    if (string2.equals("NO_CHANGE")) {
                                        c2 = 4;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 == 0) {
                                this.h.f(B3, optInt);
                                return;
                            } else if (c2 == 1) {
                                this.h.i(B3);
                                return;
                            } else if (c2 == 2) {
                                this.h.g(B3);
                                return;
                            } else if (c2 == 3) {
                                this.h.h(B3);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case '\b':
                    this.x.f(optLong, 0, null);
                    if (this.h != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        m[] mVarArr = new m[jSONArray2.length()];
                        for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                            mVarArr[i4] = new m.a(jSONArray2.getJSONObject(i4)).a();
                        }
                        this.h.k(mVarArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (JSONException e2) {
            this.a.f("Message is malformed (%s); ignoring: %s", e2.getMessage(), str);
        }
    }

    @Override // com.google.android.gms.cast.internal.w
    public final void e() {
        super.e();
        C();
    }

    public final long h() {
        i r2;
        o oVar = this.f;
        if (oVar == null || (r2 = oVar.r2()) == null) {
            return 0;
        }
        long I1 = r2.I1();
        return !r2.o2() ? o(1.0d, I1, -1) : I1;
    }

    public final long i() {
        i r2;
        o oVar = this.f;
        if (oVar == null || (r2 = oVar.r2()) == null) {
            return 0;
        }
        long Q1 = r2.Q1();
        if (r2.p2()) {
            Q1 = o(1.0d, Q1, -1);
        }
        return r2.o2() ? Math.min(Q1, r2.I1()) : Q1;
    }

    public final long j() {
        MediaInfo k2 = k();
        if (k2 == null) {
            return 0;
        }
        Long l2 = this.g;
        if (l2 != null) {
            if (l2.equals(4294967296000L)) {
                if (this.f.r2() != null) {
                    return Math.min(l2.longValue(), h());
                }
                if (m() >= 0) {
                    return Math.min(l2.longValue(), m());
                }
            }
            return l2.longValue();
        } else if (this.e == 0) {
            return 0;
        } else {
            double u2 = this.f.u2();
            long y2 = this.f.y2();
            return (u2 == 0.0d || this.f.v2() != 2) ? y2 : o(u2, y2, k2.o2());
        }
    }

    public final MediaInfo k() {
        o oVar = this.f;
        if (oVar == null) {
            return null;
        }
        return oVar.t2();
    }

    public final o l() {
        return this.f;
    }

    public final long m() {
        MediaInfo k2 = k();
        if (k2 != null) {
            return k2.o2();
        }
        return 0;
    }

    public final long p(s sVar, int i2, long j2, m[] mVarArr, int i3, Integer num, JSONObject jSONObject) {
        if (j2 == -1 || j2 >= 0) {
            JSONObject jSONObject2 = new JSONObject();
            long g2 = g();
            try {
                jSONObject2.put("requestId", g2);
                jSONObject2.put("type", "QUEUE_UPDATE");
                jSONObject2.put("mediaSessionId", E());
                if (i2 != 0) {
                    jSONObject2.put("currentItemId", i2);
                }
                if (i3 != 0) {
                    jSONObject2.put("jump", i3);
                }
                if (j2 != -1) {
                    jSONObject2.put("currentTime", a.a(j2));
                }
                if (jSONObject != null) {
                    jSONObject2.put("customData", jSONObject);
                }
            } catch (JSONException unused) {
            }
            d(jSONObject2.toString(), g2, null);
            this.t.c(g2, sVar);
            return g2;
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("playPosition cannot be negative: ");
        sb.append(j2);
        throw new IllegalArgumentException(sb.toString());
    }

    public final long q(s sVar, com.google.android.gms.cast.n nVar) {
        JSONObject jSONObject = new JSONObject();
        long g2 = g();
        long b = nVar.d() ? 4294967296000L : nVar.b();
        try {
            jSONObject.put("requestId", g2);
            jSONObject.put("type", "SEEK");
            jSONObject.put("mediaSessionId", E());
            jSONObject.put("currentTime", a.a(b));
            if (nVar.c() == 1) {
                jSONObject.put("resumeState", "PLAYBACK_START");
            } else if (nVar.c() == 2) {
                jSONObject.put("resumeState", "PLAYBACK_PAUSE");
            }
            if (nVar.a() != null) {
                jSONObject.put("customData", nVar.a());
            }
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), g2, null);
        this.g = Long.valueOf(b);
        this.m.c(g2, new m(this, sVar));
        return g2;
    }

    public final long r(s sVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long g2 = g();
        try {
            jSONObject2.put("requestId", g2);
            jSONObject2.put("type", "PAUSE");
            jSONObject2.put("mediaSessionId", E());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), g2, null);
        this.j.c(g2, sVar);
        return g2;
    }

    public final long s(s sVar, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long g2 = g();
        try {
            jSONObject.put("requestId", g2);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", E());
            JSONArray jSONArray = new JSONArray();
            for (int i2 : iArr) {
                jSONArray.put(i2);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), g2, null);
        this.x.c(g2, sVar);
        return g2;
    }

    public final long t(s sVar, long[] jArr) {
        if (jArr != null) {
            JSONObject jSONObject = new JSONObject();
            long g2 = g();
            try {
                jSONObject.put("requestId", g2);
                jSONObject.put("type", "EDIT_TRACKS_INFO");
                jSONObject.put("mediaSessionId", E());
                JSONArray jSONArray = new JSONArray();
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jSONArray.put(i2, jArr[i2]);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            } catch (JSONException unused) {
            }
            d(jSONObject.toString(), g2, null);
            this.q.c(g2, sVar);
            return g2;
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    public final void v(o oVar) {
        this.h = oVar;
    }

    public final long w(s sVar) {
        JSONObject jSONObject = new JSONObject();
        long g2 = g();
        try {
            jSONObject.put("requestId", g2);
            jSONObject.put("type", "GET_STATUS");
            o oVar = this.f;
            if (oVar != null) {
                jSONObject.put("mediaSessionId", oVar.E2());
            }
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), g2, null);
        this.p.c(g2, sVar);
        return g2;
    }

    public final long x(s sVar, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long g2 = g();
        try {
            jSONObject2.put("requestId", g2);
            jSONObject2.put("type", "STOP");
            jSONObject2.put("mediaSessionId", E());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        d(jSONObject2.toString(), g2, null);
        this.l.c(g2, sVar);
        return g2;
    }

    public final void y(long j2, int i2) {
        for (r rVar : f()) {
            rVar.f(j2, i2, null);
        }
    }

    public final long z(s sVar) {
        JSONObject jSONObject = new JSONObject();
        long g2 = g();
        try {
            jSONObject.put("requestId", g2);
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", E());
        } catch (JSONException unused) {
        }
        d(jSONObject.toString(), g2, null);
        this.w.c(g2, sVar);
        return g2;
    }
}
