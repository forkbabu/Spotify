package com.spotify.libs.onboarding.allboarding.picker;

import androidx.lifecycle.v;
import com.spotify.libs.onboarding.allboarding.room.j;
import java.util.List;

/* access modifiers changed from: package-private */
public final class t<T> implements v<List<? extends j>> {
    final /* synthetic */ u a;

    t(u uVar) {
        this.a = uVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.v
    public void a(List<? extends j> list) {
        List<? extends j> list2 = list;
        u uVar = this.a;
        uVar.w(d.a(uVar.n(), list2, null, null, false, false, 30));
        this.a.x();
    }
}
