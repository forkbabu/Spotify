package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.promodisclosure.impl.e;
import java.util.Map;

/* renamed from: sd7  reason: default package */
public class sd7 {
    private final Context a;

    public sd7(Context context) {
        this.a = context;
    }

    public void a(String str, Map<String, String> map, bre bre, nqe nqe) {
        e.b(this.a, ImmutableList.of(PlayerTrack.create(str, map)), bre, nqe, true);
    }
}
