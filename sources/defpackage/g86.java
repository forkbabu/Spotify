package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.features.playlistentity.t;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;

/* renamed from: g86  reason: default package */
final class g86 implements f86 {
    private static final int c = f86.class.hashCode();
    private final Context a;
    private twd b;

    public g86(Context context) {
        this.a = context;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public a g() {
        return b.a;
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
    }

    @Override // defpackage.f86
    public void q(boolean z) {
        if (z) {
            this.b.l0(c);
        } else {
            this.b.i0(c);
        }
    }

    @Override // defpackage.f86
    public void s(twd twd) {
        this.b = twd;
        FrameLayout frameLayout = new FrameLayout(this.a);
        View view = new View(this.a);
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, nud.g(24.0f, this.a.getResources())));
        frameLayout.addView(view);
        twd twd2 = this.b;
        v02 v02 = new v02(frameLayout, false);
        int i = c;
        twd2.Z(v02, i);
        this.b.i0(i);
    }
}
