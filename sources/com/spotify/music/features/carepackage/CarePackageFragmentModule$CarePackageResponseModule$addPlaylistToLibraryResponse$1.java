package com.spotify.music.features.carepackage;

import com.spotify.carepackage.proto.CarePackage$CarePackagePlaylistResponse;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.z;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class CarePackageFragmentModule$CarePackageResponseModule$addPlaylistToLibraryResponse$1 extends Lambda implements nmf<String, a> {
    final /* synthetic */ hi4 $carePackageEndpoint;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CarePackageFragmentModule$CarePackageResponseModule$addPlaylistToLibraryResponse$1(hi4 hi4) {
        super(1);
        this.$carePackageEndpoint = hi4;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public a invoke(String str) {
        String str2 = str;
        h.e(str2, "playlistUri");
        z<CarePackage$CarePackagePlaylistResponse> a = this.$carePackageEndpoint.a(str2);
        a.getClass();
        i iVar = new i(a);
        h.d(iVar, "carePackageEndpoint.addP…ylistUri).ignoreElement()");
        return iVar;
    }
}
