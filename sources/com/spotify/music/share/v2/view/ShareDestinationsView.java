package com.spotify.music.share.v2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.share.logging.ShareMenuLogger;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class ShareDestinationsView extends ConstraintLayout {
    private final RecyclerView a;
    private rmf<? super o8e, ? super Integer, f> b;
    private final a c = new a(new ShareDestinationsView$adapter$1(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareDestinationsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.share_destinations_view_v2, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.destinations_list);
        h.d(G, "ViewCompat.requireViewBy…, R.id.destinations_list)");
        this.a = (RecyclerView) G;
        E();
    }

    private final void E() {
        this.a.setAdapter(this.c);
        this.a.setLayoutManager(new GridLayoutManager(getContext(), 4));
    }

    public final void D(rmf<? super o8e, ? super Integer, f> rmf) {
        h.e(rmf, "shareDestinationClicked");
        this.b = rmf;
    }

    public final void setDestinations(List<? extends o8e> list) {
        h.e(list, "destinations");
        this.c.Y(list);
    }

    public final void setMenuLogger(ShareMenuLogger shareMenuLogger) {
        h.e(shareMenuLogger, "shareMenuLogger");
        this.c.Z(shareMenuLogger);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareDestinationsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h.e(context, "context");
        LayoutInflater.from(getContext()).inflate(C0707R.layout.share_destinations_view_v2, (ViewGroup) this, true);
        View G = q4.G(this, C0707R.id.destinations_list);
        h.d(G, "ViewCompat.requireViewBy…, R.id.destinations_list)");
        this.a = (RecyclerView) G;
        E();
    }
}
