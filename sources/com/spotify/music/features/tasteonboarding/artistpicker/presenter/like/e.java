package com.spotify.music.features.tasteonboarding.artistpicker.presenter.like;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.features.tasteonboarding.c;
import com.spotify.rxjava2.q;
import io.reactivex.y;

public class e implements i {
    private final t8a a;
    private final c b;
    private final y c;
    private final fq8 d;
    private final boolean e;
    private final q f = new q();

    class a extends m {
        a() {
        }

        @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
        public void onStop() {
            e.this.f.c();
        }
    }

    public e(t8a t8a, c cVar, y yVar, fq8 fq8, boolean z, k kVar) {
        this.a = t8a;
        this.b = cVar;
        this.d = fq8;
        this.e = z;
        this.c = yVar;
        kVar.y0(new a());
    }

    private void e(boolean z, String str) {
        this.f.a(this.d.a().N0(1).o0(this.c).subscribe(new a(this, z, str)));
    }

    @Override // com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.i
    public void a(String str) {
        this.b.a(str);
        e(true, str);
    }

    @Override // com.spotify.music.features.tasteonboarding.artistpicker.presenter.like.i
    public void b(String str) {
        this.b.f(str);
        e(false, str);
    }

    public /* synthetic */ void d(boolean z, String str, Boolean bool) {
        if (!this.e && bool.booleanValue()) {
            return;
        }
        if (z) {
            this.a.e(str, str);
        } else {
            this.a.b(str);
        }
    }
}
