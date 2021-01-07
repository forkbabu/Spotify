package com.spotify.mobile.android.hubframework.defaults;

import android.view.View;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import defpackage.s51;
import java.util.EnumSet;

public interface d<V extends View> extends s51<V> {

    public static abstract class a<H extends s51.c.a<?>> extends s51.c<H> implements d<View> {
    }

    EnumSet<GlueLayoutTraits.Trait> e();
}
