package com.spotify.music.sociallistening.dialogs.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.slate.container.view.SlateView;
import com.spotify.music.slate.container.view.card.CardInteractionHandler;
import com.spotify.music.sociallistening.models.JoinType;
import com.spotify.music.sociallistening.models.Session;
import com.spotify.music.sociallistening.models.SessionMember;
import com.spotify.rxjava2.q;
import defpackage.ij9;
import io.reactivex.functions.g;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import kotlin.text.e;

public final class SocialListeningJoinConfirmationActivity extends ss2 implements a3d, c.a, mfd {
    public static final /* synthetic */ int T = 0;
    public s7d G;
    public y H;
    public w7d I;
    public f4d J;
    public u7d K;
    public cfd L;
    public x9d M;
    private final q N = new q();
    private String O;
    private JoinType P;
    private boolean Q;
    private SlateView R;
    private String S;

    static final class a implements ij9.a {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: io.reactivex.s<java.lang.Object>, io.reactivex.s<ej9> */
        @Override // defpackage.ij9.a
        public final s<ej9> a() {
            return o.a;
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ SocialListeningJoinConfirmationActivity a;

        b(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity) {
            this.a = socialListeningJoinConfirmationActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity = this.a;
            x9d x9d = socialListeningJoinConfirmationActivity.M;
            if (x9d != null) {
                x9d.c(SocialListeningJoinConfirmationActivity.W0(socialListeningJoinConfirmationActivity));
                this.a.finish();
                return;
            }
            h.k("logger");
            throw null;
        }
    }

    public static final class c implements CardInteractionHandler.b {
        final /* synthetic */ SocialListeningJoinConfirmationActivity a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity) {
            this.a = socialListeningJoinConfirmationActivity;
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void a(CardInteractionHandler.SwipeDirection swipeDirection) {
            h.e(swipeDirection, "swipeDirection");
            SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity = this.a;
            int i = SocialListeningJoinConfirmationActivity.T;
            socialListeningJoinConfirmationActivity.finish();
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void b() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void c(double d, float f, CardInteractionHandler.SwipeDirection swipeDirection) {
            h.e(swipeDirection, "swipeDirection");
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void m() {
        }

        @Override // com.spotify.music.slate.container.view.card.CardInteractionHandler.b
        public void s() {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements g<Throwable> {
        final /* synthetic */ SocialListeningJoinConfirmationActivity a;

        d(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity) {
            this.a = socialListeningJoinConfirmationActivity;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            u7d u7d = this.a.K;
            if (u7d != null) {
                u7d.i(false, new SocialListeningJoinConfirmationActivity$onResume$2$1(this));
            } else {
                h.k("socialListeningDialogs");
                throw null;
            }
        }
    }

    public static final /* synthetic */ String U0(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity) {
        String str = socialListeningJoinConfirmationActivity.S;
        if (str != null) {
            return str;
        }
        h.k("hostDisplayName");
        throw null;
    }

    public static final /* synthetic */ String W0(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity) {
        String str = socialListeningJoinConfirmationActivity.O;
        if (str != null) {
            return str;
        }
        h.k("token");
        throw null;
    }

    public static final void X0(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity, boolean z) {
        x9d x9d = socialListeningJoinConfirmationActivity.M;
        if (x9d != null) {
            String str = socialListeningJoinConfirmationActivity.O;
            if (str != null) {
                x9d.j(str);
                f4d f4d = socialListeningJoinConfirmationActivity.J;
                if (f4d != null) {
                    String str2 = socialListeningJoinConfirmationActivity.O;
                    if (str2 != null) {
                        JoinType joinType = socialListeningJoinConfirmationActivity.P;
                        if (joinType != null) {
                            f4d.l(str2, z, joinType);
                            s7d s7d = socialListeningJoinConfirmationActivity.G;
                            if (s7d != null) {
                                socialListeningJoinConfirmationActivity.startActivity(((fn4) s7d).a(socialListeningJoinConfirmationActivity));
                                socialListeningJoinConfirmationActivity.finish();
                                return;
                            }
                            h.k("devicePickerActivityIntentProvider");
                            throw null;
                        }
                        h.k("joinType");
                        throw null;
                    }
                    h.k("token");
                    throw null;
                }
                h.k("socialListening");
                throw null;
            }
            h.k("token");
            throw null;
        }
        h.k("logger");
        throw null;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0049: APUT  (r1v4 java.lang.Object[]), (0 ??[int, short, byte, char]), (r4v2 java.lang.String) */
    public static final void a1(SocialListeningJoinConfirmationActivity socialListeningJoinConfirmationActivity, Session session) {
        socialListeningJoinConfirmationActivity.getClass();
        String sessionOwnerId = session.getSessionOwnerId();
        List<SessionMember> sessionMembers = session.getSessionMembers();
        h.c(sessionMembers);
        for (SessionMember sessionMember : sessionMembers) {
            if (e.f(sessionMember.getId(), sessionOwnerId, false)) {
                String displayName = sessionMember.getDisplayName();
                h.c(displayName);
                socialListeningJoinConfirmationActivity.S = displayName;
                Context applicationContext = socialListeningJoinConfirmationActivity.getApplicationContext();
                int i = socialListeningJoinConfirmationActivity.Q ? C0707R.string.social_listening_join_confirmation_dialog_title_nearby : C0707R.string.social_listening_join_confirmation_dialog_title;
                Object[] objArr = new Object[1];
                String str = socialListeningJoinConfirmationActivity.S;
                if (str != null) {
                    objArr[0] = str;
                    String string = applicationContext.getString(i, objArr);
                    h.d(string, "applicationContext\n     …                        )");
                    SlateView slateView = socialListeningJoinConfirmationActivity.R;
                    if (slateView != null) {
                        TextView textView = (TextView) slateView.findViewById(C0707R.id.title);
                        h.d(textView, "titleTextView");
                        textView.setText(string);
                        SlateView slateView2 = socialListeningJoinConfirmationActivity.R;
                        if (slateView2 != null) {
                            slateView2.setVisibility(0);
                            return;
                        } else {
                            h.k("slateView");
                            throw null;
                        }
                    } else {
                        h.k("slateView");
                        throw null;
                    }
                } else {
                    h.k("hostDisplayName");
                    throw null;
                }
            }
        }
        u7d u7d = socialListeningJoinConfirmationActivity.K;
        if (u7d != null) {
            u7d.i(false, new SocialListeningJoinConfirmationActivity$showDialogWithSessionOwner$1(socialListeningJoinConfirmationActivity));
        } else {
            h.k("socialListeningDialogs");
            throw null;
        }
    }

    @Override // defpackage.a3d
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "parent");
        View inflate = layoutInflater.inflate(C0707R.layout.join_confirmation_dialog, viewGroup, false);
        ((Button) inflate.findViewById(C0707R.id.confirm_button)).setOnClickListener(new SocialListeningJoinConfirmationActivity$getSlateContentView$1(this));
        ((Button) inflate.findViewById(C0707R.id.cancel_button)).setOnClickListener(new b(this));
        h.d(inflate, "slateContent");
        return inflate;
    }

    @Override // defpackage.mfd
    public com.spotify.instrumentation.a g1() {
        return PageIdentifiers.SOCIAL_LISTENING_JOINCONFIRMATIONDIALOG;
    }

    @Override // com.spotify.music.libs.viewuri.c.a
    public com.spotify.music.libs.viewuri.c getViewUri() {
        com.spotify.music.libs.viewuri.c cVar = ViewUris.m2;
        h.d(cVar, "ViewUris.SOCIALSESSION_JOIN_CONFIRMATION");
        return cVar;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003e, code lost:
        if (r4 != null) goto L_0x0043;
     */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "token"
            java.lang.String r4 = r4.getStringExtra(r0)
            if (r4 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            java.lang.String r4 = ""
        L_0x0012:
            r3.O = r4
            android.content.Intent r4 = r3.getIntent()
            java.lang.String r0 = "join_type"
            java.lang.String r4 = r4.getStringExtra(r0)
            if (r4 == 0) goto L_0x0041
            java.lang.String r0 = "it"
            kotlin.jvm.internal.h.d(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.h.e(r4, r0)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r1 = "Locale.ENGLISH"
            kotlin.jvm.internal.h.d(r0, r1)
            java.lang.String r4 = r4.toUpperCase(r0)
            java.lang.String r0 = "(this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.h.d(r4, r0)
            com.spotify.music.sociallistening.models.JoinType r4 = com.spotify.music.sociallistening.models.JoinType.valueOf(r4)
            if (r4 == 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            com.spotify.music.sociallistening.models.JoinType r4 = com.spotify.music.sociallistening.models.JoinType.n
        L_0x0043:
            r3.P = r4
            android.content.Intent r4 = r3.getIntent()
            r0 = 0
            java.lang.String r1 = "nearby_session"
            boolean r4 = r4.getBooleanExtra(r1, r0)
            r3.Q = r4
            r4 = 2131624515(0x7f0e0243, float:1.8876212E38)
            r3.setContentView(r4)
            r4 = 2131431427(0x7f0b1003, float:1.8484583E38)
            android.view.View r4 = r3.findViewById(r4)
            java.lang.String r0 = "findViewById(R.id.slate_view)"
            kotlin.jvm.internal.h.d(r4, r0)
            com.spotify.music.slate.container.view.SlateView r4 = (com.spotify.music.slate.container.view.SlateView) r4
            r3.R = r4
            r0 = 0
            java.lang.String r1 = "slateView"
            if (r4 == 0) goto L_0x008e
            r4.d(r3)
            com.spotify.music.slate.container.view.SlateView r4 = r3.R
            if (r4 == 0) goto L_0x008a
            com.spotify.music.sociallistening.dialogs.impl.SocialListeningJoinConfirmationActivity$c r2 = new com.spotify.music.sociallistening.dialogs.impl.SocialListeningJoinConfirmationActivity$c
            r2.<init>(r3)
            r4.setInteractionListener(r2)
            com.spotify.music.slate.container.view.SlateView r4 = r3.R
            if (r4 == 0) goto L_0x0086
            r0 = 8
            r4.setVisibility(r0)
            return
        L_0x0086:
            kotlin.jvm.internal.h.k(r1)
            throw r0
        L_0x008a:
            kotlin.jvm.internal.h.k(r1)
            throw r0
        L_0x008e:
            kotlin.jvm.internal.h.k(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.sociallistening.dialogs.impl.SocialListeningJoinConfirmationActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.N.c();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        q qVar = this.N;
        w7d w7d = this.I;
        if (w7d != null) {
            String str = this.O;
            if (str != null) {
                z<Session> a2 = w7d.a(str);
                y yVar = this.H;
                if (yVar != null) {
                    z<Session> B = a2.B(yVar);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    y yVar2 = this.H;
                    if (yVar2 != null) {
                        qVar.a(B.J(5000, timeUnit, yVar2).subscribe(new d(new SocialListeningJoinConfirmationActivity$onResume$1(this)), new d(this)));
                    } else {
                        h.k("mainScheduler");
                        throw null;
                    }
                } else {
                    h.k("mainScheduler");
                    throw null;
                }
            } else {
                h.k("token");
                throw null;
            }
        } else {
            h.k("socialConnectEndpoint");
            throw null;
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        ij9 c2 = ij9.c(a.a);
        h.d(c2, "PageViewObservable.create { Observable.empty() }");
        return c2;
    }
}
