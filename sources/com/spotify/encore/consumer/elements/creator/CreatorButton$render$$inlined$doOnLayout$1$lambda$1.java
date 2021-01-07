package com.spotify.encore.consumer.elements.creator;

import android.text.TextPaint;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class CreatorButton$render$$inlined$doOnLayout$1$lambda$1 extends FunctionReferenceImpl implements nmf<String, Float> {
    CreatorButton$render$$inlined$doOnLayout$1$lambda$1(TextPaint textPaint) {
        super(1, textPaint, TextPaint.class, "measureText", "measureText(Ljava/lang/String;)F", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public /* bridge */ /* synthetic */ Float invoke(String str) {
        return Float.valueOf(invoke(str));
    }

    public final float invoke(String str) {
        return ((TextPaint) this.receiver).measureText(str);
    }
}
