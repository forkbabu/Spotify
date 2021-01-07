package com.spotify.music.podcastentityrow;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class PodcastPlayerContextOrder extends Enum<PodcastPlayerContextOrder> {
    public static final PodcastPlayerContextOrder a;
    public static final PodcastPlayerContextOrder b;
    private static final /* synthetic */ PodcastPlayerContextOrder[] c;

    static {
        PodcastPlayerContextOrder podcastPlayerContextOrder = new PodcastPlayerContextOrder("ADD_TIME", 1);
        a = podcastPlayerContextOrder;
        PodcastPlayerContextOrder podcastPlayerContextOrder2 = new PodcastPlayerContextOrder("PUBLISH_DATE", 2);
        b = podcastPlayerContextOrder2;
        c = new PodcastPlayerContextOrder[]{new PodcastPlayerContextOrder("DEFAULT", 0), podcastPlayerContextOrder, podcastPlayerContextOrder2};
    }

    private PodcastPlayerContextOrder(String str, int i) {
    }

    public static PodcastPlayerContextOrder valueOf(String str) {
        return (PodcastPlayerContextOrder) Enum.valueOf(PodcastPlayerContextOrder.class, str);
    }

    public static PodcastPlayerContextOrder[] values() {
        return (PodcastPlayerContextOrder[]) c.clone();
    }
}
