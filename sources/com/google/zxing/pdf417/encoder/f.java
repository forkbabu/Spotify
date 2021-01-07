package com.google.zxing.pdf417.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class f {
    private static final byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};
    private static final byte[] c;
    private static final byte[] d = new byte[128];
    private static final Charset e = StandardCharsets.ISO_8859_1;

    static {
        byte[] bArr = new byte[128];
        c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 >= bArr2.length) {
                break;
            }
            byte b2 = bArr2[i2];
            if (b2 > 0) {
                c[b2] = (byte) i2;
            }
            i2++;
        }
        Arrays.fill(d, (byte) -1);
        while (true) {
            byte[] bArr3 = b;
            if (i < bArr3.length) {
                byte b3 = bArr3[i];
                if (b3 > 0) {
                    d[b3] = (byte) i;
                }
                i++;
            } else {
                return;
            }
        }
    }

    private static void a(byte[] bArr, int i, int i2, int i3, StringBuilder sb) {
        int i4;
        if (i2 == 1 && i3 == 0) {
            sb.append((char) 913);
        } else if (i2 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i2 >= 6) {
            char[] cArr = new char[5];
            i4 = i;
            while ((i + i2) - i4 >= 6) {
                long j = 0;
                for (int i5 = 0; i5 < 6; i5++) {
                    j = (j << 8) + ((long) (bArr[i4 + i5] & 255));
                }
                for (int i6 = 0; i6 < 5; i6++) {
                    cArr[i6] = (char) ((int) (j % 900));
                    j /= 900;
                }
                for (int i7 = 4; i7 >= 0; i7--) {
                    sb.append(cArr[i7]);
                }
                i4 += 6;
            }
        } else {
            i4 = i;
        }
        while (i4 < i + i2) {
            sb.append((char) (bArr[i4] & 255));
            i4++;
        }
    }

    static String b(String str, Compaction compaction, Charset charset) {
        int i;
        int i2;
        CharacterSetECI d2;
        Charset charset2 = charset;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset2 == null) {
            charset2 = e;
        } else if (!e.equals(charset2) && (d2 = CharacterSetECI.d(charset.name())) != null) {
            int g = d2.g();
            if (g >= 0 && g < 900) {
                sb.append((char) 927);
                sb.append((char) g);
            } else if (g < 810900) {
                sb.append((char) 926);
                sb.append((char) ((g / 900) - 1));
                sb.append((char) (g % 900));
            } else if (g < 811800) {
                sb.append((char) 925);
                sb.append((char) (810900 - g));
            } else {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(g)));
            }
        }
        int length = str.length();
        int ordinal = compaction.ordinal();
        if (ordinal == 1) {
            d(str, 0, length, sb, 0);
        } else if (ordinal != 2) {
            char c2 = 902;
            if (ordinal != 3) {
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (i3 < length) {
                    int length2 = str.length();
                    if (i3 < length2) {
                        char charAt = str.charAt(i3);
                        int i6 = i3;
                        i = 0;
                        while (g(charAt) && i6 < length2) {
                            i++;
                            i6++;
                            if (i6 < length2) {
                                charAt = str.charAt(i6);
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i >= 13) {
                        sb.append(c2);
                        c(str, i3, i, sb);
                        i3 += i;
                        i4 = 0;
                        i5 = 2;
                    } else {
                        int length3 = str.length();
                        int i7 = i3;
                        while (true) {
                            if (i7 >= length3) {
                                break;
                            }
                            char charAt2 = str.charAt(i7);
                            int i8 = 0;
                            while (i8 < 13 && g(charAt2) && i7 < length3) {
                                i8++;
                                i7++;
                                if (i7 < length3) {
                                    charAt2 = str.charAt(i7);
                                }
                            }
                            if (i8 >= 13) {
                                i2 = (i7 - i3) - i8;
                                break;
                            } else if (i8 <= 0) {
                                char charAt3 = str.charAt(i7);
                                if (!(charAt3 == '\t' || charAt3 == '\n' || charAt3 == '\r' || (charAt3 >= ' ' && charAt3 <= '~'))) {
                                    break;
                                }
                                i7++;
                            }
                        }
                        i2 = i7 - i3;
                        if (i2 >= 5 || i == length) {
                            if (i5 != 0) {
                                sb.append((char) 900);
                                i4 = 0;
                                i5 = 0;
                            }
                            i4 = d(str, i3, i2, sb, i4);
                            i3 += i2;
                        } else {
                            CharsetEncoder newEncoder = charset2.newEncoder();
                            int length4 = str.length();
                            int i9 = i3;
                            while (i9 < length4) {
                                char charAt4 = str.charAt(i9);
                                int i10 = 0;
                                while (i10 < 13 && g(charAt4)) {
                                    i10++;
                                    int i11 = i9 + i10;
                                    if (i11 >= length4) {
                                        break;
                                    }
                                    charAt4 = str.charAt(i11);
                                }
                                if (i10 >= 13) {
                                    break;
                                }
                                char charAt5 = str.charAt(i9);
                                if (newEncoder.canEncode(charAt5)) {
                                    i9++;
                                } else {
                                    throw new WriterException("Non-encodable character detected: " + charAt5 + " (Unicode: " + ((int) charAt5) + ')');
                                }
                            }
                            int i12 = i9 - i3;
                            if (i12 == 0) {
                                i12 = 1;
                            }
                            int i13 = i3 + i12;
                            byte[] bytes = str.substring(i3, i13).getBytes(charset2);
                            if (bytes.length == 1 && i5 == 0) {
                                a(bytes, 0, 1, 0, sb);
                            } else {
                                a(bytes, 0, bytes.length, i5, sb);
                                i4 = 0;
                                i5 = 1;
                            }
                            i3 = i13;
                        }
                        c2 = 902;
                    }
                }
            } else {
                sb.append((char) 902);
                c(str, 0, length, sb);
            }
        } else {
            byte[] bytes2 = str.getBytes(charset2);
            a(bytes2, 0, bytes2.length, 1, sb);
        }
        return sb.toString();
    }

    private static void c(String str, int i, int i2, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i2 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i3 = 0;
        while (i3 < i2) {
            sb2.setLength(0);
            int min = Math.min(44, i2 - i3);
            StringBuilder sb3 = new StringBuilder("1");
            int i4 = i + i3;
            sb3.append(str.substring(i4, i4 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            int length = sb2.length();
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                sb.append(sb2.charAt(length));
            }
            i3 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f6 A[EDGE_INSN: B:75:0x00f6->B:60:0x00f6 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int d(java.lang.CharSequence r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
        // Method dump skipped, instructions count: 293
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.encoder.f.d(java.lang.CharSequence, int, int, java.lang.StringBuilder, int):int");
    }

    private static boolean e(char c2) {
        if (c2 != ' ') {
            return c2 >= 'a' && c2 <= 'z';
        }
        return true;
    }

    private static boolean f(char c2) {
        if (c2 != ' ') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static boolean g(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean h(char c2) {
        return c[c2] != -1;
    }
}
