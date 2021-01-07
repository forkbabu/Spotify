package defpackage;

import android.animation.Animator;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;

/* access modifiers changed from: package-private */
/* renamed from: gr8  reason: default package */
public class gr8 implements ToolbarSearchFieldView.e {
    final /* synthetic */ hr8 a;

    gr8(hr8 hr8) {
        this.a = hr8;
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void a() {
        this.a.m();
        this.a.g.getSearchPlaceHolder().setPressed(false);
        Animator e = ((zud) this.a.g.getSearchPlaceHolder()).getStateListAnimatorCompat().e();
        if (e != null) {
            e.cancel();
        }
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void b() {
        if (!(this.a.c != null && this.a.c.B1())) {
            this.a.b();
            this.a.c();
        }
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void c() {
        this.a.b();
    }
}
