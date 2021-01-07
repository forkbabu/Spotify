package com.spotify.music.libs.accountlinkingnudges;

import io.reactivex.functions.h;

final class e<T1, T2, T3, R> implements h<Boolean, Boolean, Boolean, Boolean> {
    public static final e a = new e();

    e() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // io.reactivex.functions.h
    public Boolean a(Boolean bool, Boolean bool2, Boolean bool3) {
        Boolean bool4 = bool;
        Boolean bool5 = bool2;
        Boolean bool6 = bool3;
        kotlin.jvm.internal.h.e(bool4, "activityVisible");
        kotlin.jvm.internal.h.e(bool5, "isUserUnlinked");
        kotlin.jvm.internal.h.e(bool6, "activeDeviceSupportsVoice");
        return Boolean.valueOf(bool4.booleanValue() && bool5.booleanValue() && bool6.booleanValue());
    }
}
