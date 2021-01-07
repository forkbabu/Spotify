package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;

public interface x3<T> {
    public static final x3<Void> a = new a();

    static class a implements x3<Void> {
        a() {
        }

        /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel> */
        @Override // com.spotify.mobile.android.ui.contextmenu.x3
        public s<ContextMenuViewModel> a(y3<Void> y3Var) {
            return o.a;
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.x3
        public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
            return contextMenuViewModel;
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.x3
        public ContextMenuViewModel c(y3<Void> y3Var) {
            throw new UnsupportedOperationException("should never be invoked");
        }
    }

    public static class b implements x3<Void> {
        private final ContextMenuViewModel b;

        public b(ContextMenuViewModel contextMenuViewModel) {
            this.b = contextMenuViewModel;
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.x3
        public s<ContextMenuViewModel> a(y3<Void> y3Var) {
            return s.i0(this.b);
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.x3
        public ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z) {
            return contextMenuViewModel;
        }

        @Override // com.spotify.mobile.android.ui.contextmenu.x3
        public ContextMenuViewModel c(y3<Void> y3Var) {
            return this.b;
        }
    }

    s<ContextMenuViewModel> a(y3<T> y3Var);

    ContextMenuViewModel b(ContextMenuViewModel contextMenuViewModel, boolean z);

    ContextMenuViewModel c(y3<T> y3Var);
}
