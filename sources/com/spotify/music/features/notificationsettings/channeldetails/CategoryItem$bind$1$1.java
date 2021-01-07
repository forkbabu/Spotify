package com.spotify.music.features.notificationsettings.channeldetails;

import android.widget.CompoundButton;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

final /* synthetic */ class CategoryItem$bind$1$1 extends FunctionReferenceImpl implements rmf<CompoundButton, Boolean, f> {
    CategoryItem$bind$1$1(CategoryItem categoryItem) {
        super(2, categoryItem, CategoryItem.class, "onCheckedChanged", "onCheckedChanged(Landroid/widget/CompoundButton;Z)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(CompoundButton compoundButton, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        ((CategoryItem) this.receiver).onCheckedChanged(compoundButton, booleanValue);
        return f.a;
    }
}
