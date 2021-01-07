package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.hls.i;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.s;
import defpackage.um;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class f implements i {
    private static i.a a(qj qjVar) {
        boolean z = true;
        boolean z2 = (qjVar instanceof ql) || (qjVar instanceof ml) || (qjVar instanceof ol) || (qjVar instanceof kk);
        if (!(qjVar instanceof nm) && !(qjVar instanceof rk)) {
            z = false;
        }
        return new i.a(qjVar, z2, z);
    }

    private static rk c(e0 e0Var, d0 d0Var, l lVar, List<d0> list) {
        boolean z;
        um umVar = d0Var.p;
        if (umVar != null) {
            int i = 0;
            while (true) {
                if (i >= umVar.e()) {
                    break;
                }
                um.b c = umVar.c(i);
                if (c instanceof o) {
                    z = !((o) c).c.isEmpty();
                    break;
                }
                i++;
            }
        }
        z = false;
        int i2 = z ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new rk(i2, e0Var, null, lVar, list);
    }

    private static nm d(int i, boolean z, d0 d0Var, List<d0> list, e0 e0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else if (z) {
            list = Collections.singletonList(d0.u(null, "application/cea-608", 0, null, null));
        } else {
            list = Collections.emptyList();
        }
        String str = d0Var.o;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(s.a(str))) {
                i2 |= 2;
            }
            if (!"video/avc".equals(s.g(str))) {
                i2 |= 4;
            }
        }
        return new nm(2, e0Var, new sl(i2, list));
    }

    /* JADX INFO: finally extract failed */
    private static boolean e(qj qjVar, nj njVar) {
        try {
            boolean f = qjVar.f(njVar);
            njVar.j();
            return f;
        } catch (EOFException unused) {
            njVar.j();
            return false;
        } catch (Throwable th) {
            njVar.j();
            throw th;
        }
    }

    public i.a b(qj qjVar, Uri uri, d0 d0Var, List<d0> list, l lVar, e0 e0Var, Map<String, List<String>> map, nj njVar) {
        qj qjVar2;
        i.a aVar;
        if (qjVar != null) {
            if ((qjVar instanceof nm) || (qjVar instanceof rk)) {
                return a(qjVar);
            }
            if (qjVar instanceof q) {
                aVar = a(new q(d0Var.J, e0Var));
            } else if (qjVar instanceof ql) {
                aVar = a(new ql(0));
            } else if (qjVar instanceof ml) {
                aVar = a(new ml());
            } else if (qjVar instanceof ol) {
                aVar = a(new ol());
            } else {
                aVar = qjVar instanceof kk ? a(new kk(0, -9223372036854775807L)) : null;
            }
            if (aVar == null) {
                StringBuilder V0 = je.V0("Unexpected previousExtractor type: ");
                V0.append(qjVar.getClass().getSimpleName());
                throw new IllegalArgumentException(V0.toString());
            }
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if ("text/vtt".equals(d0Var.r) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) {
            qjVar2 = new q(d0Var.J, e0Var);
        } else if (lastPathSegment.endsWith(".aac")) {
            qjVar2 = new ql(0);
        } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            qjVar2 = new ml();
        } else if (lastPathSegment.endsWith(".ac4")) {
            qjVar2 = new ol();
        } else if (lastPathSegment.endsWith(".mp3")) {
            qjVar2 = new kk(0, 0);
        } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            qjVar2 = c(e0Var, d0Var, lVar, list);
        } else {
            qjVar2 = d(0, true, d0Var, list, e0Var);
        }
        njVar.j();
        if (e(qjVar2, njVar)) {
            return a(qjVar2);
        }
        if (!(qjVar2 instanceof q)) {
            q qVar = new q(d0Var.J, e0Var);
            if (e(qVar, njVar)) {
                return a(qVar);
            }
        }
        if (!(qjVar2 instanceof ql)) {
            ql qlVar = new ql(0);
            if (e(qlVar, njVar)) {
                return a(qlVar);
            }
        }
        if (!(qjVar2 instanceof ml)) {
            ml mlVar = new ml();
            if (e(mlVar, njVar)) {
                return a(mlVar);
            }
        }
        if (!(qjVar2 instanceof ol)) {
            ol olVar = new ol();
            if (e(olVar, njVar)) {
                return a(olVar);
            }
        }
        if (!(qjVar2 instanceof kk)) {
            kk kkVar = new kk(0, 0);
            if (e(kkVar, njVar)) {
                return a(kkVar);
            }
        }
        if (!(qjVar2 instanceof rk)) {
            rk c = c(e0Var, d0Var, lVar, list);
            if (e(c, njVar)) {
                return a(c);
            }
        }
        if (!(qjVar2 instanceof nm)) {
            nm d = d(0, true, d0Var, list, e0Var);
            if (e(d, njVar)) {
                return a(d);
            }
        }
        return a(qjVar2);
    }
}
