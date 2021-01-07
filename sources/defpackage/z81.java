package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableCommandModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentIdentifier;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentImages;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentText;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableImage;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableTarget;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import defpackage.b91;
import defpackage.o81;
import defpackage.p81;
import defpackage.r81;
import defpackage.s81;
import defpackage.w81;
import defpackage.x81;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

/* renamed from: z81  reason: default package */
public final class z81 {
    public static final p81.a a() {
        return HubsImmutableComponentBundle.Companion.b();
    }

    public static final o81.a b() {
        HubsImmutableCommandModel.Companion.getClass();
        return HubsImmutableCommandModel.access$getEMPTY$cp().toBuilder();
    }

    public static final s81.a c() {
        return HubsImmutableComponentModel.Companion.a();
    }

    public static final HubsImmutableComponentIdentifier d(String str, String str2) {
        h.e(str, "componentId");
        h.e(str2, "category");
        return HubsImmutableComponentIdentifier.Companion.a(str, str2);
    }

    public static final x81.a e() {
        HubsImmutableImage.Companion.getClass();
        return HubsImmutableImage.access$getEMPTY$cp().toBuilder();
    }

    public static final r81.a f() {
        return HubsImmutableComponentImages.Companion.a();
    }

    public static final HubsImmutableTarget g(String str) {
        h.e(str, "uri");
        HubsImmutableTarget.b bVar = HubsImmutableTarget.Companion;
        String[] strArr = new String[0];
        bVar.getClass();
        h.e(strArr, "actions");
        return bVar.a(str, d.c(strArr));
    }

    public static final w81.a h() {
        return HubsImmutableComponentText.Companion.a();
    }

    public static final b91.a i() {
        return HubsImmutableViewModel.Companion.a();
    }
}
