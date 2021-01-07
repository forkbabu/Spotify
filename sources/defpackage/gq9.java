package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;

/* renamed from: gq9  reason: default package */
public class gq9 {
    private final Picasso a;
    private final HubsGlueImageDelegate b;

    public gq9(Picasso picasso, HubsGlueImageDelegate hubsGlueImageDelegate) {
        picasso.getClass();
        this.a = picasso;
        hubsGlueImageDelegate.getClass();
        this.b = hubsGlueImageDelegate;
    }

    public fq9 a(Context context, ViewGroup viewGroup) {
        context.getClass();
        eq9 eq9 = new eq9(context, this.a, this.b, viewGroup);
        eq9.getView().setTag(C0707R.id.glue_viewholder_tag, eq9);
        return eq9;
    }
}
