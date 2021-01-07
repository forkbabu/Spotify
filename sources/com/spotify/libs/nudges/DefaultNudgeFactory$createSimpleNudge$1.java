package com.spotify.libs.nudges;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DefaultNudgeFactory$createSimpleNudge$1 extends Lambda implements nmf<ov0, f> {
    public static final DefaultNudgeFactory$createSimpleNudge$1 a = new DefaultNudgeFactory$createSimpleNudge$1();

    DefaultNudgeFactory$createSimpleNudge$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ov0 ov0) {
        ov0 ov02 = ov0;
        h.e(ov02, "it");
        ov02.dismiss();
        return f.a;
    }
}
