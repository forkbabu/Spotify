package com.spotify.music.features.tasteonboarding.artistpicker.view.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.spotify.music.C0707R;

public class ArtistView extends ConstraintLayout {
    private ImageView a;
    private ImageView b;
    private TextView c;

    public ArtistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        D();
    }

    private void D() {
        ViewGroup.inflate(getContext(), C0707R.layout.view_artist, this);
        setId(C0707R.id.artist_view);
        this.a = (ImageView) findViewById(C0707R.id.artist_image);
        this.b = (ImageView) findViewById(C0707R.id.artist_image_icon);
        this.c = (TextView) findViewById(C0707R.id.artist_name);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0707R.dimen.std_8dp);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public void C() {
        this.b.setVisibility(8);
    }

    public void E() {
        setLayoutParams(new ConstraintLayout.LayoutParams(-2, -1));
        b bVar = new b();
        bVar.i(this);
        int id = this.a.getId();
        bVar.D(id, "h,1:1");
        bVar.l(id, 4, C0707R.id.artist_name, 3);
        bVar.l(id, 3, C0707R.id.artist_view, 3);
        int id2 = this.c.getId();
        int id3 = this.a.getId();
        int id4 = this.a.getId();
        bVar.l(id2, 6, id3, 6);
        bVar.l(id2, 7, id4, 7);
        bVar.l(id2, 4, C0707R.id.artist_view, 4);
        bVar.c(this);
    }

    public void G() {
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        b bVar = new b();
        bVar.i(this);
        int id = this.a.getId();
        bVar.D(id, "w,1:1");
        bVar.l(id, 6, C0707R.id.artist_view, 6);
        bVar.l(id, 7, C0707R.id.artist_view, 7);
        bVar.l(id, 3, C0707R.id.artist_view, 3);
        int id2 = this.c.getId();
        int id3 = this.a.getId();
        bVar.l(id2, 6, C0707R.id.artist_view, 6);
        bVar.l(id2, 7, C0707R.id.artist_view, 7);
        bVar.l(id2, 3, id3, 4);
        bVar.c(this);
    }

    public void J() {
        this.b.setVisibility(0);
    }

    public ImageView getArtistImage() {
        return this.a;
    }

    public void setArtistName(String str) {
        this.c.setText(str);
    }

    public void setArtistSelectedIcon(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public ArtistView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        D();
    }
}
