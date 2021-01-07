package com.spotify.music.features.followfeed.views;

import com.spotify.music.features.followfeed.views.FollowRecsView;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class FollowRecsView$bindCarousel$$inlined$apply$lambda$1 implements FollowRecsView.c {
    final /* synthetic */ FollowRecsView a;
    final /* synthetic */ List b;

    FollowRecsView$bindCarousel$$inlined$apply$lambda$1(FollowRecsView followRecsView, List list) {
        this.a = followRecsView;
        this.b = list;
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void a(final String str) {
        h.e(str, "artistUri");
        FollowRecsView.f(this.a, new cmf<f>(this) {
            /* class com.spotify.music.features.followfeed.views.FollowRecsView$bindCarousel$$inlined$apply$lambda$1.AnonymousClass2 */
            final /* synthetic */ FollowRecsView$bindCarousel$$inlined$apply$lambda$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // defpackage.cmf
            public f invoke() {
                FollowRecsView.c cVar = this.this$0.a.n;
                if (cVar != null) {
                    cVar.a(str);
                }
                return f.a;
            }
        });
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void b(String str, int i) {
        h.e(str, "artistUri");
        FollowRecsView.c cVar = this.a.n;
        if (cVar != null) {
            cVar.b(str, i);
        }
    }

    @Override // com.spotify.music.features.followfeed.views.FollowRecsView.c
    public void c(final String str) {
        h.e(str, "artistUri");
        FollowRecsView.f(this.a, new cmf<f>(this) {
            /* class com.spotify.music.features.followfeed.views.FollowRecsView$bindCarousel$$inlined$apply$lambda$1.AnonymousClass1 */
            final /* synthetic */ FollowRecsView$bindCarousel$$inlined$apply$lambda$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // defpackage.cmf
            public f invoke() {
                FollowRecsView.c cVar = this.this$0.a.n;
                if (cVar != null) {
                    cVar.c(str);
                }
                return f.a;
            }
        });
    }
}
