package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m;
import com.spotify.paste.widgets.carousel.CarouselView;

/* access modifiers changed from: package-private */
/* renamed from: tqb  reason: default package */
public class tqb extends CarouselView.d {
    final /* synthetic */ uqb a;

    tqb(uqb uqb) {
        this.a = uqb;
    }

    @Override // com.spotify.paste.widgets.carousel.CarouselView.b
    public void a(int i) {
        if (i > this.a.d) {
            this.a.b.b();
        } else if (i < this.a.d) {
            this.a.b.a();
        }
        this.a.d = i;
    }

    @Override // com.spotify.paste.widgets.carousel.CarouselView.b
    public void b(int i, int i2, float f) {
        uqb.d(this.a, i, i2);
    }

    @Override // com.spotify.paste.widgets.carousel.CarouselView.b
    public void c(int i) {
        RecyclerView.b0 R = this.a.a.R(i);
        if (R instanceof m) {
            ((m) R).p();
        }
    }
}
