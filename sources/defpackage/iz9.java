package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.encore.foundation.R;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.carousel.CarouselView;

/* renamed from: iz9  reason: default package */
public final class iz9 extends RecyclerView.l {
    private final RecyclerView a;
    private final Paint b;
    private final float c;
    private final float d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private int j;
    private float k;

    /* renamed from: iz9$a */
    static class a extends RecyclerView.g {
        final /* synthetic */ iz9 a;
        final /* synthetic */ RecyclerView.e b;

        a(iz9 iz9, RecyclerView.e eVar) {
            this.a = iz9;
            this.b = eVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            iz9.m(this.a, this.b.u());
        }
    }

    /* renamed from: iz9$b */
    static class b implements CarouselView.b {
        final /* synthetic */ RecyclerView.e a;
        final /* synthetic */ iz9 b;

        b(RecyclerView.e eVar, iz9 iz9) {
            this.a = eVar;
            this.b = iz9;
        }

        @Override // com.spotify.paste.widgets.carousel.CarouselView.b
        public void a(int i) {
        }

        @Override // com.spotify.paste.widgets.carousel.CarouselView.b
        public void b(int i, int i2, float f) {
            int min = Math.min(i2, this.a.u() - 1);
            iz9.n(this.b, i == min ? (float) i : i > min ? ((float) i) - f : ((float) i) + f);
        }

        @Override // com.spotify.paste.widgets.carousel.CarouselView.b
        public void c(int i) {
        }
    }

    private iz9(RecyclerView recyclerView) {
        Paint paint = new Paint();
        this.b = paint;
        this.a = recyclerView;
        Context context = recyclerView.getContext();
        Resources resources = recyclerView.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.assisted_curation_dot_decoration_bar_height);
        this.f = dimensionPixelSize;
        this.g = resources.getDimensionPixelSize(C0707R.dimen.assisted_curation_dot_decoration_bar_left_right_margin);
        float f2 = (float) dimensionPixelSize;
        float f3 = 0.083333336f * f2;
        this.c = f3;
        this.d = f2 * 0.1f;
        this.e = (int) (f3 * 4.0f);
        this.h = androidx.core.content.a.b(context, C0707R.color.gray_inactive);
        this.i = androidx.core.content.a.b(context, R.color.white);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    static void m(iz9 iz9, int i2) {
        if (iz9.j != i2) {
            iz9.j = i2;
            iz9.a.invalidate();
        }
    }

    static void n(iz9 iz9, float f2) {
        if (Math.abs(iz9.k - f2) > 0.001f) {
            iz9.k = f2;
            iz9.a.invalidate();
        }
    }

    public static void o(CarouselView carouselView) {
        RecyclerView.e adapter = carouselView.getAdapter();
        if (adapter != null) {
            iz9 iz9 = new iz9(carouselView);
            adapter.T(new a(iz9, adapter));
            carouselView.T0(new b(adapter, iz9));
            carouselView.k(iz9, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0050  */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(android.graphics.Canvas r17, androidx.recyclerview.widget.RecyclerView r18, androidx.recyclerview.widget.RecyclerView.y r19) {
        /*
        // Method dump skipped, instructions count: 279
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz9.l(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$y):void");
    }
}
