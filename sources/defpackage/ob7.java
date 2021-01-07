package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.features.podcast.episode.datasource.z;
import com.spotify.music.features.podcast.episode.l0;
import com.spotify.music.features.podcast.episode.o0;
import com.spotify.pageloader.s0;
import io.reactivex.s;

/* renamed from: ob7  reason: default package */
public class ob7 implements s0 {
    private final s<z> a;
    private final l0 b;
    private final o0 c;

    public ob7(l0 l0Var, o0 o0Var, s<z> sVar) {
        this.b = l0Var;
        this.c = o0Var;
        this.a = sVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.c.b();
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.c.a(layoutInflater, viewGroup);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.m(this.a);
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.b.i();
    }
}
