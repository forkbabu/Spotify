package com.spotify.music.homecomponents.singleitem.card;

import kotlin.Pair;
import kotlin.collections.d;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class HomeBaseSingleFocusCardComponent$heartButtonSetUp$1 extends Lambda implements nmf<Boolean, f> {
    final /* synthetic */ s81 $componentModel;
    final /* synthetic */ w51 $config;
    final /* synthetic */ HomeSingleFocusCardViewBinder $viewBinder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeBaseSingleFocusCardComponent$heartButtonSetUp$1(HomeSingleFocusCardViewBinder homeSingleFocusCardViewBinder, s81 s81, w51 w51) {
        super(1);
        this.$viewBinder = homeSingleFocusCardViewBinder;
        this.$componentModel = s81;
        this.$config = w51;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.$viewBinder.y2(!booleanValue);
        this.$config.b().a(n61.c("heartClick", this.$componentModel, d.x(new Pair("hearted", Boolean.valueOf(booleanValue)))));
        return f.a;
    }
}
