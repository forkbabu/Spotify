package com.spotify.music.playactionhandler.impl.playorqueue;

import com.spotify.music.playactionhandler.impl.playorqueue.PlayOrQueueDialogFragment;
import io.reactivex.subjects.PublishSubject;

public final class p {
    public static void a(PlayOrQueueDialogFragment playOrQueueDialogFragment, PublishSubject<PlayOrQueueDialogFragment.DialogResult> publishSubject) {
        playOrQueueDialogFragment.w0 = publishSubject;
    }

    public static void b(PlayOrQueueDialogFragment playOrQueueDialogFragment, x9d x9d) {
        playOrQueueDialogFragment.v0 = x9d;
    }
}
