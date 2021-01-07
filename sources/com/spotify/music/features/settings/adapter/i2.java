package com.spotify.music.features.settings.adapter;

import android.content.Context;
import com.spotify.glue.dialogs.d;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.music.C0707R;

public class i2 {
    private final Context a;
    private d b;

    public interface a {
    }

    public i2(Context context) {
        this.a = context;
    }

    public void a(a aVar) {
        Context context = this.a;
        f c = m.c(context, context.getString(C0707R.string.settings_sync_quality_dialog_resync_downloads_title), this.a.getString(C0707R.string.settings_sync_quality_dialog_resync_downloads_text));
        c.f(this.a.getString(C0707R.string.two_button_dialog_button_resync_downloads), new e(aVar));
        c.e(this.a.getString(C0707R.string.settings_dialog_cancel_button), new f(aVar));
        c.a(true);
        c.h(new g(aVar));
        d b2 = c.b();
        this.b = b2;
        b2.a();
    }
}
