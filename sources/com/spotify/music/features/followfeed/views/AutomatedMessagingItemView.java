package com.spotify.music.features.followfeed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class AutomatedMessagingItemView extends LinearLayout {
    private Picasso a;
    private AutomatedMessagingHeaderView b;
    private AutomatedMessagingEntityView c;

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {
        final /* synthetic */ cmf a;

        a(cmf cmf) {
            this.a = cmf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutomatedMessagingItemView(Context context, Picasso picasso) {
        super(context);
        h.e(context, "context");
        h.e(picasso, "picasso");
        this.a = picasso;
        c();
    }

    private final void c() {
        setOrientation(1);
        View inflate = LinearLayout.inflate(getContext(), C0707R.layout.automated_messaging_item_view, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View G = q4.G(inflate, C0707R.id.automated_messaging_header_view);
        h.d(G, "ViewCompat.requireViewBy…ed_messaging_header_view)");
        this.b = (AutomatedMessagingHeaderView) G;
        View G2 = q4.G(inflate, C0707R.id.automated_messaging_entity_view);
        h.d(G2, "ViewCompat.requireViewBy…ed_messaging_entity_view)");
        this.c = (AutomatedMessagingEntityView) G2;
    }

    public final AutomatedMessagingEntityView a(String str, String str2, String str3) {
        je.x(str, "name", str2, "type", str3, "imageUrl");
        AutomatedMessagingEntityView automatedMessagingEntityView = this.c;
        if (automatedMessagingEntityView != null) {
            automatedMessagingEntityView.p(str3, this.a);
            automatedMessagingEntityView.o(str, str2);
            return automatedMessagingEntityView;
        }
        h.k("entityView");
        throw null;
    }

    public final AutomatedMessagingHeaderView b(String str, String str2, String str3, String str4) {
        h.e(str, "iconUrl");
        h.e(str2, "title");
        h.e(str3, ContextTrack.Metadata.KEY_SUBTITLE);
        h.e(str4, "timestamp");
        AutomatedMessagingHeaderView automatedMessagingHeaderView = this.b;
        if (automatedMessagingHeaderView != null) {
            automatedMessagingHeaderView.C(str, this.a);
            automatedMessagingHeaderView.G(str2);
            automatedMessagingHeaderView.D(str3);
            automatedMessagingHeaderView.E(str4);
            return automatedMessagingHeaderView;
        }
        h.k("headerView");
        throw null;
    }

    public final void setEntityClickListener(cmf<f> cmf) {
        h.e(cmf, "clickConsumer");
        AutomatedMessagingEntityView automatedMessagingEntityView = this.c;
        if (automatedMessagingEntityView != null) {
            automatedMessagingEntityView.setOnClickListener(new a(cmf));
        } else {
            h.k("entityView");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutomatedMessagingItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        c();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutomatedMessagingItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        c();
    }
}
