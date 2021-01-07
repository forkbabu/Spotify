package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.music.C0707R;

/* access modifiers changed from: package-private */
/* renamed from: v90  reason: default package */
public class v90 extends w90 implements u90 {
    private final ImageView f;

    public v90(View view) {
        super(view);
        ImageView imageView = (ImageView) view.findViewById(16908294);
        this.f = imageView;
        bvd c = dvd.c(getView().findViewById(C0707R.id.row_view));
        c.g(Z());
        c.f(imageView);
        c.a();
    }

    @Override // defpackage.fa0
    public ImageView getImageView() {
        return this.f;
    }
}
