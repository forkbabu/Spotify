package com.fasterxml.jackson.core.io;

import com.adjust.sdk.Constants;
import com.spotify.music.features.ads.model.Ad;

public final class NumberOutput {
    static final String SMALLEST_INT = String.valueOf(Integer.MIN_VALUE);
    static final String SMALLEST_LONG = String.valueOf(Long.MIN_VALUE);
    private static final int[] TRIPLET_TO_CHARS = new int[Constants.ONE_SECOND];
    public static final /* synthetic */ int a = 0;
    private static final String[] sSmallIntStrs = {Ad.DEFAULT_SKIPPABLE_AD_DELAY, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private static final String[] sSmallIntStrs2 = {"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};

    static {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                int i4 = 0;
                while (i4 < 10) {
                    TRIPLET_TO_CHARS[i] = ((i2 + 48) << 16) | ((i3 + 48) << 8) | (i4 + 48);
                    i4++;
                    i++;
                }
            }
        }
    }

    private static int _full3(int i, char[] cArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 >> 16);
        int i5 = i4 + 1;
        cArr[i4] = (char) ((i3 >> 8) & 127);
        int i6 = i5 + 1;
        cArr[i5] = (char) (i3 & 127);
        return i6;
    }

    private static int _leading3(int i, char[] cArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        if (i > 9) {
            if (i > 99) {
                cArr[i2] = (char) (i3 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i3 >> 8) & 127);
            i2++;
        }
        int i4 = i2 + 1;
        cArr[i2] = (char) (i3 & 127);
        return i4;
    }

    private static int _outputFullBillion(int i, char[] cArr, int i2) {
        int i3 = i / Constants.ONE_SECOND;
        int i4 = i - (i3 * Constants.ONE_SECOND);
        int i5 = i3 / Constants.ONE_SECOND;
        int[] iArr = TRIPLET_TO_CHARS;
        int i6 = iArr[i5];
        int i7 = i2 + 1;
        cArr[i2] = (char) (i6 >> 16);
        int i8 = i7 + 1;
        cArr[i7] = (char) ((i6 >> 8) & 127);
        int i9 = i8 + 1;
        cArr[i8] = (char) (i6 & 127);
        int i10 = iArr[i3 - (i5 * Constants.ONE_SECOND)];
        int i11 = i9 + 1;
        cArr[i9] = (char) (i10 >> 16);
        int i12 = i11 + 1;
        cArr[i11] = (char) ((i10 >> 8) & 127);
        int i13 = i12 + 1;
        cArr[i12] = (char) (i10 & 127);
        int i14 = iArr[i4];
        int i15 = i13 + 1;
        cArr[i13] = (char) (i14 >> 16);
        int i16 = i15 + 1;
        cArr[i15] = (char) ((i14 >> 8) & 127);
        int i17 = i16 + 1;
        cArr[i16] = (char) (i14 & 127);
        return i17;
    }

    public static int outputInt(int i, char[] cArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                String str = SMALLEST_INT;
                int length = str.length();
                str.getChars(0, length, cArr, i2);
                return length + i2;
            }
            cArr[i2] = '-';
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i4 = i / Constants.ONE_SECOND;
                return _full3(i - (i4 * Constants.ONE_SECOND), cArr, _leading3(i4, cArr, i2));
            } else if (i >= 10) {
                return _leading3(i, cArr, i2);
            } else {
                cArr[i2] = (char) (i + 48);
                return i2 + 1;
            }
        } else if (i >= 1000000000) {
            int i5 = i - 1000000000;
            if (i5 >= 1000000000) {
                i5 -= 1000000000;
                i3 = i2 + 1;
                cArr[i2] = '2';
            } else {
                i3 = i2 + 1;
                cArr[i2] = '1';
            }
            return _outputFullBillion(i5, cArr, i3);
        } else {
            int i6 = i / Constants.ONE_SECOND;
            int i7 = i - (i6 * Constants.ONE_SECOND);
            int i8 = i6 / Constants.ONE_SECOND;
            return _full3(i7, cArr, _full3(i6 - (i8 * Constants.ONE_SECOND), cArr, _leading3(i8, cArr, i2)));
        }
    }

    public static int outputLong(long j, char[] cArr, int i) {
        int i2;
        int i3;
        if (j < 0) {
            if (j > -2147483648L) {
                return outputInt((int) j, cArr, i);
            }
            if (j == Long.MIN_VALUE) {
                String str = SMALLEST_LONG;
                int length = str.length();
                str.getChars(0, length, cArr, i);
                return length + i;
            }
            cArr[i] = '-';
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return outputInt((int) j, cArr, i);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i4 = (int) j2;
            if (i4 >= 1000000) {
                int i5 = i4 / Constants.ONE_SECOND;
                int i6 = i4 - (i5 * Constants.ONE_SECOND);
                int i7 = i5 / Constants.ONE_SECOND;
                int _leading3 = _leading3(i7, cArr, i);
                int[] iArr = TRIPLET_TO_CHARS;
                int i8 = iArr[i5 - (i7 * Constants.ONE_SECOND)];
                int i9 = _leading3 + 1;
                cArr[_leading3] = (char) (i8 >> 16);
                int i10 = i9 + 1;
                cArr[i9] = (char) ((i8 >> 8) & 127);
                int i11 = i10 + 1;
                cArr[i10] = (char) (i8 & 127);
                int i12 = iArr[i6];
                int i13 = i11 + 1;
                cArr[i11] = (char) (i12 >> 16);
                int i14 = i13 + 1;
                cArr[i13] = (char) ((i12 >> 8) & 127);
                i3 = i14 + 1;
                cArr[i14] = (char) (i12 & 127);
            } else if (i4 < 1000) {
                i2 = _leading3(i4, cArr, i);
            } else {
                int i15 = i4 / Constants.ONE_SECOND;
                int i16 = i4 - (i15 * Constants.ONE_SECOND);
                int[] iArr2 = TRIPLET_TO_CHARS;
                int i17 = iArr2[i15];
                if (i15 > 9) {
                    if (i15 > 99) {
                        cArr[i] = (char) (i17 >> 16);
                        i++;
                    }
                    cArr[i] = (char) ((i17 >> 8) & 127);
                    i++;
                }
                int i18 = i + 1;
                cArr[i] = (char) (i17 & 127);
                int i19 = iArr2[i16];
                int i20 = i18 + 1;
                cArr[i18] = (char) (i19 >> 16);
                int i21 = i20 + 1;
                cArr[i20] = (char) ((i19 >> 8) & 127);
                i3 = i21 + 1;
                cArr[i21] = (char) (i19 & 127);
            }
            i2 = i3;
        } else {
            long j4 = j2 / 1000000000;
            int _leading32 = _leading3((int) j4, cArr, i);
            i2 = _outputFullBillion((int) (j2 - (1000000000 * j4)), cArr, _leading32);
        }
        return _outputFullBillion((int) j3, cArr, i2);
    }

    public static String toString(int i) {
        String[] strArr = sSmallIntStrs;
        if (i < strArr.length) {
            if (i >= 0) {
                return strArr[i];
            }
            int i2 = (-i) - 1;
            String[] strArr2 = sSmallIntStrs2;
            if (i2 < strArr2.length) {
                return strArr2[i2];
            }
        }
        return Integer.toString(i);
    }

    private static int _full3(int i, byte[] bArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        int i4 = i2 + 1;
        bArr[i2] = (byte) (i3 >> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i3 >> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i3;
        return i6;
    }

    private static int _leading3(int i, byte[] bArr, int i2) {
        int i3 = TRIPLET_TO_CHARS[i];
        if (i > 9) {
            if (i > 99) {
                bArr[i2] = (byte) (i3 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i3 >> 8);
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) i3;
        return i4;
    }

    private static int _outputFullBillion(int i, byte[] bArr, int i2) {
        int i3 = i / Constants.ONE_SECOND;
        int i4 = i - (i3 * Constants.ONE_SECOND);
        int i5 = i3 / Constants.ONE_SECOND;
        int i6 = i3 - (i5 * Constants.ONE_SECOND);
        int[] iArr = TRIPLET_TO_CHARS;
        int i7 = iArr[i5];
        int i8 = i2 + 1;
        bArr[i2] = (byte) (i7 >> 16);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >> 8);
        int i10 = i9 + 1;
        bArr[i9] = (byte) i7;
        int i11 = iArr[i6];
        int i12 = i10 + 1;
        bArr[i10] = (byte) (i11 >> 16);
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >> 8);
        int i14 = i13 + 1;
        bArr[i13] = (byte) i11;
        int i15 = iArr[i4];
        int i16 = i14 + 1;
        bArr[i14] = (byte) (i15 >> 16);
        int i17 = i16 + 1;
        bArr[i16] = (byte) (i15 >> 8);
        int i18 = i17 + 1;
        bArr[i17] = (byte) i15;
        return i18;
    }

    public static int outputInt(int i, byte[] bArr, int i2) {
        int i3;
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                int length = SMALLEST_INT.length();
                int i4 = 0;
                while (i4 < length) {
                    bArr[i2] = (byte) SMALLEST_INT.charAt(i4);
                    i4++;
                    i2++;
                }
                return i2;
            }
            bArr[i2] = 45;
            i = -i;
            i2++;
        }
        if (i < 1000000) {
            if (i >= 1000) {
                int i5 = i / Constants.ONE_SECOND;
                return _full3(i - (i5 * Constants.ONE_SECOND), bArr, _leading3(i5, bArr, i2));
            } else if (i >= 10) {
                return _leading3(i, bArr, i2);
            } else {
                int i6 = i2 + 1;
                bArr[i2] = (byte) (i + 48);
                return i6;
            }
        } else if (i >= 1000000000) {
            int i7 = i - 1000000000;
            if (i7 >= 1000000000) {
                i7 -= 1000000000;
                i3 = i2 + 1;
                bArr[i2] = 50;
            } else {
                i3 = i2 + 1;
                bArr[i2] = 49;
            }
            return _outputFullBillion(i7, bArr, i3);
        } else {
            int i8 = i / Constants.ONE_SECOND;
            int i9 = i - (i8 * Constants.ONE_SECOND);
            int i10 = i8 / Constants.ONE_SECOND;
            return _full3(i9, bArr, _full3(i8 - (i10 * Constants.ONE_SECOND), bArr, _leading3(i10, bArr, i2)));
        }
    }

    public static int outputLong(long j, byte[] bArr, int i) {
        int i2;
        int i3;
        if (j < 0) {
            if (j > -2147483648L) {
                return outputInt((int) j, bArr, i);
            }
            if (j == Long.MIN_VALUE) {
                int length = SMALLEST_LONG.length();
                int i4 = 0;
                while (i4 < length) {
                    bArr[i] = (byte) SMALLEST_LONG.charAt(i4);
                    i4++;
                    i++;
                }
                return i;
            }
            bArr[i] = 45;
            j = -j;
            i++;
        } else if (j <= 2147483647L) {
            return outputInt((int) j, bArr, i);
        }
        long j2 = j / 1000000000;
        long j3 = j - (j2 * 1000000000);
        if (j2 < 1000000000) {
            int i5 = (int) j2;
            if (i5 >= 1000000) {
                int i6 = i5 / Constants.ONE_SECOND;
                int i7 = i5 - (i6 * Constants.ONE_SECOND);
                int i8 = i6 / Constants.ONE_SECOND;
                int _leading3 = _leading3(i8, bArr, i);
                int[] iArr = TRIPLET_TO_CHARS;
                int i9 = iArr[i6 - (i8 * Constants.ONE_SECOND)];
                int i10 = _leading3 + 1;
                bArr[_leading3] = (byte) (i9 >> 16);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (i9 >> 8);
                int i12 = i11 + 1;
                bArr[i11] = (byte) i9;
                int i13 = iArr[i7];
                int i14 = i12 + 1;
                bArr[i12] = (byte) (i13 >> 16);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (i13 >> 8);
                i3 = i15 + 1;
                bArr[i15] = (byte) i13;
            } else if (i5 < 1000) {
                i2 = _leading3(i5, bArr, i);
            } else {
                int i16 = i5 / Constants.ONE_SECOND;
                int i17 = i5 - (i16 * Constants.ONE_SECOND);
                int[] iArr2 = TRIPLET_TO_CHARS;
                int i18 = iArr2[i16];
                if (i16 > 9) {
                    if (i16 > 99) {
                        bArr[i] = (byte) (i18 >> 16);
                        i++;
                    }
                    bArr[i] = (byte) (i18 >> 8);
                    i++;
                }
                int i19 = i + 1;
                bArr[i] = (byte) i18;
                int i20 = iArr2[i17];
                int i21 = i19 + 1;
                bArr[i19] = (byte) (i20 >> 16);
                int i22 = i21 + 1;
                bArr[i21] = (byte) (i20 >> 8);
                i3 = i22 + 1;
                bArr[i22] = (byte) i20;
            }
            i2 = i3;
        } else {
            long j4 = j2 / 1000000000;
            int _leading32 = _leading3((int) j4, bArr, i);
            i2 = _outputFullBillion((int) (j2 - (1000000000 * j4)), bArr, _leading32);
        }
        return _outputFullBillion((int) j3, bArr, i2);
    }
}
