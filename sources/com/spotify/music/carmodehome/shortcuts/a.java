package com.spotify.music.carmodehome.shortcuts;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.model.c;
import com.spotify.music.carmodehome.shortcuts.e;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import kotlin.jvm.internal.h;

public final class a implements e {
    private final ImageView a;
    private final pud b;
    private final Picasso c;
    private final cs2 d;
    private final HomeShortcutsGridItemCardView e;

    /* renamed from: com.spotify.music.carmodehome.shortcuts.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0210a implements View.OnClickListener {
        final /* synthetic */ a a;
        final /* synthetic */ e.a b;

        View$OnClickListenerC0210a(a aVar, e.a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.b.a(this.a);
        }
    }

    public a(Picasso picasso, cs2 cs2, HomeShortcutsGridItemCardView homeShortcutsGridItemCardView) {
        h.e(picasso, "picasso");
        h.e(cs2, "placeholderProvider");
        h.e(homeShortcutsGridItemCardView, "view");
        this.c = picasso;
        this.d = cs2;
        this.e = homeShortcutsGridItemCardView;
        this.a = homeShortcutsGridItemCardView.getImageView$apps_music_features_car_mode_home();
        this.b = d.a((float) homeShortcutsGridItemCardView.getResources().getDimensionPixelSize(C0707R.dimen.shelf_item_image_rounded_corner_size));
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void a() {
        this.e.setVisibility(0);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void b() {
        this.e.setVisibility(8);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void c(boolean z) {
        this.e.setTitleCentered(z);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void d(c cVar) {
        h.e(cVar, "image");
        if (h.a(cVar.c(), "drawable://liked_songs")) {
            ImageView imageView = this.a;
            Context context = imageView.getContext();
            h.d(context, "imageView.context");
            imageView.setImageDrawable(com.spotify.music.carmodehome.shelf.a.a(context));
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

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void e() {
        this.e.setTitleActive(false);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void f(e.a aVar) {
        h.e(aVar, "listener");
        this.e.setOnClickListener(new View$OnClickListenerC0210a(this, aVar));
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void g() {
        this.e.setTitleActive(true);
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e
    public void setTitle(String str) {
        h.e(str, "title");
        this.e.setTitle(str);
    }
}
