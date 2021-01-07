package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: q65  reason: default package */
public class q65 implements Object<View>, pk9 {
    private final Picasso a;

    q65(Picasso picasso) {
        this.a = picasso;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        t51.a(w51, view, s81);
        ImageView imageView = (ImageView) view.findViewById(C0707R.id.img_picture);
        x81 main = s81.images().main();
        z m = this.a.m(main != null ? main.uri() : null);
        m.x(new cwd());
        m.s(C0707R.drawable.placeholder_background);
        m.m(imageView);
        String title = s81.text().title();
        String subtitle = s81.text().subtitle() != null ? s81.text().subtitle() : "";
        ((TextView) view.findViewById(C0707R.id.txt_title)).setText(title);
        ((TextView) view.findViewById(C0707R.id.txt_subtitle)).setText(subtitle);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.row_liked_songs;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        return je.G(viewGroup, C0707R.layout.liked_songs_row, viewGroup, false);
    }
}
