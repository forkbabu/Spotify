package com.google.android.exoplayer2.drm;

import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.util.Log;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class t implements r<s> {
    public static final /* synthetic */ int d = 0;
    private final UUID a;
    private final MediaDrm b;
    private int c;

    private t(UUID uuid) {
        UUID uuid2;
        uuid.getClass();
        g.b(!u.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.a = uuid;
        MediaDrm mediaDrm = new MediaDrm((f0.a >= 27 || !u.c.equals(uuid)) ? uuid : uuid2);
        this.b = mediaDrm;
        this.c = 1;
        if (u.d.equals(uuid) && "ASUS_Z00AD".equals(f0.d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    public static t n(UUID uuid) {
        try {
            return new t(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new UnsupportedDrmException(1, e);
        } catch (Exception e2) {
            throw new UnsupportedDrmException(2, e2);
        }
    }

    @Override // com.google.android.exoplayer2.drm.r
    public Class<s> a() {
        return s.class;
    }

    @Override // com.google.android.exoplayer2.drm.r
    public Map<String, String> b(byte[] bArr) {
        return this.b.queryKeyStatus(bArr);
    }

    /* Return type fixed from 'com.google.android.exoplayer2.drm.q' to match base method */
    @Override // com.google.android.exoplayer2.drm.r
    public s c(byte[] bArr) {
        int i = f0.a;
        boolean z = i < 21 && u.d.equals(this.a) && "L3".equals(this.b.getPropertyString("securityLevel"));
        UUID uuid = this.a;
        if (i < 27 && u.c.equals(uuid)) {
            uuid = u.b;
        }
        return new s(uuid, bArr, z);
    }

    @Override // com.google.android.exoplayer2.drm.r
    public synchronized void d() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            this.b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.r
    public r.d e() {
        MediaDrm.ProvisionRequest provisionRequest = this.b.getProvisionRequest();
        return new r.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.r
    public byte[] f() {
        return this.b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void g(byte[] bArr, byte[] bArr2) {
        this.b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void h(r.b<? super s> bVar) {
        this.b.setOnEventListener(new f(this, bVar));
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void i(byte[] bArr) {
        this.b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.r
    public void j(byte[] bArr) {
        this.b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.r
    public byte[] k(byte[] bArr, byte[] bArr2) {
        if (u.c.equals(this.a) && f0.a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(f0.m(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = f0.z(sb.toString());
            } catch (JSONException e) {
                StringBuilder V0 = je.V0("Failed to adjust response data: ");
                V0.append(f0.m(bArr2));
                Log.e("ClearKeyUtil", V0.toString(), e);
            }
        }
        return this.b.provideKeyResponse(bArr, bArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0179, code lost:
        if ("AFTM".equals(r2) == false) goto L_0x0182;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017f, code lost:
        if (r13 != null) goto L_0x0183;
     */
    @Override // com.google.android.exoplayer2.drm.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.drm.r.a l(byte[] r12, java.util.List<com.google.android.exoplayer2.drm.l.b> r13, int r14, java.util.HashMap<java.lang.String, java.lang.String> r15) {
        /*
        // Method dump skipped, instructions count: 520
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.t.l(byte[], java.util.List, int, java.util.HashMap):com.google.android.exoplayer2.drm.r$a");
    }

    public String m(String str) {
        return this.b.getPropertyString(str);
    }

    public void o(String str, String str2) {
        this.b.setPropertyString(str, str2);
    }
}
