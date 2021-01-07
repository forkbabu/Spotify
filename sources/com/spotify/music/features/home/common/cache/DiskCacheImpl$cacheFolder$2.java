package com.spotify.music.features.home.common.cache;

import java.io.File;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class DiskCacheImpl$cacheFolder$2 extends Lambda implements cmf<File> {
    final /* synthetic */ DiskCacheImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiskCacheImpl$cacheFolder$2(DiskCacheImpl diskCacheImpl) {
        super(0);
        this.this$0 = diskCacheImpl;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public File invoke() {
        File filesDir = this.this$0.b.getFilesDir();
        return new File(filesDir, this.this$0.d + '/' + this.this$0.c.hashCode());
    }
}
