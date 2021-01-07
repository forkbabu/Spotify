package org.threeten.bp.chrono;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.f;

public final class JapaneseEra extends aqf implements Serializable {
    public static final JapaneseEra c;
    public static final JapaneseEra f;
    public static final JapaneseEra n;
    public static final JapaneseEra o;
    private static final AtomicReference<JapaneseEra[]> p;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient LocalDate a;
    private final transient String b;
    private final int eraValue;

    static {
        JapaneseEra japaneseEra = new JapaneseEra(-1, LocalDate.k0(1868, 9, 8), "Meiji");
        c = japaneseEra;
        JapaneseEra japaneseEra2 = new JapaneseEra(0, LocalDate.k0(1912, 7, 30), "Taisho");
        f = japaneseEra2;
        JapaneseEra japaneseEra3 = new JapaneseEra(1, LocalDate.k0(1926, 12, 25), "Showa");
        n = japaneseEra3;
        JapaneseEra japaneseEra4 = new JapaneseEra(2, LocalDate.k0(1989, 1, 8), "Heisei");
        o = japaneseEra4;
        p = new AtomicReference<>(new JapaneseEra[]{japaneseEra, japaneseEra2, japaneseEra3, japaneseEra4});
    }

    private JapaneseEra(int i, LocalDate localDate, String str) {
        this.eraValue = i;
        this.a = localDate;
        this.b = str;
    }

    public static JapaneseEra A(int i) {
        JapaneseEra[] japaneseEraArr = p.get();
        if (i >= c.eraValue && i <= japaneseEraArr[japaneseEraArr.length - 1].eraValue) {
            return japaneseEraArr[i + 1];
        }
        throw new DateTimeException("japaneseEra is invalid");
    }

    public static JapaneseEra[] C() {
        JapaneseEra[] japaneseEraArr = p.get();
        return (JapaneseEra[]) Arrays.copyOf(japaneseEraArr, japaneseEraArr.length);
    }

    private Object readResolve() {
        try {
            return A(this.eraValue);
        } catch (DateTimeException e) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        }
    }

    private Object writeReplace() {
        return new Ser((byte) 2, this);
    }

    static JapaneseEra x(LocalDate localDate) {
        if (!localDate.b0(c.a)) {
            JapaneseEra[] japaneseEraArr = p.get();
            for (int length = japaneseEraArr.length - 1; length >= 0; length--) {
                JapaneseEra japaneseEra = japaneseEraArr[length];
                if (localDate.compareTo(japaneseEra.a) >= 0) {
                    return japaneseEra;
                }
            }
            return null;
        }
        throw new DateTimeException("Date too early: " + localDate);
    }

    /* access modifiers changed from: package-private */
    public LocalDate B() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public void D(DataOutput dataOutput) {
        dataOutput.writeByte(this.eraValue);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        ChronoField chronoField = ChronoField.ERA;
        if (fVar == chronoField) {
            return JapaneseChronology.f.z(chronoField);
        }
        return super.k(fVar);
    }

    @Override // java.lang.Object
    public String toString() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public LocalDate w() {
        int i = this.eraValue + 1;
        JapaneseEra[] C = C();
        if (i >= C.length - 1) {
            return LocalDate.b;
        }
        return C[i + 1].a.h0(1);
    }

    public int z() {
        return this.eraValue;
    }
}
