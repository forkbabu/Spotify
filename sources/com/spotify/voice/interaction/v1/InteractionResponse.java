package com.spotify.voice.interaction.v1;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.WireFormat;
import com.google.protobuf.g;
import com.google.protobuf.k;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.google.protobuf.u;
import com.google.protobuf.x;
import com.spotify.metadata.voice.proto.Metadata$AudioFile;
import com.spotify.nlu.nlusearchapi.v1.FulfillmentAction;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class InteractionResponse extends GeneratedMessageLite<InteractionResponse, b> implements Object {
    private static final InteractionResponse o;
    private static volatile x<InteractionResponse> p;
    private int a;
    private String b = "";
    private o.i<ClientActionWithData> c = GeneratedMessageLite.emptyProtobufList();
    private int f;
    private String n = "";

    public enum ClientAction implements o.c {
        UNKNOWN(0),
        PLAY(1),
        RESUME(2),
        STOP(3),
        SHOW(4),
        SPEAK_TTS(5),
        NO_OP(6),
        SKIP_FORWARD(7),
        SKIP_BACKWARD(8),
        SEEK_FORWARD(9),
        SEEK_BACKWARD(10),
        REPEAT_ONE(11),
        REPEAT_CONTEXT(12),
        REPEAT_OFF(13),
        SHUFFLE_ON(14),
        SHUFFLE_OFF(15),
        CHANGE_PLAYBACK_SPEED(16),
        VOLUME_UP(17),
        VOLUME_DOWN(18),
        VOLUME_ABSOLUTE(19),
        MUTE(20),
        UNMUTE(21),
        SLEEP_TIMER(22),
        RESTART_ONE(23),
        RESTART_CONTEXT(24),
        MUTE_MIC(25),
        LISTEN_FOR_RESPONSE(26),
        END_INTERACTION(27),
        EARCON(28),
        PLAY_PREVIEW(29),
        WAIT(30),
        NAVIGATE(31),
        DISPLAY_UI(32),
        DISMISS_UI(33),
        LIKE(34),
        GENERIC(35),
        DISPLAY_SUGGESTIONS(36),
        UNRECOGNIZED(-1);
        
        private final int value;

        private ClientAction(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.o.c
        public final int getNumber() {
            return this.value;
        }
    }

    public static final class ClientActionWithData extends GeneratedMessageLite<ClientActionWithData, a> implements Object {
        private static final ClientActionWithData f;
        private static volatile x<ClientActionWithData> n;
        private int a = 0;
        private Object b;
        private int c;

        public enum ArgsCase implements o.c {
            TTS(2),
            SPEECH_CONTEXT(3),
            PREVIEW(4),
            PLAY_CONTEXT(5),
            UI(6),
            NAVIGATION_TARGET(7),
            EARCON_DATA(8),
            SEEK_DATA(9),
            WAIT_DATA(10),
            LISTEN_DATA(11),
            GENERIC_DATA(12),
            DISPLAY_DATA(13),
            ARGS_NOT_SET(0);
            
            private final int value;

            private ArgsCase(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<ClientActionWithData, a> implements Object {
            private a() {
                super(ClientActionWithData.f);
            }
        }

        static {
            ClientActionWithData clientActionWithData = new ClientActionWithData();
            f = clientActionWithData;
            clientActionWithData.makeImmutable();
        }

        private ClientActionWithData() {
        }

        public static x<ClientActionWithData> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    ClientActionWithData clientActionWithData = (ClientActionWithData) obj2;
                    int i2 = this.c;
                    boolean z = i2 != 0;
                    int i3 = clientActionWithData.c;
                    this.c = hVar.m(z, i2, i3 != 0, i3);
                    switch (clientActionWithData.i().ordinal()) {
                        case 0:
                            this.b = hVar.u(this.a == 2, this.b, clientActionWithData.b);
                            break;
                        case 1:
                            this.b = hVar.u(this.a == 3, this.b, clientActionWithData.b);
                            break;
                        case 2:
                            this.b = hVar.u(this.a == 4, this.b, clientActionWithData.b);
                            break;
                        case 3:
                            this.b = hVar.u(this.a == 5, this.b, clientActionWithData.b);
                            break;
                        case 4:
                            this.b = hVar.u(this.a == 6, this.b, clientActionWithData.b);
                            break;
                        case 5:
                            this.b = hVar.u(this.a == 7, this.b, clientActionWithData.b);
                            break;
                        case 6:
                            this.b = hVar.u(this.a == 8, this.b, clientActionWithData.b);
                            break;
                        case 7:
                            this.b = hVar.u(this.a == 9, this.b, clientActionWithData.b);
                            break;
                        case 8:
                            this.b = hVar.u(this.a == 10, this.b, clientActionWithData.b);
                            break;
                        case 9:
                            this.b = hVar.u(this.a == 11, this.b, clientActionWithData.b);
                            break;
                        case 10:
                            this.b = hVar.u(this.a == 12, this.b, clientActionWithData.b);
                            break;
                        case 11:
                            this.b = hVar.u(this.a == 13, this.b, clientActionWithData.b);
                            break;
                        case 12:
                            hVar.b(this.a != 0);
                            break;
                    }
                    if (hVar == GeneratedMessageLite.g.a && (i = clientActionWithData.a) != 0) {
                        this.a = i;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z2 = false;
                    while (!z2) {
                        try {
                            int B = gVar.B();
                            switch (B) {
                                case 0:
                                    break;
                                case 8:
                                    this.c = gVar.u();
                                    continue;
                                case 18:
                                    TtsPrompt.a aVar = this.a == 2 ? (TtsPrompt.a) ((TtsPrompt) this.b).toBuilder() : null;
                                    u o = gVar.o(TtsPrompt.parser(), kVar);
                                    this.b = o;
                                    if (aVar != null) {
                                        aVar.mergeFrom((TtsPrompt.a) ((TtsPrompt) o));
                                        this.b = aVar.buildPartial();
                                    }
                                    this.a = 2;
                                    continue;
                                case 26:
                                    SpeechContext.a aVar2 = this.a == 3 ? (SpeechContext.a) ((SpeechContext) this.b).toBuilder() : null;
                                    u o2 = gVar.o(SpeechContext.parser(), kVar);
                                    this.b = o2;
                                    if (aVar2 != null) {
                                        aVar2.mergeFrom((SpeechContext.a) ((SpeechContext) o2));
                                        this.b = aVar2.buildPartial();
                                    }
                                    this.a = 3;
                                    continue;
                                case 34:
                                    Preview.a aVar3 = this.a == 4 ? (Preview.a) ((Preview) this.b).toBuilder() : null;
                                    u o3 = gVar.o(Preview.parser(), kVar);
                                    this.b = o3;
                                    if (aVar3 != null) {
                                        aVar3.mergeFrom((Preview.a) ((Preview) o3));
                                        this.b = aVar3.buildPartial();
                                    }
                                    this.a = 4;
                                    continue;
                                case 42:
                                    PlayContext.a aVar4 = this.a == 5 ? (PlayContext.a) ((PlayContext) this.b).toBuilder() : null;
                                    u o4 = gVar.o(PlayContext.parser(), kVar);
                                    this.b = o4;
                                    if (aVar4 != null) {
                                        aVar4.mergeFrom((PlayContext.a) ((PlayContext) o4));
                                        this.b = aVar4.buildPartial();
                                    }
                                    this.a = 5;
                                    continue;
                                case 50:
                                    Ui.a aVar5 = this.a == 6 ? (Ui.a) ((Ui) this.b).toBuilder() : null;
                                    u o5 = gVar.o(Ui.parser(), kVar);
                                    this.b = o5;
                                    if (aVar5 != null) {
                                        aVar5.mergeFrom((Ui.a) ((Ui) o5));
                                        this.b = aVar5.buildPartial();
                                    }
                                    this.a = 6;
                                    continue;
                                case 58:
                                    NavigationTarget.a aVar6 = this.a == 7 ? (NavigationTarget.a) ((NavigationTarget) this.b).toBuilder() : null;
                                    u o6 = gVar.o(NavigationTarget.parser(), kVar);
                                    this.b = o6;
                                    if (aVar6 != null) {
                                        aVar6.mergeFrom((NavigationTarget.a) ((NavigationTarget) o6));
                                        this.b = aVar6.buildPartial();
                                    }
                                    this.a = 7;
                                    continue;
                                case 66:
                                    EarconData.a aVar7 = this.a == 8 ? (EarconData.a) ((EarconData) this.b).toBuilder() : null;
                                    u o7 = gVar.o(EarconData.parser(), kVar);
                                    this.b = o7;
                                    if (aVar7 != null) {
                                        aVar7.mergeFrom((EarconData.a) ((EarconData) o7));
                                        this.b = aVar7.buildPartial();
                                    }
                                    this.a = 8;
                                    continue;
                                case 74:
                                    SeekData.a aVar8 = this.a == 9 ? (SeekData.a) ((SeekData) this.b).toBuilder() : null;
                                    u o8 = gVar.o(SeekData.parser(), kVar);
                                    this.b = o8;
                                    if (aVar8 != null) {
                                        aVar8.mergeFrom((SeekData.a) ((SeekData) o8));
                                        this.b = aVar8.buildPartial();
                                    }
                                    this.a = 9;
                                    continue;
                                case 82:
                                    WaitData.a aVar9 = this.a == 10 ? (WaitData.a) ((WaitData) this.b).toBuilder() : null;
                                    u o9 = gVar.o(WaitData.parser(), kVar);
                                    this.b = o9;
                                    if (aVar9 != null) {
                                        aVar9.mergeFrom((WaitData.a) ((WaitData) o9));
                                        this.b = aVar9.buildPartial();
                                    }
                                    this.a = 10;
                                    continue;
                                case 90:
                                    ListenData.a aVar10 = this.a == 11 ? (ListenData.a) ((ListenData) this.b).toBuilder() : null;
                                    u o10 = gVar.o(ListenData.parser(), kVar);
                                    this.b = o10;
                                    if (aVar10 != null) {
                                        aVar10.mergeFrom((ListenData.a) ((ListenData) o10));
                                        this.b = aVar10.buildPartial();
                                    }
                                    this.a = 11;
                                    continue;
                                case 98:
                                    GenericData.a aVar11 = this.a == 12 ? (GenericData.a) ((GenericData) this.b).toBuilder() : null;
                                    u o11 = gVar.o(GenericData.parser(), kVar);
                                    this.b = o11;
                                    if (aVar11 != null) {
                                        aVar11.mergeFrom((GenericData.a) ((GenericData) o11));
                                        this.b = aVar11.buildPartial();
                                    }
                                    this.a = 12;
                                    continue;
                                case 106:
                                    DisplayData.a aVar12 = this.a == 13 ? (DisplayData.a) ((DisplayData) this.b).toBuilder() : null;
                                    u o12 = gVar.o(DisplayData.parser(), kVar);
                                    this.b = o12;
                                    if (aVar12 != null) {
                                        aVar12.mergeFrom((DisplayData.a) ((DisplayData) o12));
                                        this.b = aVar12.buildPartial();
                                    }
                                    this.a = 13;
                                    continue;
                                default:
                                    if (gVar.F(B)) {
                                        continue;
                                    }
                                    break;
                            }
                            z2 = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new ClientActionWithData();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (ClientActionWithData.class) {
                            if (n == null) {
                                n = new GeneratedMessageLite.c(f);
                            }
                        }
                    }
                    return n;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.c != ClientAction.UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.h(1, this.c);
            }
            if (this.a == 2) {
                i2 += CodedOutputStream.n(2, (TtsPrompt) this.b);
            }
            if (this.a == 3) {
                i2 += CodedOutputStream.n(3, (SpeechContext) this.b);
            }
            if (this.a == 4) {
                i2 += CodedOutputStream.n(4, (Preview) this.b);
            }
            if (this.a == 5) {
                i2 += CodedOutputStream.n(5, (PlayContext) this.b);
            }
            if (this.a == 6) {
                i2 += CodedOutputStream.n(6, (Ui) this.b);
            }
            if (this.a == 7) {
                i2 += CodedOutputStream.n(7, (NavigationTarget) this.b);
            }
            if (this.a == 8) {
                i2 += CodedOutputStream.n(8, (EarconData) this.b);
            }
            if (this.a == 9) {
                i2 += CodedOutputStream.n(9, (SeekData) this.b);
            }
            if (this.a == 10) {
                i2 += CodedOutputStream.n(10, (WaitData) this.b);
            }
            if (this.a == 11) {
                i2 += CodedOutputStream.n(11, (ListenData) this.b);
            }
            if (this.a == 12) {
                i2 += CodedOutputStream.n(12, (GenericData) this.b);
            }
            if (this.a == 13) {
                i2 += CodedOutputStream.n(13, (DisplayData) this.b);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public ClientAction h() {
            ClientAction clientAction;
            switch (this.c) {
                case 0:
                    clientAction = ClientAction.UNKNOWN;
                    break;
                case 1:
                    clientAction = ClientAction.PLAY;
                    break;
                case 2:
                    clientAction = ClientAction.RESUME;
                    break;
                case 3:
                    clientAction = ClientAction.STOP;
                    break;
                case 4:
                    clientAction = ClientAction.SHOW;
                    break;
                case 5:
                    clientAction = ClientAction.SPEAK_TTS;
                    break;
                case 6:
                    clientAction = ClientAction.NO_OP;
                    break;
                case 7:
                    clientAction = ClientAction.SKIP_FORWARD;
                    break;
                case 8:
                    clientAction = ClientAction.SKIP_BACKWARD;
                    break;
                case 9:
                    clientAction = ClientAction.SEEK_FORWARD;
                    break;
                case 10:
                    clientAction = ClientAction.SEEK_BACKWARD;
                    break;
                case 11:
                    clientAction = ClientAction.REPEAT_ONE;
                    break;
                case 12:
                    clientAction = ClientAction.REPEAT_CONTEXT;
                    break;
                case 13:
                    clientAction = ClientAction.REPEAT_OFF;
                    break;
                case 14:
                    clientAction = ClientAction.SHUFFLE_ON;
                    break;
                case 15:
                    clientAction = ClientAction.SHUFFLE_OFF;
                    break;
                case 16:
                    clientAction = ClientAction.CHANGE_PLAYBACK_SPEED;
                    break;
                case 17:
                    clientAction = ClientAction.VOLUME_UP;
                    break;
                case 18:
                    clientAction = ClientAction.VOLUME_DOWN;
                    break;
                case 19:
                    clientAction = ClientAction.VOLUME_ABSOLUTE;
                    break;
                case 20:
                    clientAction = ClientAction.MUTE;
                    break;
                case 21:
                    clientAction = ClientAction.UNMUTE;
                    break;
                case 22:
                    clientAction = ClientAction.SLEEP_TIMER;
                    break;
                case 23:
                    clientAction = ClientAction.RESTART_ONE;
                    break;
                case 24:
                    clientAction = ClientAction.RESTART_CONTEXT;
                    break;
                case 25:
                    clientAction = ClientAction.MUTE_MIC;
                    break;
                case 26:
                    clientAction = ClientAction.LISTEN_FOR_RESPONSE;
                    break;
                case 27:
                    clientAction = ClientAction.END_INTERACTION;
                    break;
                case 28:
                    clientAction = ClientAction.EARCON;
                    break;
                case 29:
                    clientAction = ClientAction.PLAY_PREVIEW;
                    break;
                case 30:
                    clientAction = ClientAction.WAIT;
                    break;
                case 31:
                    clientAction = ClientAction.NAVIGATE;
                    break;
                case 32:
                    clientAction = ClientAction.DISPLAY_UI;
                    break;
                case 33:
                    clientAction = ClientAction.DISMISS_UI;
                    break;
                case 34:
                    clientAction = ClientAction.LIKE;
                    break;
                case 35:
                    clientAction = ClientAction.GENERIC;
                    break;
                case 36:
                    clientAction = ClientAction.DISPLAY_SUGGESTIONS;
                    break;
                default:
                    clientAction = null;
                    break;
            }
            return clientAction == null ? ClientAction.UNRECOGNIZED : clientAction;
        }

        public ArgsCase i() {
            int i = this.a;
            if (i == 0) {
                return ArgsCase.ARGS_NOT_SET;
            }
            switch (i) {
                case 2:
                    return ArgsCase.TTS;
                case 3:
                    return ArgsCase.SPEECH_CONTEXT;
                case 4:
                    return ArgsCase.PREVIEW;
                case 5:
                    return ArgsCase.PLAY_CONTEXT;
                case 6:
                    return ArgsCase.UI;
                case 7:
                    return ArgsCase.NAVIGATION_TARGET;
                case 8:
                    return ArgsCase.EARCON_DATA;
                case 9:
                    return ArgsCase.SEEK_DATA;
                case 10:
                    return ArgsCase.WAIT_DATA;
                case 11:
                    return ArgsCase.LISTEN_DATA;
                case 12:
                    return ArgsCase.GENERIC_DATA;
                case 13:
                    return ArgsCase.DISPLAY_DATA;
                default:
                    return null;
            }
        }

        public EarconData l() {
            if (this.a == 8) {
                return (EarconData) this.b;
            }
            return EarconData.h();
        }

        public GenericData m() {
            if (this.a == 12) {
                return (GenericData) this.b;
            }
            return GenericData.l();
        }

        public ListenData n() {
            if (this.a == 11) {
                return (ListenData) this.b;
            }
            return ListenData.h();
        }

        public NavigationTarget o() {
            if (this.a == 7) {
                return (NavigationTarget) this.b;
            }
            return NavigationTarget.h();
        }

        public PlayContext p() {
            if (this.a == 5) {
                return (PlayContext) this.b;
            }
            return PlayContext.h();
        }

        public Preview q() {
            if (this.a == 4) {
                return (Preview) this.b;
            }
            return Preview.i();
        }

        public TtsPrompt r() {
            if (this.a == 2) {
                return (TtsPrompt) this.b;
            }
            return TtsPrompt.h();
        }

        public Ui s() {
            if (this.a == 6) {
                return (Ui) this.b;
            }
            return Ui.h();
        }

        public WaitData t() {
            if (this.a == 10) {
                return (WaitData) this.b;
            }
            return WaitData.h();
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.c != ClientAction.UNKNOWN.getNumber()) {
                codedOutputStream.K(1, this.c);
            }
            if (this.a == 2) {
                codedOutputStream.M(2, (TtsPrompt) this.b);
            }
            if (this.a == 3) {
                codedOutputStream.M(3, (SpeechContext) this.b);
            }
            if (this.a == 4) {
                codedOutputStream.M(4, (Preview) this.b);
            }
            if (this.a == 5) {
                codedOutputStream.M(5, (PlayContext) this.b);
            }
            if (this.a == 6) {
                codedOutputStream.M(6, (Ui) this.b);
            }
            if (this.a == 7) {
                codedOutputStream.M(7, (NavigationTarget) this.b);
            }
            if (this.a == 8) {
                codedOutputStream.M(8, (EarconData) this.b);
            }
            if (this.a == 9) {
                codedOutputStream.M(9, (SeekData) this.b);
            }
            if (this.a == 10) {
                codedOutputStream.M(10, (WaitData) this.b);
            }
            if (this.a == 11) {
                codedOutputStream.M(11, (ListenData) this.b);
            }
            if (this.a == 12) {
                codedOutputStream.M(12, (GenericData) this.b);
            }
            if (this.a == 13) {
                codedOutputStream.M(13, (DisplayData) this.b);
            }
        }
    }

    public static final class DisplayData extends GeneratedMessageLite<DisplayData, a> implements Object {
        private static final DisplayData f;
        private static volatile x<DisplayData> n;
        private int a;
        private Duration b;
        private o.i<String> c = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.b<DisplayData, a> implements Object {
            private a() {
                super(DisplayData.f);
            }
        }

        static {
            DisplayData displayData = new DisplayData();
            f = displayData;
            displayData.makeImmutable();
        }

        private DisplayData() {
        }

        public static x<DisplayData> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    DisplayData displayData = (DisplayData) obj2;
                    this.b = (Duration) hVar.i(this.b, displayData.b);
                    this.c = hVar.q(this.c, displayData.c);
                    if (hVar == GeneratedMessageLite.g.a) {
                        this.a |= displayData.a;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    Duration duration = this.b;
                                    Duration.a aVar = duration != null ? (Duration.a) duration.toBuilder() : null;
                                    Duration duration2 = (Duration) gVar.o(Duration.parser(), kVar);
                                    this.b = duration2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((Duration.a) duration2);
                                        this.b = (Duration) aVar.buildPartial();
                                    }
                                } else if (B == 18) {
                                    String A = gVar.A();
                                    if (!this.c.R0()) {
                                        this.c = GeneratedMessageLite.mutableCopy(this.c);
                                    }
                                    this.c.add(A);
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    this.c.C();
                    return null;
                case 4:
                    return new DisplayData();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (DisplayData.class) {
                            if (n == null) {
                                n = new GeneratedMessageLite.c(f);
                            }
                        }
                    }
                    return n;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            Duration duration = this.b;
            int n2 = duration != null ? CodedOutputStream.n(1, duration) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.c.size(); i3++) {
                i2 += CodedOutputStream.q(this.c.get(i3));
            }
            int C0 = je.C0(this.c, 1, n2 + i2);
            this.memoizedSerializedSize = C0;
            return C0;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            Duration duration = this.b;
            if (duration != null) {
                codedOutputStream.M(1, duration);
            }
            for (int i = 0; i < this.c.size(); i++) {
                codedOutputStream.P(2, this.c.get(i));
            }
        }
    }

    public static final class Duration extends GeneratedMessageLite<Duration, a> implements Object {
        private static final Duration c;
        private static volatile x<Duration> f;
        private long a;
        private int b;

        public static final class a extends GeneratedMessageLite.b<Duration, a> implements Object {
            private a() {
                super(Duration.c);
            }
        }

        static {
            Duration duration = new Duration();
            c = duration;
            duration.makeImmutable();
        }

        private Duration() {
        }

        public static Duration h() {
            return c;
        }

        public static x<Duration> parser() {
            return c.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return c;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Duration duration = (Duration) obj2;
                    long j = this.a;
                    boolean z2 = j != 0;
                    long j2 = duration.a;
                    this.a = hVar.s(z2, j, j2 != 0, j2);
                    int i = this.b;
                    boolean z3 = i != 0;
                    int i2 = duration.b;
                    if (i2 != 0) {
                        z = true;
                    }
                    this.b = hVar.m(z3, i, z, i2);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 8) {
                                    this.a = gVar.w();
                                } else if (B == 16) {
                                    this.b = gVar.u();
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new Duration();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (Duration.class) {
                            if (f == null) {
                                f = new GeneratedMessageLite.c(c);
                            }
                        }
                    }
                    return f;
                default:
                    throw new UnsupportedOperationException();
            }
            return c;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            long j = this.a;
            if (j != 0) {
                i2 = 0 + CodedOutputStream.l(1, j);
            }
            int i3 = this.b;
            if (i3 != 0) {
                i2 += CodedOutputStream.j(2, i3);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public long i() {
            return this.a;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            long j = this.a;
            if (j != 0) {
                codedOutputStream.U(1, j);
            }
            int i = this.b;
            if (i != 0) {
                codedOutputStream.K(2, i);
            }
        }
    }

    public static final class EarconData extends GeneratedMessageLite<EarconData, a> implements Object {
        private static final EarconData b;
        private static volatile x<EarconData> c;
        private int a;

        public enum Earcon implements o.c {
            UNKNOWN(0),
            SUCCESS(1),
            FAILURE(2),
            CONFIRMATION(3),
            UNRECOGNIZED(-1);
            
            private final int value;

            private Earcon(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public final int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<EarconData, a> implements Object {
            private a() {
                super(EarconData.b);
            }
        }

        static {
            EarconData earconData = new EarconData();
            b = earconData;
            earconData.makeImmutable();
        }

        private EarconData() {
        }

        public static EarconData h() {
            return b;
        }

        public static x<EarconData> parser() {
            return b.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return b;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    EarconData earconData = (EarconData) obj2;
                    int i = this.a;
                    boolean z2 = i != 0;
                    int i2 = earconData.a;
                    if (i2 != 0) {
                        z = true;
                    }
                    this.a = hVar.m(z2, i, z, i2);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 8) {
                                    this.a = gVar.u();
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new EarconData();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (EarconData.class) {
                            if (c == null) {
                                c = new GeneratedMessageLite.c(b);
                            }
                        }
                    }
                    return c;
                default:
                    throw new UnsupportedOperationException();
            }
            return b;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.a != Earcon.UNKNOWN.getNumber()) {
                i2 = 0 + CodedOutputStream.h(1, this.a);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Earcon i() {
            Earcon earcon;
            int i = this.a;
            if (i == 0) {
                earcon = Earcon.UNKNOWN;
            } else if (i == 1) {
                earcon = Earcon.SUCCESS;
            } else if (i == 2) {
                earcon = Earcon.FAILURE;
            } else if (i != 3) {
                earcon = null;
            } else {
                earcon = Earcon.CONFIRMATION;
            }
            return earcon == null ? Earcon.UNRECOGNIZED : earcon;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a != Earcon.UNKNOWN.getNumber()) {
                codedOutputStream.K(1, this.a);
            }
        }
    }

    public static final class GenericData extends GeneratedMessageLite<GenericData, a> implements Object {
        private static final GenericData f;
        private static volatile x<GenericData> n;
        private int a;
        private String b = "";
        private MapFieldLite<String, String> c = MapFieldLite.d();

        public static final class a extends GeneratedMessageLite.b<GenericData, a> implements Object {
            private a() {
                super(GenericData.f);
            }
        }

        private static final class b {
            static final t<String, String> a;

            static {
                WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
                a = t.b(fieldType, "", fieldType, "");
            }
        }

        static {
            GenericData genericData = new GenericData();
            f = genericData;
            genericData.makeImmutable();
        }

        private GenericData() {
        }

        public static GenericData l() {
            return f;
        }

        public static x<GenericData> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    GenericData genericData = (GenericData) obj2;
                    this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ genericData.b.isEmpty(), genericData.b);
                    this.c = hVar.c(this.c, genericData.c);
                    if (hVar == GeneratedMessageLite.g.a) {
                        this.a |= genericData.a;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    this.b = gVar.A();
                                } else if (B == 18) {
                                    if (!this.c.f()) {
                                        this.c = this.c.k();
                                    }
                                    b.a.d(this.c, gVar, kVar);
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    this.c.g();
                    return null;
                case 4:
                    return new GenericData();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (GenericData.class) {
                            if (n == null) {
                                n = new GeneratedMessageLite.c(f);
                            }
                        }
                    }
                    return n;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.b.isEmpty()) {
                i2 = 0 + CodedOutputStream.p(1, this.b);
            }
            for (Map.Entry<String, String> entry : this.c.entrySet()) {
                i2 = je.j1(entry, b.a, 2, entry.getKey(), i2);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String h() {
            return this.b;
        }

        public Map<String, String> i() {
            return Collections.unmodifiableMap(this.c);
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.b.isEmpty()) {
                codedOutputStream.P(1, this.b);
            }
            for (Map.Entry<String, String> entry : this.c.entrySet()) {
                b.a.e(codedOutputStream, 2, entry.getKey(), entry.getValue());
            }
        }
    }

    public static final class ListenData extends GeneratedMessageLite<ListenData, a> implements Object {
        private static final ListenData b;
        private static volatile x<ListenData> c;
        private Duration a;

        public static final class a extends GeneratedMessageLite.b<ListenData, a> implements Object {
            private a() {
                super(ListenData.b);
            }
        }

        static {
            ListenData listenData = new ListenData();
            b = listenData;
            listenData.makeImmutable();
        }

        private ListenData() {
        }

        public static ListenData h() {
            return b;
        }

        public static x<ListenData> parser() {
            return b.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return b;
                case 1:
                    this.a = (Duration) ((GeneratedMessageLite.h) obj).i(this.a, ((ListenData) obj2).a);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    Duration duration = this.a;
                                    Duration.a aVar = duration != null ? (Duration.a) duration.toBuilder() : null;
                                    Duration duration2 = (Duration) gVar.o(Duration.parser(), kVar);
                                    this.a = duration2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((Duration.a) duration2);
                                        this.a = (Duration) aVar.buildPartial();
                                    }
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new ListenData();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (ListenData.class) {
                            if (c == null) {
                                c = new GeneratedMessageLite.c(b);
                            }
                        }
                    }
                    return c;
                default:
                    throw new UnsupportedOperationException();
            }
            return b;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (this.a != null) {
                i2 = 0 + CodedOutputStream.n(1, i());
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Duration i() {
            Duration duration = this.a;
            return duration == null ? Duration.h() : duration;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.a != null) {
                codedOutputStream.M(1, i());
            }
        }
    }

    public static final class NavigationTarget extends GeneratedMessageLite<NavigationTarget, a> implements Object {
        private static final NavigationTarget c;
        private static volatile x<NavigationTarget> f;
        private String a = "";
        private int b;

        public enum Target implements o.c {
            ENTITY(0),
            NOW_PLAYING_VIEW(1),
            UNRECOGNIZED(-1);
            
            private final int value;

            private Target(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public final int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<NavigationTarget, a> implements Object {
            private a() {
                super(NavigationTarget.c);
            }
        }

        static {
            NavigationTarget navigationTarget = new NavigationTarget();
            c = navigationTarget;
            navigationTarget.makeImmutable();
        }

        private NavigationTarget() {
        }

        public static NavigationTarget h() {
            return c;
        }

        public static x<NavigationTarget> parser() {
            return c.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            boolean z = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return c;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    NavigationTarget navigationTarget = (NavigationTarget) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, !navigationTarget.a.isEmpty(), navigationTarget.a);
                    int i = this.b;
                    boolean z2 = i != 0;
                    int i2 = navigationTarget.b;
                    if (i2 != 0) {
                        z = true;
                    }
                    this.b = hVar.m(z2, i, z, i2);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    this.a = gVar.A();
                                } else if (B == 16) {
                                    this.b = gVar.u();
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new NavigationTarget();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (f == null) {
                        synchronized (NavigationTarget.class) {
                            if (f == null) {
                                f = new GeneratedMessageLite.c(c);
                            }
                        }
                    }
                    return f;
                default:
                    throw new UnsupportedOperationException();
            }
            return c;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.a.isEmpty()) {
                i2 = 0 + CodedOutputStream.p(1, this.a);
            }
            if (this.b != Target.ENTITY.getNumber()) {
                i2 += CodedOutputStream.h(2, this.b);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public Target i() {
            Target target;
            int i = this.b;
            if (i == 0) {
                target = Target.ENTITY;
            } else if (i != 1) {
                target = null;
            } else {
                target = Target.NOW_PLAYING_VIEW;
            }
            return target == null ? Target.UNRECOGNIZED : target;
        }

        public String l() {
            return this.a;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
            if (this.b != Target.ENTITY.getNumber()) {
                codedOutputStream.K(2, this.b);
            }
        }
    }

    public static final class PlayContext extends GeneratedMessageLite<PlayContext, a> implements Object {
        private static final PlayContext f;
        private static volatile x<PlayContext> n;
        private int a;
        private String b = "";
        private o.i<String> c = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.b<PlayContext, a> implements Object {
            private a() {
                super(PlayContext.f);
            }
        }

        static {
            PlayContext playContext = new PlayContext();
            f = playContext;
            playContext.makeImmutable();
        }

        private PlayContext() {
        }

        public static PlayContext h() {
            return f;
        }

        public static x<PlayContext> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    PlayContext playContext = (PlayContext) obj2;
                    this.b = hVar.n(!this.b.isEmpty(), this.b, true ^ playContext.b.isEmpty(), playContext.b);
                    this.c = hVar.q(this.c, playContext.c);
                    if (hVar == GeneratedMessageLite.g.a) {
                        this.a |= playContext.a;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    this.b = gVar.A();
                                } else if (B == 18) {
                                    String A = gVar.A();
                                    if (!this.c.R0()) {
                                        this.c = GeneratedMessageLite.mutableCopy(this.c);
                                    }
                                    this.c.add(A);
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    this.c.C();
                    return null;
                case 4:
                    return new PlayContext();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (PlayContext.class) {
                            if (n == null) {
                                n = new GeneratedMessageLite.c(f);
                            }
                        }
                    }
                    return n;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int p = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.c.size(); i3++) {
                i2 += CodedOutputStream.q(this.c.get(i3));
            }
            int C0 = je.C0(this.c, 1, p + i2);
            this.memoizedSerializedSize = C0;
            return C0;
        }

        public String i() {
            return this.b;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.b.isEmpty()) {
                codedOutputStream.P(1, this.b);
            }
            for (int i = 0; i < this.c.size(); i++) {
                codedOutputStream.P(2, this.c.get(i));
            }
        }
    }

    public static final class Preview extends GeneratedMessageLite<Preview, a> implements Object {
        private static final Preview n;
        private static volatile x<Preview> o;
        private int a;
        private o.i<Metadata$AudioFile> b = GeneratedMessageLite.emptyProtobufList();
        private Duration c;
        private String f = "";

        public static final class a extends GeneratedMessageLite.b<Preview, a> implements Object {
            private a() {
                super(Preview.n);
            }
        }

        static {
            Preview preview = new Preview();
            n = preview;
            preview.makeImmutable();
        }

        private Preview() {
        }

        public static Preview i() {
            return n;
        }

        public static x<Preview> parser() {
            return n.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return n;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Preview preview = (Preview) obj2;
                    this.b = hVar.q(this.b, preview.b);
                    this.c = (Duration) hVar.i(this.c, preview.c);
                    this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ preview.f.isEmpty(), preview.f);
                    if (hVar == GeneratedMessageLite.g.a) {
                        this.a |= preview.a;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    if (!this.b.R0()) {
                                        this.b = GeneratedMessageLite.mutableCopy(this.b);
                                    }
                                    this.b.add(gVar.o(Metadata$AudioFile.parser(), kVar));
                                } else if (B == 18) {
                                    Duration duration = this.c;
                                    Duration.a aVar = duration != null ? (Duration.a) duration.toBuilder() : null;
                                    Duration duration2 = (Duration) gVar.o(Duration.parser(), kVar);
                                    this.c = duration2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((Duration.a) duration2);
                                        this.c = (Duration) aVar.buildPartial();
                                    }
                                } else if (B == 26) {
                                    this.f = gVar.A();
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    this.b.C();
                    return null;
                case 4:
                    return new Preview();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (o == null) {
                        synchronized (Preview.class) {
                            if (o == null) {
                                o = new GeneratedMessageLite.c(n);
                            }
                        }
                    }
                    return o;
                default:
                    throw new UnsupportedOperationException();
            }
            return n;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                i2 += CodedOutputStream.n(1, this.b.get(i3));
            }
            if (this.c != null) {
                i2 += CodedOutputStream.n(2, l());
            }
            if (!this.f.isEmpty()) {
                i2 += CodedOutputStream.p(3, this.f);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public List<Metadata$AudioFile> h() {
            return this.b;
        }

        public Duration l() {
            Duration duration = this.c;
            return duration == null ? Duration.h() : duration;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.b.size(); i++) {
                codedOutputStream.M(1, this.b.get(i));
            }
            if (this.c != null) {
                codedOutputStream.M(2, l());
            }
            if (!this.f.isEmpty()) {
                codedOutputStream.P(3, this.f);
            }
        }
    }

    public static final class Result extends GeneratedMessageLite<Result, a> implements Object {
        private static final Result q;
        private static volatile x<Result> r;
        private String a = "";
        private String b = "";
        private String c = "";
        private boolean f;
        private String n = "";
        private String o = "";
        private boolean p;

        public static final class a extends GeneratedMessageLite.b<Result, a> implements Object {
            private a() {
                super(Result.q);
            }
        }

        static {
            Result result = new Result();
            q = result;
            result.makeImmutable();
        }

        private Result() {
        }

        public static x<Result> parser() {
            return q.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return q;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Result result = (Result) obj2;
                    this.a = hVar.n(!this.a.isEmpty(), this.a, !result.a.isEmpty(), result.a);
                    this.b = hVar.n(!this.b.isEmpty(), this.b, !result.b.isEmpty(), result.b);
                    this.c = hVar.n(!this.c.isEmpty(), this.c, !result.c.isEmpty(), result.c);
                    boolean z = this.f;
                    boolean z2 = result.f;
                    this.f = hVar.f(z, z, z2, z2);
                    this.n = hVar.n(!this.n.isEmpty(), this.n, !result.n.isEmpty(), result.n);
                    this.o = hVar.n(!this.o.isEmpty(), this.o, true ^ result.o.isEmpty(), result.o);
                    boolean z3 = this.p;
                    boolean z4 = result.p;
                    this.p = hVar.f(z3, z3, z4, z4);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z5 = false;
                    while (!z5) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    this.a = gVar.A();
                                } else if (B == 18) {
                                    this.b = gVar.A();
                                } else if (B == 26) {
                                    this.c = gVar.A();
                                } else if (B == 32) {
                                    this.f = gVar.h();
                                } else if (B == 42) {
                                    this.n = gVar.A();
                                } else if (B == 50) {
                                    this.o = gVar.A();
                                } else if (B == 56) {
                                    this.p = gVar.h();
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z5 = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new Result();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (r == null) {
                        synchronized (Result.class) {
                            if (r == null) {
                                r = new GeneratedMessageLite.c(q);
                            }
                        }
                    }
                    return r;
                default:
                    throw new UnsupportedOperationException();
            }
            return q;
        }

        public boolean getIsExplicit() {
            return this.f;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if (!this.a.isEmpty()) {
                i2 = 0 + CodedOutputStream.p(1, this.a);
            }
            if (!this.b.isEmpty()) {
                i2 += CodedOutputStream.p(2, this.b);
            }
            if (!this.c.isEmpty()) {
                i2 += CodedOutputStream.p(3, this.c);
            }
            boolean z = this.f;
            if (z) {
                i2 += CodedOutputStream.d(4, z);
            }
            if (!this.n.isEmpty()) {
                i2 += CodedOutputStream.p(5, this.n);
            }
            if (!this.o.isEmpty()) {
                i2 += CodedOutputStream.p(6, this.o);
            }
            boolean z2 = this.p;
            if (z2) {
                i2 += CodedOutputStream.d(7, z2);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String h() {
            return this.o;
        }

        public boolean i() {
            return this.p;
        }

        public String l() {
            return this.n;
        }

        public String m() {
            return this.c;
        }

        public String n() {
            return this.b;
        }

        public String o() {
            return this.a;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.a.isEmpty()) {
                codedOutputStream.P(1, this.a);
            }
            if (!this.b.isEmpty()) {
                codedOutputStream.P(2, this.b);
            }
            if (!this.c.isEmpty()) {
                codedOutputStream.P(3, this.c);
            }
            boolean z = this.f;
            if (z) {
                codedOutputStream.A(4, z);
            }
            if (!this.n.isEmpty()) {
                codedOutputStream.P(5, this.n);
            }
            if (!this.o.isEmpty()) {
                codedOutputStream.P(6, this.o);
            }
            boolean z2 = this.p;
            if (z2) {
                codedOutputStream.A(7, z2);
            }
        }
    }

    public static final class SeekData extends GeneratedMessageLite<SeekData, a> implements Object {
        private static final SeekData b;
        private static volatile x<SeekData> c;
        private Duration a;

        public static final class a extends GeneratedMessageLite.b<SeekData, a> implements Object {
            private a() {
                super(SeekData.b);
            }
        }

        static {
            SeekData seekData = new SeekData();
            b = seekData;
            seekData.makeImmutable();
        }

        private SeekData() {
        }

        public static x<SeekData> parser() {
            return b.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return b;
                case 1:
                    this.a = (Duration) ((GeneratedMessageLite.h) obj).i(this.a, ((SeekData) obj2).a);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    Duration duration = this.a;
                                    Duration.a aVar = duration != null ? (Duration.a) duration.toBuilder() : null;
                                    Duration duration2 = (Duration) gVar.o(Duration.parser(), kVar);
                                    this.a = duration2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((Duration.a) duration2);
                                        this.a = (Duration) aVar.buildPartial();
                                    }
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new SeekData();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (SeekData.class) {
                            if (c == null) {
                                c = new GeneratedMessageLite.c(b);
                            }
                        }
                    }
                    return c;
                default:
                    throw new UnsupportedOperationException();
            }
            return b;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            Duration duration = this.a;
            if (duration != null) {
                i2 = 0 + CodedOutputStream.n(1, duration);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            Duration duration = this.a;
            if (duration != null) {
                codedOutputStream.M(1, duration);
            }
        }
    }

    public static final class SpeechContext extends GeneratedMessageLite<SpeechContext, a> implements Object {
        private static final SpeechContext b;
        private static volatile x<SpeechContext> c;
        private o.i<String> a = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.b<SpeechContext, a> implements Object {
            private a() {
                super(SpeechContext.b);
            }
        }

        static {
            SpeechContext speechContext = new SpeechContext();
            b = speechContext;
            speechContext.makeImmutable();
        }

        private SpeechContext() {
        }

        public static x<SpeechContext> parser() {
            return b.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return b;
                case 1:
                    this.a = ((GeneratedMessageLite.h) obj).q(this.a, ((SpeechContext) obj2).a);
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    String A = gVar.A();
                                    if (!this.a.R0()) {
                                        this.a = GeneratedMessageLite.mutableCopy(this.a);
                                    }
                                    this.a.add(A);
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    this.a.C();
                    return null;
                case 4:
                    return new SpeechContext();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (c == null) {
                        synchronized (SpeechContext.class) {
                            if (c == null) {
                                c = new GeneratedMessageLite.c(b);
                            }
                        }
                    }
                    return c;
                default:
                    throw new UnsupportedOperationException();
            }
            return b;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.a.size(); i3++) {
                i2 += CodedOutputStream.q(this.a.get(i3));
            }
            int C0 = je.C0(this.a, 1, 0 + i2);
            this.memoizedSerializedSize = C0;
            return C0;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.a.size(); i++) {
                codedOutputStream.P(1, this.a.get(i));
            }
        }
    }

    public static final class TtsPrompt extends GeneratedMessageLite<TtsPrompt, a> implements Object {
        private static final TtsPrompt n;
        private static volatile x<TtsPrompt> o;
        private int a = 0;
        private Object b;
        private String c = "";
        private String f = "";

        public enum TtsCase implements o.c {
            TEXT(1),
            SSML(2),
            TTS_NOT_SET(0);
            
            private final int value;

            private TtsCase(int i) {
                this.value = i;
            }

            @Override // com.google.protobuf.o.c
            public int getNumber() {
                return this.value;
            }
        }

        public static final class a extends GeneratedMessageLite.b<TtsPrompt, a> implements Object {
            private a() {
                super(TtsPrompt.n);
            }
        }

        static {
            TtsPrompt ttsPrompt = new TtsPrompt();
            n = ttsPrompt;
            ttsPrompt.makeImmutable();
        }

        private TtsPrompt() {
        }

        public static TtsPrompt h() {
            return n;
        }

        public static x<TtsPrompt> parser() {
            return n.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            int i;
            boolean z = true;
            TtsCase ttsCase = null;
            boolean z2 = false;
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return n;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    TtsPrompt ttsPrompt = (TtsPrompt) obj2;
                    this.c = hVar.n(!this.c.isEmpty(), this.c, !ttsPrompt.c.isEmpty(), ttsPrompt.c);
                    this.f = hVar.n(!this.f.isEmpty(), this.f, !ttsPrompt.f.isEmpty(), ttsPrompt.f);
                    int i2 = ttsPrompt.a;
                    if (i2 == 0) {
                        ttsCase = TtsCase.TTS_NOT_SET;
                    } else if (i2 == 1) {
                        ttsCase = TtsCase.TEXT;
                    } else if (i2 == 2) {
                        ttsCase = TtsCase.SSML;
                    }
                    int ordinal = ttsCase.ordinal();
                    if (ordinal == 0) {
                        if (this.a != 1) {
                            z = false;
                        }
                        this.b = hVar.e(z, this.b, ttsPrompt.b);
                    } else if (ordinal == 1) {
                        if (this.a != 2) {
                            z = false;
                        }
                        this.b = hVar.e(z, this.b, ttsPrompt.b);
                    } else if (ordinal == 2) {
                        if (this.a == 0) {
                            z = false;
                        }
                        hVar.b(z);
                    }
                    if (hVar == GeneratedMessageLite.g.a && (i = ttsPrompt.a) != 0) {
                        this.a = i;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    while (!z2) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    String A = gVar.A();
                                    this.a = 1;
                                    this.b = A;
                                } else if (B == 18) {
                                    String A2 = gVar.A();
                                    this.a = 2;
                                    this.b = A2;
                                } else if (B == 26) {
                                    this.c = gVar.A();
                                } else if (B == 34) {
                                    this.f = gVar.A();
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z2 = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    return null;
                case 4:
                    return new TtsPrompt();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (o == null) {
                        synchronized (TtsPrompt.class) {
                            if (o == null) {
                                o = new GeneratedMessageLite.c(n);
                            }
                        }
                    }
                    return o;
                default:
                    throw new UnsupportedOperationException();
            }
            return n;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            int i3 = this.a;
            String str = "";
            if (i3 == 1) {
                i2 = 0 + CodedOutputStream.p(1, i3 == 1 ? (String) this.b : str);
            }
            int i4 = this.a;
            if (i4 == 2) {
                if (i4 == 2) {
                    str = (String) this.b;
                }
                i2 += CodedOutputStream.p(2, str);
            }
            if (!this.c.isEmpty()) {
                i2 += CodedOutputStream.p(3, this.c);
            }
            if (!this.f.isEmpty()) {
                i2 += CodedOutputStream.p(4, this.f);
            }
            this.memoizedSerializedSize = i2;
            return i2;
        }

        public String i() {
            return this.f;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i = this.a;
            String str = "";
            if (i == 1) {
                codedOutputStream.P(1, i == 1 ? (String) this.b : str);
            }
            int i2 = this.a;
            if (i2 == 2) {
                if (i2 == 2) {
                    str = (String) this.b;
                }
                codedOutputStream.P(2, str);
            }
            if (!this.c.isEmpty()) {
                codedOutputStream.P(3, this.c);
            }
            if (!this.f.isEmpty()) {
                codedOutputStream.P(4, this.f);
            }
        }
    }

    public static final class Ui extends GeneratedMessageLite<Ui, a> implements Object {
        private static final Ui o;
        private static volatile x<Ui> p;
        private int a;
        private String b = "";
        private String c = "";
        private String f = "";
        private o.i<Result> n = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.b<Ui, a> implements Object {
            private a() {
                super(Ui.o);
            }
        }

        static {
            Ui ui = new Ui();
            o = ui;
            ui.makeImmutable();
        }

        private Ui() {
        }

        public static Ui h() {
            return o;
        }

        public static x<Ui> parser() {
            return o.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return o;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    Ui ui = (Ui) obj2;
                    this.b = hVar.n(!this.b.isEmpty(), this.b, !ui.b.isEmpty(), ui.b);
                    this.c = hVar.n(!this.c.isEmpty(), this.c, !ui.c.isEmpty(), ui.c);
                    this.f = hVar.n(!this.f.isEmpty(), this.f, true ^ ui.f.isEmpty(), ui.f);
                    this.n = hVar.q(this.n, ui.n);
                    if (hVar == GeneratedMessageLite.g.a) {
                        this.a |= ui.a;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    this.b = gVar.A();
                                } else if (B == 18) {
                                    this.c = gVar.A();
                                } else if (B == 26) {
                                    this.f = gVar.A();
                                } else if (B == 34) {
                                    if (!this.n.R0()) {
                                        this.n = GeneratedMessageLite.mutableCopy(this.n);
                                    }
                                    this.n.add(gVar.o(Result.parser(), kVar));
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    this.n.C();
                    return null;
                case 4:
                    return new Ui();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (p == null) {
                        synchronized (Ui.class) {
                            if (p == null) {
                                p = new GeneratedMessageLite.c(o);
                            }
                        }
                    }
                    return p;
                default:
                    throw new UnsupportedOperationException();
            }
            return o;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
            if (!this.c.isEmpty()) {
                p2 += CodedOutputStream.p(2, this.c);
            }
            if (!this.f.isEmpty()) {
                p2 += CodedOutputStream.p(3, this.f);
            }
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                p2 += CodedOutputStream.n(4, this.n.get(i2));
            }
            this.memoizedSerializedSize = p2;
            return p2;
        }

        public List<Result> i() {
            return this.n;
        }

        public String l() {
            return this.c;
        }

        public String m() {
            return this.b;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (!this.b.isEmpty()) {
                codedOutputStream.P(1, this.b);
            }
            if (!this.c.isEmpty()) {
                codedOutputStream.P(2, this.c);
            }
            if (!this.f.isEmpty()) {
                codedOutputStream.P(3, this.f);
            }
            for (int i = 0; i < this.n.size(); i++) {
                codedOutputStream.M(4, this.n.get(i));
            }
        }
    }

    public static final class WaitData extends GeneratedMessageLite<WaitData, a> implements Object {
        private static final WaitData f;
        private static volatile x<WaitData> n;
        private int a;
        private Duration b;
        private o.i<String> c = GeneratedMessageLite.emptyProtobufList();

        public static final class a extends GeneratedMessageLite.b<WaitData, a> implements Object {
            private a() {
                super(WaitData.f);
            }
        }

        static {
            WaitData waitData = new WaitData();
            f = waitData;
            waitData.makeImmutable();
        }

        private WaitData() {
        }

        public static WaitData h() {
            return f;
        }

        public static x<WaitData> parser() {
            return f.getParserForType();
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (methodToInvoke.ordinal()) {
                case 0:
                    return f;
                case 1:
                    GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                    WaitData waitData = (WaitData) obj2;
                    this.b = (Duration) hVar.i(this.b, waitData.b);
                    this.c = hVar.q(this.c, waitData.c);
                    if (hVar == GeneratedMessageLite.g.a) {
                        this.a |= waitData.a;
                    }
                    return this;
                case 2:
                    g gVar = (g) obj;
                    k kVar = (k) obj2;
                    boolean z = false;
                    while (!z) {
                        try {
                            int B = gVar.B();
                            if (B != 0) {
                                if (B == 10) {
                                    Duration duration = this.b;
                                    Duration.a aVar = duration != null ? (Duration.a) duration.toBuilder() : null;
                                    Duration duration2 = (Duration) gVar.o(Duration.parser(), kVar);
                                    this.b = duration2;
                                    if (aVar != null) {
                                        aVar.mergeFrom((Duration.a) duration2);
                                        this.b = (Duration) aVar.buildPartial();
                                    }
                                } else if (B == 18) {
                                    String A = gVar.A();
                                    if (!this.c.R0()) {
                                        this.c = GeneratedMessageLite.mutableCopy(this.c);
                                    }
                                    this.c.add(A);
                                } else if (!gVar.F(B)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            e.d(this);
                            throw new RuntimeException(e);
                        } catch (IOException e2) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                            invalidProtocolBufferException.d(this);
                            throw new RuntimeException(invalidProtocolBufferException);
                        }
                    }
                    break;
                case 3:
                    this.c.C();
                    return null;
                case 4:
                    return new WaitData();
                case 5:
                    return new a();
                case 6:
                    break;
                case 7:
                    if (n == null) {
                        synchronized (WaitData.class) {
                            if (n == null) {
                                n = new GeneratedMessageLite.c(f);
                            }
                        }
                    }
                    return n;
                default:
                    throw new UnsupportedOperationException();
            }
            return f;
        }

        @Override // com.google.protobuf.u
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int n2 = this.b != null ? CodedOutputStream.n(1, l()) + 0 : 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.c.size(); i3++) {
                i2 += CodedOutputStream.q(this.c.get(i3));
            }
            int C0 = je.C0(this.c, 1, n2 + i2);
            this.memoizedSerializedSize = C0;
            return C0;
        }

        public List<String> i() {
            return this.c;
        }

        public Duration l() {
            Duration duration = this.b;
            return duration == null ? Duration.h() : duration;
        }

        @Override // com.google.protobuf.u
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.b != null) {
                codedOutputStream.M(1, l());
            }
            for (int i = 0; i < this.c.size(); i++) {
                codedOutputStream.P(2, this.c.get(i));
            }
        }
    }

    public static final class b extends GeneratedMessageLite.b<InteractionResponse, b> implements Object {
        private b() {
            super(InteractionResponse.o);
        }
    }

    static {
        InteractionResponse interactionResponse = new InteractionResponse();
        o = interactionResponse;
        interactionResponse.makeImmutable();
    }

    private InteractionResponse() {
    }

    public static InteractionResponse i() {
        return o;
    }

    public static x<InteractionResponse> parser() {
        return o.getParserForType();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (methodToInvoke.ordinal()) {
            case 0:
                return o;
            case 1:
                GeneratedMessageLite.h hVar = (GeneratedMessageLite.h) obj;
                InteractionResponse interactionResponse = (InteractionResponse) obj2;
                this.b = hVar.n(!this.b.isEmpty(), this.b, !interactionResponse.b.isEmpty(), interactionResponse.b);
                this.c = hVar.q(this.c, interactionResponse.c);
                int i = this.f;
                boolean z2 = i != 0;
                int i2 = interactionResponse.f;
                if (i2 != 0) {
                    z = true;
                }
                this.f = hVar.m(z2, i, z, i2);
                this.n = hVar.n(!this.n.isEmpty(), this.n, true ^ interactionResponse.n.isEmpty(), interactionResponse.n);
                if (hVar == GeneratedMessageLite.g.a) {
                    this.a |= interactionResponse.a;
                }
                return this;
            case 2:
                g gVar = (g) obj;
                k kVar = (k) obj2;
                while (!z) {
                    try {
                        int B = gVar.B();
                        if (B != 0) {
                            if (B == 10) {
                                this.b = gVar.A();
                            } else if (B == 18) {
                                if (!this.c.R0()) {
                                    this.c = GeneratedMessageLite.mutableCopy(this.c);
                                }
                                this.c.add(gVar.o(ClientActionWithData.parser(), kVar));
                            } else if (B == 24) {
                                this.f = gVar.u();
                            } else if (B == 34) {
                                this.n = gVar.A();
                            } else if (!gVar.F(B)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.d(this);
                        throw new RuntimeException(e);
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.d(this);
                        throw new RuntimeException(invalidProtocolBufferException);
                    }
                }
                break;
            case 3:
                this.c.C();
                return null;
            case 4:
                return new InteractionResponse();
            case 5:
                return new b();
            case 6:
                break;
            case 7:
                if (p == null) {
                    synchronized (InteractionResponse.class) {
                        if (p == null) {
                            p = new GeneratedMessageLite.c(o);
                        }
                    }
                }
                return p;
            default:
                throw new UnsupportedOperationException();
        }
        return o;
    }

    @Override // com.google.protobuf.u
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int p2 = !this.b.isEmpty() ? CodedOutputStream.p(1, this.b) + 0 : 0;
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            p2 += CodedOutputStream.n(2, this.c.get(i2));
        }
        if (this.f != FulfillmentAction.UNKNOWN.getNumber()) {
            p2 += CodedOutputStream.h(3, this.f);
        }
        if (!this.n.isEmpty()) {
            p2 += CodedOutputStream.p(4, this.n);
        }
        this.memoizedSerializedSize = p2;
        return p2;
    }

    public List<ClientActionWithData> h() {
        return this.c;
    }

    public String l() {
        return this.b;
    }

    @Override // com.google.protobuf.u
    public void writeTo(CodedOutputStream codedOutputStream) {
        if (!this.b.isEmpty()) {
            codedOutputStream.P(1, this.b);
        }
        for (int i = 0; i < this.c.size(); i++) {
            codedOutputStream.M(2, this.c.get(i));
        }
        if (this.f != FulfillmentAction.UNKNOWN.getNumber()) {
            codedOutputStream.K(3, this.f);
        }
        if (!this.n.isEmpty()) {
            codedOutputStream.P(4, this.n);
        }
    }
}
