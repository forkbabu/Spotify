package org.threeten.bp.chrono;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.LocalTime;
import org.threeten.bp.Period;
import org.threeten.bp.temporal.ChronoField;
import org.threeten.bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.bp.temporal.ValueRange;
import org.threeten.bp.temporal.a;
import org.threeten.bp.temporal.c;
import org.threeten.bp.temporal.e;
import org.threeten.bp.temporal.f;
import org.threeten.bp.temporal.i;

public final class HijrahDate extends ChronoDateImpl<HijrahDate> implements Serializable {
    private static final HashMap<Integer, Integer[]> A = new HashMap<>();
    private static final HashMap<Integer, Integer[]> B = new HashMap<>();
    private static final HashMap<Integer, Integer[]> C = new HashMap<>();
    private static final Long[] D = new Long[334];
    private static final Integer[] E = new Integer[t.length];
    private static final Integer[] F = new Integer[u.length];
    private static final Integer[] G = new Integer[v.length];
    private static final Integer[] H;
    private static final Integer[] I = new Integer[q.length];
    private static final Integer[] J = new Integer[r.length];
    private static final Integer[] K = new Integer[s.length];
    private static final Integer[] L = new Integer[w.length];
    public static final /* synthetic */ int M = 0;
    private static final int[] p;
    private static final int[] q = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] r = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] s = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final long serialVersionUID = -5207853542612002020L;
    private static final int[] t = {0, 1, 0, 1, 0, 1, 1};
    private static final int[] u = {1, 9999, 11, 51, 5, 29, 354};
    private static final int[] v = {1, 9999, 11, 52, 6, 30, 355};
    private static final int[] w = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final char x;
    private static final String y = File.pathSeparator;
    private static final String z;
    private final transient HijrahEra a;
    private final transient int b;
    private final transient int c;
    private final transient int f;
    private final long gregorianEpochDay;
    private final transient int n;
    private final transient DayOfWeek o;

    static {
        int[] iArr = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
        p = iArr;
        char c2 = File.separatorChar;
        x = c2;
        z = "org" + c2 + "threeten" + c2 + "bp" + c2 + "chrono";
        H = new Integer[iArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = p;
            if (i2 >= iArr2.length) {
                break;
            }
            H[i2] = new Integer(iArr2[i2]);
            i2++;
        }
        int i3 = 0;
        while (true) {
            int[] iArr3 = q;
            if (i3 >= iArr3.length) {
                break;
            }
            I[i3] = new Integer(iArr3[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            int[] iArr4 = r;
            if (i4 >= iArr4.length) {
                break;
            }
            J[i4] = new Integer(iArr4[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            int[] iArr5 = s;
            if (i5 >= iArr5.length) {
                break;
            }
            K[i5] = new Integer(iArr5[i5]);
            i5++;
        }
        int i6 = 0;
        while (true) {
            int[] iArr6 = w;
            if (i6 >= iArr6.length) {
                break;
            }
            L[i6] = new Integer(iArr6[i6]);
            i6++;
        }
        int i7 = 0;
        while (true) {
            Long[] lArr = D;
            if (i7 >= lArr.length) {
                break;
            }
            lArr[i7] = new Long((long) (i7 * 10631));
            i7++;
        }
        int i8 = 0;
        while (true) {
            int[] iArr7 = t;
            if (i8 >= iArr7.length) {
                break;
            }
            E[i8] = new Integer(iArr7[i8]);
            i8++;
        }
        int i9 = 0;
        while (true) {
            int[] iArr8 = u;
            if (i9 >= iArr8.length) {
                break;
            }
            F[i9] = new Integer(iArr8[i9]);
            i9++;
        }
        while (true) {
            int[] iArr9 = v;
            if (i < iArr9.length) {
                G[i] = new Integer(iArr9[i]);
                i++;
            } else {
                try {
                    o0();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            }
        }
    }

    private HijrahDate(long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Long l;
        int i7;
        long j2 = j - -492148;
        if (j2 >= 0) {
            Long[] lArr = D;
            for (int i8 = 0; i8 < lArr.length; i8++) {
                try {
                    if (j2 < lArr[i8].longValue()) {
                        i6 = i8 - 1;
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    i7 = ((int) j2) / 10631;
                }
            }
            i7 = ((int) j2) / 10631;
            i6 = i7;
            try {
                l = D[i6];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                l = null;
            }
            int longValue = (int) (j2 - (l == null ? new Long((long) (i6 * 10631)) : l).longValue());
            int b0 = b0(i6, (long) longValue);
            i5 = T(i6, longValue, b0);
            i4 = je.V(i6, 30, b0, 1);
            i3 = W(i5, i4);
            i2 = S(i5, i3, i4) + 1;
            i = 1;
        } else {
            int i9 = (int) j2;
            int i10 = i9 / 10631;
            int i11 = i9 % 10631;
            if (i11 == 0) {
                i11 = -10631;
                i10++;
            }
            int b02 = b0(i10, (long) i11);
            int T = T(i10, i11, b02);
            i4 = 1 - ((i10 * 30) - b02);
            i5 = c0((long) i4) ? T + 355 : T + 354;
            i3 = W(i5, i4);
            i2 = S(i5, i3, i4) + 1;
            i = 0;
        }
        int i12 = (int) ((j2 + 5) % 7);
        int[] iArr = {i, i4, i3 + 1, i2, i5 + 1, i12 + (i12 <= 0 ? 7 : 0)};
        int i13 = iArr[1];
        if (i13 < 1 || i13 > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        }
        int i14 = iArr[2];
        if (i14 < 1 || i14 > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        }
        O(iArr[3]);
        int i15 = iArr[4];
        if (i15 < 1 || i15 > G[6].intValue()) {
            throw new DateTimeException("Invalid day of year of Hijrah date");
        }
        this.a = HijrahEra.h(iArr[0]);
        int i16 = iArr[1];
        this.b = i16;
        this.c = iArr[2];
        this.f = iArr[3];
        this.n = iArr[4];
        this.o = DayOfWeek.i(iArr[5]);
        this.gregorianEpochDay = j;
        c0((long) i16);
    }

    private static void O(int i) {
        if (i < 1 || i > G[5].intValue()) {
            StringBuilder W0 = je.W0("Invalid day of month of Hijrah date, day ", i, " greater than ");
            W0.append(G[5].intValue());
            W0.append(" or less than 1");
            throw new DateTimeException(W0.toString());
        }
    }

    private static Integer[] P(int i) {
        Integer[] numArr;
        try {
            numArr = C.get(new Integer(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? L : numArr;
    }

    private static Integer[] Q(int i) {
        Integer[] numArr;
        try {
            numArr = A.get(new Integer(i));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        if (numArr != null) {
            return numArr;
        }
        if (c0((long) i)) {
            return I;
        }
        return H;
    }

    private static int S(int i, int i2, int i3) {
        int intValue;
        Integer[] Q = Q(i3);
        if (i < 0) {
            i = c0((long) i3) ? i + 355 : i + 354;
            if (i2 <= 0) {
                return i;
            }
            intValue = Q[i2].intValue();
        } else if (i2 <= 0) {
            return i;
        } else {
            intValue = Q[i2].intValue();
        }
        return i - intValue;
    }

    private static int T(int i, int i2, int i3) {
        Integer[] P = P(i);
        if (i2 > 0) {
            return i2 - P[i3].intValue();
        }
        return P[i3].intValue() + i2;
    }

    private static long U(int i, int i2, int i3) {
        Long l;
        int i4 = i - 1;
        int i5 = i4 / 30;
        int i6 = i4 % 30;
        int intValue = P(i5)[Math.abs(i6)].intValue();
        if (i6 < 0) {
            intValue = -intValue;
        }
        try {
            l = D[i5];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l = null;
        }
        if (l == null) {
            l = new Long((long) (i5 * 10631));
        }
        return (((l.longValue() + ((long) intValue)) - 492148) - 1) + ((long) Q(i)[i2 - 1].intValue()) + ((long) i3);
    }

    private static int W(int i, int i2) {
        Integer[] Q = Q(i2);
        int i3 = 0;
        if (i >= 0) {
            while (i3 < Q.length) {
                if (i < Q[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 11;
        }
        int i4 = c0((long) i2) ? i + 355 : i + 354;
        while (i3 < Q.length) {
            if (i4 < Q[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 11;
    }

    private static int b0(int i, long j) {
        Integer[] P = P(i);
        int i2 = 0;
        if (j == 0) {
            return 0;
        }
        if (j > 0) {
            while (i2 < P.length) {
                if (j < ((long) P[i2].intValue())) {
                    return i2 - 1;
                }
                i2++;
            }
            return 29;
        }
        long j2 = -j;
        while (i2 < P.length) {
            if (j2 <= ((long) P[i2].intValue())) {
                return i2 - 1;
            }
            i2++;
        }
        return 29;
    }

    static boolean c0(long j) {
        if (j <= 0) {
            j = -j;
        }
        return ((j * 11) + 14) % 30 < 11;
    }

    public static HijrahDate f0(int i, int i2, int i3) {
        return i >= 1 ? h0(HijrahEra.AH, i, i2, i3) : h0(HijrahEra.BEFORE_AH, 1 - i, i2, i3);
    }

    static HijrahDate h0(HijrahEra hijrahEra, int i, int i2, int i3) {
        yif.J(hijrahEra, "era");
        if (i < 1 || i > 9999) {
            throw new DateTimeException("Invalid year of Hijrah Era");
        } else if (i2 < 1 || i2 > 12) {
            throw new DateTimeException("Invalid month of Hijrah date");
        } else {
            O(i3);
            if (hijrahEra != HijrahEra.AH) {
                i = 1 - i;
            }
            return new HijrahDate(U(i, i2, i3));
        }
    }

    static HijrahDate j0(long j) {
        return new HijrahDate(j);
    }

    private static void k0(String str, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf != -1) {
                try {
                    int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                    int indexOf2 = nextToken.indexOf(45);
                    if (indexOf2 != -1) {
                        String substring = nextToken.substring(0, indexOf2);
                        String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                        int indexOf3 = substring.indexOf(47);
                        int indexOf4 = substring2.indexOf(47);
                        if (indexOf3 != -1) {
                            String substring3 = substring.substring(0, indexOf3);
                            String substring4 = substring.substring(indexOf3 + 1, substring.length());
                            try {
                                int parseInt2 = Integer.parseInt(substring3);
                                try {
                                    int parseInt3 = Integer.parseInt(substring4);
                                    if (indexOf4 != -1) {
                                        String substring5 = substring2.substring(0, indexOf4);
                                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                                        try {
                                            int parseInt4 = Integer.parseInt(substring5);
                                            try {
                                                int parseInt5 = Integer.parseInt(substring6);
                                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                                    throw new ParseException(je.q0("Unknown error at line ", i, "."), i);
                                                } else if (parseInt2 < 1) {
                                                    throw new IllegalArgumentException("startYear < 1");
                                                } else if (parseInt4 < 1) {
                                                    throw new IllegalArgumentException("endYear < 1");
                                                } else if (parseInt3 < 0 || parseInt3 > 11) {
                                                    throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
                                                } else if (parseInt5 < 0 || parseInt5 > 11) {
                                                    throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
                                                } else if (parseInt4 > 9999) {
                                                    throw new IllegalArgumentException("endYear > 9999");
                                                } else if (parseInt4 < parseInt2) {
                                                    throw new IllegalArgumentException("startYear > endYear");
                                                } else if (parseInt4 != parseInt2 || parseInt5 >= parseInt3) {
                                                    boolean c0 = c0((long) parseInt2);
                                                    Integer[] numArr = (Integer[]) je.b0(parseInt2, A);
                                                    if (numArr == null) {
                                                        if (!c0) {
                                                            numArr = new Integer[p.length];
                                                            int i2 = 0;
                                                            while (true) {
                                                                int[] iArr = p;
                                                                if (i2 >= iArr.length) {
                                                                    break;
                                                                }
                                                                numArr[i2] = new Integer(iArr[i2]);
                                                                i2++;
                                                            }
                                                        } else {
                                                            numArr = new Integer[q.length];
                                                            int i3 = 0;
                                                            while (true) {
                                                                int[] iArr2 = q;
                                                                if (i3 >= iArr2.length) {
                                                                    break;
                                                                }
                                                                numArr[i3] = new Integer(iArr2[i3]);
                                                                i3++;
                                                            }
                                                        }
                                                    }
                                                    Integer[] numArr2 = new Integer[numArr.length];
                                                    for (int i4 = 0; i4 < 12; i4++) {
                                                        if (i4 > parseInt3) {
                                                            numArr2[i4] = new Integer(numArr[i4].intValue() - parseInt);
                                                        } else {
                                                            numArr2[i4] = new Integer(numArr[i4].intValue());
                                                        }
                                                    }
                                                    A.put(new Integer(parseInt2), numArr2);
                                                    Integer[] numArr3 = (Integer[]) je.b0(parseInt2, B);
                                                    if (numArr3 == null) {
                                                        if (!c0) {
                                                            numArr3 = new Integer[r.length];
                                                            int i5 = 0;
                                                            while (true) {
                                                                int[] iArr3 = r;
                                                                if (i5 >= iArr3.length) {
                                                                    break;
                                                                }
                                                                numArr3[i5] = new Integer(iArr3[i5]);
                                                                i5++;
                                                            }
                                                        } else {
                                                            numArr3 = new Integer[s.length];
                                                            int i6 = 0;
                                                            while (true) {
                                                                int[] iArr4 = s;
                                                                if (i6 >= iArr4.length) {
                                                                    break;
                                                                }
                                                                numArr3[i6] = new Integer(iArr4[i6]);
                                                                i6++;
                                                            }
                                                        }
                                                    }
                                                    Integer[] numArr4 = new Integer[numArr3.length];
                                                    for (int i7 = 0; i7 < 12; i7++) {
                                                        if (i7 == parseInt3) {
                                                            numArr4[i7] = new Integer(numArr3[i7].intValue() - parseInt);
                                                        } else {
                                                            numArr4[i7] = new Integer(numArr3[i7].intValue());
                                                        }
                                                    }
                                                    B.put(new Integer(parseInt2), numArr4);
                                                    if (parseInt2 != parseInt4) {
                                                        int i8 = parseInt2 - 1;
                                                        int i9 = i8 / 30;
                                                        int i10 = i8 % 30;
                                                        Integer[] numArr5 = (Integer[]) je.b0(i9, C);
                                                        if (numArr5 == null) {
                                                            int length = w.length;
                                                            Integer[] numArr6 = new Integer[length];
                                                            for (int i11 = 0; i11 < length; i11++) {
                                                                numArr6[i11] = new Integer(w[i11]);
                                                            }
                                                            numArr5 = numArr6;
                                                        }
                                                        for (int i12 = i10 + 1; i12 < w.length; i12++) {
                                                            numArr5[i12] = new Integer(numArr5[i12].intValue() - parseInt);
                                                        }
                                                        C.put(new Integer(i9), numArr5);
                                                        int i13 = parseInt4 - 1;
                                                        int i14 = i13 / 30;
                                                        if (i9 != i14) {
                                                            while (true) {
                                                                i9++;
                                                                Long[] lArr = D;
                                                                if (i9 >= lArr.length) {
                                                                    break;
                                                                }
                                                                lArr[i9] = new Long(lArr[i9].longValue() - ((long) parseInt));
                                                            }
                                                            int i15 = i14 + 1;
                                                            while (true) {
                                                                Long[] lArr2 = D;
                                                                if (i15 >= lArr2.length) {
                                                                    break;
                                                                }
                                                                lArr2[i15] = new Long(lArr2[i15].longValue() + ((long) parseInt));
                                                                i15++;
                                                            }
                                                        }
                                                        int i16 = i13 % 30;
                                                        Integer[] numArr7 = (Integer[]) je.b0(i14, C);
                                                        if (numArr7 == null) {
                                                            int length2 = w.length;
                                                            Integer[] numArr8 = new Integer[length2];
                                                            for (int i17 = 0; i17 < length2; i17++) {
                                                                numArr8[i17] = new Integer(w[i17]);
                                                            }
                                                            numArr7 = numArr8;
                                                        }
                                                        while (true) {
                                                            i16++;
                                                            if (i16 >= w.length) {
                                                                break;
                                                            }
                                                            numArr7[i16] = new Integer(numArr7[i16].intValue() + parseInt);
                                                        }
                                                        C.put(new Integer(i14), numArr7);
                                                    }
                                                    boolean c02 = c0((long) parseInt4);
                                                    Integer[] numArr9 = (Integer[]) je.b0(parseInt4, A);
                                                    if (numArr9 == null) {
                                                        if (!c02) {
                                                            numArr9 = new Integer[p.length];
                                                            int i18 = 0;
                                                            while (true) {
                                                                int[] iArr5 = p;
                                                                if (i18 >= iArr5.length) {
                                                                    break;
                                                                }
                                                                numArr9[i18] = new Integer(iArr5[i18]);
                                                                i18++;
                                                            }
                                                        } else {
                                                            numArr9 = new Integer[q.length];
                                                            int i19 = 0;
                                                            while (true) {
                                                                int[] iArr6 = q;
                                                                if (i19 >= iArr6.length) {
                                                                    break;
                                                                }
                                                                numArr9[i19] = new Integer(iArr6[i19]);
                                                                i19++;
                                                            }
                                                        }
                                                    }
                                                    Integer[] numArr10 = new Integer[numArr9.length];
                                                    int i20 = 0;
                                                    for (int i21 = 12; i20 < i21; i21 = 12) {
                                                        if (i20 > parseInt5) {
                                                            numArr10[i20] = new Integer(numArr9[i20].intValue() + parseInt);
                                                        } else {
                                                            numArr10[i20] = new Integer(numArr9[i20].intValue());
                                                        }
                                                        i20++;
                                                    }
                                                    A.put(new Integer(parseInt4), numArr10);
                                                    Integer[] numArr11 = (Integer[]) je.b0(parseInt4, B);
                                                    if (numArr11 == null) {
                                                        if (!c02) {
                                                            numArr11 = new Integer[r.length];
                                                            int i22 = 0;
                                                            while (true) {
                                                                int[] iArr7 = r;
                                                                if (i22 >= iArr7.length) {
                                                                    break;
                                                                }
                                                                numArr11[i22] = new Integer(iArr7[i22]);
                                                                i22++;
                                                            }
                                                        } else {
                                                            numArr11 = new Integer[s.length];
                                                            int i23 = 0;
                                                            while (true) {
                                                                int[] iArr8 = s;
                                                                if (i23 >= iArr8.length) {
                                                                    break;
                                                                }
                                                                numArr11[i23] = new Integer(iArr8[i23]);
                                                                i23++;
                                                            }
                                                        }
                                                    }
                                                    Integer[] numArr12 = new Integer[numArr11.length];
                                                    for (int i24 = 0; i24 < 12; i24++) {
                                                        if (i24 == parseInt5) {
                                                            numArr12[i24] = new Integer(numArr11[i24].intValue() + parseInt);
                                                        } else {
                                                            numArr12[i24] = new Integer(numArr11[i24].intValue());
                                                        }
                                                    }
                                                    HashMap<Integer, Integer[]> hashMap = B;
                                                    hashMap.put(new Integer(parseInt4), numArr12);
                                                    Integer[] numArr13 = (Integer[]) je.b0(parseInt2, hashMap);
                                                    Integer[] numArr14 = (Integer[]) je.b0(parseInt4, hashMap);
                                                    HashMap<Integer, Integer[]> hashMap2 = A;
                                                    int intValue = numArr13[parseInt3].intValue();
                                                    int intValue2 = numArr14[parseInt5].intValue();
                                                    int intValue3 = numArr13[11].intValue() + ((Integer[]) je.b0(parseInt2, hashMap2))[11].intValue();
                                                    int intValue4 = numArr14[11].intValue() + ((Integer[]) je.b0(parseInt4, hashMap2))[11].intValue();
                                                    Integer[] numArr15 = G;
                                                    int intValue5 = numArr15[5].intValue();
                                                    Integer[] numArr16 = F;
                                                    int intValue6 = numArr16[5].intValue();
                                                    if (intValue5 < intValue) {
                                                        intValue5 = intValue;
                                                    }
                                                    if (intValue5 < intValue2) {
                                                        intValue5 = intValue2;
                                                    }
                                                    numArr15[5] = new Integer(intValue5);
                                                    if (intValue6 <= intValue) {
                                                        intValue = intValue6;
                                                    }
                                                    if (intValue <= intValue2) {
                                                        intValue2 = intValue;
                                                    }
                                                    numArr16[5] = new Integer(intValue2);
                                                    int intValue7 = numArr15[6].intValue();
                                                    int intValue8 = numArr16[6].intValue();
                                                    if (intValue7 < intValue3) {
                                                        intValue7 = intValue3;
                                                    }
                                                    if (intValue7 < intValue4) {
                                                        intValue7 = intValue4;
                                                    }
                                                    numArr15[6] = new Integer(intValue7);
                                                    if (intValue8 <= intValue3) {
                                                        intValue3 = intValue8;
                                                    }
                                                    if (intValue3 <= intValue4) {
                                                        intValue4 = intValue3;
                                                    }
                                                    numArr16[6] = new Integer(intValue4);
                                                } else {
                                                    throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                                                }
                                            } catch (NumberFormatException unused) {
                                                throw new ParseException(je.q0("End month is not properly set at line ", i, "."), i);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            throw new ParseException(je.q0("End year is not properly set at line ", i, "."), i);
                                        }
                                    } else {
                                        throw new ParseException(je.q0("End year/month has incorrect format at line ", i, "."), i);
                                    }
                                } catch (NumberFormatException unused3) {
                                    throw new ParseException(je.q0("Start month is not properly set at line ", i, "."), i);
                                }
                            } catch (NumberFormatException unused4) {
                                throw new ParseException(je.q0("Start year is not properly set at line ", i, "."), i);
                            }
                        } else {
                            throw new ParseException(je.q0("Start year/month has incorrect format at line ", i, "."), i);
                        }
                    } else {
                        throw new ParseException(je.q0("Start and end year/month has incorrect format at line ", i, "."), i);
                    }
                } catch (NumberFormatException unused5) {
                    throw new ParseException(je.q0("Offset is not properly set at line ", i, "."), i);
                }
            } else {
                throw new ParseException(je.q0("Offset has incorrect format at line ", i, "."), i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0104 A[SYNTHETIC, Splitter:B:50:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void o0() {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.HijrahDate.o0():void");
    }

    private static HijrahDate q0(int i, int i2, int i3) {
        int intValue = Q(i)[i2 - 1].intValue();
        if (i3 > intValue) {
            i3 = intValue;
        }
        return f0(i, i2, i3);
    }

    private Object readResolve() {
        return new HijrahDate(this.gregorianEpochDay);
    }

    private Object writeReplace() {
        return new Ser((byte) 3, this);
    }

    @Override // org.threeten.bp.chrono.a
    public f A() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.a
    public a B(long j, i iVar) {
        return (HijrahDate) super.p(j, iVar);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a
    public a C(long j, i iVar) {
        return (HijrahDate) super.v(j, iVar);
    }

    @Override // org.threeten.bp.chrono.a
    public a D(e eVar) {
        return (HijrahDate) HijrahChronology.c.i(((Period) eVar).a(this));
    }

    @Override // org.threeten.bp.chrono.a
    public long F() {
        return U(this.b, this.c, this.f);
    }

    @Override // org.threeten.bp.chrono.a
    public a G(c cVar) {
        return (HijrahDate) HijrahChronology.c.i(cVar.g(this));
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<HijrahDate> J(long j, i iVar) {
        return (HijrahDate) super.v(j, iVar);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<HijrahDate> L(long j) {
        return new HijrahDate(this.gregorianEpochDay + j);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<HijrahDate> M(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.c - 1) + ((int) j);
        int i2 = i / 12;
        int i3 = i % 12;
        while (i3 < 0) {
            i3 += 12;
            i2 = yif.R(i2, 1);
        }
        return h0(this.a, yif.N(this.b, i2), i3 + 1, this.f);
    }

    /* Return type fixed from 'org.threeten.bp.chrono.ChronoDateImpl' to match base method */
    /* access modifiers changed from: package-private */
    @Override // org.threeten.bp.chrono.ChronoDateImpl
    public ChronoDateImpl<HijrahDate> N(long j) {
        if (j == 0) {
            return this;
        }
        return h0(this.a, yif.N(this.b, (int) j), this.c, this.f);
    }

    @Override // defpackage.cqf, org.threeten.bp.temporal.b
    public ValueRange k(f fVar) {
        int i;
        if (!(fVar instanceof ChronoField)) {
            return fVar.i(this);
        }
        if (n(fVar)) {
            ChronoField chronoField = (ChronoField) fVar;
            int ordinal = chronoField.ordinal();
            Integer[] numArr = null;
            if (ordinal == 18) {
                int i2 = this.c - 1;
                int i3 = this.b;
                try {
                    numArr = B.get(new Integer(i3));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (numArr == null) {
                    if (c0((long) i3)) {
                        numArr = K;
                    } else {
                        numArr = J;
                    }
                }
                return ValueRange.g(1, (long) numArr[i2].intValue());
            } else if (ordinal == 19) {
                int i4 = this.b;
                int i5 = i4 - 1;
                int i6 = i5 / 30;
                try {
                    numArr = C.get(Integer.valueOf(i6));
                } catch (ArrayIndexOutOfBoundsException unused2) {
                }
                if (numArr != null) {
                    int i7 = i5 % 30;
                    if (i7 == 29) {
                        Long[] lArr = D;
                        i = (lArr[i6 + 1].intValue() - lArr[i6].intValue()) - numArr[i7].intValue();
                    } else {
                        i = numArr[i7 + 1].intValue() - numArr[i7].intValue();
                    }
                } else {
                    i = c0((long) i4) ? 355 : 354;
                }
                return ValueRange.g(1, (long) i);
            } else if (ordinal == 21) {
                return ValueRange.g(1, 5);
            } else {
                if (ordinal == 25) {
                    return ValueRange.g(1, 1000);
                }
                HijrahChronology hijrahChronology = HijrahChronology.c;
                return chronoField.k();
            }
        } else {
            throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
        }
    }

    /* access modifiers changed from: package-private */
    public HijrahDate m0(long j) {
        return new HijrahDate(this.gregorianEpochDay + j);
    }

    @Override // org.threeten.bp.chrono.a, defpackage.bqf, org.threeten.bp.temporal.a
    public a p(long j, i iVar) {
        return (HijrahDate) super.p(j, iVar);
    }

    /* renamed from: r0 */
    public HijrahDate d(f fVar, long j) {
        if (!(fVar instanceof ChronoField)) {
            return (HijrahDate) fVar.g(this, j);
        }
        ChronoField chronoField = (ChronoField) fVar;
        chronoField.q(j);
        int i = (int) j;
        switch (chronoField.ordinal()) {
            case 15:
                return m0(j - ((long) this.o.h()));
            case 16:
                return m0(j - u(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 17:
                return m0(j - u(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 18:
                return q0(this.b, this.c, i);
            case 19:
                int i2 = i - 1;
                return q0(this.b, (i2 / 30) + 1, (i2 % 30) + 1);
            case 20:
                return new HijrahDate((long) i);
            case 21:
                return m0((j - u(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 22:
                return m0((j - u(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 23:
                return q0(this.b, i, this.f);
            case 24:
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
            case 25:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return q0(i, this.c, this.f);
            case 26:
                return q0(i, this.c, this.f);
            case 27:
                return q0(1 - this.b, this.c, this.f);
        }
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.temporal.a
    public a s(c cVar) {
        return (HijrahDate) HijrahChronology.c.i(cVar.g(this));
    }

    @Override // org.threeten.bp.temporal.b
    public long u(f fVar) {
        int i;
        int i2;
        if (!(fVar instanceof ChronoField)) {
            return fVar.l(this);
        }
        switch (((ChronoField) fVar).ordinal()) {
            case 15:
                i = this.o.h();
                break;
            case 16:
                i2 = (this.f - 1) % 7;
                i = i2 + 1;
                break;
            case 17:
                i2 = (this.n - 1) % 7;
                i = i2 + 1;
                break;
            case 18:
                i = this.f;
                break;
            case 19:
                i = this.n;
                break;
            case 20:
                return F();
            case 21:
                i2 = (this.f - 1) / 7;
                i = i2 + 1;
                break;
            case 22:
                i2 = (this.n - 1) / 7;
                i = i2 + 1;
                break;
            case 23:
                i = this.c;
                break;
            case 24:
            default:
                throw new UnsupportedTemporalTypeException(je.z0("Unsupported field: ", fVar));
            case 25:
                i = this.b;
                break;
            case 26:
                i = this.b;
                break;
            case 27:
                return (long) this.a.ordinal();
        }
        return (long) i;
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a, org.threeten.bp.temporal.a
    public a v(long j, i iVar) {
        return (HijrahDate) super.v(j, iVar);
    }

    @Override // org.threeten.bp.chrono.ChronoDateImpl, org.threeten.bp.chrono.a
    public final b<HijrahDate> w(LocalTime localTime) {
        return ChronoLocalDateTimeImpl.L(this, localTime);
    }

    @Override // org.threeten.bp.chrono.a
    public e z() {
        return HijrahChronology.c;
    }
}
