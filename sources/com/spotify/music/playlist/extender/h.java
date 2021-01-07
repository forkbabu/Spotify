package com.spotify.music.playlist.extender;

import android.widget.ImageButton;
import com.spotify.music.playlist.extender.v;

public final /* synthetic */ class h implements v.a.AbstractC0321a {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ ImageButton b;

    public /* synthetic */ h(c0 c0Var, ImageButton imageButton) {
        this.a = c0Var;
        this.b = imageButton;
    }

    @Override // com.spotify.music.playlist.extender.v.a.AbstractC0321a
    public final void a(boolean z) {
        c0 c0Var = this.a;
        ImageButton imageButton = this.b;
        c0Var.getClass();
        if (!z) {
            imageButton.setImageDrawable(c0Var.f.a);
            imageButton.setOnClickListener(c0Var.f.o);
        }
    }
}
