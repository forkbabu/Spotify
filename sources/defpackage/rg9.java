package defpackage;

import com.spotify.encore.foundation.R;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.yourlibrary.quickscroll.QuickScrollView;

/* renamed from: rg9  reason: default package */
public class rg9 implements g<MusicPagesModel, s0> {
    private QuickScrollView a;

    /* renamed from: rg9$a */
    class a implements h<MusicPagesModel> {
        private Boolean a;

        a() {
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            og9 og9;
            MusicPagesModel musicPagesModel = (MusicPagesModel) obj;
            Boolean bool = this.a;
            if (bool == null || bool.booleanValue() != musicPagesModel.n()) {
                if (musicPagesModel.n()) {
                    int i = R.color.gray_15;
                    int i2 = R.color.white;
                    og9 = new og9(i, i2, i2);
                } else {
                    og9 = new og9(R.color.white, R.color.gray_15, R.color.gray_70);
                }
                rg9.a(rg9.this, og9);
                this.a = Boolean.valueOf(musicPagesModel.n());
            }
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: rg9$b */
    public static abstract class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract int a();

        /* access modifiers changed from: package-private */
        public abstract int b();

        /* access modifiers changed from: package-private */
        public abstract int c();
    }

    static void a(rg9 rg9, b bVar) {
        rg9.getClass();
        int b2 = rg9.b(bVar.b());
        rg9.a.setHandlerBackgroundColor(b2);
        rg9.a.setIndicatorBackgroundColor(b2);
        rg9.a.setHandlerArrowsColor(rg9.b(bVar.a()));
        rg9.a.setIndicatorTextColor(rg9.b(bVar.c()));
    }

    private int b(int i) {
        return this.a.getContext().getResources().getColor(i);
    }

    public void c(QuickScrollView quickScrollView) {
        this.a = quickScrollView;
    }

    @Override // com.spotify.mobius.g
    public h<MusicPagesModel> t(da2<s0> da2) {
        return new a();
    }
}
