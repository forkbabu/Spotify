package com.spotify.music.features.yourlibraryx.quickscroll;

import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class QuickScrollConnectable$connect$disposable$1 extends FunctionReferenceImpl implements nmf<Boolean, f> {
    QuickScrollConnectable$connect$disposable$1(QuickScrollConnectable quickScrollConnectable) {
        super(1, quickScrollConnectable, QuickScrollConnectable.class, "updateQuickScrollTheme", "updateQuickScrollTheme(Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        QuickScrollConnectable.k((QuickScrollConnectable) this.receiver, bool.booleanValue());
        return f.a;
    }
}
