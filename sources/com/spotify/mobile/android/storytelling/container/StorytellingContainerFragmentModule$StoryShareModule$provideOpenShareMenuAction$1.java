package com.spotify.mobile.android.storytelling.container;

import com.spotify.mobile.android.share.menu.preview.api.e;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class StorytellingContainerFragmentModule$StoryShareModule$provideOpenShareMenuAction$1 extends Lambda implements cmf<f> {
    final /* synthetic */ e $sharePreviewMenu;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StorytellingContainerFragmentModule$StoryShareModule$provideOpenShareMenuAction$1(e eVar) {
        super(0);
        this.$sharePreviewMenu = eVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.$sharePreviewMenu.b();
        return f.a;
    }
}
