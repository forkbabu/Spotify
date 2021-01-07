package com.spotify.music.features.login.startview;

import android.os.Build;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.transition.ChangeBounds;
import androidx.transition.u;
import com.spotify.libs.pse.model.d;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.g;
import com.squareup.picasso.z;
import defpackage.re0;

public class q {
    private final com.spotify.libs.pse.model.a a;
    private final zy0 b;
    private final s c;
    private final ae0 d;
    private final pe0 e;
    private final cqe f;
    private final no5 g;

    public static class a implements g {
        final g a;
        final com.spotify.libs.pse.model.a b;
        final zy0 c;

        public a(g gVar, com.spotify.libs.pse.model.a aVar, zy0 zy0) {
            this.a = gVar;
            this.b = aVar;
            this.c = zy0;
        }

        @Override // com.squareup.picasso.g
        public void onError(Exception exc) {
            this.a.onError(exc);
        }

        @Override // com.squareup.picasso.g
        public void onSuccess() {
            com.spotify.libs.pse.model.a aVar = this.b;
            if (aVar instanceof d) {
                this.c.a(((d) aVar).getHeader());
            }
            this.a.onSuccess();
        }
    }

    public q(s sVar, ae0 ae0, cqe cqe, pe0 pe0, no5 no5, com.spotify.libs.pse.model.a aVar, zy0 zy0) {
        this.c = sVar;
        this.g = no5;
        this.d = ae0;
        this.f = cqe;
        this.e = pe0;
        this.a = aVar;
        this.b = zy0;
    }

    public boolean b(int i) {
        if (i == 1) {
            com.spotify.libs.pse.model.a aVar = this.a;
            if ((aVar instanceof d) && ((d) aVar).getHeader() != null && !((d) this.a).getHeader().i().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public void c(ConstraintLayout constraintLayout, ImageView imageView, int i) {
        int measuredWidth = imageView.getMeasuredWidth();
        String a2 = this.c.a();
        a2.getClass();
        this.g.a(measuredWidth, a2);
        a aVar = new a(new mo5(zd0.a(this.d, this.f, this.e, re0.e.b)), this.a, this.b);
        AppCompatImageView appCompatImageView = (AppCompatImageView) constraintLayout.findViewById(C0707R.id.spotify_logo_no_text);
        if (Build.VERSION.SDK_INT >= 19) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.b(new p(appCompatImageView));
            u.a(constraintLayout, changeBounds);
        }
        int dimensionPixelSize = constraintLayout.getResources().getDimensionPixelSize(C0707R.dimen.start_screen_logo_size_small);
        appCompatImageView.getLayoutParams().width = dimensionPixelSize;
        appCompatImageView.getLayoutParams().height = dimensionPixelSize;
        appCompatImageView.requestLayout();
        b bVar = new b();
        bVar.i(constraintLayout);
        bVar.g(C0707R.id.spotify_logo_no_text, 3);
        bVar.c(constraintLayout);
        z m = Picasso.h().m(a2);
        m.x(new r(measuredWidth, i));
        m.n(imageView, aVar);
        imageView.setOnTouchListener(new o(this, imageView.getContext()));
    }
}
