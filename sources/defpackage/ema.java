package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.music.C0707R;
import defpackage.s51;

/* renamed from: ema  reason: default package */
public class ema implements s51<View> {
    private final HubsGlueImageDelegate a;
    private final Context b;

    public ema(HubsGlueImageDelegate hubsGlueImageDelegate, Context context) {
        hubsGlueImageDelegate.getClass();
        this.a = hubsGlueImageDelegate;
        context.getClass();
        this.b = context;
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(view, s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        int i = e90.i;
        dma dma = (dma) l70.o(view, dma.class);
        bvd c = dvd.c(view);
        c.f(dma.getImageView());
        c.g(dma.getTitleView(), dma.getSubtitleView(), dma.k());
        c.a();
        t51.a(w51, view, s81);
        String title = s81.text().title();
        String str = "";
        if (TextUtils.isEmpty(title)) {
            title = str;
        }
        dma.setTitle(title);
        String subtitle = s81.text().subtitle();
        if (!TextUtils.isEmpty(subtitle)) {
            str = subtitle;
        }
        dma.setSubtitle(str);
        Integer intValue = s81.custom().intValue("rowIndex");
        int intValue2 = intValue != null ? intValue.intValue() : -1;
        if (intValue2 != -1) {
            dma.s(intValue2);
        } else {
            dma.r();
        }
        ImageView imageView = dma.getImageView();
        x81 main = s81.images().main();
        if (main != null) {
            this.a.d(imageView, main, HubsGlueImageConfig.THUMBNAIL);
            return;
        }
        this.a.a(imageView);
        imageView.setImageDrawable(null);
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        Context context = this.b;
        View inflate = LayoutInflater.from(context).inflate(C0707R.layout.podcast_charts_row_view, viewGroup, false);
        y90 j = e90.d().j(context, viewGroup, false);
        ((LinearLayout) inflate.findViewById(C0707R.id.holder)).addView(j.getView());
        j.getView().setDuplicateParentStateEnabled(true);
        gma gma = new gma(inflate, j, (TextView) inflate.findViewById(16908296));
        gma.getView().setTag(C0707R.id.glue_viewholder_tag, gma);
        return gma.getView();
    }
}
