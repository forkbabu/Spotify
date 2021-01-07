package defpackage;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.MoreObjects;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.m;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;
import com.spotify.paste.widgets.carousel.CarouselView;
import com.spotify.player.model.ContextTrack;
import java.util.List;

/* renamed from: uqb  reason: default package */
public class uqb {
    private final CarouselView a;
    private final a b;
    private final drb<?> c;
    private int d;
    private boolean e;
    private boolean f;
    private int g = -1;

    /* renamed from: uqb$a */
    public interface a {
        void a();

        void b();
    }

    public uqb(CarouselView carouselView, a aVar) {
        aVar.getClass();
        this.b = aVar;
        this.a = carouselView;
        carouselView.setOnLayoutChildrenListener(new sqb(this));
        MoreObjects.checkArgument(carouselView.getAdapter() instanceof drb, "Carousel must have a TracksCarouselAdapter.");
        drb<?> drb = (drb) carouselView.getAdapter();
        drb.getClass();
        this.c = drb;
        carouselView.T0(new tqb(this));
    }

    static void d(uqb uqb, int i, int i2) {
        CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) uqb.a.getLayoutManager();
        carouselLayoutManager.getClass();
        if (carouselLayoutManager.Z1()) {
            if (i < i2 && uqb.e) {
                RecyclerView.b0 R = uqb.a.R(i2);
                if (R instanceof m) {
                    ((m) R).d();
                }
            } else if (i > i2 && uqb.f) {
                RecyclerView.b0 R2 = uqb.a.R(i2);
                if (R2 instanceof m) {
                    ((m) R2).d();
                }
            }
        }
    }

    public static void f(uqb uqb, boolean z) {
        int i = uqb.g;
        if (i != -1 && z) {
            uqb.a.N0(i);
            uqb.g = -1;
        }
    }

    public void g(boolean z) {
        this.f = z;
    }

    public void h(boolean z) {
        this.e = z;
    }

    public void i(List<ContextTrack> list, ContextTrack contextTrack, List<ContextTrack> list2) {
        Handler handler = new Handler();
        int size = list.size();
        boolean Z = this.c.Z();
        int b0 = this.c.b0(list, contextTrack, list2, handler);
        if (b0 != 0 || this.d != size) {
            if (Z || b0 == 2) {
                this.a.I0(size);
            } else if (b0 == 1) {
                this.g = size;
            } else if (this.d != size) {
                this.a.N0(size);
            }
            this.d = size;
        }
    }
}
