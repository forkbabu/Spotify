package defpackage;

import com.spotify.carepackage.proto.CarePackage$CarePackagePlaylistResponse;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: ni4  reason: default package */
public final class ni4<T, R> implements l<CarePackage$CarePackagePlaylistResponse, String> {
    public static final ni4 a = new ni4();

    ni4() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public String apply(CarePackage$CarePackagePlaylistResponse carePackage$CarePackagePlaylistResponse) {
        CarePackage$CarePackagePlaylistResponse carePackage$CarePackagePlaylistResponse2 = carePackage$CarePackagePlaylistResponse;
        h.e(carePackage$CarePackagePlaylistResponse2, "it");
        return carePackage$CarePackagePlaylistResponse2.h();
    }
}
