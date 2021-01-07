package com.spotify.music.features.yourlibrary.musicpages.item;

import android.content.Context;
import android.content.DialogInterface;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.m;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.musicpages.MusicPagesLogger;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import java.util.List;

public class o implements g<MusicPagesModel, s0> {
    public static final /* synthetic */ int o = 0;
    private final Context a;
    private final MusicPagesLogger b;
    private b c = f.a;
    private boolean f;
    private List<fb9> n;

    class a implements h<MusicPagesModel> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            o.this.f = musicPagesModel.u();
            o.this.n = musicPagesModel.f();
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            o oVar = o.this;
            int i = o.o;
            oVar.c = f.a;
        }
    }

    /* access modifiers changed from: private */
    public interface b {
        void a(s0 s0Var);
    }

    public o(Context context, MusicPagesLogger musicPagesLogger) {
        this.a = context;
        this.b = musicPagesLogger;
    }

    public void d(MusicItem musicItem, int i, DialogInterface dialogInterface, int i2) {
        this.c.a(s0.j(musicItem, i, musicItem.k()));
        dialogInterface.dismiss();
    }

    public void e(MusicItem musicItem) {
        this.c.a(s0.L(musicItem));
    }

    public void f(MusicItem musicItem, int i, boolean z) {
        if (z) {
            String string = this.a.getString(C0707R.string.your_library_music_pages_unlike_song_dialog_title);
            String string2 = this.a.getString(C0707R.string.your_library_music_pages_unlike_song_dialog_positive_button);
            String string3 = this.a.getString(C0707R.string.your_library_music_pages_unlike_song_dialog_negative_button);
            f c2 = m.c(this.a, string, musicItem.w());
            c2.f(string2, new h(this, musicItem, i));
            c2.e(string3, g.a);
            c2.b().a();
            return;
        }
        this.c.a(s0.j(musicItem, i, musicItem.k()));
    }

    public void g(MusicItem musicItem, int i) {
        this.c.a(s0.K(musicItem, i, musicItem.k(), this.b.L(musicItem.k(), musicItem.A(), this.n, this.f, musicItem.y().m())));
    }

    public void h(MusicItem musicItem) {
        this.c.a(s0.m(musicItem));
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        da2.getClass();
        this.c = new e(da2);
        return new a();
    }
}
