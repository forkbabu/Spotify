package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.play.core.tasks.m;
import java.util.List;

final class l extends j<List<String>> {
    final /* synthetic */ o c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(o oVar, m<List<String>> mVar) {
        super(oVar, mVar);
        this.c = oVar;
    }

    @Override // com.google.android.play.core.assetpacks.j, com.google.android.play.core.internal.i0
    public final void A(List<Bundle> list) {
        super.A(list);
        this.a.e(o.c(this.c, list));
    }
}
