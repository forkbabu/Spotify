package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import defpackage.q48;
import defpackage.w48;

/* renamed from: v48  reason: default package */
public class v48 implements s0 {
    private final q48.a a;
    private final w48.a b;
    private View c;
    private Bundle f;
    private q48 n;
    private w48 o;

    public v48(q48.a aVar, w48.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public void a() {
        q48 q48 = this.n;
        if (q48 != null) {
            q48.b();
        }
    }

    public void b(Bundle bundle) {
        w48 w48 = this.o;
        if (w48 != null) {
            ((x48) w48).h(bundle);
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
        q48 b2 = ((s48) this.a).b();
        this.n = b2;
        w48 b3 = ((y48) this.b).b(b2);
        this.o = b3;
        this.c = ((x48) b3).g(layoutInflater, viewGroup, this.f);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        q48 q48 = this.n;
        if (q48 != null) {
            q48.stop();
        }
    }
}
