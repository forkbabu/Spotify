package com.spotify.mobile.android.ui.view;

import android.content.Context;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.music.C0707R;

public class y {
    private final Context a;
    private final g b;

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    public y(Context context) {
        g gVar = new g(context);
        this.a = context;
        this.b = gVar;
    }

    public void a(a aVar, b bVar) {
        f c = this.b.c(this.a.getString(C0707R.string.remove_download_dialog_title), this.a.getString(C0707R.string.remove_download_dialog_description));
        c.e(this.a.getString(C0707R.string.remove_download_dialog_negative_button), new t(aVar));
        c.f(this.a.getString(C0707R.string.remove_download_dialog_positive_button), new r(bVar));
        c.h(new s(aVar));
        c.b().a();
    }
}
