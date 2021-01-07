package defpackage;

import com.spotify.mobile.android.observablestates.docking.DockingStatus;
import io.reactivex.functions.l;

/* renamed from: vw1  reason: default package */
public final /* synthetic */ class vw1 implements l {
    public static final /* synthetic */ vw1 a = new vw1();

    private /* synthetic */ vw1() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((DockingStatus) obj) == DockingStatus.DOCKED);
    }
}
