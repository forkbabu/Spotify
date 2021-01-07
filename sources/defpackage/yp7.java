package defpackage;

import com.spotify.music.features.profile.proto.ProfilemodelRequest$Profile;
import defpackage.mp7;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: yp7  reason: default package */
public final /* synthetic */ class yp7 implements l {
    public static final /* synthetic */ yp7 a = new yp7();

    private /* synthetic */ yp7() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        v vVar = (v) obj;
        if (!vVar.f() || vVar.a() == null) {
            return mp7.b.a;
        }
        ProfilemodelRequest$Profile profilemodelRequest$Profile = (ProfilemodelRequest$Profile) vVar.a();
        h.e(profilemodelRequest$Profile, "profile");
        return new mp7.a(profilemodelRequest$Profile);
    }
}
