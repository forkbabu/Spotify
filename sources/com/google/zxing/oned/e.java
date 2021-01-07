package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.b;
import java.util.Map;

public final class e extends m {
    private static void e(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    @Override // com.google.zxing.oned.m, com.google.zxing.c
    public b a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.m
    public boolean[] c(String str) {
        int[] iArr = d.a;
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                    int length2 = str.length();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt = str.charAt(i2);
                        if (charAt != 0) {
                            if (charAt != ' ') {
                                if (charAt == '@') {
                                    sb.append("%V");
                                } else if (charAt == '`') {
                                    sb.append("%W");
                                } else if (!(charAt == '-' || charAt == '.')) {
                                    if (charAt <= 26) {
                                        sb.append('$');
                                        sb.append((char) ((charAt - 1) + 65));
                                    } else if (charAt < ' ') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - 27) + 65));
                                    } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                                        sb.append('/');
                                        sb.append((char) ((charAt - '!') + 65));
                                    } else if (charAt <= '9') {
                                        sb.append((char) ((charAt - '0') + 48));
                                    } else if (charAt <= '?') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - ';') + 70));
                                    } else if (charAt <= 'Z') {
                                        sb.append((char) ((charAt - 'A') + 65));
                                    } else if (charAt <= '_') {
                                        sb.append('%');
                                        sb.append((char) ((charAt - '[') + 75));
                                    } else if (charAt <= 'z') {
                                        sb.append('+');
                                        sb.append((char) ((charAt - 'a') + 65));
                                    } else if (charAt <= 127) {
                                        sb.append('%');
                                        sb.append((char) ((charAt - '{') + 80));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i2) + "'");
                                    }
                                }
                            }
                            sb.append(charAt);
                        } else {
                            sb.append("%U");
                        }
                    }
                    str = sb.toString();
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr2 = new int[9];
            int i3 = length + 25;
            for (int i4 = 0; i4 < length; i4++) {
                e(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i4))], iArr2);
                for (int i5 = 0; i5 < 9; i5++) {
                    i3 += iArr2[i5];
                }
            }
            boolean[] zArr = new boolean[i3];
            e(148, iArr2);
            int b = m.b(zArr, 0, iArr2, true);
            int[] iArr3 = {1};
            int b2 = b + m.b(zArr, b, iArr3, false);
            for (int i6 = 0; i6 < length; i6++) {
                e(iArr["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i6))], iArr2);
                int b3 = b2 + m.b(zArr, b2, iArr2, true);
                b2 = b3 + m.b(zArr, b3, iArr3, false);
            }
            e(148, iArr2);
            m.b(zArr, b2, iArr2, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
