package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.internal.measurement.h;
import com.google.firebase.analytics.connector.internal.b;
import com.google.firebase.analytics.connector.internal.d;
import com.google.firebase.c;
import defpackage.oy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: py  reason: default package */
public class py implements oy {
    private static volatile oy c;
    private final wu a;
    final Map<String, Object> b;

    /* renamed from: py$a */
    class a implements oy.a {
        a(py pyVar, String str) {
        }
    }

    private py(wu wuVar) {
        if (wuVar != null) {
            this.a = wuVar;
            this.b = new ConcurrentHashMap();
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static oy d(c cVar, Context context, r10 r10) {
        if (cVar == null) {
            throw new NullPointerException("null reference");
        } else if (context == null) {
            throw new NullPointerException("null reference");
        } else if (r10 != null) {
            g.l(context.getApplicationContext());
            if (c == null) {
                synchronized (py.class) {
                    if (c == null) {
                        Bundle bundle = new Bundle(1);
                        if (cVar.p()) {
                            r10.b(com.google.firebase.a.class, ry.a, qy.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", cVar.o());
                        }
                        c = new py(h.a(context, null, null, null, bundle).d());
                    }
                }
            }
            return c;
        } else {
            throw new NullPointerException("null reference");
        }
    }

    @Override // defpackage.oy
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.c.a(str) && com.google.firebase.analytics.connector.internal.c.b(str2, bundle) && com.google.firebase.analytics.connector.internal.c.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1);
            }
            this.a.a(str, str2, bundle);
        }
    }

    @Override // defpackage.oy
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.c.a(str) && com.google.firebase.analytics.connector.internal.c.c(str, str2)) {
            this.a.c(str, str2, obj);
        }
    }

    @Override // defpackage.oy
    public oy.a c(String str, oy.b bVar) {
        Object obj;
        if (bVar == null) {
            throw new NullPointerException("null reference");
        } else if (!com.google.firebase.analytics.connector.internal.c.a(str)) {
            return null;
        } else {
            if (!str.isEmpty() && this.b.containsKey(str) && this.b.get(str) != null) {
                return null;
            }
            wu wuVar = this.a;
            if ("fiam".equals(str)) {
                obj = new b(wuVar, bVar);
            } else if ("crash".equals(str) || "clx".equals(str)) {
                obj = new d(wuVar, bVar);
            } else {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            this.b.put(str, obj);
            return new a(this, str);
        }
    }
}
