package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

public final class Base64Variant implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final transient int _maxLineLength;
    final String _name;
    private final transient char _paddingChar;
    private final transient boolean _usesPadding;

    public Base64Variant(String str, String str2, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
        int length = str2.length();
        if (length == 64) {
            str2.getChars(0, length, cArr, 0);
            Arrays.fill(iArr, -1);
            for (int i2 = 0; i2 < length; i2++) {
                char c2 = this._base64ToAsciiC[i2];
                this._base64ToAsciiB[i2] = (byte) c2;
                this._asciiToBase64[c2] = i2;
            }
            if (z) {
                this._asciiToBase64[c] = -2;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(je.q0("Base64Alphabet length must be exactly 64 (was ", length, ")"));
    }

    /* access modifiers changed from: protected */
    public void _reportBase64EOF() {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidBase64(char c, int i, String str) {
        String str2;
        if (c <= ' ') {
            StringBuilder V0 = je.V0("Illegal white space character (code 0x");
            V0.append(Integer.toHexString(c));
            V0.append(") as character #");
            V0.append(i + 1);
            V0.append(" of 4-char base64 unit: can only used between units");
            str2 = V0.toString();
        } else {
            if (c == this._paddingChar) {
                StringBuilder V02 = je.V0("Unexpected padding character ('");
                V02.append(this._paddingChar);
                V02.append("') as character #");
                V02.append(i + 1);
                V02.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
                str2 = V02.toString();
            } else if (!Character.isDefined(c) || Character.isISOControl(c)) {
                StringBuilder V03 = je.V0("Illegal character (code 0x");
                V03.append(Integer.toHexString(c));
                V03.append(") in base64 content");
                str2 = V03.toString();
            } else {
                str2 = "Illegal character '" + c + "' (code 0x" + Integer.toHexString(c) + ") in base64 content";
            }
        }
        if (str != null) {
            str2 = je.y0(str2, ": ", str);
        }
        throw new IllegalArgumentException(str2);
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt > ' ') {
                int decodeBase64Char = decodeBase64Char(charAt);
                if (decodeBase64Char < 0) {
                    _reportInvalidBase64(charAt, 0, null);
                    throw null;
                } else if (i2 < length) {
                    int i3 = i2 + 1;
                    char charAt2 = str.charAt(i2);
                    int decodeBase64Char2 = decodeBase64Char(charAt2);
                    if (decodeBase64Char2 >= 0) {
                        int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
                        if (i3 < length) {
                            int i5 = i3 + 1;
                            char charAt3 = str.charAt(i3);
                            int decodeBase64Char3 = decodeBase64Char(charAt3);
                            if (decodeBase64Char3 >= 0) {
                                int i6 = (i4 << 6) | decodeBase64Char3;
                                if (i5 < length) {
                                    i2 = i5 + 1;
                                    char charAt4 = str.charAt(i5);
                                    int decodeBase64Char4 = decodeBase64Char(charAt4);
                                    if (decodeBase64Char4 >= 0) {
                                        byteArrayBuilder.appendThreeBytes((i6 << 6) | decodeBase64Char4);
                                    } else if (decodeBase64Char4 == -2) {
                                        byteArrayBuilder.appendTwoBytes(i6 >> 2);
                                    } else {
                                        _reportInvalidBase64(charAt4, 3, null);
                                        throw null;
                                    }
                                } else if (!this._usesPadding) {
                                    byteArrayBuilder.appendTwoBytes(i6 >> 2);
                                    return;
                                } else {
                                    _reportBase64EOF();
                                    throw null;
                                }
                            } else if (decodeBase64Char3 != -2) {
                                _reportInvalidBase64(charAt3, 2, null);
                                throw null;
                            } else if (i5 < length) {
                                i = i5 + 1;
                                char charAt5 = str.charAt(i5);
                                if (usesPaddingChar(charAt5)) {
                                    byteArrayBuilder.append(i4 >> 4);
                                } else {
                                    StringBuilder V0 = je.V0("expected padding character '");
                                    V0.append(this._paddingChar);
                                    V0.append("'");
                                    _reportInvalidBase64(charAt5, 3, V0.toString());
                                    throw null;
                                }
                            } else {
                                _reportBase64EOF();
                                throw null;
                            }
                        } else if (!this._usesPadding) {
                            byteArrayBuilder.append(i4 >> 4);
                            return;
                        } else {
                            _reportBase64EOF();
                            throw null;
                        }
                    } else {
                        _reportInvalidBase64(charAt2, 1, null);
                        throw null;
                    }
                } else {
                    _reportBase64EOF();
                    throw null;
                }
            }
            i = i2;
        }
    }

    public int decodeBase64Char(char c) {
        if (c <= 127) {
            return this._asciiToBase64[c];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append('\"');
        }
        int i = this._maxLineLength >> 2;
        int i2 = 0;
        int i3 = length - 3;
        while (i2 <= i3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = (((bArr[i2] << 8) | (bArr[i4] & 255)) << 8) | (bArr[i5] & 255);
            sb.append(this._base64ToAsciiC[(i7 >> 18) & 63]);
            sb.append(this._base64ToAsciiC[(i7 >> 12) & 63]);
            sb.append(this._base64ToAsciiC[(i7 >> 6) & 63]);
            sb.append(this._base64ToAsciiC[i7 & 63]);
            i--;
            if (i <= 0) {
                sb.append('\\');
                sb.append('n');
                i = this._maxLineLength >> 2;
            }
            i2 = i6;
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i2 + 1;
            int i10 = bArr[i2] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            sb.append(this._base64ToAsciiC[(i10 >> 18) & 63]);
            sb.append(this._base64ToAsciiC[(i10 >> 12) & 63]);
            if (this._usesPadding) {
                sb.append(i8 == 2 ? this._base64ToAsciiC[(i10 >> 6) & 63] : this._paddingChar);
                sb.append(this._paddingChar);
            } else if (i8 == 2) {
                sb.append(this._base64ToAsciiC[(i10 >> 6) & 63]);
            }
        }
        if (z) {
            sb.append('\"');
        }
        return sb.toString();
    }

    public int encodeBase64Chunk(int i, char[] cArr, int i2) {
        int i3 = i2 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i2] = cArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        cArr[i3] = cArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[i & 63];
        return i6;
    }

    public int encodeBase64Partial(int i, int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i3] = cArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i >> 12) & 63];
        if (this._usesPadding) {
            int i6 = i5 + 1;
            cArr[i5] = i2 == 2 ? cArr2[(i >> 6) & 63] : this._paddingChar;
            int i7 = i6 + 1;
            cArr[i6] = this._paddingChar;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            int i8 = i5 + 1;
            cArr[i5] = cArr2[(i >> 6) & 63];
            return i8;
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        return obj == this;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this._name.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end", this._name, Character.valueOf(this._paddingChar));
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        String str;
        String str2 = this._name;
        Base64Variant base64Variant = Base64Variants.MIME;
        if (!base64Variant._name.equals(str2)) {
            base64Variant = Base64Variants.MIME_NO_LINEFEEDS;
            if (!base64Variant._name.equals(str2)) {
                base64Variant = Base64Variants.PEM;
                if (!base64Variant._name.equals(str2)) {
                    base64Variant = Base64Variants.MODIFIED_FOR_URL;
                    if (!base64Variant._name.equals(str2)) {
                        if (str2 == null) {
                            str = "<null>";
                        } else {
                            str = je.y0("'", str2, "'");
                        }
                        throw new IllegalArgumentException(je.x0("No Base64Variant with name ", str));
                    }
                }
            }
        }
        return base64Variant;
    }

    @Override // java.lang.Object
    public String toString() {
        return this._name;
    }

    public boolean usesPadding() {
        return this._usesPadding;
    }

    public boolean usesPaddingChar(char c) {
        return c == this._paddingChar;
    }

    public int decodeBase64Char(int i) {
        if (i <= 127) {
            return this._asciiToBase64[i];
        }
        return -1;
    }

    public boolean usesPaddingChar(int i) {
        return i == this._paddingChar;
    }

    public int encodeBase64Chunk(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i2] = bArr2[(i >> 18) & 63];
        int i4 = i3 + 1;
        bArr[i3] = bArr2[(i >> 12) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 6) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[i & 63];
        return i6;
    }

    public int encodeBase64Partial(int i, int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i3] = bArr2[(i >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i >> 12) & 63];
        if (this._usesPadding) {
            byte b = (byte) this._paddingChar;
            int i6 = i5 + 1;
            bArr[i5] = i2 == 2 ? bArr2[(i >> 6) & 63] : b;
            int i7 = i6 + 1;
            bArr[i6] = b;
            return i7;
        } else if (i2 != 2) {
            return i5;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = bArr2[(i >> 6) & 63];
            return i8;
        }
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i) {
        this(base64Variant, str, base64Variant._usesPadding, base64Variant._paddingChar, i);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c, int i) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._usesPadding = z;
        this._paddingChar = c;
        this._maxLineLength = i;
    }
}
