package com.spotify.mobile.android.storytelling.controls.stories;

import defpackage.ox1;
import io.reactivex.functions.f;
import io.reactivex.t;
import io.reactivex.u;
import kotlin.jvm.internal.h;

final class StoriesControls$userRequests$1<T> implements u<ox1> {
    final /* synthetic */ StoriesControls a;

    static final class a implements f {
        final /* synthetic */ StoriesControls$userRequests$1 a;

        a(StoriesControls$userRequests$1 storiesControls$userRequests$1) {
            this.a = storiesControls$userRequests$1;
        }

        @Override // io.reactivex.functions.f
        public final void cancel() {
            this.a.a.e().b();
            this.a.a.f().setStoryEndListener$libs_storytelling(null);
        }
    }

    StoriesControls$userRequests$1(StoriesControls storiesControls) {
        this.a = storiesControls;
    }

    @Override // io.reactivex.u
    public final void subscribe(final t<ox1> tVar) {
        h.e(tVar, "emitter");
        this.a.e().setStoryGestureListener(new nmf<StoryGesture, kotlin.f>(this) {
            /* class com.spotify.mobile.android.storytelling.controls.stories.StoriesControls$userRequests$1.AnonymousClass1 */
            final /* synthetic */ StoriesControls$userRequests$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: io.reactivex.t */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
                if (defpackage.q4.o(r4.this$0.a.e()) == 1) goto L_0x0044;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
                if (defpackage.q4.o(r4.this$0.a.e()) == 1) goto L_0x0045;
             */
            @Override // defpackage.nmf
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public kotlin.f invoke(com.spotify.mobile.android.storytelling.controls.stories.StoryGesture r5) {
                /*
                    r4 = this;
                    com.spotify.mobile.android.storytelling.controls.stories.StoryGesture r5 = (com.spotify.mobile.android.storytelling.controls.stories.StoryGesture) r5
                    ox1$c r0 = defpackage.ox1.c.a
                    ox1$e r1 = defpackage.ox1.e.a
                    java.lang.String r2 = "storyGesture"
                    kotlin.jvm.internal.h.e(r5, r2)
                    int r5 = r5.ordinal()
                    if (r5 == 0) goto L_0x004a
                    r2 = 1
                    if (r5 == r2) goto L_0x0047
                    r3 = 2
                    if (r5 == r3) goto L_0x0035
                    r3 = 3
                    if (r5 == r3) goto L_0x0026
                    r0 = 4
                    if (r5 != r0) goto L_0x0020
                    ox1$a r5 = defpackage.ox1.a.a
                    goto L_0x004c
                L_0x0020:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                L_0x0026:
                    com.spotify.mobile.android.storytelling.controls.stories.StoriesControls$userRequests$1 r5 = r4.this$0
                    com.spotify.mobile.android.storytelling.controls.stories.StoriesControls r5 = r5.a
                    com.spotify.mobile.android.storytelling.controls.stories.StoriesBackgroundView r5 = r5.e()
                    int r5 = defpackage.q4.o(r5)
                    if (r5 != r2) goto L_0x0045
                    goto L_0x0044
                L_0x0035:
                    com.spotify.mobile.android.storytelling.controls.stories.StoriesControls$userRequests$1 r5 = r4.this$0
                    com.spotify.mobile.android.storytelling.controls.stories.StoriesControls r5 = r5.a
                    com.spotify.mobile.android.storytelling.controls.stories.StoriesBackgroundView r5 = r5.e()
                    int r5 = defpackage.q4.o(r5)
                    if (r5 != r2) goto L_0x0044
                    goto L_0x0045
                L_0x0044:
                    r0 = r1
                L_0x0045:
                    r5 = r0
                    goto L_0x004c
                L_0x0047:
                    ox1$g r5 = defpackage.ox1.g.a
                    goto L_0x004c
                L_0x004a:
                    ox1$d r5 = defpackage.ox1.d.a
                L_0x004c:
                    io.reactivex.t r0 = r3
                    r0.onNext(r5)
                    kotlin.f r5 = kotlin.f.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.storytelling.controls.stories.StoriesControls$userRequests$1.AnonymousClass1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.a.f().setStoryEndListener$libs_storytelling(new nmf<Integer, kotlin.f>() {
            /* class com.spotify.mobile.android.storytelling.controls.stories.StoriesControls$userRequests$1.AnonymousClass2 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: io.reactivex.t */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.nmf
            public kotlin.f invoke(Integer num) {
                num.intValue();
                tVar.onNext(ox1.c.a);
                return kotlin.f.a;
            }
        });
        this.a.f().setCloseListener$libs_storytelling(new cmf<kotlin.f>() {
            /* class com.spotify.mobile.android.storytelling.controls.stories.StoriesControls$userRequests$1.AnonymousClass3 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.t */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.cmf
            public kotlin.f invoke() {
                tVar.onNext(ox1.a.a);
                return kotlin.f.a;
            }
        });
        this.a.f().setMuteListener$libs_storytelling(new nmf<Boolean, kotlin.f>() {
            /* class com.spotify.mobile.android.storytelling.controls.stories.StoriesControls$userRequests$1.AnonymousClass4 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.t */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.nmf
            public kotlin.f invoke(Boolean bool) {
                tVar.onNext(bool.booleanValue() ? ox1.b.a : ox1.i.a);
                return kotlin.f.a;
            }
        });
        this.a.f().setShareListener$libs_storytelling(new cmf<kotlin.f>() {
            /* class com.spotify.mobile.android.storytelling.controls.stories.StoriesControls$userRequests$1.AnonymousClass5 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.t */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.cmf
            public kotlin.f invoke() {
                tVar.onNext(ox1.h.a);
                return kotlin.f.a;
            }
        });
        tVar.e(new a(this));
    }
}
