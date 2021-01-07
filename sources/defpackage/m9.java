package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.j;

/* renamed from: m9  reason: default package */
public abstract class m9<T> extends n9<T> {
    private static final String h = j.f("BrdcstRcvrCnstrntTrckr");
    private final BroadcastReceiver g = new a();

    /* renamed from: m9$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                m9.this.h(context, intent);
            }
        }
    }

    public m9(Context context, na naVar) {
        super(context, naVar);
    }

    @Override // defpackage.n9
    public void e() {
        j.c().a(h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.registerReceiver(this.g, g());
    }

    @Override // defpackage.n9
    public void f() {
        j.c().a(h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
