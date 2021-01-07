package defpackage;

import android.content.Intent;
import android.os.Build;
import com.spotify.messages.VoiceAdLog;
import com.spotify.mobile.android.ui.activity.PermissionsRequestActivity;
import com.spotify.mobile.android.util.ui.m;

/* access modifiers changed from: package-private */
/* renamed from: nob  reason: default package */
public class nob extends m {
    final /* synthetic */ oob a;

    nob(oob oob) {
        this.a = oob;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void b(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            int i3 = PermissionsRequestActivity.f;
            PermissionsRequestActivity.a aVar = (PermissionsRequestActivity.a) intent.getParcelableExtra("permission_result");
            if (aVar != null) {
                boolean b = aVar.b("android.permission.RECORD_AUDIO");
                VoiceAdLog.c q = VoiceAdLog.q();
                q.r(this.a.d.d());
                q.o("audio_psa");
                if (b) {
                    q.p("mic_permission_accept");
                } else if (Build.VERSION.SDK_INT < 23 || !oob.b(this.a)) {
                    oob.c(this.a);
                    q.p("mic_permission_deny");
                } else {
                    q.p("mic_permission_deny_forever");
                }
                this.a.b.c(q.build());
                this.a.c.d(this.a.a, b);
            }
        }
    }
}
