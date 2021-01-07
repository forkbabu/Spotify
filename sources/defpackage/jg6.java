package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.t;
import io.reactivex.a;

/* renamed from: jg6  reason: default package */
final class jg6 implements ig6, hg6 {
    private static final int p = jg6.class.hashCode();
    private final Context a;
    private final eg6 b;
    private final c.a c;
    private final com.spotify.music.features.playlistentity.configuration.c f;
    private c n;
    private twd o;

    public jg6(Context context, c.a aVar, fg6 fg6, com.spotify.music.features.playlistentity.configuration.c cVar) {
        this.a = context;
        this.b = fg6.b(cVar);
        this.c = aVar;
        this.f = cVar;
    }

    @Override // defpackage.hg6
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup, twd twd) {
        c cVar;
        Context context = this.a;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(C0707R.id.inline_play_button_container);
        frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 1));
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = nud.f(12.0f, this.a.getResources());
        layoutParams.gravity = 1;
        if (this.a.getResources().getBoolean(C0707R.bool.showPlayButtonInHeader)) {
            if (this.f.a().d()) {
                cVar = this.c.a(this.a);
            } else {
                cVar = this.c.b(com.spotify.android.paste.app.c.g().a(this.a));
            }
            cVar.setOnClickListener(new zf6(this));
            linearLayout.addView(cVar.getView(), layoutParams);
            this.n = cVar;
        }
        twd.Z(new v02(frameLayout, true), p);
        this.o = twd;
    }

    public /* synthetic */ void b(View view) {
        this.b.f();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void c(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void d(Bundle bundle) {
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void f() {
        this.b.a(null);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public a g() {
        return this.b.b();
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void h() {
        this.b.a(this);
    }

    public void i(boolean z) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.a(z);
        }
    }

    public void j(boolean z) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.b(z);
        }
    }

    public void k(boolean z) {
        if (z) {
            this.o.l0(p);
        } else {
            this.o.i0(p);
        }
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void l(t.b bVar) {
        this.b.g(bVar);
    }

    @Override // com.spotify.music.features.playlistentity.t
    public void onStop() {
        this.b.h();
    }
}
