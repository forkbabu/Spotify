package com.spotify.android.dac.api.view.helpers;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import kotlin.f;

public interface a<T> {

    /* renamed from: com.spotify.android.dac.api.view.helpers.a$a  reason: collision with other inner class name */
    public static final class C0144a {
        /* JADX WARN: Incorrect args count in method signature: <T:Ljava/lang/Object;>(Lcom/spotify/android/dac/api/view/helpers/a<TT;>;)Lcmf<Lkotlin/f;>; */
        public static cmf a() {
            return ComponentBinder$unbinder$1.a;
        }
    }

    smf<ViewGroup, T, Boolean, View> builder();

    rmf<View, T, f> c();

    cmf<f> d();

    nmf<Any, T> e();
}
