package com.spotify.pageloader.rx.logic;

import defpackage.jud;
import java.util.Set;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class ObservableLoadableLogic$handleNewSubscriber$1 extends Lambda implements cmf<f> {
    final /* synthetic */ Set $effects;
    final /* synthetic */ lud $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ObservableLoadableLogic$handleNewSubscriber$1(lud lud, Set set) {
        super(0);
        this.$model = lud;
        this.$effects = set;
    }

    @Override // defpackage.cmf
    public final void invoke() {
        if (!this.$model.d()) {
            this.$effects.add(jud.e.a);
        }
    }
}
