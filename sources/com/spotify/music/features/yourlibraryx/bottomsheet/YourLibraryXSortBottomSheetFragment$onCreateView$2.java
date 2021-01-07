package com.spotify.music.features.yourlibraryx.bottomsheet;

import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.event.b;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class YourLibraryXSortBottomSheetFragment$onCreateView$2 extends Lambda implements nmf<YourLibraryXSortOption, f> {
    final /* synthetic */ YourLibraryXSortBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryXSortBottomSheetFragment$onCreateView$2(YourLibraryXSortBottomSheetFragment yourLibraryXSortBottomSheetFragment) {
        super(1);
        this.this$0 = yourLibraryXSortBottomSheetFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(YourLibraryXSortOption yourLibraryXSortOption) {
        YourLibraryXSortOption yourLibraryXSortOption2 = yourLibraryXSortOption;
        h.e(yourLibraryXSortOption2, "it");
        b bVar = this.this$0.v0;
        if (bVar != null) {
            bVar.Z(null);
            b bVar2 = this.this$0.x0;
            if (bVar2 != null) {
                bVar2.b(new YourLibraryXEvent.w(yourLibraryXSortOption2));
                eh9 eh9 = this.this$0.w0;
                if (eh9 != null) {
                    eh9.j(yourLibraryXSortOption2);
                    this.this$0.M4();
                    return f.a;
                }
                h.k("logger");
                throw null;
            }
            h.k("eventSubject");
            throw null;
        }
        h.k("adapter");
        throw null;
    }
}
