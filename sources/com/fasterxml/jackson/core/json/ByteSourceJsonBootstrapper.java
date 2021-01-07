package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.io.IOContext;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.io.CharConversionException;
import java.io.InputStream;

public final class ByteSourceJsonBootstrapper {
    private boolean _bigEndian = true;
    private final boolean _bufferRecyclable;
    private int _bytesPerChar;
    private final IOContext _context;
    private final InputStream _in;
    private final byte[] _inputBuffer;
    private int _inputEnd;
    private int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._bufferRecyclable = true;
    }

    private boolean checkUTF16(int i) {
        if ((65280 & i) == 0) {
            this._bigEndian = true;
        } else if ((i & BitmapRenderer.ALPHA_VISIBLE) != 0) {
            return false;
        } else {
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private void reportWeirdUCS4(String str) {
        throw new CharConversionException(je.y0("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00af, code lost:
        if (checkUTF16(r4 >>> 16) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d9, code lost:
        if (checkUTF16((r4[r7 + 1] & 255) | ((r4[r7] & 255) << 8)) != false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.core.JsonParser constructParser(int r22, com.fasterxml.jackson.core.ObjectCodec r23, com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer r24, com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r25, int r26) {
        /*
        // Method dump skipped, instructions count: 422
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.constructParser(int, com.fasterxml.jackson.core.ObjectCodec, com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer, com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer, int):com.fasterxml.jackson.core.JsonParser");
    }

    /* access modifiers changed from: protected */
    public boolean ensureLoaded(int i) {
        int i2;
        int i3 = this._inputEnd - this._inputPtr;
        while (i3 < i) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i4 = this._inputEnd;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this._inputEnd += i2;
            i3 += i2;
        }
        return true;
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i, int i2) {
        this._context = iOContext;
        this._in = null;
        this._inputBuffer = bArr;
        this._inputPtr = i;
        this._inputEnd = i + i2;
        this._bufferRecyclable = false;
    }
}
