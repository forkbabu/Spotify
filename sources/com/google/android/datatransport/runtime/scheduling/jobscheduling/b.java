package com.google.android.datatransport.runtime.scheduling.jobscheduling;

final /* synthetic */ class b implements Runnable {
    private static final b a = new b();

    private b() {
    }

    public static Runnable a() {
        return a;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = AlarmManagerSchedulerBroadcastReceiver.a;
    }
}
