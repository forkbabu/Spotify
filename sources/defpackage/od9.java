package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.features.yourlibrary.musicpages.datasource.r4;
import com.spotify.music.features.yourlibrary.musicpages.e1;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: od9  reason: default package */
public class od9 {
    private final qd9 a;
    private final Player b;
    private final String c;
    private final e1 d;
    private final bre e;

    public od9(qd9 qd9, Player player, String str, e1 e1Var, bre bre) {
        this.a = qd9;
        this.b = player;
        this.c = str;
        this.d = e1Var;
        this.e = bre;
    }

    public void a(Optional optional, Map map) {
        PlayOptions build = new PlayOptions.Builder().playerOptionsOverride(Boolean.TRUE, null, null).build();
        Player player = this.b;
        List<MusicItem> list = (List) optional.get();
        PlayerTrack[] playerTrackArr = new PlayerTrack[list.size()];
        int i = 0;
        for (MusicItem musicItem : list) {
            playerTrackArr[i] = PlayerTrack.create(musicItem.A());
            i++;
        }
        player.play(PlayerContext.create(this.c, playerTrackArr, map), build);
    }

    public a b(MusicItem musicItem, String str, qpd qpd, String str2) {
        return this.a.a(musicItem, Collections.singletonMap("context_description", str), qpd, str2, this.e.get());
    }

    public a c(r4 r4Var, String str, String str2) {
        Optional optional;
        Map<String, String> singletonMap = Collections.singletonMap("context_description", str);
        int count = r4Var.getCount();
        if (count > 200) {
            optional = Optional.absent();
        } else {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < count; i++) {
                int size = arrayList.size();
                this.d.getClass();
                if (size > 16) {
                    break;
                }
                MusicItem item = r4Var.getItem(i);
                if (item.o()) {
                    arrayList.add(item);
                }
            }
            int size2 = arrayList.size();
            this.d.getClass();
            if (size2 <= 15) {
                optional = Optional.of(arrayList);
            } else {
                optional = Optional.absent();
            }
        }
        if (optional.isPresent()) {
            return a.u(new nd9(this, optional, singletonMap));
        }
        return this.a.b(singletonMap, str2, this.e.get());
    }
}
