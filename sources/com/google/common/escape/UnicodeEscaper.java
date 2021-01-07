package com.google.common.escape;

public abstract class UnicodeEscaper extends Escaper {
    protected UnicodeEscaper() {
    }

    /* access modifiers changed from: protected */
    public abstract char[] escape(int i);

    /* access modifiers changed from: protected */
    public final String escapeSlow(String str, int i) {
        int length = str.length();
        char[] charBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        while (i4 < length) {
            if (i4 < length) {
                int i5 = i4 + 1;
                char charAt = str.charAt(i4);
                int i6 = charAt;
                if (charAt >= 55296) {
                    i6 = charAt;
                    if (charAt <= 57343) {
                        if (charAt > 56319) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected low surrogate character '");
                            sb.append(charAt);
                            sb.append("' with value ");
                            sb.append((int) charAt);
                            sb.append(" at index ");
                            sb.append(i5 - 1);
                            sb.append(" in '");
                            sb.append((Object) str);
                            sb.append("'");
                            throw new IllegalArgumentException(sb.toString());
                        } else if (i5 == length) {
                            i6 = -charAt;
                        } else {
                            char charAt2 = str.charAt(i5);
                            if (Character.isLowSurrogate(charAt2)) {
                                i6 = Character.toCodePoint(charAt, charAt2);
                            } else {
                                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i5 + " in '" + ((Object) str) + "'");
                            }
                        }
                    }
                }
                if (i6 >= 0) {
                    char[] escape = escape(i6 == 1 ? 1 : 0);
                    int i7 = (Character.isSupplementaryCodePoint(i6) ? 2 : 1) + i4;
                    if (escape != null) {
                        int i8 = i4 - i2;
                        int i9 = i3 + i8;
                        int length2 = escape.length + i9;
                        if (charBufferFromThreadLocal.length < length2) {
                            int i10 = (length - i4) + length2 + 32;
                            if (i10 >= 0) {
                                char[] cArr = new char[i10];
                                if (i3 > 0) {
                                    System.arraycopy(charBufferFromThreadLocal, 0, cArr, 0, i3);
                                }
                                charBufferFromThreadLocal = cArr;
                            } else {
                                throw new AssertionError("Cannot increase internal buffer any further");
                            }
                        }
                        if (i8 > 0) {
                            str.getChars(i2, i4, charBufferFromThreadLocal, i3);
                            i3 = i9;
                        }
                        if (escape.length > 0) {
                            System.arraycopy(escape, 0, charBufferFromThreadLocal, i3, escape.length);
                            i3 += escape.length;
                        }
                        i2 = i7;
                    }
                    i4 = nextEscapeIndex(str, i7, length);
                } else {
                    throw new IllegalArgumentException("Trailing high surrogate at end of input");
                }
            } else {
                throw new IndexOutOfBoundsException("Index exceeds specified range");
            }
        }
        int i11 = length - i2;
        if (i11 > 0) {
            int i12 = i11 + i3;
            if (charBufferFromThreadLocal.length < i12) {
                if (i12 >= 0) {
                    char[] cArr2 = new char[i12];
                    if (i3 > 0) {
                        System.arraycopy(charBufferFromThreadLocal, 0, cArr2, 0, i3);
                    }
                    charBufferFromThreadLocal = cArr2;
                } else {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
            }
            str.getChars(i2, length, charBufferFromThreadLocal, i3);
            i3 = i12;
        }
        return new String(charBufferFromThreadLocal, 0, i3);
    }

    /* access modifiers changed from: protected */
    public abstract int nextEscapeIndex(CharSequence charSequence, int i, int i2);
}
