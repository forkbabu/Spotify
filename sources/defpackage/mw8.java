package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.spotify.android.flags.c;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import com.spotify.music.sociallistening.participantlist.impl.m;
import com.spotify.voice.results.impl.VoiceResultsFragment;

/* renamed from: mw8  reason: default package */
final class mw8 implements blb {

    /* renamed from: mw8$a */
    class a implements k {

        /* renamed from: mw8$a$a  reason: collision with other inner class name */
        class C0640a implements s {
            C0640a(a aVar) {
            }

            @Override // com.spotify.mobile.android.ui.fragments.s
            public String D0(Context context) {
                return "";
            }

            @Override // com.spotify.mobile.android.ui.fragments.s
            public Fragment e() {
                VoiceResultsFragment voiceResultsFragment = new VoiceResultsFragment();
                m.d(voiceResultsFragment, yn0.a(kfd.C1));
                return voiceResultsFragment;
            }

            @Override // com.spotify.mobile.android.ui.fragments.s
            public String i0() {
                return "spotify:voice-results";
            }

            @Override // defpackage.ij9.b
            public ij9 u0() {
                return ij9.b(PageIdentifiers.VOICE_ALTERNATIVESEARCHRESULTS, null);
            }

            @Override // defpackage.ifd.b
            public ifd z1() {
                return kfd.C1;
            }
        }

        a(mw8 mw8) {
        }

        @Override // com.spotify.music.navigation.k
        public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            return new C0640a(this);
        }
    }

    mw8() {
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        xkb xkb = (xkb) glb;
        xkb.i(LinkType.VOICE_RESULTS, "voice results", new a(this));
    }
}
