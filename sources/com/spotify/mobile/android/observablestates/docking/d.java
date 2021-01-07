package com.spotify.mobile.android.observablestates.docking;

import io.reactivex.functions.i;

public final /* synthetic */ class d implements i {
    public static final /* synthetic */ d a = new d();

    private /* synthetic */ d() {
    }

    @Override // io.reactivex.functions.i
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        DockingStatus dockingStatus = DockingStatus.DOCKED;
        return ((!booleanValue2 || !booleanValue3 || !booleanValue4) && !booleanValue) ? DockingStatus.NOT_DOCKED : dockingStatus;
    }
}
