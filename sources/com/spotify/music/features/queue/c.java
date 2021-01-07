package com.spotify.music.features.queue;

import com.spotify.android.flags.d;
import com.spotify.music.features.queue.v2.QueueFragmentV2;
import com.spotify.music.sociallistening.participantlist.impl.m;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ QueueActivity a;

    public /* synthetic */ c(QueueActivity queueActivity) {
        this.a = queueActivity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        QueueActivity queueActivity = this.a;
        com.spotify.android.flags.c cVar = (com.spotify.android.flags.c) obj;
        ifd ifd = kfd.R0;
        if (queueActivity.K.c()) {
            QueueFragmentV2 queueFragmentV2 = new QueueFragmentV2();
            queueFragmentV2.z1();
            m.d(queueFragmentV2, yn0.a(ifd));
            return queueFragmentV2;
        }
        QueueNoPLFragment queueNoPLFragment = new QueueNoPLFragment();
        m.d(queueNoPLFragment, yn0.a(ifd));
        d.a(queueNoPLFragment, cVar);
        return queueNoPLFragment;
    }
}
