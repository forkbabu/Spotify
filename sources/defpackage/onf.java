package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.consumer.components.promo.impl.R;
import com.spotify.encore.mobile.utils.roundedcorner.RoundedCornerTreatment;
import com.spotify.mobile.android.wrapped2020.views.gradient.WrappedGradientView;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import kotlin.f;
import kotlin.jvm.internal.h;
import libs.encore.consumer.components.promo.api.wrapped.PromoCardWrapped$Events;
import libs.encore.consumer.components.promo.api.wrapped.b;

/* renamed from: onf  reason: default package */
public final class onf {
    private final View a;
    private final TextView b;
    private final TextView c;
    private final ImageView d;
    private final WrappedGradientView e;

    /* access modifiers changed from: package-private */
    /* renamed from: onf$a */
    public static final class a implements View.OnClickListener {
        final /* synthetic */ nmf a;

        a(nmf nmf) {
            this.a = nmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke(PromoCardWrapped$Events.Clicked);
        }
    }

    public onf(Context context) {
        h.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.promo_card_wrapped, (ViewGroup) null);
        h.d(inflate, "inflater.inflate(R.layou…promo_card_wrapped, null)");
        this.a = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View G = q4.G(inflate, R.id.txt_title);
        h.d(G, "requireViewById(view, R.id.txt_title)");
        TextView textView = (TextView) G;
        this.b = textView;
        View G2 = q4.G(inflate, R.id.txt_description);
        h.d(G2, "requireViewById(view, R.id.txt_description)");
        TextView textView2 = (TextView) G2;
        this.c = textView2;
        View G3 = q4.G(inflate, R.id.image_background);
        h.d(G3, "requireViewById(view, R.id.image_background)");
        WrappedGradientView wrappedGradientView = (WrappedGradientView) G3;
        this.e = wrappedGradientView;
        View G4 = q4.G(inflate, R.id.image_arrow);
        h.d(G4, "requireViewById(view, R.id.image_arrow)");
        ImageView imageView = (ImageView) G4;
        this.d = imageView;
        imageView.setImageDrawable(new SpotifyIconDrawable(inflate.getContext(), SpotifyIconV2.ARROW_RIGHT, (float) nud.g(40.0f, inflate.getResources())));
        RoundedCornerTreatment.Companion.create(wrappedGradientView, (float) nud.g(8.0f, inflate.getResources()));
        bvd b2 = dvd.b(inflate);
        b2.g(textView, textView2);
        b2.f(imageView, inflate);
        b2.a();
        wrappedGradientView.a().start();
    }

    public final View a() {
        return this.a;
    }

    public final void b(b bVar) {
        h.e(bVar, "model");
        this.b.setText(bVar.b());
        this.c.setText(bVar.a());
    }

    public final void c(nmf<? super PromoCardWrapped$Events, f> nmf) {
        h.e(nmf, "consumer");
        this.a.setOnClickListener(new a(nmf));
    }
}
