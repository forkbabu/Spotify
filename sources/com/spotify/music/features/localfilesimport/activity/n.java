package com.spotify.music.features.localfilesimport.activity;

import com.google.common.collect.ImmutableSet;
import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.h;
import java.util.HashSet;
import java.util.Set;

public final /* synthetic */ class n implements h {
    public static final /* synthetic */ n a = new n();

    private /* synthetic */ n() {
    }

    @Override // io.reactivex.functions.h
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = LocalFilesImportActivity.h0;
        HashSet hashSet = new HashSet(3);
        hashSet.addAll((Set) obj);
        hashSet.addAll((Set) obj2);
        hashSet.addAll((ImmutableSet) obj3);
        Logger.b("Local files: pathsObservable(): %d", Integer.valueOf(hashSet.size()));
        return hashSet;
    }
}
