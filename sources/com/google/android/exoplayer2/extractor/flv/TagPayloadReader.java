package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.v;

abstract class TagPayloadReader {
    protected final zj a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    protected TagPayloadReader(zj zjVar) {
        this.a = zjVar;
    }

    public final boolean a(v vVar, long j) {
        return b(vVar) && c(vVar, j);
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(v vVar);

    /* access modifiers changed from: protected */
    public abstract boolean c(v vVar, long j);
}
