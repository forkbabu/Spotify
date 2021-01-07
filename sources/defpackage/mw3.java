package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.hubframework.defaults.components.glue.k;
import defpackage.k91;

/* renamed from: mw3  reason: default package */
public final /* synthetic */ class mw3 implements k91.a {
    public final /* synthetic */ ImmutableList a;

    public /* synthetic */ mw3(ImmutableList immutableList) {
        this.a = immutableList;
    }

    @Override // defpackage.k91.a
    public final s81 a(s81 s81) {
        ImmutableList immutableList = this.a;
        if (!HubsComponentCategory.ROW.d().equals(s81.componentId().category()) || !immutableList.contains(s81.metadata().string("uri", ""))) {
            return null;
        }
        return s81.toBuilder().c(k.a(true)).l();
    }
}
