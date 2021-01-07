package defpackage;

import android.view.View;
import com.spotify.music.libs.fullscreen.story.domain.i;

/* renamed from: uc5  reason: default package */
public final /* synthetic */ class uc5 implements View.OnClickListener {
    public final /* synthetic */ da2 a;

    public /* synthetic */ uc5(da2 da2) {
        this.a = da2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.accept(i.m.a);
    }
}
