package org.threeten.bp;

import com.adjust.sdk.Constants;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.SignStyle;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ChronoUnit;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;
import org.threeten.bp.temporal.h;
import org.threeten.bp.temporal.i;

public final class Year extends cqf implements a, c, Comparable<Year>, Serializable {
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = -23038383694477807L;
    private final int year;

    static {
        new DateTimeFormatterBuilder().p(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).w();
    }

    private Year(int i) {
        this.year = i;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static Year w(b bVar) {
        if (bVar instanceof Year) {
            return (Year) bVar;
        }
        try {
            if (!IsoChronology.c.equals(e.n(bVar))) {
                bVar = LocalDate.N(bVar);
            }
            return z(bVar.r(ChronoField.YEAR));
        } catch (DateTimeException unused) {
            throw new DateTimeException(je.Q0(bVar, je.b1("Unable to obtain Year from TemporalAccessor: ", bVar, ", type ")));
        }
    }

    private Object writeReplace() {
        return new Ser((byte) 67, this);
    }

    public static boolean x(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    public static Year z(int i) {
        ChronoField.YEAR.q((long) i);
        return new Year(i);
    }

    /* renamed from: A */
    public Year v(long j, i iVar) {
        if (!(iVar instanceof ChronoUnit)) {
            return (Year) iVar.h(this, j);
        }
        switch (((ChronoUnit) iVar).ordinal()) {
            case 10:
                return B(j);
            case 11:
                return B(yif.P(j, 10));
            case 12:
                return B(yif.P(j, 100));
            case 13:
                return B(yif.P(j, Constants.ONE_SECOND));
            case 14:
                ChronoField chronoField = ChronoField.ERA;
                return d(chronoField, yif.O(u(chronoField), j));
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    public Year B(long j) {
        return j == 0 ? this : z(ChronoField.YEAR.p(((long) this.year) + j));
    }

    /* renamed from: C */
    public Year d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (Year) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        chronoField.q(j);
        switch (chronoField.ordinal()) {
            case 25:
                if (this.year < 1) {
                    j = 1 - j;
                }
                return z((int) j);
            case 26:
                return z((int) j);
            case 27:
                return u(ChronoField.ERA) == j ? this : z(1 - this.year);
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }

    /* access modifiers changed from: package-private */
    public void D(DataOutput dataOutput) {
        dataOutput.writeInt(this.year);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public int compareTo(Year year2) {
        return this.year - year2.year;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Year) || this.year != ((Year) obj).year) {
            return false;
        }
        return true;
    }

    @Override // org.threeten.bp.temporal.c
    public a g(a aVar) {
        if (e.n(aVar).equals(IsoChronology.c)) {
            return aVar.d(ChronoField.YEAR, (long) this.year);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.year;
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        if (fVar != ChronoField.YEAR_OF_ERA) {
            return super.k(fVar);
        }
        return ValueRange.g(1, this.year <= 0 ? 1000000000 : 999999999);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public <R> R m(h<R> hVar) {
        if (hVar == g.a()) {
            return (R) IsoChronology.c;
        }
        if (hVar == g.e()) {
            return (R) ChronoUnit.YEARS;
        }
        if (hVar == g.b() || hVar == g.c() || hVar == g.f() || hVar == g.g() || hVar == g.d()) {
            return null;
        }
        return (R) super.m(hVar);
    }

    @Override // org.threeten.bp.temporal.b
    public boolean n(f fVar) {
        if (fVar instanceof ChronoField) {
            if (fVar == ChronoField.YEAR || fVar == ChronoField.YEAR_OF_ERA || fVar == ChronoField.ERA) {
                return true;
            }
            return false;
        } else if (fVar == null || !fVar.h(this)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return j == Long.MIN_VALUE ? v(Long.MAX_VALUE, iVar).v(1, iVar) : v(-j, iVar);
    }

    @Override // org.threeten.bp.temporal.a
    public long q(a aVar, i iVar) {
        Year w = w(aVar);
        if (!(iVar instanceof ChronoUnit)) {
            return iVar.g(this, w);
        }
        long j = ((long) w.year) - ((long) this.year);
        switch (((ChronoUnit) iVar).ordinal()) {
            case 10:
                return j;
            case 11:
                return j / 10;
            case 12:
                return j / 100;
            case 13:
                return j / 1000;
            case 14:
                ChronoField chronoField = ChronoField.ERA;
                return w.u(chronoField) - u(chronoField);
            default:
                throw new UnsupportedTemporalTypeException("Unsupported unit: " + iVar);
        }
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public int r(f fVar) {
        return k(fVar).a(u(fVar), fVar);
    }

    @Override // org.threeten.bp.temporal.a
    public a s(c cVar) {
        return (Year) cVar.g(this);
    }

    @Override // java.lang.Object
    public String toString() {
        return Integer.toString(this.year);
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        int i = 1;
        switch (((ChronoField) fVar).ordinal()) {
            case 25:
                int i2 = this.year;
                if (i2 < 1) {
                    i2 = 1 - i2;
                }
                return (long) i2;
            case 26:
                return (long) this.year;
            case 27:
                if (this.year < 1) {
                    i = 0;
                }
                return (long) i;
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }
}
