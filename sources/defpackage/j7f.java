package defpackage;

import com.spotify.voice.api.model.ClientAction;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.interaction.v1.InteractionResponse;
import kotlin.collections.d;

/* renamed from: j7f  reason: default package */
public class j7f implements nmf<InteractionResponse.ClientActionWithData, VoiceInteractionResponse.Action> {
    private static int a(InteractionResponse.Duration duration) {
        return (int) duration.i();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public VoiceInteractionResponse.Action invoke(InteractionResponse.ClientActionWithData clientActionWithData) {
        VoiceInteractionResponse.Earcon.EarconValue earconValue;
        VoiceInteractionResponse.Navigate.NavigationData.Target target;
        InteractionResponse.ClientActionWithData clientActionWithData2 = clientActionWithData;
        int ordinal = clientActionWithData2.h().ordinal();
        if (ordinal == 1) {
            return VoiceInteractionResponse.Play.create(ClientAction.PLAY, VoiceInteractionResponse.b.create(clientActionWithData2.p().i()));
        }
        if (ordinal == 5) {
            return VoiceInteractionResponse.SpeakTts.create(ClientAction.SPEAK_TTS, VoiceInteractionResponse.SpeakTts.TtsData.create(clientActionWithData2.r().i()));
        }
        if (ordinal == 14) {
            return VoiceInteractionResponse.ShuffleOn.create(ClientAction.SHUFFLE_ON, VoiceInteractionResponse.b.create(clientActionWithData2.p().i()));
        }
        if (ordinal == 26) {
            return VoiceInteractionResponse.Listen.create(ClientAction.LISTEN_FOR_RESPONSE, VoiceInteractionResponse.Listen.ListenData.create(VoiceInteractionResponse.a.create(a(clientActionWithData2.n().i()))));
        }
        if (ordinal == 35) {
            return VoiceInteractionResponse.Generic.create(ClientAction.GENERIC, VoiceInteractionResponse.Generic.GenericData.create(clientActionWithData2.m().h(), clientActionWithData2.m().i()));
        }
        switch (ordinal) {
            case 28:
                ClientAction clientAction = ClientAction.EARCON;
                int ordinal2 = clientActionWithData2.l().i().ordinal();
                if (ordinal2 == 1) {
                    earconValue = VoiceInteractionResponse.Earcon.EarconValue.SUCCESS;
                } else if (ordinal2 == 2) {
                    earconValue = VoiceInteractionResponse.Earcon.EarconValue.FAILURE;
                } else if (ordinal2 != 3) {
                    earconValue = VoiceInteractionResponse.Earcon.EarconValue.UNKNOWN;
                } else {
                    earconValue = VoiceInteractionResponse.Earcon.EarconValue.CONFIRMATION;
                }
                return VoiceInteractionResponse.Earcon.create(clientAction, VoiceInteractionResponse.Earcon.EarconData.create(earconValue));
            case 29:
                return VoiceInteractionResponse.Preview.create(ClientAction.PLAY_PREVIEW, VoiceInteractionResponse.Preview.PreviewData.create(d.v(clientActionWithData2.q().h(), b3f.a), VoiceInteractionResponse.a.create(a(clientActionWithData2.q().l()))));
            case 30:
                return VoiceInteractionResponse.Wait.create(ClientAction.WAIT, VoiceInteractionResponse.Wait.WaitData.create(VoiceInteractionResponse.a.create(a(clientActionWithData2.t().l())), clientActionWithData2.t().i()));
            case 31:
                ClientAction clientAction2 = ClientAction.NAVIGATE;
                String l = clientActionWithData2.o().l();
                if (clientActionWithData2.o().i() == InteractionResponse.NavigationTarget.Target.NOW_PLAYING_VIEW) {
                    target = VoiceInteractionResponse.Navigate.NavigationData.Target.NOW_PLAYING_VIEW;
                } else {
                    target = VoiceInteractionResponse.Navigate.NavigationData.Target.UNKNOWN;
                }
                return VoiceInteractionResponse.Navigate.create(clientAction2, VoiceInteractionResponse.Navigate.NavigationData.create(l, target));
            case 32:
                return VoiceInteractionResponse.Display.create(ClientAction.DISPLAY_UI, VoiceInteractionResponse.Display.DisplayData.create(clientActionWithData2.s().m(), clientActionWithData2.s().l(), d.v(clientActionWithData2.s().i(), c3f.a), null));
            default:
                return VoiceInteractionResponse.DefaultAction.create(ClientAction.forValue(clientActionWithData2.h().name()));
        }
    }
}
