package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.l;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.j;
import androidx.work.k;

public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            j.c().a(a, "Requesting diagnostics", new Throwable[0]);
            try {
                l.k(context).b((k) new k.a(DiagnosticsWorker.class).b());
            } catch (IllegalStateException e) {
                j.c().b(a, "WorkManager is not initialized", e);
            }
        }
    }
}
