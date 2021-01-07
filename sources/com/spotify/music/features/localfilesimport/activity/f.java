package com.spotify.music.features.localfilesimport.activity;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.localfilesimport.model.LocalSourcesResponse;
import defpackage.rn5;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public final /* synthetic */ LocalFilesImportActivity a;

    public /* synthetic */ f(LocalFilesImportActivity localFilesImportActivity) {
        this.a = localFilesImportActivity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        LocalFilesImportActivity localFilesImportActivity = this.a;
        localFilesImportActivity.getClass();
        Logger.b("Local files: switching localSourcesResponse into LocalTracks, success: %s", Boolean.valueOf(((LocalSourcesResponse) obj).isSuccess()));
        qn5 qn5 = localFilesImportActivity.Z;
        rn5.a a2 = rn5.a();
        a2.e(ImmutableList.of("link.isDuplicate eq false", "inCollection eq false"));
        a2.c(true);
        return qn5.d(a2.build().d()).j0(e.a);
    }
}
