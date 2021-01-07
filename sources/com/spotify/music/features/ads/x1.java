package com.spotify.music.features.ads;

import android.content.Context;
import com.google.protobuf.u;
import com.spotify.messages.VoiceAdLog;

public class x1 {
    private final w52 a;
    private final gl0<u> b;
    private final Context c;
    private final cqe d;
    boolean e;

    public x1(w52 w52, gl0<u> gl0, Context context, cqe cqe) {
        this.a = w52;
        this.b = gl0;
        this.c = context;
        this.d = cqe;
        boolean f = w52.f(context, "android.permission.RECORD_AUDIO");
        this.e = f;
        a(f);
    }

    private void a(boolean z) {
        VoiceAdLog.c q = VoiceAdLog.q();
        q.p(z ? "mic_perms_enabled" : "mic_perms_disabled");
        q.r(this.d.d());
        q.o("");
        this.b.c((VoiceAdLog) q.build());
    }

    public void b() {
        boolean f = this.a.f(this.c, "android.permission.RECORD_AUDIO");
        boolean z = this.e;
        if (f != z) {
            boolean z2 = !z;
            this.e = z2;
            a(z2);
        }
    }
}
