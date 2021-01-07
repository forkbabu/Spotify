package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.d;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;

/* renamed from: soc  reason: default package */
public class soc {
    public static final String c = "soc";
    private final Context a;
    private final Picasso b;

    public soc(Context context, Picasso picasso) {
        this.a = context.getApplicationContext();
        this.b = picasso;
    }

    public void a(ImageView imageView, String str) {
        int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(C0707R.dimen.action_card_image_size);
        float dimension = this.a.getResources().getDimension(C0707R.dimen.action_card_improved_icon_radius);
        Drawable g = yc0.g(this.a);
        this.b.b(imageView);
        z l = this.b.l(!TextUtils.isEmpty(str) ? Uri.parse(str) : Uri.EMPTY);
        l.t(g);
        l.g(g);
        l.u(dimensionPixelOffset, dimensionPixelOffset);
        l.a();
        l.w(c);
        l.o(rwd.g(imageView, d.a(dimension), null));
    }
}
