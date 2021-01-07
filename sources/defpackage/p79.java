package defpackage;

import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;

/* renamed from: p79  reason: default package */
public class p79 implements g<MusicPagesModel, s0> {
    private b a = m79.a;

    /* renamed from: p79$a */
    class a implements h<MusicPagesModel> {
        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            p79.this.a = k79.a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p79$b */
    public interface b {
        void h();
    }

    public void b() {
        this.a.h();
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        this.a = new l79(da2);
        return new a();
    }
}
