package com.google.android.datatransport.runtime.backends;

public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static BackendResponse a() {
        return new b(Status.FATAL_ERROR, -1);
    }

    public static BackendResponse d(long j) {
        return new b(Status.OK, j);
    }

    public static BackendResponse e() {
        return new b(Status.TRANSIENT_ERROR, -1);
    }

    public abstract long b();

    public abstract Status c();
}
