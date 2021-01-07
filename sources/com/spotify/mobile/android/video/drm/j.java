package com.spotify.mobile.android.video.drm;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.drm.u;
import com.google.common.base.Charsets;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.video.exception.ErrorType;
import java.util.UUID;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.w;
import okhttp3.y;

public class j implements u {
    private static final w e = w.d("application/octet-stream");
    private static final w f = w.d("application/x-www-form-urlencoded");
    private final Handler a = new Handler(Looper.getMainLooper());
    private final c b;
    private final y c;
    private final String d;

    public j(c cVar, y yVar, String str) {
        this.b = cVar;
        this.c = yVar;
        this.d = str;
    }

    public byte[] a(UUID uuid, r.a aVar) {
        Handler handler = this.a;
        c cVar = this.b;
        cVar.getClass();
        handler.post(new b(cVar));
        String b2 = aVar.b();
        byte[] a2 = aVar.a();
        if (!DrmUtil.b.equals(uuid)) {
            throw new DrmException("Unsupported DRM scheme", ErrorType.ERROR_DRM_UNSUPPORTED_SCHEME);
        } else if (!TextUtils.isEmpty(this.d) || !TextUtils.isEmpty(b2)) {
            if (TextUtils.isEmpty(b2)) {
                b2 = this.d;
            }
            a0.a aVar2 = new a0.a();
            aVar2.j(b2);
            aVar2.g(Request.POST, c0.e(e, a2));
            d0 h = this.c.b(aVar2.b()).h();
            if (h.f() == 200) {
                return h.a().b();
            }
            throw new DrmLicenseServerException(h.f(), h.q());
        } else {
            throw new DrmException("No license server", ErrorType.ERROR_DRM_NO_LICENSE_SERVER);
        }
    }

    public byte[] b(UUID uuid, r.d dVar) {
        String b2 = dVar.b();
        byte[] a2 = dVar.a();
        if (DrmUtil.b.equals(uuid)) {
            String str = "?";
            boolean contains = b2.contains(str);
            StringBuilder V0 = je.V0(b2);
            if (contains) {
                str = "&";
            }
            V0.append(str);
            V0.append("signedRequest=");
            V0.append(new String(a2, Charsets.UTF_8));
            String sb = V0.toString();
            a0.a aVar = new a0.a();
            aVar.j(sb);
            aVar.g(Request.POST, c0.e(f, new byte[0]));
            return this.c.b(aVar.b()).h().a().b();
        }
        throw new DrmException("Unsupported DRM scheme", ErrorType.ERROR_DRM_UNSUPPORTED_SCHEME);
    }
}
