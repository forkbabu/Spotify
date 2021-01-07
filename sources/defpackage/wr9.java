package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.music.homething.addnewdevice.connecting.view.ConnectingFragment;
import com.spotify.music.homething.addnewdevice.scandevices.service.HomethingActivationService;
import java.util.UUID;

/* renamed from: wr9  reason: default package */
public class wr9 implements ur9 {
    private final Context a;
    private final ws9 b;
    private final rt9 c;
    private UUID d;
    private vr9 e;
    private final BroadcastReceiver f = new a();

    /* renamed from: wr9$a */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (rw.equal(wr9.this.d, (UUID) intent.getSerializableExtra("KEY_UUID"))) {
                if (intent.hasExtra("KEY_PROGRESS")) {
                    ((ConnectingFragment) wr9.this.e).O4(intent.getIntExtra("KEY_PROGRESS", 0));
                }
                if (intent.getBooleanExtra("KEY_SENT_SPOTIFY_TOKEN", false)) {
                    ((ConnectingFragment) wr9.this.e).L4();
                }
                if (intent.getBooleanExtra("KEY_SENT_WIFI", false)) {
                    ((ConnectingFragment) wr9.this.e).M4();
                }
                if (intent.getBooleanExtra("KEY_WAITED_FOR_REBOOT", false)) {
                    ((ConnectingFragment) wr9.this.e).N4();
                    wr9.this.b.e();
                }
                if (intent.getBooleanExtra("KEY_ACTIVATION_FAILED", false)) {
                    wr9.this.b.b();
                }
            }
        }
    }

    public wr9(Context context, ws9 ws9, rt9 rt9) {
        this.a = context;
        this.b = ws9;
        this.c = rt9;
    }

    public void d(Bundle bundle) {
        if (bundle != null) {
            this.d = (UUID) bundle.getSerializable("KEY_SESSION_UUID");
        }
    }

    public void e(Bundle bundle) {
        bundle.putSerializable("KEY_SESSION_UUID", this.d);
    }

    public void f(vr9 vr9) {
        this.e = vr9;
        this.a.registerReceiver(this.f, new IntentFilter("ACTION_ACTIVATION_UPDATE"));
        if (this.d == null) {
            this.d = UUID.randomUUID();
            Intent intent = new Intent(this.a, HomethingActivationService.class);
            intent.putExtra("com.spotify.music.homething.addnewdevice.scandevices.service.DEVICE_ADDRESS", this.c.a());
            intent.putExtra("com.spotify.music.homething.addnewdevice.scandevices.service.ACTIVATION_INFO", this.c);
            intent.putExtra("com.spotify.music.homething.addnewdevice.scandevices.service.SESSION_UUID", this.d);
            this.a.startService(intent);
        }
    }

    public void g() {
        this.a.unregisterReceiver(this.f);
    }
}
