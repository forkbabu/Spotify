package com.spotify.music.marquee.feedback;

import android.view.View;
import com.spotify.music.marquee.feedback.f;

public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ f.b a;
    public final /* synthetic */ h b;

    public /* synthetic */ b(f.b bVar, h hVar) {
        this.a = bVar;
        this.b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j0(this.b, view);
    }
}
