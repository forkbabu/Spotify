package defpackage;

import android.content.res.Resources;
import com.google.common.collect.Collections2;
import com.spotify.music.C0707R;
import com.spotify.music.libs.voice.VoiceTtsOption;
import com.spotify.voice.api.model.ClientAction;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import java.util.Collections;
import java.util.Queue;

/* renamed from: tue  reason: default package */
public class tue {
    private final Resources a;
    private final String b;

    public tue(Resources resources, String str) {
        this.a = resources;
        this.b = str;
    }

    private static VoiceInteractionResponse.Action a(Resources resources) {
        return VoiceInteractionResponse.Display.create(ClientAction.DISPLAY_UI, VoiceInteractionResponse.Display.DisplayData.create(resources.getString(C0707R.string.offline_title), resources.getString(C0707R.string.offline_description), Collections.emptyList(), null));
    }

    private static VoiceInteractionResponse.SpeakTts d(String str, boolean z) {
        ClientAction clientAction = ClientAction.SPEAK_TTS;
        if (VoiceTtsOption.VOICE_ONE.i().equals(str)) {
            return VoiceInteractionResponse.SpeakTts.create(clientAction, VoiceInteractionResponse.SpeakTts.TtsData.createLocal(z ? C0707R.raw.v1_offline_has_content : C0707R.raw.v1_offline_no_content));
        }
        return VoiceInteractionResponse.SpeakTts.create(clientAction, VoiceInteractionResponse.SpeakTts.TtsData.createLocal(z ? C0707R.raw.v2_offline_has_content : C0707R.raw.v2_offline_no_content));
    }

    public Queue<VoiceInteractionResponse.Action> b() {
        return Collections2.newArrayDeque(Collections2.newArrayList(a(this.a), d(this.b, true), VoiceInteractionResponse.Navigate.create(ClientAction.NAVIGATE, VoiceInteractionResponse.Navigate.NavigationData.create("spotify:collection", null))));
    }

    public Queue<VoiceInteractionResponse.Action> c() {
        return Collections2.newArrayDeque(Collections2.newArrayList(a(this.a), d(this.b, false), VoiceInteractionResponse.Wait.create(ClientAction.WAIT, VoiceInteractionResponse.Wait.WaitData.create(VoiceInteractionResponse.a.create(3), Collections.emptyList())), VoiceInteractionResponse.DefaultAction.create(ClientAction.DISMISS_UI)));
    }
}
