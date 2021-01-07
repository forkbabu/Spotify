package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: z90  reason: default package */
public class z90 extends aa0 implements y90 {
    private final ImageView n;

    public z90(View view) {
        super(view);
        this.n = (ImageView) view.findViewById(16908294);
        bvd c = dvd.c(getView().findViewById(C0707R.id.row_view));
        c.g(getTitleView(), getSubtitleView());
        c.f(getImageView());
        c.a();
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.n;
    }
}
