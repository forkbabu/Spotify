package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import defpackage.fu4;
import defpackage.pu4;

/* renamed from: su4  reason: default package */
public class su4 implements s0 {
    private final fu4.a a;
    private final pu4.a b;
    private View c;
    private Bundle f;
    private fu4 n;
    private pu4 o;

    public su4(fu4.a aVar, pu4.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public void a() {
        fu4 fu4 = this.n;
        if (fu4 != null) {
            fu4.b();
        }
    }

    public void b(Bundle bundle) {
        pu4 pu4 = this.o;
        if (pu4 != null) {
            ((qu4) pu4).j(bundle);
        }
    }

    public void c(Bundle bundle) {
        this.f = bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.c;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        fu4 b2 = ((hu4) this.a).b();
        this.n = b2;
        pu4 b3 = ((ru4) this.b).b(b2);
        this.o = b3;
        this.c = ((qu4) b3).i(layoutInflater, viewGroup, this.f);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        fu4 fu4 = this.n;
        if (fu4 != null) {
            fu4.stop();
        }
    }
}
