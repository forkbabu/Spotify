package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseHeader;
import com.spotify.music.features.yourlibraryx.domain.b;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class YourLibraryEffectHandler$toContentFilters$4 extends Lambda implements cmf<b.f> {
    final /* synthetic */ YourLibraryResponseProto$YourLibraryResponseHeader $this_toContentFilters;
    final /* synthetic */ e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryEffectHandler$toContentFilters$4(e eVar, YourLibraryResponseProto$YourLibraryResponseHeader yourLibraryResponseProto$YourLibraryResponseHeader) {
        super(0);
        this.this$0 = eVar;
        this.$this_toContentFilters = yourLibraryResponseProto$YourLibraryResponseHeader;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public b.f invoke() {
        return new b.f(e.a(this.this$0, this.$this_toContentFilters.p()));
    }
}
