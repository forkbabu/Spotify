package com.fasterxml.jackson.core.util;

import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;

public class BufferRecycler {
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, SnackbarUtilsKt.SNACKBAR_ACTION_DURATION, SnackbarUtilsKt.SNACKBAR_ACTION_DURATION};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, 200, 200};
    protected final byte[][] _byteBuffers = new byte[4][];
    protected final char[][] _charBuffers = new char[4][];

    public final byte[] allocByteBuffer(int i) {
        int i2 = BYTE_BUFFER_LENGTHS[i];
        if (i2 <= 0) {
            i2 = 0;
        }
        byte[][] bArr = this._byteBuffers;
        byte[] bArr2 = bArr[i];
        if (bArr2 == null || bArr2.length < i2) {
            return new byte[i2];
        }
        bArr[i] = null;
        return bArr2;
    }

    public char[] allocCharBuffer(int i, int i2) {
        int i3 = CHAR_BUFFER_LENGTHS[i];
        if (i2 < i3) {
            i2 = i3;
        }
        char[][] cArr = this._charBuffers;
        char[] cArr2 = cArr[i];
        if (cArr2 == null || cArr2.length < i2) {
            return new char[i2];
        }
        cArr[i] = null;
        return cArr2;
    }

    public void releaseByteBuffer(int i, byte[] bArr) {
        this._byteBuffers[i] = bArr;
    }

    public void releaseCharBuffer(int i, char[] cArr) {
        this._charBuffers[i] = cArr;
    }
}
