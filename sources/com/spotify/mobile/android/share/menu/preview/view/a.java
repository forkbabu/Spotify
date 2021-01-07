package com.spotify.mobile.android.share.menu.preview.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.share.menu.preview.api.b;
import com.spotify.music.C0707R;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import kotlin.jvm.internal.h;

public final class a extends RecyclerView.b0 {
    private final ImageView C;
    private final TextView D;
    private final Map<String, b> E;
    private final PublishSubject<com.spotify.mobile.android.share.menu.preview.api.a> F;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.mobile.android.share.menu.preview.view.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC0190a implements View.OnClickListener {
        final /* synthetic */ a a;
        final /* synthetic */ com.spotify.mobile.android.share.menu.preview.api.a b;

        View$OnClickListenerC0190a(a aVar, com.spotify.mobile.android.share.menu.preview.api.a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.F.onNext(this.b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, Map<String, b> map, PublishSubject<com.spotify.mobile.android.share.menu.preview.api.a> publishSubject) {
        super(view);
        h.e(view, "itemView");
        h.e(map, "shareDestinationViewDataMap");
        h.e(publishSubject, "destinationClickSubject");
        this.E = map;
        this.F = publishSubject;
        View G = q4.G(view, C0707R.id.icon);
        h.d(G, "ViewCompat.requireViewById(itemView, R.id.icon)");
        this.C = (ImageView) G;
        View G2 = q4.G(view, C0707R.id.name);
        h.d(G2, "ViewCompat.requireViewById(itemView, R.id.name)");
        this.D = (TextView) G2;
    }

    public final void j0(com.spotify.mobile.android.share.menu.preview.api.a aVar) {
        h.e(aVar, "shareDestination");
        b bVar = this.E.get(aVar.a());
        if (bVar != null) {
            this.C.setImageDrawable(bVar.a());
            this.D.setText(bVar.b());
            this.a.setOnClickListener(new View$OnClickListenerC0190a(this, aVar));
            return;
        }
        throw new IllegalStateException(("No view data provided for " + aVar).toString());
    }
}
