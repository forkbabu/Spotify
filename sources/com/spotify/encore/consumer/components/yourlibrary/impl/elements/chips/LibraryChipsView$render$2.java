package com.spotify.encore.consumer.components.yourlibrary.impl.elements.chips;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class LibraryChipsView$render$2 extends Lambda implements cmf<f> {
    final /* synthetic */ List $model;
    final /* synthetic */ LibraryChipsView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LibraryChipsView$render$2(LibraryChipsView libraryChipsView, List list) {
        super(0);
        this.this$0 = libraryChipsView;
        this.$model = list;
    }

    @Override // defpackage.cmf
    public final void invoke() {
        LibraryChipsView libraryChipsView = this.this$0;
        List list = this.$model;
        List list2 = libraryChipsView.previous;
        if (list2 == null) {
            list2 = EmptyList.a;
        }
        libraryChipsView.render(list, list2, this.this$0.previous != null);
        this.this$0.previous = this.$model;
    }
}
