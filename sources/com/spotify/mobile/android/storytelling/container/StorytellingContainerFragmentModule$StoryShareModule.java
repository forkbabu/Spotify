package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobile.android.share.menu.preview.api.e;
import com.spotify.mobile.android.share.menu.preview.api.f;
import com.spotify.mobile.android.storytelling.common.PauseState;
import kotlin.jvm.internal.h;

public final class StorytellingContainerFragmentModule$StoryShareModule {

    public static final class a implements f {
        final /* synthetic */ nmf a;

        a(nmf nmf) {
            this.a = nmf;
        }

        @Override // com.spotify.mobile.android.share.menu.preview.api.f
        public void a() {
            this.a.invoke(PauseState.RESUMED);
        }
    }

    public static final cmf<kotlin.f> a(e eVar) {
        h.e(eVar, "sharePreviewMenu");
        return new StorytellingContainerFragmentModule$StoryShareModule$provideOpenShareMenuAction$1(eVar);
    }

    public static final f b(nmf<PauseState, kotlin.f> nmf) {
        h.e(nmf, "pauseStateConsumer");
        return new a(nmf);
    }
}
