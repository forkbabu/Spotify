package com.spotify.music.homecomponents.singleitem.card;

import kotlin.Pair;
import kotlin.collections.d;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class HomeBaseSingleFocusCardComponent$showMoreButtonSetUp$1 extends Lambda implements cmf<f> {
    final /* synthetic */ s81 $componentModel;
    final /* synthetic */ w51 $config;
    final /* synthetic */ String[] $uris;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeBaseSingleFocusCardComponent$showMoreButtonSetUp$1(s81 s81, String[] strArr, w51 w51) {
        super(0);
        this.$componentModel = s81;
        this.$uris = strArr;
        this.$config = w51;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        this.$config.b().a(n61.c("showMoreClick", this.$componentModel, d.x(new Pair("uris", this.$uris))));
        return f.a;
    }
}
