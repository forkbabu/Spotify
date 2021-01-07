package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.NetworkType;
import androidx.work.b;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* access modifiers changed from: package-private */
public class c {
    private static final String e = j.f("ConstraintsCmdHandler");
    private final Context a;
    private final int b;
    private final e c;
    private final b9 d;

    c(Context context, int i, e eVar) {
        this.a = context;
        this.b = i;
        this.c = eVar;
        this.d = new b9(context, eVar.f(), null);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        List<ga> m = ((ia) this.c.g().o().z()).m();
        Context context = this.a;
        int i = ConstraintProxy.b;
        ArrayList arrayList = (ArrayList) m;
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            b bVar = ((ga) it.next()).j;
            z |= bVar.f();
            z2 |= bVar.g();
            z3 |= bVar.i();
            z4 |= bVar.b() != NetworkType.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        String str = ConstraintProxyUpdateReceiver.a;
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        context.sendBroadcast(intent);
        this.d.d(m);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ga gaVar = (ga) it2.next();
            String str2 = gaVar.a;
            if (currentTimeMillis >= gaVar.a() && (!gaVar.b() || this.d.a(str2))) {
                arrayList2.add(gaVar);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String str3 = ((ga) it3.next()).a;
            Intent b2 = b.b(this.a, str3);
            j.c().a(e, String.format("Creating a delay_met command for workSpec with id (%s)", str3), new Throwable[0]);
            e eVar = this.c;
            eVar.j(new e.b(eVar, b2, this.b));
        }
        this.d.e();
    }
}
