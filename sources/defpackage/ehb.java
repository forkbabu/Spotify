package defpackage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import com.spotify.music.marketingformats.constants.MarketingFormatsCustomKey;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.z;
import defpackage.s51;
import java.util.EnumSet;
import kotlin.jvm.internal.h;

/* renamed from: ehb  reason: default package */
public final class ehb implements d<View> {
    private TextView a;
    private TextView b;
    private ImageView c;
    private final Picasso f;

    public ehb(Picasso picasso) {
        h.e(picasso, "picasso");
        this.f = picasso;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        h.e(view, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        String uri;
        h.e(view, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        w81 text = s81.text();
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(text.title());
            TextView textView2 = this.b;
            if (textView2 != null) {
                textView2.setText(text.description());
                String[] stringArray = s81.custom().stringArray(MarketingFormatsCustomKey.KEY_COLOR.d());
                if (stringArray != null) {
                    int parseColor = Color.parseColor(stringArray[0]);
                    TextView textView3 = this.a;
                    if (textView3 != null) {
                        textView3.setTextColor(parseColor);
                        TextView textView4 = this.b;
                        if (textView4 != null) {
                            textView4.setTextColor(parseColor);
                        } else {
                            h.k("description");
                            throw null;
                        }
                    } else {
                        h.k("title");
                        throw null;
                    }
                }
                x81 background = s81.images().background();
                if (background != null && (uri = background.uri()) != null) {
                    z m = this.f.m(uri);
                    ImageView imageView = this.c;
                    if (imageView != null) {
                        m.n(imageView, null);
                    } else {
                        h.k("background");
                        throw null;
                    }
                }
            } else {
                h.k("description");
                throw null;
            }
        } else {
            h.k("title");
            throw null;
        }
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.CARD);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.CARD)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.blurb_component, viewGroup, false);
        View G = q4.G(inflate, C0707R.id.title);
        h.d(G, "requireViewById(it, R.id.title)");
        this.a = (TextView) G;
        View G2 = q4.G(inflate, C0707R.id.description);
        h.d(G2, "requireViewById(it, R.id.description)");
        this.b = (TextView) G2;
        View G3 = q4.G(inflate, C0707R.id.background);
        h.d(G3, "requireViewById(it, R.id.background)");
        this.c = (ImageView) G3;
        h.d(inflate, "LayoutInflater.from(pare…background)\n            }");
        return inflate;
    }
}
