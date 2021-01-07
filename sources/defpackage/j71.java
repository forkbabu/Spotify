package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.common.a;
import com.spotify.mobile.android.hubframework.defaults.components.custom.HubsGlueImageSettings;
import com.spotify.mobile.android.util.ui.BadgesFactory;
import com.spotify.music.C0707R;
import com.spotify.paste.graphics.drawable.b;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.h0;
import com.squareup.picasso.z;

/* renamed from: j71  reason: default package */
public class j71 implements HubsGlueImageDelegate {
    private final m71 a;
    private final o71 b;
    private final Picasso c;
    private final BadgesFactory d;

    j71(Context context, Picasso picasso, BadgesFactory badgesFactory) {
        this.a = new m71(context, SpotifyIconV2.TRACK);
        this.b = new o71(context);
        this.c = picasso;
        this.d = badgesFactory;
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate
    public void a(ImageView imageView) {
        this.c.b(imageView);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate
    public Uri b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(str);
        }
        return null;
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate
    public o71 c() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate
    public void d(ImageView imageView, x81 x81, HubsGlueImageDelegate.ImageConfig imageConfig) {
        h0 h0Var;
        if (x81 == null) {
            this.c.b(imageView);
            imageView.setImageDrawable(null);
            return;
        }
        HubsGlueImageDelegate.ImageConfig.ImageSize g = imageConfig.g();
        Drawable e = e(x81.placeholder(), imageConfig);
        Picasso picasso = this.c;
        String uri = x81.uri();
        z l = picasso.l(!TextUtils.isEmpty(uri) ? Uri.parse(uri) : null);
        l.t(e);
        l.g(e);
        HubsGlueImageSettings.Style a2 = HubsGlueImageSettings.a(x81);
        HubsGlueImageDelegate.ImageConfig.ImageSize imageSize = HubsGlueImageDelegate.ImageConfig.ImageSize.LARGE;
        int ordinal = a2.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                h0Var = gwd.c();
            } else if (g == imageSize) {
                h0Var = this.b.c();
            } else {
                h0Var = this.b.d();
            }
        } else if (g == imageSize) {
            h0Var = this.b.a();
        } else {
            h0Var = this.b.b();
        }
        l.x(h0Var);
        Context context = imageView.getContext();
        yvd a3 = HubsGlueImageSettings.a(x81) == HubsGlueImageSettings.Style.CIRCULAR ? b.a() : null;
        if (x81.custom().boolValue("verified", false)) {
            BadgesFactory badgesFactory = this.d;
            BadgesFactory.BadgeSize a4 = a.a(g);
            badgesFactory.getClass();
            a3 = new yvd(new com.spotify.mobile.android.util.ui.a(BadgesFactory.Badge.VERIFIED, context, a4), a3, context);
        }
        if (a3 == null) {
            l.n(imageView, null);
        } else {
            l.o(rwd.g(imageView, a3, null));
        }
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate
    public Drawable e(String str, HubsGlueImageDelegate.ImageConfig imageConfig) {
        return this.a.b(str, imageConfig);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate
    public Picasso f() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate
    public void g(ImageView imageView, String str) {
        SpotifyIconV2 or = n71.a(str).or((Optional<SpotifyIconV2>) SpotifyIconV2.TRACK);
        if (or != imageView.getTag(C0707R.id.hub_glue_internal_tag_image_icon)) {
            imageView.setImageDrawable(z42.e(imageView.getContext(), or));
            imageView.setTag(C0707R.id.hub_glue_internal_tag_image_icon, or);
        }
    }
}
