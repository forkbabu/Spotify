package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.C0707R;

/* renamed from: xb0  reason: default package */
class xb0 extends vb0 implements wb0 {
    private final ImageView c;
    private final boolean f;

    xb0(View view) {
        super(view);
        this.c = (ImageView) view.findViewById(C0707R.id.cover_art_image);
        this.f = view.getResources().getConfiguration().orientation != 2;
    }

    @Override // defpackage.vb0, defpackage.ub0
    public int C0() {
        return (this.c.getHeight() / 2) + this.c.getTop();
    }

    @Override // defpackage.sb0
    public ImageView getImageView() {
        return this.c;
    }

    @Override // defpackage.vb0, defpackage.ub0
    public boolean h2() {
        return this.f;
    }

    @Override // defpackage.vb0, defpackage.ub0
    public int u0() {
        return getView().getMeasuredWidth() / 2;
    }
}
