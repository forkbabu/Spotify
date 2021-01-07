package defpackage;

import com.spotify.mobile.android.observablestates.docking.DockingStatus;
import io.reactivex.functions.g;

/* renamed from: vm1  reason: default package */
public final /* synthetic */ class vm1 implements g {
    public final /* synthetic */ pn1 a;

    public /* synthetic */ vm1(pn1 pn1) {
        this.a = pn1;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        pn1.h(this.a, (DockingStatus) obj);
    }
}
