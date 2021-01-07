package com.spotify.music.features.yourlibraryx.view;

import android.app.Activity;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryShowExtraInfo;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.b;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.features.yourlibraryx.view.entities.swipe.SwipeAction;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.j;
import kotlin.reflect.c;

public final class s implements r {
    private List<? extends b> a = EmptyList.a;
    private String b = "";
    private final SwipeAction c;
    private final SwipeAction f;
    private final Activity n;
    private final b o;
    private final wbb p;

    public static final class a implements h<f> {
        final /* synthetic */ s a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(s sVar) {
            this.a = sVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            f fVar = (f) obj;
            kotlin.jvm.internal.h.e(fVar, "value");
            this.a.a = fVar.c().c();
            this.a.b = fVar.k();
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
        }
    }

    public s(Activity activity, String str, String str2, b bVar, wbb wbb) {
        kotlin.jvm.internal.h.e(activity, "activity");
        kotlin.jvm.internal.h.e(str, "likedSongsLabel");
        kotlin.jvm.internal.h.e(str2, "yourEpisodesLabel");
        kotlin.jvm.internal.h.e(bVar, "dateHelper");
        kotlin.jvm.internal.h.e(wbb, "flags");
        this.n = activity;
        this.o = bVar;
        this.p = wbb;
        this.c = new SwipeAction(androidx.core.content.a.b(activity, C0707R.color.your_library_pin_background), new com.spotify.music.features.yourlibraryx.view.entities.swipe.a(oi0.d(activity), oi0.e(activity)), null, 4);
        this.f = new SwipeAction(androidx.core.content.a.b(activity, C0707R.color.your_library_unpin_background), new com.spotify.music.features.yourlibraryx.view.entities.swipe.a(oi0.e(activity), oi0.d(activity)), null, 4);
    }

    @Override // com.spotify.music.features.yourlibraryx.view.r
    public <T extends b> boolean B(c<? extends T> cVar) {
        kotlin.jvm.internal.h.e(cVar, "type");
        return com.spotify.music.features.yourlibraryx.b.a(this.a, cVar);
    }

    @Override // com.spotify.music.features.yourlibraryx.view.r
    public boolean B0(YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity) {
        kotlin.jvm.internal.h.e(yourLibraryResponseProto$YourLibraryResponseEntity, "entity");
        String str = this.b;
        YourLibraryResponseProto$YourLibraryEntityInfo m = yourLibraryResponseProto$YourLibraryResponseEntity.m();
        kotlin.jvm.internal.h.d(m, "entity.entityInfo");
        return kotlin.jvm.internal.h.a(str, m.p());
    }

    @Override // com.spotify.music.features.yourlibraryx.view.r
    public boolean J0(YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity) {
        kotlin.jvm.internal.h.e(yourLibraryResponseProto$YourLibraryResponseEntity, "entity");
        if (this.p.a()) {
            YourLibraryResponseProto$YourLibraryEntityInfo m = yourLibraryResponseProto$YourLibraryResponseEntity.m();
            kotlin.jvm.internal.h.d(m, "entity.entityInfo");
            if (m.o()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.yourlibraryx.view.r
    public LibraryItemDescription.UpdateDate S(YourLibraryResponseProto$YourLibraryShowExtraInfo yourLibraryResponseProto$YourLibraryShowExtraInfo) {
        kotlin.jvm.internal.h.e(yourLibraryResponseProto$YourLibraryShowExtraInfo, "showInfo");
        long millis = TimeUnit.SECONDS.toMillis(yourLibraryResponseProto$YourLibraryShowExtraInfo.l());
        return new LibraryItemDescription.UpdateDate(millis, this.o.a(millis));
    }

    @Override // com.spotify.music.features.yourlibraryx.view.r
    public boolean X1() {
        return B(j.b(b.C0269b.class));
    }

    @Override // com.spotify.music.features.yourlibraryx.view.r
    public SwipeAction Y1(YourLibraryResponseProto$YourLibraryResponseEntity yourLibraryResponseProto$YourLibraryResponseEntity) {
        kotlin.jvm.internal.h.e(yourLibraryResponseProto$YourLibraryResponseEntity, "entity");
        if (this.p.a()) {
            YourLibraryResponseProto$YourLibraryEntityInfo m = yourLibraryResponseProto$YourLibraryResponseEntity.m();
            kotlin.jvm.internal.h.d(m, "entity.entityInfo");
            if (m.n() == YourLibraryResponseProto$YourLibraryEntityInfo.Pinnable.YES) {
                YourLibraryResponseProto$YourLibraryEntityInfo m2 = yourLibraryResponseProto$YourLibraryResponseEntity.m();
                kotlin.jvm.internal.h.d(m2, "entity.entityInfo");
                return m2.o() ? this.f : this.c;
            }
        }
        return null;
    }

    @Override // com.spotify.mobius.g
    public h<f> t(da2<YourLibraryXEvent> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        return new a(this);
    }
}
