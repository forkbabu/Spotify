package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.e0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import com.spotify.music.C0707R;
import kotlin.d;
import kotlin.jvm.internal.h;
import kotlin.reflect.c;

public final class l0 {
    public static final <VM extends e0> d<VM> a(Fragment fragment, c<VM> cVar, cmf<? extends h0> cmf, cmf<? extends g0.b> cmf2) {
        h.f(fragment, "$this$createViewModelLazy");
        h.f(cVar, "viewModelClass");
        h.f(cmf, "storeProducer");
        return new f0(cVar, cmf, cmf2);
    }

    static g b(Context context, i iVar, Fragment fragment, boolean z) {
        int i;
        Fragment.c cVar = fragment.S;
        boolean z2 = false;
        if (cVar == null) {
            i = 0;
        } else {
            i = cVar.e;
        }
        int O2 = fragment.O2();
        fragment.y4(0);
        View a = iVar.a(fragment.F);
        if (!(a == null || a.getTag(C0707R.id.visible_removing_fragment_view_tag) == null)) {
            a.setTag(C0707R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup = fragment.O;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation t3 = fragment.t3();
        if (t3 != null) {
            return new g(t3);
        }
        Animator u3 = fragment.u3();
        if (u3 != null) {
            return new g(u3);
        }
        if (O2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(O2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, O2);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, O2);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, O2);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (i == 0) {
            return null;
        }
        int i2 = i != 4097 ? i != 4099 ? i != 8194 ? -1 : z ? C0707R.anim.fragment_close_enter : C0707R.anim.fragment_close_exit : z ? C0707R.anim.fragment_fade_enter : C0707R.anim.fragment_fade_exit : z ? C0707R.anim.fragment_open_enter : C0707R.anim.fragment_open_exit;
        if (i2 < 0) {
            return null;
        }
        return new g(AnimationUtils.loadAnimation(context, i2));
    }
}
