package com.spotify.mobile.android.coreintegration;

import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        TaskRemovedStatus taskRemovedStatus = (TaskRemovedStatus) obj;
        int i = t.E;
        return Boolean.valueOf(taskRemovedStatus == TaskRemovedStatus.REMOVED);
    }
}
