package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.glue.patterns.contextmenu.model.e;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.mobile.android.util.o0;
import com.spotify.mobile.android.video.i0;
import com.spotify.mobile.android.video.model.ContextPlayerConfiguration;
import com.spotify.music.C0707R;
import com.spotify.remoteconfig.sc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: r9b  reason: default package */
public class r9b {
    private final o0 a;
    private final fwc b;
    private final t9b c;
    private final sc d;

    /* access modifiers changed from: package-private */
    /* renamed from: r9b$a */
    public class a implements e {
        final /* synthetic */ Context a;
        final /* synthetic */ Optional b;

        a(Context context, Optional optional) {
            this.a = context;
            this.b = optional;
        }

        @Override // com.spotify.android.glue.patterns.contextmenu.model.e
        public void a(b bVar) {
            r9b.a(r9b.this, this.a, this.b);
        }
    }

    public r9b(o0 o0Var, fwc fwc, t9b t9b, sc scVar) {
        this.a = o0Var;
        this.b = fwc;
        this.c = t9b;
        this.d = scVar;
    }

    static void a(r9b r9b, Context context, Optional optional) {
        r9b.b.d(ContextPlayerConfiguration.fromSubtitle(optional)).o0(io.reactivex.android.schedulers.a.b()).subscribe(new o9b(r9b, context, optional), n9b.a);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static int d(String str) {
        char c2;
        if (TextUtils.isEmpty(str)) {
            return C0707R.string.video_subtitle_off;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case 3184:
                if (str.equals("cs")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3201:
                if (str.equals("de")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3239:
                if (str.equals("el")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3241:
                if (str.equals("en")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3246:
                if (str.equals("es")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3267:
                if (str.equals("fi")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3276:
                if (str.equals("fr")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3341:
                if (str.equals("hu")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 3355:
                if (str.equals("id")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 3371:
                if (str.equals("it")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 3383:
                if (str.equals("ja")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 3494:
                if (str.equals("ms")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 3518:
                if (str.equals("nl")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 3580:
                if (str.equals("pl")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 3588:
                if (str.equals("pt")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 3683:
                if (str.equals("sv")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 3763:
                if (str.equals("vi")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 3886:
                if (str.equals("zh")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return C0707R.string.video_subtitle_lang_czech;
            case 1:
                return C0707R.string.video_subtitle_lang_german;
            case 2:
                return C0707R.string.video_subtitle_lang_greek;
            case 3:
                return C0707R.string.video_subtitle_lang_english;
            case 4:
                return C0707R.string.video_subtitle_lang_spanish;
            case 5:
                return C0707R.string.video_subtitle_lang_finnish;
            case 6:
                return C0707R.string.video_subtitle_lang_french;
            case 7:
                return C0707R.string.video_subtitle_lang_hungarian;
            case '\b':
                return C0707R.string.video_subtitle_lang_indonesian;
            case '\t':
                return C0707R.string.video_subtitle_lang_italian;
            case '\n':
                return C0707R.string.video_subtitle_lang_japanese;
            case 11:
                return C0707R.string.video_subtitle_lang_malay;
            case '\f':
                return C0707R.string.video_subtitle_lang_dutch;
            case '\r':
                return C0707R.string.video_subtitle_lang_polish;
            case 14:
                return C0707R.string.video_subtitle_lang_portuguese;
            case 15:
                return C0707R.string.video_subtitle_lang_swedish;
            case 16:
                return C0707R.string.video_subtitle_lang_turkish;
            case 17:
                return C0707R.string.video_subtitle_lang_vietnamese;
            case 18:
                return C0707R.string.video_subtitle_lang_chinese;
            default:
                return -1;
        }
    }

    private String e(Context context, Optional<i0> optional) {
        String str;
        int d2 = d(optional.transform(p9b.a).or((Optional<V>) ""));
        if (d2 == C0707R.string.video_subtitle_off) {
            return context.getString(d2);
        }
        if (d2 == -1) {
            return "";
        }
        if (optional.transform(q9b.a).or((Optional<V>) ((V) Boolean.FALSE)).booleanValue()) {
            str = context.getString(d2) + " [CC]";
        } else {
            str = context.getString(d2);
        }
        if (!this.d.a()) {
            return str;
        }
        StringBuilder Z0 = je.Z0(str, " ");
        Z0.append(context.getString(C0707R.string.video_subtitle_auto_generated));
        return Z0.toString();
    }

    public r3 b(Context context, Optional<i0> optional) {
        List<i0> d2 = this.c.d();
        ContextMenuViewModel contextMenuViewModel = new ContextMenuViewModel();
        contextMenuViewModel.G(context.getString(C0707R.string.video_subtitle_menu_header));
        ArrayList arrayList = new ArrayList();
        for (i0 i0Var : d2) {
            arrayList.add(Optional.of(i0Var));
        }
        if (!d2.isEmpty()) {
            arrayList.add(0, Optional.absent());
        }
        Iterator it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            Optional<i0> optional2 = (Optional) it.next();
            V v = (V) "";
            if (d(optional2.transform(p9b.a).or(v)) != -1) {
                boolean equals = optional2.equals(optional);
                String e = e(context, optional2);
                StringBuilder sb = new StringBuilder();
                if (equals) {
                    v = (V) "✓ ";
                }
                sb.append((String) v);
                sb.append((Object) e);
                b a2 = contextMenuViewModel.a(i, sb.toString());
                a2.o(new a(context, optional2));
                if (optional2.equals(optional)) {
                    a2.j(true);
                }
                i++;
            }
        }
        return cx1.b(contextMenuViewModel);
    }

    public String c(Context context) {
        String str;
        List<i0> d2 = this.c.d();
        Optional<i0> c2 = this.c.c();
        StringBuilder sb = new StringBuilder(context.getText(C0707R.string.video_subtitle_menu_header));
        if (d2.isEmpty()) {
            str = context.getString(C0707R.string.video_subtitle_unavailable);
        } else if (c2.isPresent()) {
            str = e(context, c2);
        } else {
            str = context.getString(C0707R.string.video_subtitle_off);
        }
        return je.I0(sb, " • ", str);
    }

    public /* synthetic */ void f(Context context, Optional optional, Response response) {
        if (response.getStatus() == 200) {
            this.a.b(SpotifyIconV2.CHECK, e(context, optional), C0707R.id.video_subtitle_confirmation_popup, 0);
        }
    }
}
