package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.spotify.mobile.android.hubframework.defaults.components.glue.w;
import com.spotify.music.libs.search.hubs.util.image.ImageConfig;
import com.spotify.music.libs.search.hubs.util.image.b;

/* renamed from: bra  reason: default package */
public final class bra {
    public static void a(zra zra, b bVar, kra kra, s81 s81, w51 w51, ImageConfig imageConfig) {
        asa asa = (asa) zra;
        asa.setTitle(s81.text().title());
        asa.setSubtitle(s81.text().subtitle());
        int i = w.c;
        asa.setAppearsDisabled(s81.custom().boolValue("appearDisabled", false));
        asa.c0("explicit".equals(s81.custom().string("label")));
        asa.b("19".equals(s81.custom().string("label")));
        i91.b(w51.b()).e("click").d(s81).c(asa.getView()).a();
        View view = asa.getView();
        if (s81.events().containsKey("longClick")) {
            i91.b(w51.b()).e("longClick").d(s81).c(view).b();
        }
        ImageView imageView = asa.getImageView();
        bVar.a(imageView);
        bVar.b(imageView, imageConfig);
        kra.a(w51, asa, s81);
    }
}
