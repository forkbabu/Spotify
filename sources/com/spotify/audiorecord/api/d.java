package com.spotify.audiorecord.api;

import io.reactivex.functions.l;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

class d implements l<ByteBuffer, Float> {
    final /* synthetic */ e a;

    d(e eVar) {
        this.a = eVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public Float apply(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = byteBuffer;
        ShortBuffer asShortBuffer = byteBuffer2.slice().order(byteBuffer2.order()).asShortBuffer();
        int remaining = asShortBuffer.remaining();
        float f = 0.0f;
        while (asShortBuffer.hasRemaining()) {
            short s = asShortBuffer.get();
            f += (float) (s * s);
        }
        return Float.valueOf(Math.min(1.0f, (((float) Math.sqrt((double) (f / ((float) remaining)))) / 32767.0f) * 16.0f));
    }
}
