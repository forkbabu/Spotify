package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.wrapped2020.stories.container.Wrapped2020StoriesActivity;
import defpackage.glb;
import kotlin.jvm.internal.h;

/* renamed from: cz8  reason: default package */
public final class cz8 implements blb {
    private final Context a;

    /* renamed from: cz8$a */
    static final class a<T, U, R> implements glb.b<Intent, c, Intent> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // defpackage.glb.b
        public Intent a(Intent intent, c cVar) {
            Intent intent2 = new Intent();
            intent2.setAction("android.intent.action.VIEW");
            intent2.setData(Uri.parse("spotify:genre:2020"));
            return intent2;
        }
    }

    /* renamed from: cz8$b */
    static final class b<T, U, R> implements glb.b<Intent, c, Intent> {
        final /* synthetic */ cz8 a;

        b(cz8 cz8) {
            this.a = cz8;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // defpackage.glb.b
        public Intent a(Intent intent, c cVar) {
            Wrapped2020StoriesActivity.a aVar = Wrapped2020StoriesActivity.G;
            Context context = this.a.a;
            h.e(context, "context");
            Intent intent2 = new Intent(context, Wrapped2020StoriesActivity.class);
            intent2.putExtra("use_sample_response", false);
            return intent2;
        }
    }

    public cz8(Context context) {
        h.e(context, "context");
        this.a = context;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        xkb xkb = (xkb) glb;
        xkb.e(dz8.a, "Wrapped Deep Link.", a.a);
        xkb.h(LinkType.WRAPPED_DATASTORIES, "Wrapped User Data Stories.", new b(this));
    }
}
