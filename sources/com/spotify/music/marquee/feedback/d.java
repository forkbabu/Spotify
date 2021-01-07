package com.spotify.music.marquee.feedback;

import androidx.fragment.app.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.marquee.feedback.f;
import java.lang.ref.WeakReference;

public class d implements f.a {
    private final jjb a;
    private final o0 b;
    private final String c;
    private final String d;
    private final WeakReference<c> e;

    public d(jjb jjb, o0 o0Var, String str, String str2, c cVar) {
        this.a = jjb;
        this.b = o0Var;
        this.c = str;
        this.d = str2;
        this.e = new WeakReference<>(cVar);
    }

    public void a(h hVar) {
        this.a.d(hVar.a(), this.c, this.d);
        if (this.e.get() != null) {
            this.e.get().finish();
            this.e.get().overridePendingTransition(0, C0707R.anim.marquee_overlay_exit);
        }
        this.b.a(SpotifyIconV2.BAN, C0707R.string.marquee_optout_marquee_notification_text, 1);
    }
}
