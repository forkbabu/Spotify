package com.facebook.appevents.ml;

import com.facebook.appevents.ml.ModelManager;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class Model {
    private a a;
    private a b;
    private a c;
    private a d;
    private a e;
    private a f;
    private a g;
    private a h;
    private a i;
    private a j;
    private a k;
    private final Map<String, a> l = new HashMap();

    private Model(Map<String, a> map) {
        this.a = map.get("embed.weight");
        this.b = b.k(map.get("convs.0.weight"));
        this.c = b.k(map.get("convs.1.weight"));
        this.d = b.k(map.get("convs.2.weight"));
        this.e = map.get("convs.0.bias");
        this.f = map.get("convs.1.bias");
        this.g = map.get("convs.2.bias");
        this.h = b.j(map.get("fc1.weight"));
        this.i = b.j(map.get("fc2.weight"));
        this.j = map.get("fc1.bias");
        this.k = map.get("fc2.bias");
        Iterator it = new HashSet<String>() {
            /* class com.facebook.appevents.ml.Model.AnonymousClass1 */

            {
                add(ModelManager.Task.MTML_INTEGRITY_DETECT.d());
                add(ModelManager.Task.MTML_APP_EVENT_PREDICTION.d());
            }
        }.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String x0 = je.x0(str, ".weight");
            String x02 = je.x0(str, ".bias");
            a aVar = map.get(x0);
            a aVar2 = map.get(x02);
            if (aVar != null) {
                this.l.put(x0, b.j(aVar));
            }
            if (aVar2 != null) {
                this.l.put(x02, aVar2);
            }
        }
    }

    public static Model a(File file) {
        if (uf.c(Model.class)) {
            return null;
        }
        try {
            try {
                return new Model(b(file));
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th) {
            uf.b(th, Model.class);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        defpackage.uf.b(r0, com.facebook.appevents.ml.Model.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d1 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, com.facebook.appevents.ml.a> b(java.io.File r18) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ml.Model.b(java.io.File):java.util.Map");
    }

    public a c(a aVar, String[] strArr, String str) {
        if (uf.c(this)) {
            return null;
        }
        try {
            a c2 = b.c(b.e(strArr, 128, this.a), this.b);
            b.a(c2, this.e);
            b.i(c2);
            a c3 = b.c(c2, this.c);
            b.a(c3, this.f);
            b.i(c3);
            a g2 = b.g(c3, 2);
            a c4 = b.c(g2, this.d);
            b.a(c4, this.g);
            b.i(c4);
            a g3 = b.g(c2, c2.b(1));
            a g4 = b.g(g2, g2.b(1));
            a g5 = b.g(c4, c4.b(1));
            b.f(g3, 1);
            b.f(g4, 1);
            b.f(g5, 1);
            a d2 = b.d(b.b(new a[]{g3, g4, g5, aVar}), this.h, this.j);
            b.i(d2);
            a d3 = b.d(d2, this.i, this.k);
            b.i(d3);
            Map<String, a> map = this.l;
            a aVar2 = map.get(str + ".weight");
            Map<String, a> map2 = this.l;
            a aVar3 = map2.get(str + ".bias");
            if (aVar2 != null) {
                if (aVar3 != null) {
                    a d4 = b.d(d3, aVar2, aVar3);
                    if (!uf.c(b.class)) {
                        try {
                            int b2 = d4.b(0);
                            int b3 = d4.b(1);
                            float[] a2 = d4.a();
                            for (int i2 = 0; i2 < b2; i2++) {
                                int i3 = i2 * b3;
                                int i4 = i3 + b3;
                                float f2 = Float.MIN_VALUE;
                                float f3 = 0.0f;
                                for (int i5 = i3; i5 < i4; i5++) {
                                    if (a2[i5] > f2) {
                                        f2 = a2[i5];
                                    }
                                }
                                for (int i6 = i3; i6 < i4; i6++) {
                                    a2[i6] = (float) Math.exp((double) (a2[i6] - f2));
                                }
                                for (int i7 = i3; i7 < i4; i7++) {
                                    f3 += a2[i7];
                                }
                                while (i3 < i4) {
                                    a2[i3] = a2[i3] / f3;
                                    i3++;
                                }
                            }
                        } catch (Throwable th) {
                            uf.b(th, b.class);
                        }
                    }
                    return d4;
                }
            }
            return null;
        } catch (Throwable th2) {
            uf.b(th2, this);
            return null;
        }
    }
}
