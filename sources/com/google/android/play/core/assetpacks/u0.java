package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class u0 {
    private final Map<String, Double> a = new HashMap();

    u0() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized double a(String str, k1 k1Var) {
        double d;
        double d2 = (double) ((o0) k1Var).g;
        Double.isNaN(d2);
        Double.isNaN(d2);
        double d3 = (double) ((o0) k1Var).h;
        Double.isNaN(d3);
        Double.isNaN(d3);
        d = (d2 + 1.0d) / d3;
        this.a.put(str, Double.valueOf(d));
        return d;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(String str) {
        this.a.put(str, Double.valueOf(0.0d));
    }

    /* access modifiers changed from: package-private */
    public final synchronized double c(String str) {
        Double d = this.a.get(str);
        if (d == null) {
            return 0.0d;
        }
        return d.doubleValue();
    }
}
