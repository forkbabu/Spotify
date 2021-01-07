package com.google.common.io;

import com.google.common.base.MoreObjects;
import com.google.common.math.IntMath;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

public abstract class BaseEncoding {
    private static final BaseEncoding BASE16 = new Base16Encoding("base16()", "0123456789ABCDEF");
    private static final BaseEncoding BASE64 = new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final BaseEncoding BASE64_URL = new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* access modifiers changed from: private */
    public static final class Alphabet {
        final int bitsPerChar;
        final int bytesPerChunk;
        private final char[] chars;
        final int charsPerChunk;
        private final byte[] decodabet;
        final int mask;
        private final String name;
        private final boolean[] validPadding;

        Alphabet(String str, char[] cArr) {
            str.getClass();
            this.name = str;
            cArr.getClass();
            this.chars = cArr;
            try {
                int log2 = IntMath.log2(cArr.length, RoundingMode.UNNECESSARY);
                this.bitsPerChar = log2;
                int min = Math.min(8, Integer.lowestOneBit(log2));
                try {
                    this.charsPerChunk = 8 / min;
                    this.bytesPerChunk = log2 / min;
                    this.mask = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i = 0; i < cArr.length; i++) {
                        char c = cArr[i];
                        MoreObjects.checkArgument(c < 128, "Non-ASCII character: %s", c);
                        MoreObjects.checkArgument(bArr[c] == -1, "Duplicate character: %s", c);
                        bArr[c] = (byte) i;
                    }
                    this.decodabet = bArr;
                    boolean[] zArr = new boolean[this.charsPerChunk];
                    for (int i2 = 0; i2 < this.bytesPerChunk; i2++) {
                        zArr[IntMath.divide(i2 * 8, this.bitsPerChar, RoundingMode.CEILING)] = true;
                    }
                    this.validPadding = zArr;
                } catch (ArithmeticException e) {
                    StringBuilder V0 = je.V0("Illegal alphabet ");
                    V0.append(new String(cArr));
                    throw new IllegalArgumentException(V0.toString(), e);
                }
            } catch (ArithmeticException e2) {
                StringBuilder V02 = je.V0("Illegal alphabet length ");
                V02.append(cArr.length);
                throw new IllegalArgumentException(V02.toString(), e2);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean canDecode(char c) {
            return c <= 127 && this.decodabet[c] != -1;
        }

        /* access modifiers changed from: package-private */
        public int decode(char c) {
            if (c <= 127) {
                byte b = this.decodabet[c];
                if (b != -1) {
                    return b;
                }
                if (c <= ' ' || c == 127) {
                    StringBuilder V0 = je.V0("Unrecognized character: 0x");
                    V0.append(Integer.toHexString(c));
                    throw new DecodingException(V0.toString());
                }
                throw new DecodingException(je.o0("Unrecognized character: ", c));
            }
            StringBuilder V02 = je.V0("Unrecognized character: 0x");
            V02.append(Integer.toHexString(c));
            throw new DecodingException(V02.toString());
        }

        /* access modifiers changed from: package-private */
        public char encode(int i) {
            return this.chars[i];
        }

        public boolean equals(Object obj) {
            if (obj instanceof Alphabet) {
                return Arrays.equals(this.chars, ((Alphabet) obj).chars);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.chars);
        }

        /* access modifiers changed from: package-private */
        public boolean isValidPaddingStartPosition(int i) {
            return this.validPadding[i % this.charsPerChunk];
        }

        /* access modifiers changed from: package-private */
        public Alphabet lowerCase() {
            boolean z;
            boolean z2;
            char[] cArr = this.chars;
            int length = cArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (rw.isUpperCase(cArr[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                return this;
            }
            char[] cArr2 = this.chars;
            int length2 = cArr2.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    z2 = false;
                    break;
                }
                char c = cArr2[i3];
                if (c >= 'a' && c <= 'z') {
                    z2 = true;
                    break;
                }
                i3++;
            }
            MoreObjects.checkState(!z2, "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr3 = new char[this.chars.length];
            while (true) {
                char[] cArr4 = this.chars;
                if (i >= cArr4.length) {
                    return new Alphabet(je.I0(new StringBuilder(), this.name, ".lowerCase()"), cArr3);
                }
                char c2 = cArr4[i];
                if (rw.isUpperCase(c2)) {
                    c2 = (char) (c2 ^ ' ');
                }
                cArr3[i] = c2;
                i++;
            }
        }

        public boolean matches(char c) {
            byte[] bArr = this.decodabet;
            return c < bArr.length && bArr[c] != -1;
        }

        public String toString() {
            return this.name;
        }
    }

    static final class Base16Encoding extends StandardBaseEncoding {
        final char[] encoding;

        Base16Encoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()));
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) {
            if (charSequence.length() % 2 != 1) {
                int i = 0;
                int i2 = 0;
                while (i < charSequence.length()) {
                    bArr[i2] = (byte) ((this.alphabet.decode(charSequence.charAt(i)) << 4) | this.alphabet.decode(charSequence.charAt(i + 1)));
                    i += 2;
                    i2++;
                }
                return i2;
            }
            StringBuilder V0 = je.V0("Invalid input length ");
            V0.append(charSequence.length());
            throw new DecodingException(V0.toString());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) {
            MoreObjects.checkPositionIndexes(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.encoding[i4]);
                appendable.append(this.encoding[i4 | 256]);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, Character ch) {
            return new Base16Encoding(alphabet);
        }

        private Base16Encoding(Alphabet alphabet) {
            super(alphabet, null);
            this.encoding = new char[512];
            MoreObjects.checkArgument(alphabet.chars.length == 16);
            for (int i = 0; i < 256; i++) {
                this.encoding[i] = alphabet.encode(i >>> 4);
                this.encoding[i | 256] = alphabet.encode(i & 15);
            }
        }
    }

    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: package-private */
    public static class StandardBaseEncoding extends BaseEncoding {
        final Alphabet alphabet;
        private transient BaseEncoding lowerCase;
        final Character paddingChar;

        StandardBaseEncoding(Alphabet alphabet2, Character ch) {
            alphabet2.getClass();
            this.alphabet = alphabet2;
            MoreObjects.checkArgument(ch == null || !alphabet2.matches(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.paddingChar = ch;
        }

        @Override // com.google.common.io.BaseEncoding
        public boolean canDecode(CharSequence charSequence) {
            CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (!this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                return false;
            }
            for (int i = 0; i < trimTrailingPadding.length(); i++) {
                if (!this.alphabet.canDecode(trimTrailingPadding.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) {
            Alphabet alphabet2;
            CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                int i = 0;
                int i2 = 0;
                while (i < trimTrailingPadding.length()) {
                    long j = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        alphabet2 = this.alphabet;
                        if (i3 >= alphabet2.charsPerChunk) {
                            break;
                        }
                        j <<= alphabet2.bitsPerChar;
                        if (i + i3 < trimTrailingPadding.length()) {
                            j |= (long) this.alphabet.decode(trimTrailingPadding.charAt(i4 + i));
                            i4++;
                        }
                        i3++;
                    }
                    int i5 = alphabet2.bytesPerChunk;
                    int i6 = (i5 * 8) - (i4 * alphabet2.bitsPerChar);
                    int i7 = (i5 - 1) * 8;
                    while (i7 >= i6) {
                        bArr[i2] = (byte) ((int) ((j >>> i7) & 255));
                        i7 -= 8;
                        i2++;
                    }
                    i += this.alphabet.charsPerChunk;
                }
                return i2;
            }
            StringBuilder V0 = je.V0("Invalid input length ");
            V0.append(trimTrailingPadding.length());
            throw new DecodingException(V0.toString());
        }

        /* access modifiers changed from: package-private */
        public void encodeChunkTo(Appendable appendable, byte[] bArr, int i, int i2) {
            MoreObjects.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            MoreObjects.checkArgument(i2 <= this.alphabet.bytesPerChunk);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.alphabet.bitsPerChar;
            while (i3 < i2 * 8) {
                Alphabet alphabet2 = this.alphabet;
                appendable.append(alphabet2.encode(((int) (j >>> (i5 - i3))) & alphabet2.mask));
                i3 += this.alphabet.bitsPerChar;
            }
            if (this.paddingChar != null) {
                while (i3 < this.alphabet.bytesPerChunk * 8) {
                    appendable.append(this.paddingChar.charValue());
                    i3 += this.alphabet.bitsPerChar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) {
            MoreObjects.checkPositionIndexes(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                encodeChunkTo(appendable, bArr, i + i3, Math.min(this.alphabet.bytesPerChunk, i2 - i3));
                i3 += this.alphabet.bytesPerChunk;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof StandardBaseEncoding)) {
                return false;
            }
            StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
            if (!this.alphabet.equals(standardBaseEncoding.alphabet) || !rw.equal(this.paddingChar, standardBaseEncoding.paddingChar)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.alphabet.hashCode() ^ Arrays.hashCode(new Object[]{this.paddingChar});
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding lowerCase() {
            BaseEncoding baseEncoding = this.lowerCase;
            if (baseEncoding == null) {
                Alphabet lowerCase2 = this.alphabet.lowerCase();
                baseEncoding = lowerCase2 == this.alphabet ? this : newInstance(lowerCase2, this.paddingChar);
                this.lowerCase = baseEncoding;
            }
            return baseEncoding;
        }

        /* access modifiers changed from: package-private */
        public BaseEncoding newInstance(Alphabet alphabet2, Character ch) {
            return new StandardBaseEncoding(alphabet2, ch);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding omitPadding() {
            return this.paddingChar == null ? this : newInstance(this.alphabet, null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.alphabet.toString());
            if (8 % this.alphabet.bitsPerChar != 0) {
                if (this.paddingChar == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.paddingChar);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding
        public CharSequence trimTrailingPadding(CharSequence charSequence) {
            charSequence.getClass();
            Character ch = this.paddingChar;
            if (ch == null) {
                return charSequence;
            }
            char charValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }
    }

    static {
        new StandardBaseEncoding(new Alphabet("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
        new StandardBaseEncoding(new Alphabet("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');
    }

    BaseEncoding() {
    }

    public static BaseEncoding base16() {
        return BASE16;
    }

    public static BaseEncoding base64() {
        return BASE64;
    }

    public static BaseEncoding base64Url() {
        return BASE64_URL;
    }

    public abstract boolean canDecode(CharSequence charSequence);

    public final byte[] decode(CharSequence charSequence) {
        try {
            CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            int length = (int) (((((long) ((StandardBaseEncoding) this).alphabet.bitsPerChar) * ((long) trimTrailingPadding.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int decodeTo = decodeTo(bArr, trimTrailingPadding);
            if (decodeTo == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[decodeTo];
            System.arraycopy(bArr, 0, bArr2, 0, decodeTo);
            return bArr2;
        } catch (DecodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract int decodeTo(byte[] bArr, CharSequence charSequence);

    public String encode(byte[] bArr) {
        int length = bArr.length;
        MoreObjects.checkPositionIndexes(0, 0 + length, bArr.length);
        Alphabet alphabet = ((StandardBaseEncoding) this).alphabet;
        StringBuilder sb = new StringBuilder(IntMath.divide(length, alphabet.bytesPerChunk, RoundingMode.CEILING) * alphabet.charsPerChunk);
        try {
            encodeTo(sb, bArr, 0, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void encodeTo(Appendable appendable, byte[] bArr, int i, int i2);

    public abstract BaseEncoding lowerCase();

    public abstract BaseEncoding omitPadding();

    /* access modifiers changed from: package-private */
    public abstract CharSequence trimTrailingPadding(CharSequence charSequence);

    static final class Base64Encoding extends StandardBaseEncoding {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        Base64Encoding(java.lang.String r2, java.lang.String r3, java.lang.Character r4) {
            /*
                r1 = this;
                com.google.common.io.BaseEncoding$Alphabet r0 = new com.google.common.io.BaseEncoding$Alphabet
                char[] r3 = r3.toCharArray()
                r0.<init>(r2, r3)
                r1.<init>(r0, r4)
                char[] r2 = com.google.common.io.BaseEncoding.Alphabet.access$000(r0)
                int r2 = r2.length
                r3 = 64
                if (r2 != r3) goto L_0x0017
                r2 = 1
                goto L_0x0018
            L_0x0017:
                r2 = 0
            L_0x0018:
                com.google.common.base.MoreObjects.checkArgument(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.BaseEncoding.Base64Encoding.<init>(java.lang.String, java.lang.String, java.lang.Character):void");
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public int decodeTo(byte[] bArr, CharSequence charSequence) {
            CharSequence trimTrailingPadding = trimTrailingPadding(charSequence);
            if (this.alphabet.isValidPaddingStartPosition(trimTrailingPadding.length())) {
                int i = 0;
                int i2 = 0;
                while (i < trimTrailingPadding.length()) {
                    int i3 = i + 1;
                    int i4 = i3 + 1;
                    int decode = (this.alphabet.decode(trimTrailingPadding.charAt(i)) << 18) | (this.alphabet.decode(trimTrailingPadding.charAt(i3)) << 12);
                    int i5 = i2 + 1;
                    bArr[i2] = (byte) (decode >>> 16);
                    if (i4 < trimTrailingPadding.length()) {
                        int i6 = i4 + 1;
                        int decode2 = decode | (this.alphabet.decode(trimTrailingPadding.charAt(i4)) << 6);
                        i2 = i5 + 1;
                        bArr[i5] = (byte) ((decode2 >>> 8) & BitmapRenderer.ALPHA_VISIBLE);
                        if (i6 < trimTrailingPadding.length()) {
                            i4 = i6 + 1;
                            i5 = i2 + 1;
                            bArr[i2] = (byte) ((decode2 | this.alphabet.decode(trimTrailingPadding.charAt(i6))) & BitmapRenderer.ALPHA_VISIBLE);
                        } else {
                            i = i6;
                        }
                    }
                    i2 = i5;
                    i = i4;
                }
                return i2;
            }
            StringBuilder V0 = je.V0("Invalid input length ");
            V0.append(trimTrailingPadding.length());
            throw new DecodingException(V0.toString());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding, com.google.common.io.BaseEncoding
        public void encodeTo(Appendable appendable, byte[] bArr, int i, int i2) {
            int i3 = i + i2;
            MoreObjects.checkPositionIndexes(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                int i6 = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                appendable.append(this.alphabet.encode(i6 >>> 18));
                appendable.append(this.alphabet.encode((i6 >>> 12) & 63));
                appendable.append(this.alphabet.encode((i6 >>> 6) & 63));
                appendable.append(this.alphabet.encode(i6 & 63));
                i2 -= 3;
                i = i5 + 1;
            }
            if (i < i3) {
                encodeChunkTo(appendable, bArr, i, i3 - i);
            }
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.common.io.BaseEncoding.StandardBaseEncoding
        public BaseEncoding newInstance(Alphabet alphabet, Character ch) {
            return new Base64Encoding(alphabet, ch);
        }

        private Base64Encoding(Alphabet alphabet, Character ch) {
            super(alphabet, ch);
            MoreObjects.checkArgument(alphabet.chars.length == 64);
        }
    }
}
