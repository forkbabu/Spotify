package defpackage;

import com.spotify.music.playactionhandler.impl.playorqueue.PlayOrQueueDialogFragment;
import io.reactivex.subjects.PublishSubject;

/* renamed from: gec  reason: default package */
public final class gec implements fjf<PublishSubject<PlayOrQueueDialogFragment.DialogResult>> {

    /* access modifiers changed from: private */
    /* renamed from: gec$a */
    public static final class a {
        private static final gec a = new gec();
    }

    public static gec a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return PublishSubject.h1();
    }
}
