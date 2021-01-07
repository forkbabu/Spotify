package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: kd0  reason: default package */
public class kd0 {
    private final e6 a;
    private final Map<String, Intent> b = new HashMap();
    private final Context c;

    public kd0(Context context) {
        this.c = context;
        this.a = e6.b(context);
    }

    public Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        ArrayList arrayList = new ArrayList(intentFilter.countActions());
        for (int i = 0; i < intentFilter.countActions(); i++) {
            Intent intent = this.b.get(intentFilter.getAction(i));
            if (intent != null) {
                arrayList.add(intent);
            }
        }
        if (broadcastReceiver != null) {
            this.a.c(broadcastReceiver, intentFilter);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                broadcastReceiver.onReceive(this.c, (Intent) it.next());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (Intent) arrayList.get(arrayList.size() - 1);
    }

    public void b(Intent intent) {
        this.b.remove(intent.getAction());
    }

    public boolean c(Intent intent) {
        this.b.put(intent.getAction(), intent);
        return this.a.d(intent);
    }

    public void d(BroadcastReceiver broadcastReceiver) {
        this.a.e(broadcastReceiver);
    }
}
