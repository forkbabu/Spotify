package com.spotify.music.homecomponents.singleitem.card;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class HomeBaseSingleFocusCardComponent$playButtonSetUp$1 extends Lambda implements nmf<Boolean, f> {
    final /* synthetic */ s81 $componentModel;
    final /* synthetic */ w51 $config;
    final /* synthetic */ HomeSingleFocusCardViewBinder $viewBinder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeBaseSingleFocusCardComponent$playButtonSetUp$1(HomeSingleFocusCardViewBinder homeSingleFocusCardViewBinder, w51 w51, s81 s81) {
        super(1);
        this.$viewBinder = homeSingleFocusCardViewBinder;
        this.$config = w51;
        this.$componentModel = s81;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(Boolean bool) {
        this.$viewBinder.u1(!bool.booleanValue());
        this.$config.b().a(n61.b("singleItemButtonClick", this.$componentModel));
        return f.a;
    }
}
