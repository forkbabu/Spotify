package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.pageloader.s0;
import io.reactivex.s;

/* renamed from: o14  reason: default package */
public class o14 implements s0 {
    private final a2a a;
    private final u14 b;
    private final s<com.spotify.music.libs.assistedcuration.presenter.s> c;
    private View f;

    public o14(r34 r34, s<com.spotify.music.libs.assistedcuration.presenter.s> sVar) {
        this.a = r34.L();
        this.b = r34.N();
        this.c = sVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.f;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.f = this.a.a(layoutInflater, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.f(this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.b.g();
    }
}
