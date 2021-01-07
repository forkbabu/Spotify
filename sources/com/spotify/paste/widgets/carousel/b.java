package com.spotify.paste.widgets.carousel;

import android.content.Context;
import com.spotify.paste.widgets.carousel.CarouselLayoutManager;

/* access modifiers changed from: package-private */
public class b extends CarouselLayoutManager.e {
    b(CarouselLayoutManager.b bVar, Context context, CarouselLayoutManager.ScrollDirection scrollDirection) {
        super(context, scrollDirection);
    }

    @Override // androidx.recyclerview.widget.t
    public int p(int i, int i2, int i3, int i4, int i5) {
        return ((((i4 - i3) - (i2 - i)) / 2) + i3) - i;
    }
}
