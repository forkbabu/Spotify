package com.spotify.mobile.android.video.offline;

import android.content.Context;
import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.util.f0;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.video.drm.f;
import com.spotify.mobile.android.video.exo.u;
import com.spotify.mobile.android.video.i0;
import defpackage.cq;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.Iterator;
import java.util.List;

public class c0 {
    private final Context a;
    private final y62 b;
    private final List<f> c;
    private final z<p62> d;
    private final boolean e;

    public c0(Context context, y62 y62, List<f> list, z<p62> zVar, boolean z) {
        this.a = context;
        this.b = y62;
        this.c = list;
        this.d = zVar;
        this.e = z;
    }

    public z<DownloadHelper> a(d0 d0Var, f0 f0Var) {
        z<p62> zVar = this.d;
        y62 y62 = this.b;
        y62.getClass();
        return zVar.A(new a(y62)).s(new g(this, d0Var, f0Var));
    }

    public d0 b(d0 d0Var, f0 f0Var, List list) {
        c72 c72;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                c72 = null;
                break;
            }
            c72 = (c72) it.next();
            if (c72.c(d0Var)) {
                break;
            }
        }
        if (c72 == null) {
            StringBuilder V0 = je.V0("No media extension for downloading ");
            V0.append(d0Var.b());
            return z.q(new Exception(V0.toString()));
        }
        t a2 = c72.a(d0Var, null, null, new a0(this));
        Context context = this.a;
        cq.d dVar = DownloadHelper.p;
        cq.d dVar2 = cq.d.L;
        cq.e c2 = new cq.e(context).b().c();
        c2.c(true);
        cq.e c3 = c2.b().c();
        c3.e(f0Var.b());
        c3.c(true);
        return z.g(new i(this, new DownloadHelper(c72.getType(), Uri.parse(c72.b(d0Var)), null, a2, c3.b(), f0.w(new u(this.a, null, 1, null), null))));
    }

    /* access modifiers changed from: protected */
    public void c(DownloadHelper downloadHelper) {
        Object f;
        if (this.e && (f = downloadHelper.f()) != null) {
            Optional first = FluentIterable.from(this.c).transform(new h(f)).filter(j.a).first();
            if (first.isPresent()) {
                List list = (List) first.get();
                String[] strArr = new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    strArr[i] = ((i0) list.get(i)).b();
                }
                downloadHelper.c(false, strArr);
            }
        }
    }
}
