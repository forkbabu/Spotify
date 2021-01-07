package defpackage;

import android.content.res.Resources;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: d85  reason: default package */
public class d85 implements w<b91, b91> {
    private static final Joiner b = Joiner.on(" • ").skipNulls();
    private final Resources a;

    public d85(Resources resources) {
        this.a = resources;
    }

    public s81 a(s81 s81) {
        String id = s81.id();
        if (id == null || !id.startsWith("artist-entity-view-podcasts_row") || !HubsComponentCategory.ROW.d().equals(s81.componentId().category())) {
            return s81;
        }
        String subtitle = s81.text().subtitle();
        int ordinal = l0.z(s81.metadata().string("uri")).q().ordinal();
        if (ordinal == 196 || ordinal == 237) {
            subtitle = b.join(this.a.getString(C0707R.string.podcasts_featuring_subtitle_podcast_episode), MoreObjects.emptyToNull(subtitle), new Object[0]);
        } else if (ordinal == 244 || ordinal == 246) {
            subtitle = b.join(this.a.getString(C0707R.string.podcasts_featuring_subtitle_podcast), MoreObjects.emptyToNull(subtitle), new Object[0]);
        }
        return s81.toBuilder().y(s81.text().toBuilder().d(subtitle)).l();
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return sVar.j0(new x75(this));
    }
}
