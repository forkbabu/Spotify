package com.spotify.music.features.localfilesimport.activity;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.localfilesimport.model.LocalSourceJacksonModel;
import com.spotify.music.features.localfilesimport.model.e;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Set;

public final /* synthetic */ class k implements l {
    public final /* synthetic */ LocalFilesImportActivity a;

    public /* synthetic */ k(LocalFilesImportActivity localFilesImportActivity) {
        this.a = localFilesImportActivity;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        LocalFilesImportActivity localFilesImportActivity = this.a;
        Set<String> set = (Set) obj;
        localFilesImportActivity.getClass();
        Logger.b("Local files: switching pathsObservable into LocalSourcesResponse: %d", Integer.valueOf(set.size()));
        ArrayList arrayList = new ArrayList(set.size());
        for (String str : set) {
            arrayList.add(new LocalSourceJacksonModel(str, null, null));
        }
        return localFilesImportActivity.Z.a(e.a(arrayList)).P();
    }
}
