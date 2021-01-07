package com.spotify.music.libs.accountlinkingnudges;

import android.view.View;
import com.spotify.base.java.logging.Logger;

/* compiled from: java-style lambda group */
public final class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        if (i == 0) {
            ((ov0) this.c).dismiss();
            DefaultGoogleAccountLinkingNudgeAttacher.e((DefaultGoogleAccountLinkingNudgeAttacher) this.b);
        } else if (i == 1) {
            Logger.b("Not now clicked", new Object[0]);
            ((ov0) this.c).dismiss();
            DefaultGoogleAccountLinkingNudgeAttacher.c((DefaultGoogleAccountLinkingNudgeAttacher) this.b).a();
        } else {
            throw null;
        }
    }
}
