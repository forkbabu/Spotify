package com.spotify.mobile.android.video.offline;

import android.os.Build;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.drm.v;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.drm.f;
import com.spotify.mobile.android.video.exception.ErrorType;
import io.reactivex.z;
import java.util.Iterator;
import java.util.List;

public class w {
    private final j0 a;
    private final z<p62> b;
    private final List<f> c;
    private final ajf<x> d;

    public w(j0 j0Var, z<p62> zVar, ajf<x> ajf, List<f> list) {
        this.a = j0Var;
        this.b = zVar;
        this.d = ajf;
        this.c = list;
    }

    public void a(String str) {
        this.d.get().a(str);
    }

    public void b(String str, Object obj) {
        if (obj != null) {
            Iterator<f> it = this.c.iterator();
            l lVar = null;
            while (it.hasNext() && (lVar = it.next().b(obj)) == null) {
            }
            if (lVar != null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    v<s> a2 = this.a.a(this.b.d().b());
                    try {
                        this.d.get().c(str, new h0(a2.c(lVar)));
                    } finally {
                        a2.d();
                    }
                } else {
                    throw new DrmException("Unsupported os version", ErrorType.ERROR_DRM_UNSUPPORTED_OS_VERSION);
                }
            }
        }
    }
}
