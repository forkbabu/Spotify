package defpackage;

import android.content.Context;
import java.util.WeakHashMap;

/* renamed from: d3  reason: default package */
public final class d3 {
    private static final WeakHashMap<Context, d3> a = new WeakHashMap<>();

    private d3(Context context) {
    }

    public static d3 a(Context context) {
        d3 d3Var;
        WeakHashMap<Context, d3> weakHashMap = a;
        synchronized (weakHashMap) {
            d3Var = weakHashMap.get(context);
            if (d3Var == null) {
                d3Var = new d3(context);
                weakHashMap.put(context, d3Var);
            }
        }
        return d3Var;
    }
}
