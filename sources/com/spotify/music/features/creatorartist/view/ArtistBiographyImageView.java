package com.spotify.music.features.creatorartist.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.music.C0707R;
import com.spotify.music.features.creatorartist.model.Image;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

public class ArtistBiographyImageView extends FrameLayout {
    ImageView a;

    public ArtistBiographyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a(Image image, Picasso picasso) {
        if (image.uri.isEmpty()) {
            this.a.setImageResource(C0707R.drawable.placeholder_artist);
            return;
        }
        z m = picasso.m(image.uri);
        m.s(C0707R.drawable.placeholder_artist);
        m.f(C0707R.drawable.placeholder_artist);
        m.m(this.a);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) LayoutInflater.from(getContext()).inflate(C0707R.layout.biography_image_view, this).findViewById(C0707R.id.image);
    }
}
