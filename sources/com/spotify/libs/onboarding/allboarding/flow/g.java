package com.spotify.libs.onboarding.allboarding.flow;

import android.view.View;
import androidx.lifecycle.v;
import com.spotify.libs.onboarding.allboarding.greatpicksloading.GreatPicksLoadingView;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.jvm.internal.h;

final class g<T> implements v<List<? extends String>> {
    final /* synthetic */ ShowLoadingFragment a;
    final /* synthetic */ View b;

    g(ShowLoadingFragment showLoadingFragment, View view) {
        this.a = showLoadingFragment;
        this.b = view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.spotify.libs.onboarding.allboarding.greatpicksloading.GreatPicksLoadingView */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.v
    public void a(List<? extends String> list) {
        List<? extends String> list2 = list;
        GreatPicksLoadingView greatPicksLoadingView = (GreatPicksLoadingView) this.b.findViewById(C0707R.id.loading_animation_great_picks);
        h.d(greatPicksLoadingView, "greatPicksLoadingView");
        greatPicksLoadingView.setVisibility(0);
        Picasso picasso = this.a.h0;
        if (picasso != null) {
            h.d(list2, "artistImageUri");
            greatPicksLoadingView.D(picasso, list2);
            return;
        }
        h.k("picasso");
        throw null;
    }
}
