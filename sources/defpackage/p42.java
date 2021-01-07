package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuFragment;
import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.C0707R;

/* renamed from: p42  reason: default package */
public final class p42 {
    private static final View.OnClickListener a = new c(null);

    /* access modifiers changed from: package-private */
    /* renamed from: p42$a */
    public static class a implements View.OnClickListener {
        final /* synthetic */ Context a;
        final /* synthetic */ b4 b;
        final /* synthetic */ Object c;
        final /* synthetic */ com.spotify.music.libs.viewuri.c f;

        a(Context context, b4 b4Var, Object obj, com.spotify.music.libs.viewuri.c cVar) {
            this.a = context;
            this.b = b4Var;
            this.c = obj;
            this.f = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ContextMenuFragment.b5(this.a, this.b, this.c, this.f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p42$b */
    public static class b implements View.OnClickListener {
        final /* synthetic */ Context a;
        final /* synthetic */ b4 b;
        final /* synthetic */ Object c;
        final /* synthetic */ com.spotify.music.libs.viewuri.c f;

        b(Context context, b4 b4Var, Object obj, com.spotify.music.libs.viewuri.c cVar) {
            this.a = context;
            this.b = b4Var;
            this.c = obj;
            this.f = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ContextMenuFragment.b5(this.a, this.b, this.c, this.f);
        }
    }

    /* renamed from: p42$c */
    private static class c implements View.OnClickListener {
        c(a aVar) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.showContextMenu();
        }
    }

    public static View a(Context context) {
        ImageButton i = z42.i(context, SpotifyIconV2.MORE_ANDROID);
        i.setContentDescription(context.getString(C0707R.string.content_description_show_context_menu));
        i.setOnClickListener(a);
        return i;
    }

    @Deprecated
    public static <T> View b(Context context, Drawable drawable, b4<T> b4Var, T t, com.spotify.music.libs.viewuri.c cVar) {
        ImageButton h = z42.h(context, drawable);
        h.setContentDescription(context.getString(C0707R.string.content_description_show_context_menu));
        h.setOnClickListener(new b(context, b4Var, t, cVar));
        return h;
    }

    @Deprecated
    public static <T> View c(Context context, b4<T> b4Var, T t, com.spotify.music.libs.viewuri.c cVar) {
        ImageButton i = z42.i(context, SpotifyIconV2.MORE_ANDROID);
        i.setContentDescription(context.getString(C0707R.string.content_description_show_context_menu));
        i.setOnClickListener(new a(context, b4Var, t, cVar));
        return i;
    }

    public static <T> View d(Context context, b4<T> b4Var, T t, com.spotify.music.libs.viewuri.c cVar, String str, String str2) {
        ImageButton i = z42.i(context, SpotifyIconV2.MORE_ANDROID);
        i.setContentDescription(context.getString(C0707R.string.content_description_show_context_menu_with_unique_name, str, str2));
        i.setOnClickListener(new n42(context, b4Var, t, cVar));
        return i;
    }
}
