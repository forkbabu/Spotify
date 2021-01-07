package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.freetierartist.datasource.v;
import com.spotify.pageloader.s0;
import io.reactivex.s;

/* renamed from: q75  reason: default package */
public class q75 implements s0 {
    private final t75 a;
    private final n85 b;
    private final s<v> c;

    public q75(t75 t75, n85 n85, s<v> sVar) {
        this.a = t75;
        this.b = n85;
        this.c = sVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.b.c();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.a.m(this.c);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.a.n();
    }
}
