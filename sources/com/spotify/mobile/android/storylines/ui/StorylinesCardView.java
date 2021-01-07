package com.spotify.mobile.android.storylines.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.mobile.android.storylines.model.StorylinesCardImageModel;
import com.spotify.mobile.android.storylines.model.b;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class StorylinesCardView extends FrameLayout {
    ImageView a;
    private a b;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    public StorylinesCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void b(StorylinesCardImageModel storylinesCardImageModel, Picasso picasso, a aVar, b bVar) {
        this.b = aVar;
        b.a f = bVar.f();
        f.a(storylinesCardImageModel.getImageId());
        b b2 = f.b();
        ((StorylinesView) this.b).x(b2);
        z m = picasso.m(storylinesCardImageModel.getUri());
        m.w(Integer.valueOf((int) C0707R.id.storylines_card_loaded_with_picasso));
        m.n(this.a, new h(this, b2));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) q4.G(LayoutInflater.from(getContext()).inflate(C0707R.layout.storylines_card_view, this), C0707R.id.storylines_card_image);
    }
}
