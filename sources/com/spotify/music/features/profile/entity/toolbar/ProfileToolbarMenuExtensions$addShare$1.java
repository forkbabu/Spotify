package com.spotify.music.features.profile.entity.toolbar;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.music.C0707R;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import defpackage.pzc;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class ProfileToolbarMenuExtensions$addShare$1 extends Lambda implements cmf<f> {
    final /* synthetic */ hs7 $model;
    final /* synthetic */ r $shareData;
    final /* synthetic */ jzc $shareFlow;
    final /* synthetic */ a0 $this_addShare;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileToolbarMenuExtensions$addShare$1(a0 a0Var, hs7 hs7, r rVar, jzc jzc) {
        super(0);
        this.$this_addShare = a0Var;
        this.$model = hs7;
        this.$shareData = rVar;
        this.$shareFlow = jzc;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        String d = this.$model.d();
        s j = s.j(this.$shareData, this.$this_addShare.getContext().getString(this.$model.b() ? C0707R.string.share_to_external_profile_own_message : C0707R.string.share_to_external_profile_others_message));
        pzc.a c = pzc.c(this.$model.c().g(), d, "", this.$shareData);
        c.c(j);
        this.$shareFlow.c(c.build(), rzc.a, C0707R.string.integration_id_context_menu);
        return f.a;
    }
}
