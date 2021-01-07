package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.topic.TopicFragment;
import com.spotify.music.navigation.k;
import kotlin.jvm.internal.h;

/* renamed from: it8  reason: default package */
public final class it8 implements blb {
    private final boolean a;

    /* renamed from: it8$a */
    static final class a implements k {
        public static final a a = new a();

        a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            h.e(intent, "intent");
            String dataString = intent.getDataString();
            TopicFragment topicFragment = new TopicFragment();
            Bundle bundle = new Bundle();
            bundle.putString("topic_uri", dataString);
            topicFragment.r4(bundle);
            return topicFragment;
        }
    }

    public it8(boolean z) {
        this.a = z;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        if (this.a) {
            xkb xkb = (xkb) glb;
            xkb.i(LinkType.TOPIC, "Client topic Page", a.a);
        }
    }
}
