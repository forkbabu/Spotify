package org.threeten.bp.format;

import com.adjust.sdk.Constants;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZoneOffset;
import org.threeten.bp.format.f;
import org.threeten.bp.format.h;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.IsoFields;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.WeekFields;

public final class DateTimeFormatterBuilder {
    private static final org.threeten.bp.temporal.h<ZoneId> h = new a();
    private static final Map<Character, org.threeten.bp.temporal.f> i;
    static final Comparator<String> j = new c();
    private DateTimeFormatterBuilder a;
    private final DateTimeFormatterBuilder b;
    private final List<f> c;
    private final boolean d;
    private int e;
    private char f;
    private int g;

    /* access modifiers changed from: package-private */
    public enum SettingsParser implements f {
        SENSITIVE,
        INSENSITIVE,
        STRICT,
        LENIENT;

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            int ordinal = ordinal();
            if (ordinal == 0) {
                cVar.l(true);
            } else if (ordinal == 1) {
                cVar.l(false);
            } else if (ordinal == 2) {
                cVar.p(true);
            } else if (ordinal == 3) {
                cVar.p(false);
            }
            return i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            return true;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return "ParseCaseSensitive(true)";
            }
            if (ordinal == 1) {
                return "ParseCaseSensitive(false)";
            }
            if (ordinal == 2) {
                return "ParseStrict(true)";
            }
            if (ordinal == 3) {
                return "ParseStrict(false)";
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* access modifiers changed from: package-private */
    public static class a implements org.threeten.bp.temporal.h<ZoneId> {
        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // org.threeten.bp.temporal.h
        public ZoneId a(org.threeten.bp.temporal.b bVar) {
            ZoneId zoneId = (ZoneId) bVar.m(org.threeten.bp.temporal.g.g());
            if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                return null;
            }
            return zoneId;
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends f {
        final /* synthetic */ h.b c;

        b(DateTimeFormatterBuilder dateTimeFormatterBuilder, h.b bVar) {
            this.c = bVar;
        }

        @Override // org.threeten.bp.format.f
        public String b(org.threeten.bp.temporal.f fVar, long j, TextStyle textStyle, Locale locale) {
            return this.c.a(j, textStyle);
        }

        @Override // org.threeten.bp.format.f
        public Iterator<Map.Entry<String, Long>> c(org.threeten.bp.temporal.f fVar, TextStyle textStyle, Locale locale) {
            return this.c.b(textStyle);
        }
    }

    static class c implements Comparator<String> {
        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            return str3.length() == str4.length() ? str3.compareTo(str4) : str3.length() - str4.length();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements f {
        private final char a;

        d(char c) {
            this.a = c;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            if (i == charSequence.length()) {
                return i ^ -1;
            }
            return !cVar.c(this.a, charSequence.charAt(i)) ? i ^ -1 : i + 1;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            if (this.a == '\'') {
                return "''";
            }
            StringBuilder V0 = je.V0("'");
            V0.append(this.a);
            V0.append("'");
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public interface f {
        int d(c cVar, CharSequence charSequence, int i);

        boolean g(e eVar, StringBuilder sb);
    }

    /* access modifiers changed from: package-private */
    public static final class g implements f {
        private final org.threeten.bp.temporal.f a;
        private final int b;
        private final int c;
        private final boolean f;

        g(org.threeten.bp.temporal.f fVar, int i, int i2, boolean z) {
            yif.J(fVar, "field");
            if (!fVar.k().e()) {
                throw new IllegalArgumentException(je.z0("Field must have a fixed set of values: ", fVar));
            } else if (i < 0 || i > 9) {
                throw new IllegalArgumentException(je.p0("Minimum width must be from 0 to 9 inclusive but was ", i));
            } else if (i2 < 1 || i2 > 9) {
                throw new IllegalArgumentException(je.p0("Maximum width must be from 1 to 9 inclusive but was ", i2));
            } else if (i2 >= i) {
                this.a = fVar;
                this.b = i;
                this.c = i2;
                this.f = z;
            } else {
                throw new IllegalArgumentException(je.s0("Maximum width must exceed or equal the minimum width but ", i2, " < ", i));
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            int i2;
            int i3 = cVar.k() ? this.b : 0;
            int i4 = cVar.k() ? this.c : 9;
            int length = charSequence.length();
            if (i == length) {
                return i3 > 0 ? i ^ -1 : i;
            }
            if (this.f) {
                if (charSequence.charAt(i) != cVar.i().c()) {
                    return i3 > 0 ? i ^ -1 : i;
                }
                i++;
            }
            int i5 = i3 + i;
            if (i5 > length) {
                return i ^ -1;
            }
            int min = Math.min(i4 + i, length);
            int i6 = i;
            int i7 = 0;
            while (true) {
                if (i6 >= min) {
                    i2 = i6;
                    break;
                }
                int i8 = i6 + 1;
                int b2 = cVar.i().b(charSequence.charAt(i6));
                if (b2 >= 0) {
                    i7 = (i7 * 10) + b2;
                    i6 = i8;
                } else if (i8 < i5) {
                    return i ^ -1;
                } else {
                    i2 = i8 - 1;
                }
            }
            BigDecimal movePointLeft = new BigDecimal(i7).movePointLeft(i2 - i);
            ValueRange k = this.a.k();
            BigDecimal valueOf = BigDecimal.valueOf(k.d());
            return cVar.n(this.a, movePointLeft.multiply(BigDecimal.valueOf(k.c()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i, i2);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            Long e = eVar.e(this.a);
            if (e == null) {
                return false;
            }
            g c2 = eVar.c();
            long longValue = e.longValue();
            ValueRange k = this.a.k();
            k.b(longValue, this.a);
            BigDecimal valueOf = BigDecimal.valueOf(k.d());
            BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(k.c()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
            BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
            if (stripTrailingZeros.scale() != 0) {
                String a2 = c2.a(stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.b), this.c), RoundingMode.FLOOR).toPlainString().substring(2));
                if (this.f) {
                    sb.append(c2.c());
                }
                sb.append(a2);
                return true;
            } else if (this.b <= 0) {
                return true;
            } else {
                if (this.f) {
                    sb.append(c2.c());
                }
                for (int i = 0; i < this.b; i++) {
                    sb.append(c2.f());
                }
                return true;
            }
        }

        public String toString() {
            String str = this.f ? ",DecimalPoint" : "";
            StringBuilder V0 = je.V0("Fraction(");
            V0.append(this.a);
            V0.append(",");
            V0.append(this.b);
            V0.append(",");
            V0.append(this.c);
            V0.append(str);
            V0.append(")");
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements f {
        h(int i) {
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            int i2;
            int i3;
            int i4;
            cVar.getClass();
            c cVar2 = new c(cVar);
            DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
            dateTimeFormatterBuilder.a(b.h);
            dateTimeFormatterBuilder.e('T');
            ChronoField chronoField = ChronoField.HOUR_OF_DAY;
            dateTimeFormatterBuilder.o(chronoField, 2);
            dateTimeFormatterBuilder.e(':');
            ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
            dateTimeFormatterBuilder.o(chronoField2, 2);
            dateTimeFormatterBuilder.e(':');
            ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
            dateTimeFormatterBuilder.o(chronoField3, 2);
            ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
            dateTimeFormatterBuilder.b(chronoField4, 0, 9, true);
            dateTimeFormatterBuilder.e('Z');
            int d = dateTimeFormatterBuilder.w().h(false).d(cVar2, charSequence, i);
            if (d < 0) {
                return d;
            }
            long longValue = cVar2.h(ChronoField.YEAR).longValue();
            int intValue = cVar2.h(ChronoField.MONTH_OF_YEAR).intValue();
            int intValue2 = cVar2.h(ChronoField.DAY_OF_MONTH).intValue();
            int intValue3 = cVar2.h(chronoField).intValue();
            int intValue4 = cVar2.h(chronoField2).intValue();
            Long h = cVar2.h(chronoField3);
            Long h2 = cVar2.h(chronoField4);
            int intValue5 = h != null ? h.intValue() : 0;
            int intValue6 = h2 != null ? h2.intValue() : 0;
            int i5 = ((int) longValue) % 10000;
            if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
                i2 = intValue5;
                i4 = 1;
                i3 = 0;
            } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
                cVar.o();
                i3 = intValue3;
                i4 = 0;
                i2 = 59;
            } else {
                i3 = intValue3;
                i2 = intValue5;
                i4 = 0;
            }
            try {
                return cVar.n(chronoField4, (long) intValue6, i, cVar.n(ChronoField.INSTANT_SECONDS, LocalDateTime.b0(i5, intValue, intValue2, i3, intValue4, i2, 0).j0((long) i4).C(ZoneOffset.n) + yif.Q(longValue / 10000, 315569520000L), i, d));
            } catch (RuntimeException unused) {
                return i ^ -1;
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            boolean z;
            Long e = eVar.e(ChronoField.INSTANT_SECONDS);
            Long l = 0L;
            org.threeten.bp.temporal.b d = eVar.d();
            ChronoField chronoField = ChronoField.NANO_OF_SECOND;
            if (d.n(chronoField)) {
                l = Long.valueOf(eVar.d().u(chronoField));
            }
            if (e == null) {
                return false;
            }
            long longValue = e.longValue();
            int p = chronoField.p(l.longValue());
            if (longValue >= -62167219200L) {
                long j = (longValue - 315569520000L) + 62167219200L;
                long o = yif.o(j, 315569520000L) + 1;
                LocalDateTime f0 = LocalDateTime.f0(yif.r(j, 315569520000L) - 62167219200L, 0, ZoneOffset.n);
                if (o > 0) {
                    sb.append('+');
                    sb.append(o);
                }
                sb.append(f0);
                if (f0.O() == 0) {
                    sb.append(":00");
                }
            } else {
                long j2 = longValue + 62167219200L;
                long j3 = j2 / 315569520000L;
                long j4 = j2 % 315569520000L;
                LocalDateTime f02 = LocalDateTime.f0(j4 - 62167219200L, 0, ZoneOffset.n);
                int length = sb.length();
                sb.append(f02);
                if (f02.O() == 0) {
                    sb.append(":00");
                }
                if (j3 < 0) {
                    if (f02.P() == -10000) {
                        sb.replace(length, length + 2, Long.toString(j3 - 1));
                    } else if (j4 == 0) {
                        sb.insert(length, j3);
                    } else {
                        sb.insert(length + 1, Math.abs(j3));
                    }
                }
            }
            if (p != 0) {
                sb.append('.');
                if (p % 1000000 == 0) {
                    z = true;
                    sb.append(Integer.toString((p / 1000000) + Constants.ONE_SECOND).substring(1));
                } else {
                    z = true;
                    if (p % Constants.ONE_SECOND == 0) {
                        sb.append(Integer.toString((p / Constants.ONE_SECOND) + 1000000).substring(1));
                    } else {
                        sb.append(Integer.toString(p + 1000000000).substring(1));
                    }
                }
            } else {
                z = true;
            }
            sb.append('Z');
            return z;
        }

        public String toString() {
            return "Instant()";
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements f {
        private final TextStyle a;

        public i(TextStyle textStyle) {
            this.a = textStyle;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            char charAt;
            if (!cVar.r(charSequence, i, "GMT", 0, 3)) {
                return i ^ -1;
            }
            int i2 = i + 3;
            if (this.a == TextStyle.FULL) {
                return new k("", "+HH:MM:ss").d(cVar, charSequence, i2);
            }
            int length = charSequence.length();
            if (i2 == length) {
                return cVar.n(ChronoField.OFFSET_SECONDS, 0, i2, i2);
            }
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 != '+' && charAt2 != '-') {
                return cVar.n(ChronoField.OFFSET_SECONDS, 0, i2, i2);
            }
            int i3 = charAt2 == '-' ? -1 : 1;
            if (i2 == length) {
                return i2 ^ -1;
            }
            int i4 = i2 + 1;
            char charAt3 = charSequence.charAt(i4);
            if (charAt3 < '0' || charAt3 > '9') {
                return i4 ^ -1;
            }
            int i5 = i4 + 1;
            int i6 = charAt3 - '0';
            if (i5 != length && (charAt = charSequence.charAt(i5)) >= '0' && charAt <= '9') {
                i6 = (i6 * 10) + (charAt - '0');
                if (i6 > 23) {
                    return i5 ^ -1;
                }
                i5++;
            }
            if (i5 == length || charSequence.charAt(i5) != ':') {
                return cVar.n(ChronoField.OFFSET_SECONDS, (long) (i3 * 3600 * i6), i5, i5);
            }
            int i7 = i5 + 1;
            int i8 = length - 2;
            if (i7 > i8) {
                return i7 ^ -1;
            }
            char charAt4 = charSequence.charAt(i7);
            if (charAt4 < '0' || charAt4 > '9') {
                return i7 ^ -1;
            }
            int i9 = i7 + 1;
            int i10 = charAt4 - '0';
            char charAt5 = charSequence.charAt(i9);
            if (charAt5 < '0' || charAt5 > '9') {
                return i9 ^ -1;
            }
            int i11 = i9 + 1;
            int i12 = (charAt5 - '0') + (i10 * 10);
            if (i12 > 59) {
                return i11 ^ -1;
            }
            if (i11 == length || charSequence.charAt(i11) != ':') {
                return cVar.n(ChronoField.OFFSET_SECONDS, (long) (((i12 * 60) + (i6 * 3600)) * i3), i11, i11);
            }
            int i13 = i11 + 1;
            if (i13 > i8) {
                return i13 ^ -1;
            }
            char charAt6 = charSequence.charAt(i13);
            if (charAt6 < '0' || charAt6 > '9') {
                return i13 ^ -1;
            }
            int i14 = i13 + 1;
            int i15 = charAt6 - '0';
            char charAt7 = charSequence.charAt(i14);
            if (charAt7 < '0' || charAt7 > '9') {
                return i14 ^ -1;
            }
            int i16 = i14 + 1;
            int i17 = (charAt7 - '0') + (i15 * 10);
            if (i17 > 59) {
                return i16 ^ -1;
            }
            return cVar.n(ChronoField.OFFSET_SECONDS, (long) (((i12 * 60) + (i6 * 3600) + i17) * i3), i16, i16);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            Long e = eVar.e(ChronoField.OFFSET_SECONDS);
            if (e == null) {
                return false;
            }
            sb.append("GMT");
            if (this.a == TextStyle.FULL) {
                return new k("", "+HH:MM:ss").g(eVar, sb);
            }
            int T = yif.T(e.longValue());
            if (T == 0) {
                return true;
            }
            int abs = Math.abs((T / 3600) % 100);
            int abs2 = Math.abs((T / 60) % 60);
            int abs3 = Math.abs(T % 60);
            sb.append(T < 0 ? "-" : "+");
            sb.append(abs);
            if (abs2 <= 0 && abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs2 / 10) + 48));
            sb.append((char) ((abs2 % 10) + 48));
            if (abs3 <= 0) {
                return true;
            }
            sb.append(":");
            sb.append((char) ((abs3 / 10) + 48));
            sb.append((char) ((abs3 % 10) + 48));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements f {
        static final String[] c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};
        static final k f = new k("Z", "+HH:MM:ss");
        private final String a;
        private final int b;

        k(String str, String str2) {
            yif.J(str, "noOffsetText");
            yif.J(str2, "pattern");
            this.a = str;
            int i = 0;
            while (true) {
                String[] strArr = c;
                if (i >= strArr.length) {
                    throw new IllegalArgumentException(je.x0("Invalid zone offset pattern: ", str2));
                } else if (strArr[i].equals(str2)) {
                    this.b = i;
                    return;
                } else {
                    i++;
                }
            }
        }

        private boolean a(int[] iArr, int i, CharSequence charSequence, boolean z) {
            int i2;
            int i3 = this.b;
            if ((i3 + 3) / 2 < i) {
                return false;
            }
            int i4 = iArr[0];
            if (i3 % 2 == 0 && i > 1) {
                int i5 = i4 + 1;
                if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                    return z;
                }
                i4 = i5;
            }
            if (i4 + 2 > charSequence.length()) {
                return z;
            }
            int i6 = i4 + 1;
            char charAt = charSequence.charAt(i4);
            int i7 = i6 + 1;
            char charAt2 = charSequence.charAt(i6);
            if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i2 = (charAt2 - '0') + ((charAt - '0') * 10)) < 0 || i2 > 59) {
                return z;
            }
            iArr[i] = i2;
            iArr[0] = i7;
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x007f  */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(org.threeten.bp.format.c r15, java.lang.CharSequence r16, int r17) {
            /*
                r14 = this;
                r0 = r14
                r7 = r16
                r8 = r17
                int r1 = r16.length()
                java.lang.String r2 = r0.a
                int r9 = r2.length()
                r10 = -1
                if (r9 != 0) goto L_0x0022
                if (r8 != r1) goto L_0x0044
                org.threeten.bp.temporal.ChronoField r2 = org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS
                r3 = 0
                r1 = r15
                r5 = r17
                r6 = r17
                int r1 = r1.n(r2, r3, r5, r6)
                return r1
            L_0x0022:
                if (r8 != r1) goto L_0x0027
                r1 = r8 ^ -1
                return r1
            L_0x0027:
                java.lang.String r4 = r0.a
                r5 = 0
                r1 = r15
                r2 = r16
                r3 = r17
                r6 = r9
                boolean r1 = r1.r(r2, r3, r4, r5, r6)
                if (r1 == 0) goto L_0x0044
                org.threeten.bp.temporal.ChronoField r2 = org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r9
                r1 = r15
                r5 = r17
                int r1 = r1.n(r2, r3, r5, r6)
                return r1
            L_0x0044:
                char r1 = r16.charAt(r17)
                r2 = 43
                r3 = 45
                if (r1 == r2) goto L_0x0050
                if (r1 != r3) goto L_0x00a3
            L_0x0050:
                r2 = 1
                if (r1 != r3) goto L_0x0055
                r1 = -1
                goto L_0x0056
            L_0x0055:
                r1 = 1
            L_0x0056:
                r3 = 4
                int[] r3 = new int[r3]
                int r4 = r8 + 1
                r5 = 0
                r3[r5] = r4
                boolean r4 = r14.a(r3, r2, r7, r2)
                r6 = 2
                r11 = 3
                if (r4 != 0) goto L_0x007c
                int r4 = r0.b
                if (r4 < r11) goto L_0x006c
                r4 = 1
                goto L_0x006d
            L_0x006c:
                r4 = 0
            L_0x006d:
                boolean r4 = r14.a(r3, r6, r7, r4)
                if (r4 != 0) goto L_0x007c
                boolean r4 = r14.a(r3, r11, r7, r5)
                if (r4 == 0) goto L_0x007a
                goto L_0x007c
            L_0x007a:
                r4 = 0
                goto L_0x007d
            L_0x007c:
                r4 = 1
            L_0x007d:
                if (r4 != 0) goto L_0x00a3
                long r9 = (long) r1
                r1 = r3[r2]
                long r1 = (long) r1
                r12 = 3600(0xe10, double:1.7786E-320)
                long r1 = r1 * r12
                r4 = r3[r6]
                long r6 = (long) r4
                r12 = 60
                long r6 = r6 * r12
                long r6 = r6 + r1
                r1 = r3[r11]
                long r1 = (long) r1
                long r6 = r6 + r1
                long r6 = r6 * r9
                org.threeten.bp.temporal.ChronoField r2 = org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS
                r9 = r3[r5]
                r1 = r15
                r3 = r6
                r5 = r17
                r6 = r9
                int r1 = r1.n(r2, r3, r5, r6)
                return r1
            L_0x00a3:
                if (r9 != 0) goto L_0x00b3
                org.threeten.bp.temporal.ChronoField r2 = org.threeten.bp.temporal.ChronoField.OFFSET_SECONDS
                r3 = 0
                int r6 = r8 + r9
                r1 = r15
                r5 = r17
                int r1 = r1.n(r2, r3, r5, r6)
                return r1
            L_0x00b3:
                r1 = r8 ^ -1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder.k.d(org.threeten.bp.format.c, java.lang.CharSequence, int):int");
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            Long e = eVar.e(ChronoField.OFFSET_SECONDS);
            if (e == null) {
                return false;
            }
            int T = yif.T(e.longValue());
            if (T == 0) {
                sb.append(this.a);
            } else {
                int abs = Math.abs((T / 3600) % 100);
                int abs2 = Math.abs((T / 60) % 60);
                int abs3 = Math.abs(T % 60);
                int length = sb.length();
                sb.append(T < 0 ? "-" : "+");
                sb.append((char) ((abs / 10) + 48));
                sb.append((char) ((abs % 10) + 48));
                int i = this.b;
                if (i >= 3 || (i >= 1 && abs2 > 0)) {
                    String str = ":";
                    sb.append(i % 2 == 0 ? str : "");
                    sb.append((char) ((abs2 / 10) + 48));
                    sb.append((char) ((abs2 % 10) + 48));
                    abs += abs2;
                    int i2 = this.b;
                    if (i2 >= 7 || (i2 >= 5 && abs3 > 0)) {
                        if (i2 % 2 != 0) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append((char) ((abs3 / 10) + 48));
                        sb.append((char) ((abs3 % 10) + 48));
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                    sb.append(this.a);
                }
            }
            return true;
        }

        public String toString() {
            String replace = this.a.replace("'", "''");
            StringBuilder V0 = je.V0("Offset(");
            V0.append(c[this.b]);
            V0.append(",'");
            V0.append(replace);
            V0.append("')");
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements f {
        private final f a;
        private final int b;
        private final char c;

        l(f fVar, int i, char c2) {
            this.a = fVar;
            this.b = i;
            this.c = c2;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            boolean k = cVar.k();
            boolean j = cVar.j();
            if (i > charSequence.length()) {
                throw new IndexOutOfBoundsException();
            } else if (i == charSequence.length()) {
                return i ^ -1;
            } else {
                int i2 = this.b + i;
                if (i2 > charSequence.length()) {
                    if (k) {
                        return i ^ -1;
                    }
                    i2 = charSequence.length();
                }
                int i3 = i;
                while (i3 < i2) {
                    char charAt = charSequence.charAt(i3);
                    char c2 = this.c;
                    if (!j) {
                        if (!cVar.c(charAt, c2)) {
                            break;
                        }
                    } else if (charAt != c2) {
                        break;
                    }
                    i3++;
                }
                int d = this.a.d(cVar, charSequence.subSequence(0, i2), i3);
                return (d == i2 || !k) ? d : (i + i3) ^ -1;
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            int length = sb.length();
            if (!this.a.g(eVar, sb)) {
                return false;
            }
            int length2 = sb.length() - length;
            if (length2 <= this.b) {
                for (int i = 0; i < this.b - length2; i++) {
                    sb.insert(length, this.c);
                }
                return true;
            }
            StringBuilder W0 = je.W0("Cannot print as output of ", length2, " characters exceeds pad width of ");
            W0.append(this.b);
            throw new DateTimeException(W0.toString());
        }

        public String toString() {
            String str;
            StringBuilder V0 = je.V0("Pad(");
            V0.append(this.a);
            V0.append(",");
            V0.append(this.b);
            if (this.c == ' ') {
                str = ")";
            } else {
                StringBuilder V02 = je.V0(",'");
                V02.append(this.c);
                V02.append("')");
                str = V02.toString();
            }
            V0.append(str);
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements f {
        private final String a;

        n(String str) {
            this.a = str;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            if (i > charSequence.length() || i < 0) {
                throw new IndexOutOfBoundsException();
            }
            String str = this.a;
            if (!cVar.r(charSequence, i, str, 0, str.length())) {
                return i ^ -1;
            }
            return this.a.length() + i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            sb.append(this.a);
            return true;
        }

        public String toString() {
            return je.y0("'", this.a.replace("'", "''"), "'");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements f {
        private final org.threeten.bp.temporal.f a;
        private final TextStyle b;
        private final f c;
        private volatile j f;

        o(org.threeten.bp.temporal.f fVar, TextStyle textStyle, f fVar2) {
            this.a = fVar;
            this.b = textStyle;
            this.c = fVar2;
        }

        private j a() {
            if (this.f == null) {
                this.f = new j(this.a, 1, 19, SignStyle.NORMAL);
            }
            return this.f;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException();
            }
            Iterator<Map.Entry<String, Long>> c2 = this.c.c(this.a, cVar.k() ? this.b : null, cVar.g());
            if (c2 != null) {
                while (c2.hasNext()) {
                    Map.Entry<String, Long> next = c2.next();
                    String key = next.getKey();
                    if (cVar.r(key, 0, charSequence, i, key.length())) {
                        return cVar.n(this.a, next.getValue().longValue(), i, key.length() + i);
                    }
                }
                if (cVar.k()) {
                    return i ^ -1;
                }
            }
            return a().d(cVar, charSequence, i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            Long e = eVar.e(this.a);
            if (e == null) {
                return false;
            }
            String b2 = this.c.b(this.a, e.longValue(), this.b, eVar.b());
            if (b2 == null) {
                return a().g(eVar, sb);
            }
            sb.append(b2);
            return true;
        }

        public String toString() {
            if (this.b == TextStyle.FULL) {
                StringBuilder V0 = je.V0("Text(");
                V0.append(this.a);
                V0.append(")");
                return V0.toString();
            }
            StringBuilder V02 = je.V0("Text(");
            V02.append(this.a);
            V02.append(",");
            V02.append(this.b);
            V02.append(")");
            return V02.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements f {
        private final char a;
        private final int b;

        public p(char c, int i) {
            this.a = c;
            this.b = i;
        }

        private f a(WeekFields weekFields) {
            j jVar;
            SignStyle signStyle = SignStyle.NOT_NEGATIVE;
            char c = this.a;
            if (c == 'W') {
                jVar = new j(weekFields.h(), 1, 2, signStyle);
            } else if (c != 'Y') {
                if (c == 'c') {
                    jVar = new j(weekFields.b(), this.b, 2, signStyle);
                } else if (c == 'e') {
                    jVar = new j(weekFields.b(), this.b, 2, signStyle);
                } else if (c != 'w') {
                    return null;
                } else {
                    jVar = new j(weekFields.i(), this.b, 2, signStyle);
                }
            } else if (this.b == 2) {
                return new m(weekFields.g(), 2, 2, 0, m.r);
            } else {
                org.threeten.bp.temporal.f g = weekFields.g();
                int i = this.b;
                return new j(g, i, 19, i < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD, -1, null);
            }
            return jVar;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            return ((j) a(WeekFields.e(cVar.g()))).d(cVar, charSequence, i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            return ((j) a(WeekFields.e(eVar.b()))).g(eVar, sb);
        }

        public String toString() {
            StringBuilder T0 = je.T0(30, "Localized(");
            char c = this.a;
            if (c == 'Y') {
                int i = this.b;
                if (i == 1) {
                    T0.append("WeekBasedYear");
                } else if (i == 2) {
                    T0.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
                } else {
                    T0.append("WeekBasedYear,");
                    T0.append(this.b);
                    T0.append(",");
                    T0.append(19);
                    T0.append(",");
                    T0.append(this.b < 4 ? SignStyle.NORMAL : SignStyle.EXCEEDS_PAD);
                }
            } else {
                if (c == 'c' || c == 'e') {
                    T0.append("DayOfWeek");
                } else if (c == 'w') {
                    T0.append("WeekOfWeekBasedYear");
                } else if (c == 'W') {
                    T0.append("WeekOfMonth");
                }
                T0.append(",");
                T0.append(this.b);
            }
            T0.append(")");
            return T0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r implements f {
        private static final Comparator<String> b = new a();
        private final TextStyle a;

        static class a implements Comparator<String> {
            a() {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                int length = str4.length() - str3.length();
                return length == 0 ? str3.compareTo(str4) : length;
            }
        }

        r(TextStyle textStyle) {
            yif.J(textStyle, "textStyle");
            this.a = textStyle;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            TreeMap treeMap = new TreeMap(b);
            Map<String, String> map = ZoneId.a;
            Iterator it = new HashSet(org.threeten.bp.zone.c.a()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                treeMap.put(str, str);
                TimeZone timeZone = TimeZone.getTimeZone(str);
                TextStyle textStyle = this.a;
                textStyle.getClass();
                int i2 = TextStyle.values()[textStyle.ordinal() & -2] == TextStyle.FULL ? 1 : 0;
                treeMap.put(timeZone.getDisplayName(false, i2, cVar.g()), str);
                treeMap.put(timeZone.getDisplayName(true, i2, cVar.g()), str);
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                String str2 = (String) entry.getKey();
                if (cVar.r(charSequence, i, str2, 0, str2.length())) {
                    cVar.m(ZoneId.w((String) entry.getValue()));
                    return str2.length() + i;
                }
            }
            return i ^ -1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean g(org.threeten.bp.format.e r7, java.lang.StringBuilder r8) {
            /*
                r6 = this;
                org.threeten.bp.temporal.h r0 = org.threeten.bp.temporal.g.g()
                java.lang.Object r0 = r7.f(r0)
                org.threeten.bp.ZoneId r0 = (org.threeten.bp.ZoneId) r0
                r1 = 0
                if (r0 != 0) goto L_0x000e
                return r1
            L_0x000e:
                org.threeten.bp.zone.ZoneRules r2 = r0.l()     // Catch:{ ZoneRulesException -> 0x001f }
                boolean r3 = r2.e()     // Catch:{ ZoneRulesException -> 0x001f }
                if (r3 == 0) goto L_0x001f
                org.threeten.bp.Instant r3 = org.threeten.bp.Instant.a     // Catch:{ ZoneRulesException -> 0x001f }
                org.threeten.bp.ZoneOffset r2 = r2.a(r3)     // Catch:{ ZoneRulesException -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r2 = r0
            L_0x0020:
                boolean r2 = r2 instanceof org.threeten.bp.ZoneOffset
                r3 = 1
                if (r2 == 0) goto L_0x002d
                java.lang.String r7 = r0.i()
                r8.append(r7)
                return r3
            L_0x002d:
                org.threeten.bp.temporal.b r2 = r7.d()
                org.threeten.bp.temporal.ChronoField r4 = org.threeten.bp.temporal.ChronoField.INSTANT_SECONDS
                boolean r5 = r2.n(r4)
                if (r5 == 0) goto L_0x004a
                long r4 = r2.u(r4)
                org.threeten.bp.Instant r2 = org.threeten.bp.Instant.F(r4)
                org.threeten.bp.zone.ZoneRules r4 = r0.l()
                boolean r2 = r4.d(r2)
                goto L_0x004b
            L_0x004a:
                r2 = 0
            L_0x004b:
                java.lang.String r0 = r0.i()
                java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
                org.threeten.bp.format.TextStyle r4 = r6.a
                r4.getClass()
                org.threeten.bp.format.TextStyle[] r5 = org.threeten.bp.format.TextStyle.values()
                int r4 = r4.ordinal()
                r4 = r4 & -2
                r4 = r5[r4]
                org.threeten.bp.format.TextStyle r5 = org.threeten.bp.format.TextStyle.FULL
                if (r4 != r5) goto L_0x0069
                r1 = 1
            L_0x0069:
                java.util.Locale r7 = r7.b()
                java.lang.String r7 = r0.getDisplayName(r2, r1, r7)
                r8.append(r7)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder.r.g(org.threeten.bp.format.e, java.lang.StringBuilder):boolean");
        }

        public String toString() {
            StringBuilder V0 = je.V0("ZoneText(");
            V0.append(this.a);
            V0.append(")");
            return V0.toString();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        org.threeten.bp.temporal.f fVar = IsoFields.a;
        hashMap.put('Q', fVar);
        hashMap.put('q', fVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    private int d(f fVar) {
        yif.J(fVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            l lVar = new l(fVar, i2, dateTimeFormatterBuilder.f);
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = 0;
            fVar = lVar;
        }
        dateTimeFormatterBuilder.c.add(fVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        dateTimeFormatterBuilder2.g = -1;
        return dateTimeFormatterBuilder2.c.size() - 1;
    }

    private DateTimeFormatterBuilder m(j jVar) {
        j jVar2;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0 || !(dateTimeFormatterBuilder.c.get(i2) instanceof j)) {
            this.a.g = d(jVar);
        } else {
            DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
            int i3 = dateTimeFormatterBuilder2.g;
            j jVar3 = (j) dateTimeFormatterBuilder2.c.get(i3);
            int i4 = jVar.b;
            int i5 = jVar.c;
            if (i4 == i5 && jVar.f == SignStyle.NOT_NEGATIVE) {
                jVar2 = jVar3.f(i5);
                d(jVar.e());
                this.a.g = i3;
            } else {
                jVar2 = jVar3.e();
                this.a.g = d(jVar);
            }
            this.a.c.set(i3, jVar2);
        }
        return this;
    }

    public DateTimeFormatterBuilder a(b bVar) {
        yif.J(bVar, "formatter");
        d(bVar.h(false));
        return this;
    }

    public DateTimeFormatterBuilder b(org.threeten.bp.temporal.f fVar, int i2, int i3, boolean z) {
        d(new g(fVar, i2, i3, z));
        return this;
    }

    public DateTimeFormatterBuilder c() {
        d(new h(-2));
        return this;
    }

    public DateTimeFormatterBuilder e(char c2) {
        d(new d(c2));
        return this;
    }

    public DateTimeFormatterBuilder f(String str) {
        yif.J(str, "literal");
        if (str.length() > 0) {
            if (str.length() == 1) {
                d(new d(str.charAt(0)));
            } else {
                d(new n(str));
            }
        }
        return this;
    }

    public DateTimeFormatterBuilder g(TextStyle textStyle) {
        yif.J(textStyle, "style");
        if (textStyle == TextStyle.FULL || textStyle == TextStyle.SHORT) {
            d(new i(textStyle));
            return this;
        }
        throw new IllegalArgumentException("Style must be either full or short");
    }

    public DateTimeFormatterBuilder h(String str, String str2) {
        d(new k(str2, str));
        return this;
    }

    public DateTimeFormatterBuilder i() {
        d(k.f);
        return this;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x03ef A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.threeten.bp.format.DateTimeFormatterBuilder j(java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 1130
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder.j(java.lang.String):org.threeten.bp.format.DateTimeFormatterBuilder");
    }

    public DateTimeFormatterBuilder k(org.threeten.bp.temporal.f fVar, Map<Long, String> map) {
        yif.J(fVar, "field");
        yif.J(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        d(new o(fVar, textStyle, new b(this, new h.b(Collections.singletonMap(textStyle, linkedHashMap)))));
        return this;
    }

    public DateTimeFormatterBuilder l(org.threeten.bp.temporal.f fVar, TextStyle textStyle) {
        yif.J(fVar, "field");
        yif.J(textStyle, "textStyle");
        int i2 = f.b;
        d(new o(fVar, textStyle, f.a.a));
        return this;
    }

    public DateTimeFormatterBuilder n(org.threeten.bp.temporal.f fVar) {
        yif.J(fVar, "field");
        m(new j(fVar, 1, 19, SignStyle.NORMAL));
        return this;
    }

    public DateTimeFormatterBuilder o(org.threeten.bp.temporal.f fVar, int i2) {
        yif.J(fVar, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException(je.p0("The width must be from 1 to 19 inclusive but was ", i2));
        }
        m(new j(fVar, i2, i2, SignStyle.NOT_NEGATIVE));
        return this;
    }

    public DateTimeFormatterBuilder p(org.threeten.bp.temporal.f fVar, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            o(fVar, i3);
            return this;
        }
        yif.J(fVar, "field");
        yif.J(signStyle, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException(je.p0("The minimum width must be from 1 to 19 inclusive but was ", i2));
        } else if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException(je.p0("The maximum width must be from 1 to 19 inclusive but was ", i3));
        } else if (i3 >= i2) {
            m(new j(fVar, i2, i3, signStyle));
            return this;
        } else {
            throw new IllegalArgumentException(je.s0("The maximum width must exceed or equal the minimum width but ", i3, " < ", i2));
        }
    }

    public DateTimeFormatterBuilder q() {
        d(new q(h, "ZoneRegionId()"));
        return this;
    }

    public DateTimeFormatterBuilder r() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b != null) {
            if (dateTimeFormatterBuilder.c.size() > 0) {
                DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
                e eVar = new e(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
                this.a = this.a.b;
                d(eVar);
            } else {
                this.a = this.a.b;
            }
            return this;
        }
        throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
    }

    public DateTimeFormatterBuilder s() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder, true);
        return this;
    }

    public DateTimeFormatterBuilder t() {
        d(SettingsParser.INSENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder u() {
        d(SettingsParser.SENSITIVE);
        return this;
    }

    public DateTimeFormatterBuilder v() {
        d(SettingsParser.LENIENT);
        return this;
    }

    public b w() {
        return x(Locale.getDefault());
    }

    public b x(Locale locale) {
        yif.J(locale, "locale");
        while (this.a.b != null) {
            r();
        }
        return new b(new e(this.c, false), locale, g.e, ResolverStyle.SMART, null, null, null);
    }

    /* access modifiers changed from: package-private */
    public static final class q implements f {
        private static volatile Map.Entry<Integer, a> c;
        private final org.threeten.bp.temporal.h<ZoneId> a;
        private final String b;

        q(org.threeten.bp.temporal.h<ZoneId> hVar, String str) {
            this.a = hVar;
            this.b = str;
        }

        private ZoneId a(Set<String> set, String str, boolean z) {
            if (str == null) {
                return null;
            }
            if (!z) {
                for (String str2 : set) {
                    if (str2.equalsIgnoreCase(str)) {
                        return ZoneId.w(str2);
                    }
                }
                return null;
            } else if (set.contains(str)) {
                return ZoneId.w(str);
            } else {
                return null;
            }
        }

        private int b(c cVar, CharSequence charSequence, int i, int i2) {
            String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
            c cVar2 = new c(cVar);
            if (i2 >= charSequence.length() || !cVar.c(charSequence.charAt(i2), 'Z')) {
                int d = k.f.d(cVar2, charSequence, i2);
                if (d < 0) {
                    cVar.m(ZoneId.x(upperCase, ZoneOffset.n));
                    return i2;
                }
                cVar.m(ZoneId.x(upperCase, ZoneOffset.G((int) cVar2.h(ChronoField.OFFSET_SECONDS).longValue())));
                return d;
            }
            cVar.m(ZoneId.x(upperCase, ZoneOffset.n));
            return i2;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            int i2;
            int length = charSequence.length();
            if (i > length) {
                throw new IndexOutOfBoundsException();
            } else if (i == length) {
                return i ^ -1;
            } else {
                char charAt = charSequence.charAt(i);
                if (charAt == '+' || charAt == '-') {
                    cVar.getClass();
                    c cVar2 = new c(cVar);
                    int d = k.f.d(cVar2, charSequence, i);
                    if (d < 0) {
                        return d;
                    }
                    cVar.m(ZoneOffset.G((int) cVar2.h(ChronoField.OFFSET_SECONDS).longValue()));
                    return d;
                }
                int i3 = i + 2;
                if (length >= i3) {
                    char charAt2 = charSequence.charAt(i + 1);
                    if (cVar.c(charAt, 'U') && cVar.c(charAt2, 'T')) {
                        int i4 = i + 3;
                        if (length < i4 || !cVar.c(charSequence.charAt(i3), 'C')) {
                            return b(cVar, charSequence, i, i3);
                        }
                        return b(cVar, charSequence, i, i4);
                    } else if (cVar.c(charAt, 'G') && length >= (i2 = i + 3) && cVar.c(charAt2, 'M') && cVar.c(charSequence.charAt(i3), 'T')) {
                        return b(cVar, charSequence, i, i2);
                    }
                }
                Set<String> a2 = org.threeten.bp.zone.c.a();
                int size = a2.size();
                Map.Entry<Integer, a> entry = c;
                String str = null;
                if (entry == null || entry.getKey().intValue() != size) {
                    synchronized (this) {
                        entry = c;
                        if (entry == null || entry.getKey().intValue() != size) {
                            Integer valueOf = Integer.valueOf(size);
                            ArrayList arrayList = new ArrayList(a2);
                            Collections.sort(arrayList, DateTimeFormatterBuilder.j);
                            a aVar = new a(((String) arrayList.get(0)).length(), null);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                aVar.c((String) it.next());
                            }
                            entry = new AbstractMap.SimpleImmutableEntry<>(valueOf, aVar);
                            c = entry;
                        }
                    }
                }
                a value = entry.getValue();
                String str2 = null;
                while (value != null) {
                    int i5 = value.a + i;
                    if (i5 > length) {
                        break;
                    }
                    String obj = charSequence.subSequence(i, i5).toString();
                    value = a.a(value, obj, cVar.j());
                    str = obj;
                    str2 = str;
                }
                ZoneId a3 = a(a2, str, cVar.j());
                if (a3 == null) {
                    a3 = a(a2, str2, cVar.j());
                    if (a3 != null) {
                        str = str2;
                    } else if (!cVar.c(charAt, 'Z')) {
                        return i ^ -1;
                    } else {
                        cVar.m(ZoneOffset.n);
                        return i + 1;
                    }
                }
                cVar.m(a3);
                return str.length() + i;
            }
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            ZoneId zoneId = (ZoneId) eVar.f(this.a);
            if (zoneId == null) {
                return false;
            }
            sb.append(zoneId.i());
            return true;
        }

        public String toString() {
            return this.b;
        }

        private static final class a {
            final int a;
            private final Map<CharSequence, a> b = new HashMap();
            private final Map<String, a> c = new HashMap();

            private a(int i) {
                this.a = i;
            }

            static a a(a aVar, CharSequence charSequence, boolean z) {
                if (z) {
                    return aVar.b.get(charSequence);
                }
                return aVar.c.get(charSequence.toString().toLowerCase(Locale.ENGLISH));
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            private void c(String str) {
                int length = str.length();
                int i = this.a;
                if (length == i) {
                    this.b.put(str, null);
                    this.c.put(str.toLowerCase(Locale.ENGLISH), null);
                } else if (length > i) {
                    String substring = str.substring(0, i);
                    a aVar = this.b.get(substring);
                    if (aVar == null) {
                        aVar = new a(length);
                        this.b.put(substring, aVar);
                        this.c.put(substring.toLowerCase(Locale.ENGLISH), aVar);
                    }
                    aVar.c(str);
                }
            }

            a(int i, a aVar) {
                this.a = i;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements f {
        private final f[] a;
        private final boolean b;

        e(List<f> list, boolean z) {
            this.a = (f[]) list.toArray(new f[list.size()]);
            this.b = z;
        }

        public e a(boolean z) {
            if (z == this.b) {
                return this;
            }
            return new e(this.a, z);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public int d(c cVar, CharSequence charSequence, int i) {
            if (this.b) {
                cVar.q();
                int i2 = i;
                for (f fVar : this.a) {
                    i2 = fVar.d(cVar, charSequence, i2);
                    if (i2 < 0) {
                        cVar.e(false);
                        return i;
                    }
                }
                cVar.e(true);
                return i2;
            }
            for (f fVar2 : this.a) {
                i = fVar2.d(cVar, charSequence, i);
                if (i < 0) {
                    break;
                }
            }
            return i;
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        public boolean g(e eVar, StringBuilder sb) {
            int length = sb.length();
            if (this.b) {
                eVar.g();
            }
            try {
                for (f fVar : this.a) {
                    if (!fVar.g(eVar, sb)) {
                        sb.setLength(length);
                        return true;
                    }
                }
                if (this.b) {
                    eVar.a();
                }
                return true;
            } finally {
                if (this.b) {
                    eVar.a();
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.a != null) {
                sb.append(this.b ? "[" : "(");
                for (f fVar : this.a) {
                    sb.append(fVar);
                }
                sb.append(this.b ? "]" : ")");
            }
            return sb.toString();
        }

        e(f[] fVarArr, boolean z) {
            this.a = fVarArr;
            this.b = z;
        }
    }

    /* access modifiers changed from: package-private */
    public static class j implements f {
        static final int[] o = {0, 10, 100, Constants.ONE_SECOND, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
        final org.threeten.bp.temporal.f a;
        final int b;
        final int c;
        final SignStyle f;
        final int n;

        j(org.threeten.bp.temporal.f fVar, int i, int i2, SignStyle signStyle) {
            this.a = fVar;
            this.b = i;
            this.c = i2;
            this.f = signStyle;
            this.n = 0;
        }

        /* access modifiers changed from: package-private */
        public long a(e eVar, long j) {
            return j;
        }

        /* access modifiers changed from: package-private */
        public boolean b(c cVar) {
            int i = this.n;
            return i == -1 || (i > 0 && this.b == this.c && this.f == SignStyle.NOT_NEGATIVE);
        }

        /* access modifiers changed from: package-private */
        public int c(c cVar, long j, int i, int i2) {
            return cVar.n(this.a, j, i, i2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0111, code lost:
            r9 = r9;
            r5 = r11;
         */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x016a  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0188  */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(org.threeten.bp.format.c r20, java.lang.CharSequence r21, int r22) {
            /*
            // Method dump skipped, instructions count: 402
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder.j.d(org.threeten.bp.format.c, java.lang.CharSequence, int):int");
        }

        /* access modifiers changed from: package-private */
        public j e() {
            if (this.n == -1) {
                return this;
            }
            return new j(this.a, this.b, this.c, this.f, -1);
        }

        /* access modifiers changed from: package-private */
        public j f(int i) {
            return new j(this.a, this.b, this.c, this.f, this.n + i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
            if (r4 != 4) goto L_0x009e;
         */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean g(org.threeten.bp.format.e r12, java.lang.StringBuilder r13) {
            /*
                r11 = this;
                org.threeten.bp.temporal.f r0 = r11.a
                java.lang.Long r0 = r12.e(r0)
                r1 = 0
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                long r2 = r0.longValue()
                long r2 = r11.a(r12, r2)
                org.threeten.bp.format.g r12 = r12.c()
                r4 = -9223372036854775808
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 != 0) goto L_0x001f
                java.lang.String r0 = "9223372036854775808"
                goto L_0x0027
            L_0x001f:
                long r4 = java.lang.Math.abs(r2)
                java.lang.String r0 = java.lang.Long.toString(r4)
            L_0x0027:
                int r4 = r0.length()
                int r5 = r11.c
                java.lang.String r6 = " cannot be printed as the value "
                java.lang.String r7 = "Field "
                if (r4 > r5) goto L_0x00b5
                java.lang.String r0 = r12.a(r0)
                r4 = 0
                r8 = 4
                r9 = 1
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r10 < 0) goto L_0x0069
                org.threeten.bp.format.SignStyle r4 = r11.f
                int r4 = r4.ordinal()
                if (r4 == r9) goto L_0x0061
                if (r4 == r8) goto L_0x004a
                goto L_0x009e
            L_0x004a:
                int r4 = r11.b
                r5 = 19
                if (r4 >= r5) goto L_0x009e
                int[] r5 = org.threeten.bp.format.DateTimeFormatterBuilder.j.o
                r4 = r5[r4]
                long r4 = (long) r4
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x009e
                char r2 = r12.e()
                r13.append(r2)
                goto L_0x009e
            L_0x0061:
                char r2 = r12.e()
                r13.append(r2)
                goto L_0x009e
            L_0x0069:
                org.threeten.bp.format.SignStyle r4 = r11.f
                int r4 = r4.ordinal()
                if (r4 == 0) goto L_0x0097
                if (r4 == r9) goto L_0x0097
                r5 = 3
                if (r4 == r5) goto L_0x0079
                if (r4 == r8) goto L_0x0097
                goto L_0x009e
            L_0x0079:
                org.threeten.bp.DateTimeException r12 = new org.threeten.bp.DateTimeException
                java.lang.StringBuilder r13 = defpackage.je.V0(r7)
                org.threeten.bp.temporal.f r0 = r11.a
                r13.append(r0)
                r13.append(r6)
                r13.append(r2)
                java.lang.String r0 = " cannot be negative according to the SignStyle"
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L_0x0097:
                char r2 = r12.d()
                r13.append(r2)
            L_0x009e:
                int r2 = r11.b
                int r3 = r0.length()
                int r2 = r2 - r3
                if (r1 >= r2) goto L_0x00b1
                char r2 = r12.f()
                r13.append(r2)
                int r1 = r1 + 1
                goto L_0x009e
            L_0x00b1:
                r13.append(r0)
                return r9
            L_0x00b5:
                org.threeten.bp.DateTimeException r12 = new org.threeten.bp.DateTimeException
                java.lang.StringBuilder r13 = defpackage.je.V0(r7)
                org.threeten.bp.temporal.f r0 = r11.a
                r13.append(r0)
                r13.append(r6)
                r13.append(r2)
                java.lang.String r0 = " exceeds the maximum print width of "
                r13.append(r0)
                int r0 = r11.c
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                goto L_0x00d9
            L_0x00d8:
                throw r12
            L_0x00d9:
                goto L_0x00d8
            */
            throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.format.DateTimeFormatterBuilder.j.g(org.threeten.bp.format.e, java.lang.StringBuilder):boolean");
        }

        public String toString() {
            int i = this.b;
            if (i == 1 && this.c == 19 && this.f == SignStyle.NORMAL) {
                StringBuilder V0 = je.V0("Value(");
                V0.append(this.a);
                V0.append(")");
                return V0.toString();
            } else if (i == this.c && this.f == SignStyle.NOT_NEGATIVE) {
                StringBuilder V02 = je.V0("Value(");
                V02.append(this.a);
                V02.append(",");
                return je.B0(V02, this.b, ")");
            } else {
                StringBuilder V03 = je.V0("Value(");
                V03.append(this.a);
                V03.append(",");
                V03.append(this.b);
                V03.append(",");
                V03.append(this.c);
                V03.append(",");
                V03.append(this.f);
                V03.append(")");
                return V03.toString();
            }
        }

        private j(org.threeten.bp.temporal.f fVar, int i, int i2, SignStyle signStyle, int i3) {
            this.a = fVar;
            this.b = i;
            this.c = i2;
            this.f = signStyle;
            this.n = i3;
        }

        j(org.threeten.bp.temporal.f fVar, int i, int i2, SignStyle signStyle, int i3, a aVar) {
            this.a = fVar;
            this.b = i;
            this.c = i2;
            this.f = signStyle;
            this.n = i3;
        }
    }

    private DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder, boolean z) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = z;
    }

    /* access modifiers changed from: package-private */
    public static final class m extends j {
        static final LocalDate r = LocalDate.k0(SnackbarUtilsKt.SNACKBAR_ACTION_DURATION, 1, 1);
        private final int p;
        private final org.threeten.bp.chrono.a q;

        m(org.threeten.bp.temporal.f fVar, int i, int i2, int i3, org.threeten.bp.chrono.a aVar) {
            super(fVar, i, i2, SignStyle.NOT_NEGATIVE);
            if (i < 1 || i > 10) {
                throw new IllegalArgumentException(je.p0("The width must be from 1 to 10 inclusive but was ", i));
            } else if (i2 < 1 || i2 > 10) {
                throw new IllegalArgumentException(je.p0("The maxWidth must be from 1 to 10 inclusive but was ", i2));
            } else if (i2 >= i) {
                if (aVar == null) {
                    long j = (long) i3;
                    if (!fVar.k().f(j)) {
                        throw new IllegalArgumentException("The base value must be within the range of the field");
                    } else if (j + ((long) j.o[i]) > 2147483647L) {
                        throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
                    }
                }
                this.p = i3;
                this.q = aVar;
            } else {
                throw new IllegalArgumentException("The maxWidth must be greater than the width");
            }
        }

        /* access modifiers changed from: package-private */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.j
        public long a(e eVar, long j) {
            int[] iArr = j.o;
            long abs = Math.abs(j);
            int i = this.p;
            if (this.q != null) {
                i = org.threeten.bp.chrono.e.n(eVar.d()).h(this.q).r(this.a);
            }
            if (j >= ((long) i)) {
                int i2 = this.b;
                if (j < ((long) (i + iArr[i2]))) {
                    return abs % ((long) iArr[i2]);
                }
            }
            return abs % ((long) iArr[this.c]);
        }

        /* access modifiers changed from: package-private */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.j
        public boolean b(c cVar) {
            if (!cVar.k()) {
                return false;
            }
            return super.b(cVar);
        }

        /* access modifiers changed from: package-private */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.j
        public int c(c cVar, long j, int i, int i2) {
            int i3 = this.p;
            if (this.q != null) {
                i3 = cVar.f().h(this.q).r(this.a);
                cVar.b(this, j, i, i2);
            }
            int i4 = i2 - i;
            int i5 = this.b;
            if (i4 == i5 && j >= 0) {
                long j2 = (long) j.o[i5];
                long j3 = (long) i3;
                long j4 = j3 - (j3 % j2);
                j = i3 > 0 ? j4 + j : j4 - j;
                if (j < j3) {
                    j += j2;
                }
            }
            return cVar.n(this.a, j, i, i2);
        }

        /* access modifiers changed from: package-private */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.j
        public j e() {
            if (this.n == -1) {
                return this;
            }
            return new m(this.a, this.b, this.c, this.p, this.q, -1);
        }

        /* access modifiers changed from: package-private */
        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.j
        public j f(int i) {
            return new m(this.a, this.b, this.c, this.p, this.q, this.n + i);
        }

        @Override // org.threeten.bp.format.DateTimeFormatterBuilder.j
        public String toString() {
            StringBuilder V0 = je.V0("ReducedValue(");
            V0.append(this.a);
            V0.append(",");
            V0.append(this.b);
            V0.append(",");
            V0.append(this.c);
            V0.append(",");
            Object obj = this.q;
            if (obj == null) {
                obj = Integer.valueOf(this.p);
            }
            V0.append(obj);
            V0.append(")");
            return V0.toString();
        }

        private m(org.threeten.bp.temporal.f fVar, int i, int i2, int i3, org.threeten.bp.chrono.a aVar, int i4) {
            super(fVar, i, i2, SignStyle.NOT_NEGATIVE, i4, null);
            this.p = i3;
            this.q = aVar;
        }
    }
}
