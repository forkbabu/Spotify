package org.threeten.bp.chrono;

import java.io.DataInput;
import java.io.InvalidObjectException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.g;

public abstract class e implements Comparable<e> {
    private static final ConcurrentHashMap<String, e> a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, e> b = new ConcurrentHashMap<>();

    static {
        try {
            Locale.class.getMethod("getUnicodeLocaleType", String.class);
        } catch (Throwable unused) {
        }
    }

    protected e() {
    }

    public static e n(b bVar) {
        yif.J(bVar, "temporal");
        e eVar = (e) bVar.m(g.a());
        return eVar != null ? eVar : IsoChronology.c;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static e s(DataInput dataInput) {
        String readUTF = dataInput.readUTF();
        ConcurrentHashMap<String, e> concurrentHashMap = a;
        if (concurrentHashMap.isEmpty()) {
            u(IsoChronology.c);
            u(ThaiBuddhistChronology.c);
            u(MinguoChronology.c);
            u(JapaneseChronology.f);
            HijrahChronology hijrahChronology = HijrahChronology.c;
            u(hijrahChronology);
            concurrentHashMap.putIfAbsent("Hijrah", hijrahChronology);
            b.putIfAbsent("islamic", hijrahChronology);
            Iterator it = ServiceLoader.load(e.class, e.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                a.putIfAbsent(eVar.q(), eVar);
                String p = eVar.p();
                if (p != null) {
                    b.putIfAbsent(p, eVar);
                }
            }
        }
        e eVar2 = a.get(readUTF);
        if (eVar2 != null || (eVar2 = b.get(readUTF)) != null) {
            return eVar2;
        }
        throw new DateTimeException(je.x0("Unknown chronology: ", readUTF));
    }

    private static void u(e eVar) {
        a.putIfAbsent(eVar.q(), eVar);
        String p = eVar.p();
        if (p != null) {
            b.putIfAbsent(p, eVar);
        }
    }

    private Object writeReplace() {
        return new Ser((byte) 11, this);
    }

    /* renamed from: d */
    public int compareTo(e eVar) {
        return q().compareTo(eVar.q());
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e) || compareTo((e) obj) != 0) {
            return false;
        }
        return true;
    }

    public abstract a g(int i, int i2, int i3);

    public abstract a h(b bVar);

    @Override // java.lang.Object
    public int hashCode() {
        return getClass().hashCode() ^ q().hashCode();
    }

    /* access modifiers changed from: package-private */
    public <D extends a> D i(a aVar) {
        D d = (D) ((a) aVar);
        if (equals(d.z())) {
            return d;
        }
        StringBuilder V0 = je.V0("Chrono mismatch, expected: ");
        V0.append(q());
        V0.append(", actual: ");
        V0.append(d.z().q());
        throw new ClassCastException(V0.toString());
    }

    /* access modifiers changed from: package-private */
    public <D extends a> ChronoLocalDateTimeImpl<D> k(a aVar) {
        ChronoLocalDateTimeImpl<D> chronoLocalDateTimeImpl = (ChronoLocalDateTimeImpl) aVar;
        if (equals(chronoLocalDateTimeImpl.F().z())) {
            return chronoLocalDateTimeImpl;
        }
        StringBuilder V0 = je.V0("Chrono mismatch, required: ");
        V0.append(q());
        V0.append(", supplied: ");
        V0.append(chronoLocalDateTimeImpl.F().z().q());
        throw new ClassCastException(V0.toString());
    }

    /* access modifiers changed from: package-private */
    public <D extends a> ChronoZonedDateTimeImpl<D> l(a aVar) {
        ChronoZonedDateTimeImpl<D> chronoZonedDateTimeImpl = (ChronoZonedDateTimeImpl) aVar;
        if (equals(chronoZonedDateTimeImpl.D().z())) {
            return chronoZonedDateTimeImpl;
        }
        StringBuilder V0 = je.V0("Chrono mismatch, required: ");
        V0.append(q());
        V0.append(", supplied: ");
        V0.append(chronoZonedDateTimeImpl.D().z().q());
        throw new ClassCastException(V0.toString());
    }

    public abstract f m(int i);

    public abstract String p();

    public abstract String q();

    public b<?> r(b bVar) {
        try {
            return h(bVar).w(LocalTime.z(bVar));
        } catch (DateTimeException e) {
            StringBuilder V0 = je.V0("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            V0.append(bVar.getClass());
            throw new DateTimeException(V0.toString(), e);
        }
    }

    @Override // java.lang.Object
    public String toString() {
        return q();
    }

    /* access modifiers changed from: package-private */
    public void v(Map<f, Long> map, ChronoField chronoField, long j) {
        Long l = map.get(chronoField);
        if (l == null || l.longValue() == j) {
            map.put(chronoField, Long.valueOf(j));
            return;
        }
        throw new DateTimeException("Invalid state, field: " + chronoField + " " + l + " conflicts with " + chronoField + " " + j);
    }

    public d<?> w(Instant instant, ZoneId zoneId) {
        return ChronoZonedDateTimeImpl.O(this, instant, zoneId);
    }

    public d<?> x(b bVar) {
        try {
            ZoneId h = ZoneId.h(bVar);
            try {
                return w(Instant.z(bVar), h);
            } catch (DateTimeException unused) {
                return ChronoZonedDateTimeImpl.N(k(r(bVar)), h, null);
            }
        } catch (DateTimeException e) {
            StringBuilder V0 = je.V0("Unable to obtain ChronoZonedDateTime from TemporalAccessor: ");
            V0.append(bVar.getClass());
            throw new DateTimeException(V0.toString(), e);
        }
    }
}
