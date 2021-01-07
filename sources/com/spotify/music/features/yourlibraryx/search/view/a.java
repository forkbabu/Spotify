package com.spotify.music.features.yourlibraryx.search.view;

import android.app.Activity;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.SubscriptionType;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.view.g;
import com.spotify.music.features.yourlibraryx.view.y;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class a implements g {
    private final Activity a;

    public a(Activity activity) {
        h.e(activity, "activity");
        this.a = activity;
    }

    @Override // com.spotify.music.features.yourlibraryx.view.g
    public List<y> a(f fVar) {
        h.e(fVar, "model");
        if (fVar.e().e() != SubscriptionType.RECENT_SEARCHES || !(!fVar.f().c().isEmpty())) {
            return EmptyList.a;
        }
        String string = this.a.getString(C0707R.string.your_library_recent_searches_section_header);
        h.d(string, "activity.getString(R.str…_searches_section_header)");
        return d.t(new y.c(string));
    }
}
