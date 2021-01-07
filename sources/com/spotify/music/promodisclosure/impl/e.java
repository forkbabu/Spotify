package com.spotify.music.promodisclosure.impl;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;

public final class e {
    public static void a(Context context, String str, bre bre, nqe nqe) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.spotify.music.features.queue.service.QueueService");
        intent.setAction("add_album");
        intent.putExtra("album_uri", str);
        intent.putExtra(ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID, bre.get());
        intent.putExtra(ContextTrack.Metadata.KEY_INTERACTION_ID, nqe.b());
        context.startService(intent);
    }

    public static void b(Context context, List<PlayerTrack> list, bre bre, nqe nqe, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.spotify.music.features.queue.service.QueueService");
        intent.setAction("add_tracks_or_episodes");
        intent.putParcelableArrayListExtra("items", new ArrayList<>(list));
        intent.putExtra("show_toast", z);
        intent.putExtra(ContextTrack.Metadata.KEY_PAGE_INSTANCE_ID, bre.get());
        intent.putExtra(ContextTrack.Metadata.KEY_INTERACTION_ID, nqe.b());
        context.startService(intent);
    }
}
