package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.m;

final class k extends j<ParcelFileDescriptor> {
    k(o oVar, m<ParcelFileDescriptor> mVar) {
        super(oVar, mVar);
    }

    @Override // com.google.android.play.core.assetpacks.j, com.google.android.play.core.internal.i0
    public final void F0(Bundle bundle, Bundle bundle2) {
        super.F0(bundle, bundle2);
        this.a.e((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor"));
    }
}
