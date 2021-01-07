package com.spotify.music.carmodehome.shelf;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.shelf.c;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

public final class b implements c {
    private final ImageView a;
    private final pud b;
    private final Picasso c;
    private final cs2 d;
    private final CarModeCardView e;

    static final class a implements View.OnClickListener {
        final /* synthetic */ b a;
        final /* synthetic */ c.a b;

        a(b bVar, c.a aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.a(this.a);
        }
    }

    public b(Picasso picasso, cs2 cs2, CarModeCardView carModeCardView) {
        h.e(picasso, "picasso");
        h.e(cs2, "placeholderProvider");
        h.e(carModeCardView, "view");
        this.c = picasso;
        this.d = cs2;
        this.e = carModeCardView;
        this.a = carModeCardView.getImageView();
        this.b = d.a((float) carModeCardView.getResources().getDimensionPixelSize(C0707R.dimen.shelf_item_image_rounded_corner_size));
    }

    @Override // com.spotify.music.carmodehome.shelf.c
    public void a() {
        this.e.setVisibility(0);
    }

    @Override // com.spotify.music.carmodehome.shelf.c
    public void b() {
        this.e.setVisibility(8);
    }

    @Override // com.spotify.music.carmodehome.shelf.c
    public void c(boolean z) {
        this.e.setTitleCentered(z);
    }

    @Override // com.spotify.music.carmodehome.shelf.c
    public void d(com.spotify.music.carmodehome.model.c cVar) {
        h.e(cVar, "image");
        if (h.a(cVar.c(), "drawable://liked_songs")) {
            ImageView imageView = this.a;
            h.d(imageView, "imageView");
            Context context = imageView.getContext();
            h.d(context, "imageView.context");
            imageView.setImageDrawable(a.a(context));
            return;
        }
        z m = this.c.m(cVar.c());
        h.d(m, "picasso.load(image.uri)");
        Drawable a2 = this.d.a(cVar.a());
        String b2 = cVar.b();
        int hashCode = b2.hashCode();
        if (hashCode != -1498085729) {
            if (hashCode == 1385468589 && b2.equals("rounded")) {
                m.t(a2);
                m.g(a2);
                m.o(rwd.f(this.a, this.b));
                return;
            }
        } else if (b2.equals("circular")) {
            com.spotify.paste.graphics.drawable.c cVar2 = new com.spotify.paste.graphics.drawable.c(a2, 1.0f);
            m.t(cVar2);
            m.g(cVar2);
            m.o(rwd.c(this.a));
            return;
        }
        m.t(a2);
        m.g(a2);
        m.m(this.a);
    }

    @Override // com.spotify.music.carmodehome.shelf.c
    public void e(boolean z) {
        this.e.setActive(z);
    }

    @Override // com.spotify.music.carmodehome.shelf.c
    public void f(c.a aVar) {
        h.e(aVar, "listener");
        this.e.setOnClickListener(new a(this, aVar));
    }

    @Override // com.spotify.music.carmodehome.shelf.c
    public void setTitle(String str) {
        h.e(str, "title");
        this.e.setTitle(str);
    }
}
