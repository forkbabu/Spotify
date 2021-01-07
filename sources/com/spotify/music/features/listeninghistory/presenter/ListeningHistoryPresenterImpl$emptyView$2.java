package com.spotify.music.features.listeninghistory.presenter;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ListeningHistoryPresenterImpl$emptyView$2 extends Lambda implements cmf<b91> {
    final /* synthetic */ ListeningHistoryPresenterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ListeningHistoryPresenterImpl$emptyView$2(ListeningHistoryPresenterImpl listeningHistoryPresenterImpl) {
        super(0);
        this.this$0 = listeningHistoryPresenterImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public b91 invoke() {
        Context g = ListeningHistoryPresenterImpl.g(this.this$0);
        h.e(g, "context");
        String string = g.getString(C0707R.string.empty_view_title);
        h.d(string, "context.getString(R.string.empty_view_title)");
        String string2 = g.getString(C0707R.string.empty_view_subtitle);
        h.d(string2, "context.getString(R.string.empty_view_subtitle)");
        return t71.d().l(z81.c().n(HubsGlueComponent.EMPTY_VIEW).y(z81.h().a(string).c(string2)).l()).g();
    }
}
