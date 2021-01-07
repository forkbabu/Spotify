package defpackage;

import com.spotify.music.carmode.navigation.domain.CarModeNavigationModel;
import com.spotify.music.libs.carmodeengine.util.y;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: on2  reason: default package */
public final class on2 {
    private final y a;

    /* renamed from: on2$a */
    static final class a<T, R> implements l<Boolean, CarModeNavigationModel.SearchType> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public CarModeNavigationModel.SearchType apply(Boolean bool) {
            Boolean bool2 = bool;
            h.e(bool2, "isVoiceAvailable");
            if (bool2.booleanValue()) {
                return CarModeNavigationModel.SearchType.VOICE;
            }
            return CarModeNavigationModel.SearchType.REGULAR;
        }
    }

    public on2(y yVar) {
        h.e(yVar, "carModeFeatureAvailability");
        this.a = yVar;
    }

    public final s<CarModeNavigationModel.SearchType> a() {
        s<R> j0 = this.a.d().E().j0(a.a);
        h.d(j0, "carModeFeatureAvailabili…          }\n            }");
        return j0;
    }
}
