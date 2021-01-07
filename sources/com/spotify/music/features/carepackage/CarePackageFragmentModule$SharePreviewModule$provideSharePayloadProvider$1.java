package com.spotify.music.features.carepackage;

import android.content.Context;
import com.spotify.mobile.android.share.menu.preview.api.c;
import com.spotify.mobile.android.share.menu.preview.api.d;
import com.spotify.music.C0707R;
import com.spotify.music.features.carepackage.sharecardimage.ShareCardImageKt;
import com.spotify.playlist.models.k;
import com.squareup.picasso.Picasso;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class CarePackageFragmentModule$SharePreviewModule$provideSharePayloadProvider$1 extends Lambda implements cmf<d> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Picasso $picasso;
    final /* synthetic */ li4 $playlistEntityProvider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CarePackageFragmentModule$SharePreviewModule$provideSharePayloadProvider$1(li4 li4, Context context, Picasso picasso) {
        super(0);
        this.$playlistEntityProvider = li4;
        this.$context = context;
        this.$picasso = picasso;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public d invoke() {
        k d = this.$playlistEntityProvider.b().T().d();
        if (d != null) {
            return new d.b(new c(d.j().getUri(), ShareCardImageKt.a(this.$context, d, this.$picasso), this.$context.getString(C0707R.string.share_message), null, null, 24));
        }
        return d.a.a;
    }
}
