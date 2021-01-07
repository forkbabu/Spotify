package com.spotify.music.features.followfeed.hubs.components;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import com.spotify.music.features.followfeed.mobius.b;
import com.spotify.music.features.followfeed.views.AutomatedMessagingItemView;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import defpackage.s51;
import kotlin.jvm.internal.h;

public final class a implements s51<AutomatedMessagingItemView> {
    private final Picasso a;
    private final b b;
    private final f45 c;

    public a(Picasso picasso, b bVar, f45 f45) {
        h.e(picasso, "picasso");
        h.e(bVar, "eventDispatcher");
        h.e(f45, "releaseDateUtil");
        this.a = picasso;
        this.b = bVar;
        this.c = f45;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, s81, s51$a, int[]] */
    @Override // defpackage.s51
    public void b(AutomatedMessagingItemView automatedMessagingItemView, s81 s81, s51.a aVar, int[] iArr) {
        h.e(automatedMessagingItemView, "view");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, s81, w51, s51$b] */
    @Override // defpackage.s51
    public void c(AutomatedMessagingItemView automatedMessagingItemView, s81 s81, w51 w51, s51.b bVar) {
        String str;
        String str2;
        String str3;
        String string;
        AutomatedMessagingItemView automatedMessagingItemView2 = automatedMessagingItemView;
        h.e(automatedMessagingItemView2, "view");
        h.e(s81, "data");
        h.e(w51, "config");
        h.e(bVar, "state");
        p81 custom = s81.custom();
        String str4 = Build.ID;
        h.d(str4, "ID");
        String str5 = "";
        String string2 = custom.string(str4, str5);
        int intValue = custom.intValue("position", -1);
        String string3 = custom.string("title", str5);
        String string4 = custom.string(ContextTrack.Metadata.KEY_SUBTITLE, str5);
        String string5 = custom.string("icon_url", str5);
        String string6 = custom.string("delivery_time", str5);
        p81 bundle = custom.bundle("item_context");
        if (bundle == null || (str = bundle.string("uri", str5)) == null) {
            str = str5;
        }
        if (bundle == null || (str2 = bundle.string("name", str5)) == null) {
            str2 = str5;
        }
        if (bundle == null || (str3 = bundle.string("type", str5)) == null) {
            str3 = str5;
        }
        if (!(bundle == null || (string = bundle.string("image_url", str5)) == null)) {
            str5 = string;
        }
        automatedMessagingItemView2.b(string5, string3, string4, this.c.a(string6));
        automatedMessagingItemView2.a(str2, str3, str5);
        automatedMessagingItemView2.setEntityClickListener(new AutomatedMessagingComponentBinder$bindView$1(this, string2, intValue, str));
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // defpackage.s51
    public AutomatedMessagingItemView h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        Context context = viewGroup.getContext();
        h.d(context, "parent.context");
        return new AutomatedMessagingItemView(context, this.a);
    }
}
