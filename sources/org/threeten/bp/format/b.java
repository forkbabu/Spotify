package org.threeten.bp.format;

import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.ZoneId;
import org.threeten.bp.chrono.IsoChronology;
import org.threeten.bp.chrono.e;
import org.threeten.bp.format.DateTimeFormatterBuilder;
import org.threeten.bp.format.c;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.h;

public final class b {
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public static final b l;
    private final DateTimeFormatterBuilder.e a;
    private final Locale b;
    private final g c;
    private final ResolverStyle d;
    private final Set<f> e;
    private final e f;
    private final ZoneId g;

    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder p = dateTimeFormatterBuilder.p(chronoField, 4, 10, signStyle);
        p.e('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        p.o(chronoField2, 2);
        p.e('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        p.o(chronoField3, 2);
        ResolverStyle resolverStyle = ResolverStyle.STRICT;
        b j2 = p.w().j(resolverStyle);
        IsoChronology isoChronology = IsoChronology.c;
        b i2 = j2.i(isoChronology);
        h = i2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder2.t();
        dateTimeFormatterBuilder2.a(i2);
        dateTimeFormatterBuilder2.i();
        dateTimeFormatterBuilder2.w().j(resolverStyle).i(isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.t();
        dateTimeFormatterBuilder3.a(i2);
        dateTimeFormatterBuilder3.s();
        dateTimeFormatterBuilder3.i();
        dateTimeFormatterBuilder3.w().j(resolverStyle).i(isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        dateTimeFormatterBuilder4.o(chronoField4, 2);
        dateTimeFormatterBuilder4.e(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        dateTimeFormatterBuilder4.o(chronoField5, 2);
        dateTimeFormatterBuilder4.s();
        dateTimeFormatterBuilder4.e(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        dateTimeFormatterBuilder4.o(chronoField6, 2);
        dateTimeFormatterBuilder4.s();
        dateTimeFormatterBuilder4.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        b j3 = dateTimeFormatterBuilder4.w().j(resolverStyle);
        i = j3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder5 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder5.t();
        dateTimeFormatterBuilder5.a(j3);
        dateTimeFormatterBuilder5.i();
        dateTimeFormatterBuilder5.w().j(resolverStyle);
        DateTimeFormatterBuilder dateTimeFormatterBuilder6 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder6.t();
        dateTimeFormatterBuilder6.a(j3);
        dateTimeFormatterBuilder6.s();
        dateTimeFormatterBuilder6.i();
        dateTimeFormatterBuilder6.w().j(resolverStyle);
        DateTimeFormatterBuilder dateTimeFormatterBuilder7 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder7.t();
        dateTimeFormatterBuilder7.a(i2);
        dateTimeFormatterBuilder7.e('T');
        dateTimeFormatterBuilder7.a(j3);
        b i3 = dateTimeFormatterBuilder7.w().j(resolverStyle).i(isoChronology);
        j = i3;
        DateTimeFormatterBuilder dateTimeFormatterBuilder8 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder8.t();
        dateTimeFormatterBuilder8.a(i3);
        dateTimeFormatterBuilder8.i();
        b i4 = dateTimeFormatterBuilder8.w().j(resolverStyle).i(isoChronology);
        k = i4;
        DateTimeFormatterBuilder dateTimeFormatterBuilder9 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder9.a(i4);
        dateTimeFormatterBuilder9.s();
        dateTimeFormatterBuilder9.e('[');
        dateTimeFormatterBuilder9.u();
        dateTimeFormatterBuilder9.q();
        dateTimeFormatterBuilder9.e(']');
        dateTimeFormatterBuilder9.w().j(resolverStyle).i(isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder10 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder10.a(i3);
        dateTimeFormatterBuilder10.s();
        dateTimeFormatterBuilder10.i();
        dateTimeFormatterBuilder10.s();
        dateTimeFormatterBuilder10.e('[');
        dateTimeFormatterBuilder10.u();
        dateTimeFormatterBuilder10.q();
        dateTimeFormatterBuilder10.e(']');
        dateTimeFormatterBuilder10.w().j(resolverStyle).i(isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder11 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder11.t();
        DateTimeFormatterBuilder p2 = dateTimeFormatterBuilder11.p(chronoField, 4, 10, signStyle);
        p2.e('-');
        p2.o(ChronoField.DAY_OF_YEAR, 3);
        p2.s();
        p2.i();
        p2.w().j(resolverStyle).i(isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder12 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder12.t();
        DateTimeFormatterBuilder p3 = dateTimeFormatterBuilder12.p(IsoFields.c, 4, 10, signStyle);
        p3.f("-W");
        p3.o(IsoFields.b, 2);
        p3.e('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        p3.o(chronoField7, 1);
        p3.s();
        p3.i();
        p3.w().j(resolverStyle).i(isoChronology);
        DateTimeFormatterBuilder dateTimeFormatterBuilder13 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder13.t();
        dateTimeFormatterBuilder13.c();
        l = dateTimeFormatterBuilder13.w().j(resolverStyle);
        DateTimeFormatterBuilder dateTimeFormatterBuilder14 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder14.t();
        dateTimeFormatterBuilder14.o(chronoField, 4);
        dateTimeFormatterBuilder14.o(chronoField2, 2);
        dateTimeFormatterBuilder14.o(chronoField3, 2);
        dateTimeFormatterBuilder14.s();
        dateTimeFormatterBuilder14.h("+HHMMss", "Z");
        dateTimeFormatterBuilder14.w().j(resolverStyle).i(isoChronology);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        DateTimeFormatterBuilder dateTimeFormatterBuilder15 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder15.t();
        dateTimeFormatterBuilder15.v();
        dateTimeFormatterBuilder15.s();
        dateTimeFormatterBuilder15.k(chronoField7, hashMap);
        dateTimeFormatterBuilder15.f(", ");
        dateTimeFormatterBuilder15.r();
        DateTimeFormatterBuilder p4 = dateTimeFormatterBuilder15.p(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE);
        p4.e(' ');
        p4.k(chronoField2, hashMap2);
        p4.e(' ');
        p4.o(chronoField, 4);
        p4.e(' ');
        p4.o(chronoField4, 2);
        p4.e(':');
        p4.o(chronoField5, 2);
        p4.s();
        p4.e(':');
        p4.o(chronoField6, 2);
        p4.r();
        p4.e(' ');
        p4.h("+HHMM", "GMT");
        p4.w().j(ResolverStyle.SMART).i(isoChronology);
    }

    b(DateTimeFormatterBuilder.e eVar, Locale locale, g gVar, ResolverStyle resolverStyle, Set<f> set, e eVar2, ZoneId zoneId) {
        yif.J(eVar, "printerParser");
        this.a = eVar;
        yif.J(locale, "locale");
        this.b = locale;
        yif.J(gVar, "decimalStyle");
        this.c = gVar;
        yif.J(resolverStyle, "resolverStyle");
        this.d = resolverStyle;
        this.e = set;
        this.f = eVar2;
        this.g = zoneId;
    }

    private a g(CharSequence charSequence, ParsePosition parsePosition) {
        c.b bVar;
        String str;
        ParsePosition parsePosition2 = new ParsePosition(0);
        yif.J(charSequence, "text");
        yif.J(parsePosition2, "position");
        c cVar = new c(this);
        int d2 = this.a.d(cVar, charSequence, parsePosition2.getIndex());
        if (d2 < 0) {
            parsePosition2.setErrorIndex(d2 ^ -1);
            bVar = null;
        } else {
            parsePosition2.setIndex(d2);
            bVar = cVar.s();
        }
        if (bVar == null || parsePosition2.getErrorIndex() >= 0 || parsePosition2.getIndex() < charSequence.length()) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            if (parsePosition2.getErrorIndex() >= 0) {
                StringBuilder a1 = je.a1("Text '", str, "' could not be parsed at index ");
                a1.append(parsePosition2.getErrorIndex());
                throw new DateTimeParseException(a1.toString(), charSequence, parsePosition2.getErrorIndex());
            }
            StringBuilder a12 = je.a1("Text '", str, "' could not be parsed, unparsed text found at index ");
            a12.append(parsePosition2.getIndex());
            throw new DateTimeParseException(a12.toString(), charSequence, parsePosition2.getIndex());
        }
        a aVar = new a();
        aVar.a.putAll(bVar.c);
        aVar.b = c.this.f();
        ZoneId zoneId = bVar.b;
        if (zoneId != null) {
            aVar.c = zoneId;
        } else {
            aVar.c = c.a(c.this);
        }
        aVar.o = bVar.f;
        aVar.p = bVar.n;
        return aVar;
    }

    public String a(org.threeten.bp.temporal.b bVar) {
        StringBuilder sb = new StringBuilder(32);
        yif.J(bVar, "temporal");
        yif.J(sb, "appendable");
        try {
            this.a.g(new e(bVar, this), sb);
            return sb.toString();
        } catch (IOException e2) {
            throw new DateTimeException(e2.getMessage(), e2);
        }
    }

    public e b() {
        return this.f;
    }

    public g c() {
        return this.c;
    }

    public Locale d() {
        return this.b;
    }

    public ZoneId e() {
        return this.g;
    }

    public <T> T f(CharSequence charSequence, h<T> hVar) {
        String str;
        yif.J(charSequence, "text");
        yif.J(hVar, "type");
        try {
            a g2 = g(charSequence, null);
            g2.F(this.d, this.e);
            return hVar.a(g2);
        } catch (DateTimeParseException e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (charSequence.length() > 64) {
                str = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                str = charSequence.toString();
            }
            StringBuilder a1 = je.a1("Text '", str, "' could not be parsed: ");
            a1.append(e3.getMessage());
            throw new DateTimeParseException(a1.toString(), charSequence, 0, e3);
        }
    }

    /* access modifiers changed from: package-private */
    public DateTimeFormatterBuilder.e h(boolean z) {
        return this.a.a(z);
    }

    public b i(e eVar) {
        if (yif.n(this.f, eVar)) {
            return this;
        }
        return new b(this.a, this.b, this.c, this.d, this.e, eVar, this.g);
    }

    public b j(ResolverStyle resolverStyle) {
        yif.J(resolverStyle, "resolverStyle");
        if (yif.n(this.d, resolverStyle)) {
            return this;
        }
        return new b(this.a, this.b, this.c, resolverStyle, this.e, this.f, this.g);
    }

    public b k(ZoneId zoneId) {
        if (yif.n(this.g, zoneId)) {
            return this;
        }
        return new b(this.a, this.b, this.c, this.d, this.e, this.f, zoneId);
    }

    public String toString() {
        String eVar = this.a.toString();
        return eVar.startsWith("[") ? eVar : eVar.substring(1, eVar.length() - 1);
    }
}
