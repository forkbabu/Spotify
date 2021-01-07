package com.spotify.music.libs.fullscreen.story.promo.encore;

import android.view.View;
import kotlin.jvm.internal.Ref$FloatRef;

final class d implements View.OnClickListener {
    final /* synthetic */ nmf a;
    final /* synthetic */ Ref$FloatRef b;

    d(nmf nmf, Ref$FloatRef ref$FloatRef) {
        this.a = nmf;
        this.b = ref$FloatRef;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.invoke(Float.valueOf(this.b.element));
    }
}
