package com.spotify.libs.nudges;

import android.view.View;
import android.widget.Button;
import com.spotify.libs.nudges.api.options.c;

final class a implements View.OnClickListener {
    final /* synthetic */ c.a a;
    final /* synthetic */ DefaultNudge b;

    a(c.a aVar, c cVar, Button button, DefaultNudge defaultNudge) {
        this.a = aVar;
        this.b = defaultNudge;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b().invoke(this.b);
    }
}
