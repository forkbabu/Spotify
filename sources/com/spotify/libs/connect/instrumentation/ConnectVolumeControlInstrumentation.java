package com.spotify.libs.connect.instrumentation;

public interface ConnectVolumeControlInstrumentation {

    public enum Action {
        SET_SYSTEM_VOLUME("set_system_volume"),
        SEND_VOLUME_COMMAND("send_volume_command"),
        SYSTEM_VOLUME_UPDATED("system_volume_updated"),
        REMOTE_VOLUME_RECEIVED("remote_volume_received");
        
        private final String value;

        private Action(String str) {
            this.value = str;
        }

        public final String d() {
            return this.value;
        }
    }

    public enum ApplicationState {
        FOREGROUND("foreground"),
        BACKGROUND_LOCKSCREEN("background_lockscreen");
        
        private final String value;

        private ApplicationState(String str) {
            this.value = str;
        }

        public final String d() {
            return this.value;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class RemoteVolumeReceived extends Enum<RemoteVolumeReceived> {
        public static final RemoteVolumeReceived a;
        private static final /* synthetic */ RemoteVolumeReceived[] b;
        private final String value;

        static {
            RemoteVolumeReceived remoteVolumeReceived = new RemoteVolumeReceived("CORE", 0, "core");
            a = remoteVolumeReceived;
            b = new RemoteVolumeReceived[]{remoteVolumeReceived, new RemoteVolumeReceived("CAST", 1, "cast")};
        }

        private RemoteVolumeReceived(String str, int i, String str2) {
            this.value = str2;
        }

        public static RemoteVolumeReceived valueOf(String str) {
            return (RemoteVolumeReceived) Enum.valueOf(RemoteVolumeReceived.class, str);
        }

        public static RemoteVolumeReceived[] values() {
            return (RemoteVolumeReceived[]) b.clone();
        }

        public final String d() {
            return this.value;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class SendVolumeCommand extends Enum<SendVolumeCommand> {
        public static final SendVolumeCommand a;
        private static final /* synthetic */ SendVolumeCommand[] b;
        private final String value;

        static {
            SendVolumeCommand sendVolumeCommand = new SendVolumeCommand("VOLUME_SET", 2, "volume_set");
            a = sendVolumeCommand;
            b = new SendVolumeCommand[]{new SendVolumeCommand("VOLUME_UP", 0, "volume_up"), new SendVolumeCommand("VOLUME_DOWN", 1, "volume_down"), sendVolumeCommand};
        }

        private SendVolumeCommand(String str, int i, String str2) {
            this.value = str2;
        }

        public static SendVolumeCommand valueOf(String str) {
            return (SendVolumeCommand) Enum.valueOf(SendVolumeCommand.class, str);
        }

        public static SendVolumeCommand[] values() {
            return (SendVolumeCommand[]) b.clone();
        }

        public final String d() {
            return this.value;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class SetSystemVolume extends Enum<SetSystemVolume> {
        public static final SetSystemVolume a;
        private static final /* synthetic */ SetSystemVolume[] b;
        private final String value;

        static {
            SetSystemVolume setSystemVolume = new SetSystemVolume("EXTERNAL_REQUEST", 1, "external_request");
            a = setSystemVolume;
            b = new SetSystemVolume[]{new SetSystemVolume("SYNC_WITH_REMOTE", 0, "sync_with_remote"), setSystemVolume};
        }

        private SetSystemVolume(String str, int i, String str2) {
            this.value = str2;
        }

        public static SetSystemVolume valueOf(String str) {
            return (SetSystemVolume) Enum.valueOf(SetSystemVolume.class, str);
        }

        public static SetSystemVolume[] values() {
            return (SetSystemVolume[]) b.clone();
        }

        public final String d() {
            return this.value;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    public static final class SystemVolumeUpdated extends Enum<SystemVolumeUpdated> {
        public static final SystemVolumeUpdated a;
        public static final SystemVolumeUpdated b;
        public static final SystemVolumeUpdated c;
        private static final /* synthetic */ SystemVolumeUpdated[] f;
        private final String value;

        static {
            SystemVolumeUpdated systemVolumeUpdated = new SystemVolumeUpdated("VOLUME_UP", 1, "volume_up");
            a = systemVolumeUpdated;
            SystemVolumeUpdated systemVolumeUpdated2 = new SystemVolumeUpdated("VOLUME_DOWN", 2, "volume_down");
            b = systemVolumeUpdated2;
            SystemVolumeUpdated systemVolumeUpdated3 = new SystemVolumeUpdated("VOLUME_SET", 3, "volume_set");
            c = systemVolumeUpdated3;
            f = new SystemVolumeUpdated[]{new SystemVolumeUpdated("ROUTE_CHANGE", 0, "route_change"), systemVolumeUpdated, systemVolumeUpdated2, systemVolumeUpdated3};
        }

        private SystemVolumeUpdated(String str, int i, String str2) {
            this.value = str2;
        }

        public static SystemVolumeUpdated valueOf(String str) {
            return (SystemVolumeUpdated) Enum.valueOf(SystemVolumeUpdated.class, str);
        }

        public static SystemVolumeUpdated[] values() {
            return (SystemVolumeUpdated[]) f.clone();
        }

        public final String d() {
            return this.value;
        }
    }

    void a(SetSystemVolume setSystemVolume, float f, Float f2);

    void b(SendVolumeCommand sendVolumeCommand, float f, Float f2);

    void c(SystemVolumeUpdated systemVolumeUpdated, float f, Float f2);

    void d(RemoteVolumeReceived remoteVolumeReceived, float f, Float f2);
}
