package com.spotify.libs.onboarding.allboarding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.spotify.allboarding.model.v1.proto.Item;
import com.spotify.allboarding.model.v1.proto.Logging;
import com.spotify.allboarding.model.v1.proto.NextAction;
import com.spotify.allboarding.model.v1.proto.NextScreen;
import com.spotify.allboarding.model.v1.proto.NextStep;
import com.spotify.allboarding.model.v1.proto.NullableString;
import com.spotify.allboarding.model.v1.proto.ScreenType;
import com.spotify.allboarding.model.v1.proto.SquircleArtist;
import com.spotify.allboarding.model.v1.proto.SquircleArtistMore;
import com.spotify.allboarding.model.v1.proto.SquircleShow;
import com.spotify.allboarding.model.v1.proto.SquircleShowMore;
import com.spotify.libs.onboarding.allboarding.room.PickerStepData;
import com.spotify.libs.onboarding.allboarding.room.a0;
import com.spotify.libs.onboarding.allboarding.room.b;
import com.spotify.libs.onboarding.allboarding.room.b0;
import com.spotify.libs.onboarding.allboarding.room.e;
import com.spotify.libs.onboarding.allboarding.room.f;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.t;
import com.spotify.libs.onboarding.allboarding.room.u;
import com.spotify.libs.onboarding.allboarding.room.z;
import defpackage.b70;
import defpackage.xv0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class c {
    public static final j a(Item item) {
        h.e(item, "item");
        Item.ItemCase l = item.l();
        if (l != null) {
            int ordinal = l.ordinal();
            if (ordinal == 0) {
                SquircleArtist m = item.m();
                h.d(m, "item.squircleArtist");
                return b(m);
            } else if (ordinal == 1) {
                SquircleArtistMore n = item.n();
                h.d(n, "item.squircleArtistMore");
                h.e(n, "squircleArtistMore");
                String q = n.q();
                h.d(q, "squircleArtistMore.uri");
                String p = n.p();
                h.d(p, "squircleArtistMore.text");
                Logging m2 = n.m();
                h.d(m2, "squircleArtistMore.logging");
                String l2 = m2.l();
                h.d(l2, "squircleArtistMore.logging.section");
                Logging m3 = n.m();
                h.d(m3, "squircleArtistMore.logging");
                String h = m3.h();
                h.d(h, "squircleArtistMore.logging.contentSource");
                f fVar = new f(l2, h);
                int l3 = n.l();
                NullableString n2 = n.n();
                h.d(n2, "squircleArtistMore.moreUrl");
                e eVar = new e(n2.i(), l3, 0, true, true, true, 0);
                String h2 = n.h();
                h.d(h2, "squircleArtistMore.color");
                return new j(q, p, null, null, fVar, null, eVar, null, null, null, null, new com.spotify.libs.onboarding.allboarding.room.c(h2), 1964);
            }
        }
        throw new AssertionError("item must by any of SQUIRCLEARTIST or SQUIRCLEARTISTMORE");
    }

    public static final j b(SquircleArtist squircleArtist) {
        h.e(squircleArtist, "squircleArtist");
        String q = squircleArtist.q();
        h.d(q, "squircleArtist.uri");
        String p = squircleArtist.p();
        h.d(p, "squircleArtist.text");
        Logging m = squircleArtist.m();
        h.d(m, "squircleArtist.logging");
        String l = m.l();
        h.d(l, "squircleArtist.logging.section");
        Logging m2 = squircleArtist.m();
        h.d(m2, "squircleArtist.logging");
        String h = m2.h();
        h.d(h, "squircleArtist.logging.contentSource");
        f fVar = new f(l, h);
        z zVar = new z(squircleArtist.o(), true, 0, 4);
        int i = squircleArtist.i();
        NullableString n = squircleArtist.n();
        h.d(n, "squircleArtist.moreUrl");
        e eVar = new e(n.i(), i, 0, true, false, false, 0);
        NullableString l2 = squircleArtist.l();
        h.d(l2, "squircleArtist.imageUrl");
        String i2 = l2.i();
        h.d(i2, "squircleArtist.imageUrl.value");
        return new j(q, p, null, null, fVar, zVar, eVar, null, null, null, new b(i2), null, 2956);
    }

    public static final List<u> c(String str, List<SquircleArtist> list) {
        h.e(str, "parentUri");
        h.e(list, "relatedItems");
        ArrayList arrayList = new ArrayList(d.e(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String q = it.next().q();
            h.d(q, "relatedItem.uri");
            arrayList.add(new u(str, q));
        }
        return arrayList;
    }

    public static final t d(j jVar) {
        h.e(jVar, "$this$asType");
        if (jVar.e() != null) {
            return t.c.a;
        }
        if (jVar.b() != null) {
            return t.a.a;
        }
        if (jVar.c() != null) {
            return t.b.a;
        }
        if (jVar.m() != null) {
            return t.d.a;
        }
        if (jVar.n() != null) {
            return t.e.a;
        }
        return t.f.a;
    }

    public static final NavController e(Fragment fragment) {
        h.e(fragment, "$this$findNavController");
        NavController K4 = NavHostFragment.K4(fragment);
        h.d(K4, "NavHostFragment.findNavController(this)");
        return K4;
    }

    public static final void f(Context context, View view) {
        h.e(context, "$this$hideSoftKeyboard");
        h.e(view, "view");
        InputMethodManager inputMethodManager = (InputMethodManager) a.f(context, InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static View g(Context context, int i, ViewGroup viewGroup, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            viewGroup = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        h.e(context, "$this$inflate");
        return LayoutInflater.from(context).inflate(i, viewGroup, z);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:27:0x00c9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.spotify.libs.onboarding.allboarding.room.u> h(java.util.List<com.spotify.allboarding.model.v1.proto.Item> r8) {
        /*
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.a
            java.lang.String r1 = "items"
            kotlin.jvm.internal.h.e(r8, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0010:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x00ef
            java.lang.Object r2 = r8.next()
            com.spotify.allboarding.model.v1.proto.Item r2 = (com.spotify.allboarding.model.v1.proto.Item) r2
            com.spotify.allboarding.model.v1.proto.Item$ItemCase r3 = r2.l()
            if (r3 == 0) goto L_0x00ce
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x00b3
            r4 = 1
            if (r3 == r4) goto L_0x008c
            r4 = 4
            if (r3 == r4) goto L_0x008a
            r4 = 5
            if (r3 != r4) goto L_0x00ce
            com.spotify.allboarding.model.v1.proto.SquircleShowMore r3 = r2.p()
            java.lang.String r4 = "parent.squircleShowMore"
            kotlin.jvm.internal.h.d(r3, r4)
            java.lang.String r3 = r3.q()
            java.lang.String r5 = "parent.squircleShowMore.uri"
            kotlin.jvm.internal.h.d(r3, r5)
            com.spotify.allboarding.model.v1.proto.SquircleShowMore r2 = r2.p()
            kotlin.jvm.internal.h.d(r2, r4)
            java.util.List r2 = r2.o()
            java.lang.String r4 = "parent.squircleShowMore.relatedItemsList"
            kotlin.jvm.internal.h.d(r2, r4)
            java.lang.String r4 = "parentUri"
            kotlin.jvm.internal.h.e(r3, r4)
            java.lang.String r4 = "relatedItems"
            kotlin.jvm.internal.h.e(r2, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.d.e(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00c9
            java.lang.Object r5 = r2.next()
            com.spotify.allboarding.model.v1.proto.SquircleShow r5 = (com.spotify.allboarding.model.v1.proto.SquircleShow) r5
            com.spotify.libs.onboarding.allboarding.room.u r6 = new com.spotify.libs.onboarding.allboarding.room.u
            java.lang.String r5 = r5.o()
            java.lang.String r7 = "relatedItem.uri"
            kotlin.jvm.internal.h.d(r5, r7)
            r6.<init>(r3, r5)
            r4.add(r6)
            goto L_0x006c
        L_0x008a:
            r4 = r0
            goto L_0x00c9
        L_0x008c:
            com.spotify.allboarding.model.v1.proto.SquircleArtistMore r3 = r2.n()
            java.lang.String r4 = "parent.squircleArtistMore"
            kotlin.jvm.internal.h.d(r3, r4)
            java.lang.String r3 = r3.q()
            java.lang.String r5 = "parent.squircleArtistMore.uri"
            kotlin.jvm.internal.h.d(r3, r5)
            com.spotify.allboarding.model.v1.proto.SquircleArtistMore r2 = r2.n()
            kotlin.jvm.internal.h.d(r2, r4)
            java.util.List r2 = r2.o()
            java.lang.String r4 = "parent.squircleArtistMore.relatedItemsList"
            kotlin.jvm.internal.h.d(r2, r4)
            java.util.List r4 = c(r3, r2)
            goto L_0x00c9
        L_0x00b3:
            com.spotify.allboarding.model.v1.proto.SquircleArtist r2 = r2.m()
            java.lang.String r3 = "parent.squircleArtist"
            kotlin.jvm.internal.h.d(r2, r3)
            java.lang.String r2 = r2.q()
            java.lang.String r3 = "parent.squircleArtist.uri"
            kotlin.jvm.internal.h.d(r2, r3)
            java.util.List r4 = c(r2, r0)
        L_0x00c9:
            kotlin.collections.d.a(r1, r4)
            goto L_0x0010
        L_0x00ce:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r0 = "item must by any of [SQUIRCLEARTIST, SQUIRCLEARTISTMORE, SQUIRCLEPILLOW, SQUIRCLEPILLOWMORE] "
            java.lang.String r1 = "but it was "
            java.lang.StringBuilder r0 = defpackage.je.Z0(r0, r1)
            com.spotify.allboarding.model.v1.proto.Item$ItemCase r1 = r2.l()
            r0.append(r1)
            java.lang.String r1 = " \n "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.onboarding.allboarding.c.h(java.util.List):java.util.List");
    }

    public static com.spotify.music.libs.viewuri.c i() {
        xv0.a aVar = xv0.a;
        com.spotify.music.libs.viewuri.c b = b70.a.c.b();
        yif.g(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public static final j j(Item item) {
        h.e(item, "item");
        Item.ItemCase l = item.l();
        if (l != null) {
            int ordinal = l.ordinal();
            if (ordinal == 4) {
                SquircleShow o = item.o();
                h.d(o, "item.squircleShow");
                return k(o);
            } else if (ordinal == 5) {
                SquircleShowMore p = item.p();
                h.d(p, "item.squircleShowMore");
                h.e(p, "squircleShowMore");
                String q = p.q();
                h.d(q, "squircleShowMore.uri");
                String p2 = p.p();
                h.d(p2, "squircleShowMore.text");
                Logging m = p.m();
                h.d(m, "squircleShowMore.logging");
                String l2 = m.l();
                h.d(l2, "squircleShowMore.logging.section");
                Logging m2 = p.m();
                h.d(m2, "squircleShowMore.logging");
                String h = m2.h();
                h.d(h, "squircleShowMore.logging.contentSource");
                f fVar = new f(l2, h);
                int l3 = p.l();
                NullableString n = p.n();
                h.d(n, "squircleShowMore.moreUrl");
                e eVar = new e(n.i(), l3, 0, true, true, true, 0);
                String h2 = p.h();
                h.d(h2, "squircleShowMore.color");
                return new j(q, p2, null, null, fVar, null, eVar, null, null, new b0(h2, false, 0), null, null, 3500);
            }
        }
        throw new AssertionError("item must by any of SQUIRCLEPILLOW or SQUIRCLEPILLOWMORE");
    }

    public static final j k(SquircleShow squircleShow) {
        h.e(squircleShow, "squircleShow");
        String o = squircleShow.o();
        h.d(o, "squircleShow.uri");
        String n = squircleShow.n();
        h.d(n, "squircleShow.text");
        Logging l = squircleShow.l();
        h.d(l, "squircleShow.logging");
        String l2 = l.l();
        h.d(l2, "squircleShow.logging.section");
        Logging l3 = squircleShow.l();
        h.d(l3, "squircleShow.logging");
        String h = l3.h();
        h.d(h, "squircleShow.logging.contentSource");
        f fVar = new f(l2, h);
        z zVar = new z(squircleShow.m(), true, 0, 4);
        NullableString i = squircleShow.i();
        h.d(i, "squircleShow.imageUrl");
        return new j(o, n, null, null, fVar, zVar, null, null, new a0(i.i()), null, null, null, 3788);
    }

    public static final PickerStepData.AllboardingScreenType l(ScreenType screenType) {
        h.e(screenType, "$this$toRoom");
        int ordinal = screenType.ordinal();
        if (ordinal == 0) {
            return PickerStepData.AllboardingScreenType.LOADING;
        }
        if (ordinal == 1) {
            return PickerStepData.AllboardingScreenType.PICKER;
        }
        if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new AssertionError("This should not happened");
    }

    public static final PickerStepData.b m(NextStep nextStep) {
        h.e(nextStep, "$this$toRoom");
        NullableString i = nextStep.i();
        h.d(i, "buttonLabel");
        String i2 = i.i();
        if (i2 == null) {
            return null;
        }
        if (!(!kotlin.text.e.n(i2))) {
            i2 = null;
        }
        if (i2 == null) {
            return null;
        }
        NextAction h = nextStep.h();
        h.d(h, "action");
        h.e(h, "$this$toRoom");
        NextAction.Type l = h.l();
        h.d(l, "type");
        h.e(l, "$this$toRoom");
        PickerStepData.NextAction.AllboardingType valueOf = PickerStepData.NextAction.AllboardingType.valueOf(l.toString());
        NullableString i3 = h.i();
        h.d(i3, "link");
        PickerStepData.NextAction nextAction = new PickerStepData.NextAction(valueOf, i3.i());
        NextScreen m = nextStep.m();
        h.d(m, "screen");
        h.e(m, "$this$toRoom");
        ScreenType l2 = m.l();
        h.d(l2, "type");
        PickerStepData.AllboardingScreenType l3 = l(l2);
        NullableString i4 = m.i();
        h.d(i4, "this.loadingText");
        PickerStepData.a aVar = new PickerStepData.a(l3, i4.i());
        NullableString i5 = nextStep.i();
        h.d(i5, "buttonLabel");
        return new PickerStepData.b(nextAction, aVar, i5.i());
    }
}
