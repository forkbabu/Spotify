package com.spotify.music.features.carepackage;

import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class CarePackageFragmentModule$EntitySelectorModule$provideListNameEntitySelectorResultConsumer$1 extends FunctionReferenceImpl implements nmf<List<? extends ty4>, f> {
    CarePackageFragmentModule$EntitySelectorModule$provideListNameEntitySelectorResultConsumer$1(si4 si4) {
        super(1, si4, si4.class, "notifyUserSelection", "notifyUserSelection(Ljava/util/List;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(List<? extends ty4> list) {
        List<? extends ty4> list2 = list;
        h.e(list2, "p1");
        ((si4) this.receiver).a(list2);
        return f.a;
    }
}
