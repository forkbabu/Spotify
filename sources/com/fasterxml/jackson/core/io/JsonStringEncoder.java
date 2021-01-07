package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;

public final class JsonStringEncoder {
    private static final byte[] HB = CharTypes.copyHexBytes();
    private static final char[] HC = CharTypes.copyHexChars();
    protected ByteArrayBuilder _bytes;
    protected final char[] _qbuf;
    protected TextBuffer _text;

    public JsonStringEncoder() {
        char[] cArr = new char[6];
        this._qbuf = cArr;
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
    }

    private static int _convert(int i, int i2) {
        if (i2 < 56320 || i2 > 57343) {
            StringBuilder V0 = je.V0("Broken surrogate pair: first char 0x");
            V0.append(Integer.toHexString(i));
            V0.append(", second 0x");
            V0.append(Integer.toHexString(i2));
            V0.append("; illegal combination");
            throw new IllegalArgumentException(V0.toString());
        }
        return (i2 - 56320) + ((i - 55296) << 10) + 65536;
    }

    private static void _illegal(int i) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] encodeAsUTF8(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r9 >= 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r9 = r13._qbuf;
        r9[1] = 'u';
        r10 = com.fasterxml.jackson.core.io.JsonStringEncoder.HC;
        r9[4] = r10[r6 >> 4];
        r9[5] = r10[r6 & 15];
        r6 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r13._qbuf[1] = (char) r9;
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r9 = r7 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r9 <= r1.length) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        r9 = r1.length - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        if (r9 <= 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        java.lang.System.arraycopy(r13._qbuf, 0, r1, r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r1 = r0.finishCurrentSegment();
        r6 = r6 - r9;
        java.lang.System.arraycopy(r13._qbuf, r9, r1, 0, r6);
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        java.lang.System.arraycopy(r13._qbuf, 0, r1, r7, r6);
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r8 = r6 + 1;
        r6 = r14.charAt(r6);
        r9 = r2[r6];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] quoteAsString(java.lang.String r14) {
        /*
            r13 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r13._text
            if (r0 != 0) goto L_0x000c
            com.fasterxml.jackson.core.util.TextBuffer r0 = new com.fasterxml.jackson.core.util.TextBuffer
            r1 = 0
            r0.<init>(r1)
            r13._text = r0
        L_0x000c:
            char[] r1 = r0.emptyAndGetCurrentSegment()
            int[] r2 = com.fasterxml.jackson.core.io.CharTypes.get7BitOutputEscapes()
            int r3 = r2.length
            int r4 = r14.length()
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x001c:
            if (r6 >= r4) goto L_0x0087
        L_0x001e:
            char r8 = r14.charAt(r6)
            if (r8 >= r3) goto L_0x0073
            r9 = r2[r8]
            if (r9 == 0) goto L_0x0073
            int r8 = r6 + 1
            char r6 = r14.charAt(r6)
            r9 = r2[r6]
            r10 = 1
            if (r9 >= 0) goto L_0x004b
            char[] r9 = r13._qbuf
            r11 = 117(0x75, float:1.64E-43)
            r9[r10] = r11
            char[] r10 = com.fasterxml.jackson.core.io.JsonStringEncoder.HC
            int r11 = r6 >> 4
            char r11 = r10[r11]
            r12 = 4
            r9[r12] = r11
            r6 = r6 & 15
            char r6 = r10[r6]
            r10 = 5
            r9[r10] = r6
            r6 = 6
            goto L_0x0051
        L_0x004b:
            char[] r6 = r13._qbuf
            char r9 = (char) r9
            r6[r10] = r9
            r6 = 2
        L_0x0051:
            int r9 = r7 + r6
            int r10 = r1.length
            if (r9 <= r10) goto L_0x006b
            int r9 = r1.length
            int r9 = r9 - r7
            if (r9 <= 0) goto L_0x005f
            char[] r10 = r13._qbuf
            java.lang.System.arraycopy(r10, r5, r1, r7, r9)
        L_0x005f:
            char[] r1 = r0.finishCurrentSegment()
            int r6 = r6 - r9
            char[] r7 = r13._qbuf
            java.lang.System.arraycopy(r7, r9, r1, r5, r6)
            r7 = r6
            goto L_0x0071
        L_0x006b:
            char[] r10 = r13._qbuf
            java.lang.System.arraycopy(r10, r5, r1, r7, r6)
            r7 = r9
        L_0x0071:
            r6 = r8
            goto L_0x001c
        L_0x0073:
            int r9 = r1.length
            if (r7 < r9) goto L_0x007b
            char[] r1 = r0.finishCurrentSegment()
            r7 = 0
        L_0x007b:
            int r9 = r7 + 1
            r1[r7] = r8
            int r6 = r6 + 1
            if (r6 < r4) goto L_0x0085
            r7 = r9
            goto L_0x0087
        L_0x0085:
            r7 = r9
            goto L_0x001e
        L_0x0087:
            r0.setCurrentLength(r7)
            char[] r14 = r0.contentsAsArray()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r6 < r3.length) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r3 = r0.finishCurrentSegment();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        r8 = r5 + 1;
        r5 = r12.charAt(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r5 > 127) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        r3 = r7[r5];
        r0.setCurrentSegmentLength(r6);
        r0.append(92);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r3 >= 0) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r0.append(117);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        if (r5 <= 255) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r3 = r5 >> 8;
        r6 = com.fasterxml.jackson.core.io.JsonStringEncoder.HB;
        r0.append(r6[r3 >> 4]);
        r0.append(r6[r3 & 15]);
        r5 = r5 & com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer.ALPHA_VISIBLE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        r0.append(48);
        r0.append(48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r3 = com.fasterxml.jackson.core.io.JsonStringEncoder.HB;
        r0.append(r3[r5 >> 4]);
        r0.append(r3[r5 & 15]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r0.append((byte) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r6 = r0.getCurrentSegmentLength();
        r3 = r0.getCurrentSegment();
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r5 > 2047) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        r7 = r6 + 1;
        r3[r6] = (byte) ((r5 >> 6) | 192);
        r5 = (r5 & 63) | 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        r6 = r5;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        if (r5 < 55296) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (r5 <= 57343) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        if (r5 > 56319) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        if (r8 >= r2) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cb, code lost:
        r7 = r8 + 1;
        r5 = _convert(r5, r12.charAt(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d8, code lost:
        if (r5 > 1114111) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
        r8 = r6 + 1;
        r3[r6] = (byte) ((r5 >> 18) | 240);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
        if (r8 < r3.length) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e6, code lost:
        r3 = r0.finishCurrentSegment();
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00eb, code lost:
        r6 = r8 + 1;
        r3[r8] = (byte) (((r5 >> 12) & 63) | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f7, code lost:
        if (r6 < r3.length) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f9, code lost:
        r3 = r0.finishCurrentSegment();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        r8 = r6 + 1;
        r3[r6] = (byte) (((r5 >> 6) & 63) | 128);
        r6 = (r5 & 63) | 128;
        r5 = r7;
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0111, code lost:
        _illegal(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0114, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        _illegal(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0118, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0119, code lost:
        _illegal(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011d, code lost:
        r7 = r6 + 1;
        r3[r6] = (byte) ((r5 >> 12) | 224);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r7 < r3.length) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0129, code lost:
        r3 = r0.finishCurrentSegment();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012e, code lost:
        r3[r7] = (byte) (((r5 >> 6) & 63) | 128);
        r5 = (r5 & 63) | 128;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0141, code lost:
        if (r7 < r3.length) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0143, code lost:
        r3 = r0.finishCurrentSegment();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0148, code lost:
        r3[r7] = (byte) r6;
        r6 = r7 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] quoteAsUTF8(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsUTF8(java.lang.String):byte[]");
    }
}
