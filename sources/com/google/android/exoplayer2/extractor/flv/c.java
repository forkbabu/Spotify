package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.v;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

final class c extends TagPayloadReader {
    private long b = -9223372036854775807L;

    public c() {
        super(new pj());
    }

    private static Object e(v vVar, int i) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(vVar.q()));
        }
        boolean z = false;
        if (i == 1) {
            if (vVar.x() == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (i == 2) {
            return g(vVar);
        } else {
            if (i == 3) {
                HashMap hashMap = new HashMap();
                while (true) {
                    String g = g(vVar);
                    int x = vVar.x();
                    if (x == 9) {
                        return hashMap;
                    }
                    Object e = e(vVar, x);
                    if (e != null) {
                        hashMap.put(g, e);
                    }
                }
            } else if (i == 8) {
                return f(vVar);
            } else {
                if (i == 10) {
                    int B = vVar.B();
                    ArrayList arrayList = new ArrayList(B);
                    for (int i2 = 0; i2 < B; i2++) {
                        Object e2 = e(vVar, vVar.x());
                        if (e2 != null) {
                            arrayList.add(e2);
                        }
                    }
                    return arrayList;
                } else if (i != 11) {
                    return null;
                } else {
                    Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(vVar.q())).doubleValue());
                    vVar.L(2);
                    return date;
                }
            }
        }
    }

    private static HashMap<String, Object> f(v vVar) {
        int B = vVar.B();
        HashMap<String, Object> hashMap = new HashMap<>(B);
        for (int i = 0; i < B; i++) {
            String g = g(vVar);
            Object e = e(vVar, vVar.x());
            if (e != null) {
                hashMap.put(g, e);
            }
        }
        return hashMap;
    }

    private static String g(v vVar) {
        int D = vVar.D();
        int b2 = vVar.b();
        vVar.L(D);
        return new String(vVar.a, b2, D);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(v vVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(v vVar, long j) {
        if (vVar.x() != 2) {
            throw new ParserException();
        } else if (!"onMetaData".equals(g(vVar)) || vVar.x() != 8) {
            return false;
        } else {
            HashMap<String, Object> f = f(vVar);
            if (f.containsKey("duration")) {
                double doubleValue = ((Double) f.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
            return false;
        }
    }

    public long d() {
        return this.b;
    }
}
