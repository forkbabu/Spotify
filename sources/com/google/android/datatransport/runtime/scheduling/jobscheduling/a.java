package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;

public class a implements r {
    private final Context a;
    private final nh b;
    private AlarmManager c;
    private final SchedulerConfig d;
    private final ti e;

    public a(Context context, nh nhVar, ti tiVar, SchedulerConfig schedulerConfig) {
        this.a = context;
        this.b = nhVar;
        this.c = (AlarmManager) context.getSystemService("alarm");
        this.e = tiVar;
        this.d = schedulerConfig;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.r
    public void a(tg tgVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", tgVar.b());
        builder.appendQueryParameter("priority", String.valueOf(yi.a(tgVar.d())));
        if (tgVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(tgVar.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null) {
            bh.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", tgVar);
            return;
        }
        long F0 = this.b.F0(tgVar);
        long b2 = this.d.b(tgVar.d(), F0, i);
        bh.b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", tgVar, Long.valueOf(b2), Long.valueOf(F0), Integer.valueOf(i));
        this.c.set(3, this.e.a() + b2, PendingIntent.getBroadcast(this.a, 0, intent, 0));
    }
}
