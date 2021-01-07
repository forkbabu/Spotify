package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.music.libs.search.hubs.component.SearchComponent;
import com.spotify.searchview.proto.Entity;

/* renamed from: q68  reason: default package */
public class q68 implements gwa {
    @Override // defpackage.gwa
    public q81 a(Entity entity) {
        Entity.EntityCase m = entity.m();
        if (m == Entity.EntityCase.TOPIC) {
            return SearchComponent.TOPIC;
        }
        if (m == Entity.EntityCase.AUDIO_SHOW) {
            return SearchComponent.SHOW_ROW;
        }
        if (m == Entity.EntityCase.AUDIO_EPISODE) {
            return entity.i().m() ? SearchComponent.MUSIC_AND_TALK_ROW : SearchComponent.EPISODE_ROW;
        }
        if (m != Entity.EntityCase.TRACK || !entity.q().l()) {
            return HubsGlueRow.NORMAL;
        }
        return SearchComponent.TRACK_WITH_LYRICS;
    }
}
