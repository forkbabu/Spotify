package org.threeten.bp.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.bp.Period;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;

public final class c {
    private Locale a;
    private g b;
    private e c;
    private ZoneId d;
    private boolean e = true;
    private boolean f = true;
    private final ArrayList<b> g;

    public final class b extends cqf {
        e a;
        ZoneId b;
        final Map<f, Long> c;
        boolean f;
        Period n;
        List<Object[]> o;

        @Override // defpackage.cqf, org.threeten.bp.temporal.b
        public <R> R m(h<R> hVar) {
            return hVar == g.a() ? (R) this.a : (hVar == g.g() || hVar == g.f()) ? (R) this.b : (R) super.m(hVar);
        }

        @Override // org.threeten.bp.temporal.b
        public boolean n(f fVar) {
            return this.c.containsKey(fVar);
        }

        @Override // defpackage.cqf, org.threeten.bp.temporal.b
        public int r(f fVar) {
            if (this.c.containsKey(fVar)) {
                return yif.T(this.c.get(fVar).longValue());
            }
            throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }

        public String toString() {
            return this.c.toString() + "," + this.a + "," + this.b;
        }

        @Override // org.threeten.bp.temporal.b
        public long u(f fVar) {
            if (this.c.containsKey(fVar)) {
                return this.c.get(fVar).longValue();
            }
            throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }

        public b w() {
            b bVar = new b();
            bVar.a = this.a;
            bVar.b = this.b;
            bVar.c.putAll(this.c);
            bVar.f = this.f;
            return bVar;
        }

        private b() {
            c.this = r1;
            this.a = null;
            this.b = null;
            this.c = new HashMap();
            this.n = Period.a;
        }
    }

    c(b bVar) {
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.a = bVar.d();
        this.b = bVar.c();
        this.c = bVar.b();
        this.d = bVar.e();
        arrayList.add(new b());
    }

    private b d() {
        ArrayList<b> arrayList = this.g;
        return arrayList.get(arrayList.size() - 1);
    }

    public void b(DateTimeFormatterBuilder.m mVar, long j, int i, int i2) {
        b d2 = d();
        if (d2.o == null) {
            d2.o = new ArrayList(2);
        }
        d2.o.add(new Object[]{mVar, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2)});
    }

    public boolean c(char c2, char c3) {
        if (this.e) {
            return c2 == c3;
        }
        if (c2 == c3 || Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3)) {
            return true;
        }
        return false;
    }

    public void e(boolean z) {
        if (z) {
            ArrayList<b> arrayList = this.g;
            arrayList.remove(arrayList.size() - 2);
            return;
        }
        ArrayList<b> arrayList2 = this.g;
        arrayList2.remove(arrayList2.size() - 1);
    }

    public e f() {
        e eVar = d().a;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = this.c;
        return eVar2 == null ? IsoChronology.c : eVar2;
    }

    public Locale g() {
        return this.a;
    }

    public Long h(f fVar) {
        return d().c.get(fVar);
    }

    public g i() {
        return this.b;
    }

    public boolean j() {
        return this.e;
    }

    public boolean k() {
        return this.f;
    }

    public void l(boolean z) {
        this.e = z;
    }

    public void m(ZoneId zoneId) {
        yif.J(zoneId, "zone");
        d().b = zoneId;
    }

    public int n(f fVar, long j, int i, int i2) {
        yif.J(fVar, "field");
        Long put = d().c.put(fVar, Long.valueOf(j));
        return (put == null || put.longValue() == j) ? i2 : i ^ -1;
    }

    public void o() {
        d().f = true;
    }

    public void p(boolean z) {
        this.f = z;
    }

    public void q() {
        this.g.add(d().w());
    }

    public boolean r(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.e) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char charAt = charSequence.charAt(i + i5);
            char charAt2 = charSequence2.charAt(i2 + i5);
            if (!(charAt == charAt2 || Character.toUpperCase(charAt) == Character.toUpperCase(charAt2) || Character.toLowerCase(charAt) == Character.toLowerCase(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public b s() {
        return d();
    }

    public String toString() {
        return d().toString();
    }

    c(c cVar) {
        ArrayList<b> arrayList = new ArrayList<>();
        this.g = arrayList;
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        arrayList.add(new b());
    }
}
