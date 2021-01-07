package com.spotify.mobile.android.coreintegration;

public final class w implements fjf<io.reactivex.subjects.a<TaskRemovedStatus>> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final w a = new w();
    }

    public static w a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return io.reactivex.subjects.a.i1(TaskRemovedStatus.NOT_REMOVED);
    }
}
