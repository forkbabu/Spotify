package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class ga extends p9 {
    private String d;
    private Set<Integer> e;
    private Map<Integer, ia> f;
    private Long g;
    private Long h;

    ga(r9 r9Var) {
        super(r9Var);
    }

    private final ia u(int i) {
        if (this.f.containsKey(Integer.valueOf(i))) {
            return this.f.get(Integer.valueOf(i));
        }
        ia iaVar = new ia(this, this.d, null);
        this.f.put(Integer.valueOf(i), iaVar);
        return iaVar;
    }

    private final boolean w(int i, int i2) {
        if (this.f.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return this.f.get(Integer.valueOf(i)).d.get(i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.p9
    public final boolean r() {
        return false;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:365:0x0350 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:368:0x0350 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v92, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v118, types: [java.util.Map] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x030e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x030f, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x040f, code lost:
        r7.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:121:0x02ba] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05d7  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x076a  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x08d9  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0968  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0523 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c0 A[Catch:{ SQLiteException -> 0x022c }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.w0> v(java.lang.String r62, java.util.List<com.google.android.gms.internal.measurement.y0> r63, java.util.List<com.google.android.gms.internal.measurement.f1> r64, java.lang.Long r65, java.lang.Long r66) {
        /*
        // Method dump skipped, instructions count: 2426
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ga.v(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
