package com.spotify.mobile.android.share.menu.preview.view;

import io.reactivex.functions.g;
import kotlin.f;

/* access modifiers changed from: package-private */
public final class SharePreviewMenuViews$fuser$3<A> implements qj0<Integer> {
    final /* synthetic */ SharePreviewMenuViews a;

    static final class a implements oj0 {
        final /* synthetic */ SharePreviewMenuViews$fuser$3 a;
        final /* synthetic */ io.reactivex.disposables.b b;

        a(SharePreviewMenuViews$fuser$3 sharePreviewMenuViews$fuser$3, io.reactivex.disposables.b bVar) {
            this.a = sharePreviewMenuViews$fuser$3;
            this.b = bVar;
        }

        @Override // defpackage.oj0
        public final void dispose() {
            this.a.a.f.C();
            this.b.dispose();
        }
    }

    static final class b<T> implements g<Integer> {
        final /* synthetic */ wi0 a;

        b(wi0 wi0) {
            this.a = wi0;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: wi0 */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(Integer num) {
            this.a.a(num);
        }
    }

    SharePreviewMenuViews$fuser$3(SharePreviewMenuViews sharePreviewMenuViews) {
        this.a = sharePreviewMenuViews;
    }

    @Override // defpackage.qj0
    public final oj0 a(final wi0<Integer> wi0) {
        this.a.f.setOnRetryClicked$libs_share_preview_menu(new cmf<f>() {
            /* class com.spotify.mobile.android.share.menu.preview.view.SharePreviewMenuViews$fuser$3.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: wi0 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.cmf
            public f invoke() {
                wi0.a(0);
                return f.a;
            }
        });
        return new a(this, this.a.p.subscribe(new b(wi0)));
    }
}
