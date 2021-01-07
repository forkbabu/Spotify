package com.spotify.encore.consumer.components.yourlibrary.impl.elements;

import android.content.res.Resources;
import com.spotify.encore.consumer.components.yourlibrary.api.elements.LibraryItemDescription;
import com.spotify.encore.consumer.components.yourlibrary.impl.R;
import java.text.DateFormat;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class LibraryItemDescriptionFormatterKt {
    private static final DateFormat dateFormatter = DateFormat.getDateInstance(2);

    public static final String format(Resources resources, LibraryItemDescription.Model model) {
        h.e(resources, "resources");
        h.e(model, "model");
        if (model instanceof LibraryItemDescription.Model.Album) {
            return formatAlbum(resources, (LibraryItemDescription.Model.Album) model);
        }
        if (model instanceof LibraryItemDescription.Model.Artist) {
            return formatArtist(resources, (LibraryItemDescription.Model.Artist) model);
        }
        if (model instanceof LibraryItemDescription.Model.Folder) {
            return formatFolder(resources, (LibraryItemDescription.Model.Folder) model);
        }
        if (model instanceof LibraryItemDescription.Model.LikedSongs) {
            return formatLikedSongs(resources, (LibraryItemDescription.Model.LikedSongs) model);
        }
        if (model instanceof LibraryItemDescription.Model.Playlist) {
            return formatPlaylist(resources, (LibraryItemDescription.Model.Playlist) model);
        }
        if (model instanceof LibraryItemDescription.Model.Show) {
            return formatShow(resources, (LibraryItemDescription.Model.Show) model);
        }
        if (model instanceof LibraryItemDescription.Model.YourEpisodes) {
            return formatYourEpisodes(resources, (LibraryItemDescription.Model.YourEpisodes) model);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String formatAlbum(Resources resources, LibraryItemDescription.Model.Album album) {
        if (!album.getIncludeType()) {
            return album.getArtist();
        }
        if (album.getArtist() == null) {
            return resources.getString(R.string.item_description_album_empty_creator);
        }
        return resources.getString(R.string.item_description_album, album.getArtist());
    }

    private static final String formatArtist(Resources resources, LibraryItemDescription.Model.Artist artist) {
        if (artist.getIncludeType()) {
            return resources.getString(R.string.item_description_artist);
        }
        return null;
    }

    private static final String formatFolder(Resources resources, LibraryItemDescription.Model.Folder folder) {
        if (folder.getNumberOfPlaylists() == 0 && folder.getNumberOfFolders() == 0) {
            return resources.getString(R.string.item_description_folder_empty);
        }
        if (folder.getNumberOfFolders() == 0) {
            return resources.getQuantityString(R.plurals.item_description_folder_playlists_count, folder.getNumberOfPlaylists(), Integer.valueOf(folder.getNumberOfPlaylists()));
        }
        if (folder.getNumberOfPlaylists() == 0) {
            return resources.getQuantityString(R.plurals.item_description_folder_folders_count, folder.getNumberOfFolders(), Integer.valueOf(folder.getNumberOfFolders()));
        }
        return resources.getString(R.string.item_description_folder_combined, resources.getQuantityString(R.plurals.item_description_folder_playlists_count, folder.getNumberOfPlaylists(), Integer.valueOf(folder.getNumberOfPlaylists())), resources.getQuantityString(R.plurals.item_description_folder_folders_count, folder.getNumberOfFolders(), Integer.valueOf(folder.getNumberOfFolders())));
    }

    private static final String formatLikedSongs(Resources resources, LibraryItemDescription.Model.LikedSongs likedSongs) {
        if (likedSongs.getNumberOfSongs() == 0) {
            return resources.getString(R.string.item_description_liked_songs_empty);
        }
        if (likedSongs.getIncludeType()) {
            return resources.getQuantityString(R.plurals.item_description_liked_songs, likedSongs.getNumberOfSongs(), Integer.valueOf(likedSongs.getNumberOfSongs()));
        }
        return resources.getQuantityString(R.plurals.item_description_liked_songs_filtered, likedSongs.getNumberOfSongs(), Integer.valueOf(likedSongs.getNumberOfSongs()));
    }

    private static final String formatPlaylist(Resources resources, LibraryItemDescription.Model.Playlist playlist) {
        if (!playlist.getIncludeType()) {
            return playlist.getCreator();
        }
        if (playlist.getCreator() == null) {
            return resources.getString(R.string.item_description_playlist_empty_creator);
        }
        return resources.getString(R.string.item_description_playlist, playlist.getCreator());
    }

    private static final String formatShow(Resources resources, LibraryItemDescription.Model.Show show) {
        boolean z = show.getCreator() != null;
        if (!show.getIncludeType()) {
            boolean z2 = show.getUpdateDate() != null;
            if (z && z2) {
                int i = R.string.item_description_show_date_and_creator;
                LibraryItemDescription.UpdateDate updateDate = show.getUpdateDate();
                h.c(updateDate);
                return resources.getString(i, formattedDate(resources, updateDate), show.getCreator());
            } else if (z2) {
                LibraryItemDescription.UpdateDate updateDate2 = show.getUpdateDate();
                h.c(updateDate2);
                return formattedDate(resources, updateDate2);
            } else if (z) {
                return show.getCreator();
            } else {
                return null;
            }
        } else if (z) {
            return resources.getString(R.string.item_description_show, show.getCreator());
        } else {
            return resources.getString(R.string.item_description_show_empty_creator);
        }
    }

    private static final String formatYourEpisodes(Resources resources, LibraryItemDescription.Model.YourEpisodes yourEpisodes) {
        if (yourEpisodes.getNumberOfEpisodes() == 0) {
            return resources.getString(R.string.item_description_your_episodes_empty);
        }
        if (yourEpisodes.getIncludeType()) {
            return resources.getQuantityString(R.plurals.item_description_your_episodes, yourEpisodes.getNumberOfEpisodes(), Integer.valueOf(yourEpisodes.getNumberOfEpisodes()));
        }
        return resources.getQuantityString(R.plurals.item_description_your_episodes_filtered, yourEpisodes.getNumberOfEpisodes(), Integer.valueOf(yourEpisodes.getNumberOfEpisodes()));
    }

    private static final String formattedDate(Resources resources, LibraryItemDescription.UpdateDate updateDate) {
        if (updateDate.getDaysAgo() <= 0) {
            String string = resources.getString(R.string.item_description_date_updated_today);
            h.d(string, "resources.getString(R.st…ption_date_updated_today)");
            return string;
        } else if (updateDate.getDaysAgo() == 1) {
            String string2 = resources.getString(R.string.item_description_date_updated_yesterday);
            h.d(string2, "resources.getString(R.st…n_date_updated_yesterday)");
            return string2;
        } else {
            String string3 = resources.getString(R.string.item_description_date_updated, dateFormatter.format(new Date(updateDate.getTimestampMillis())));
            h.d(string3, "resources.getString(\n   …e.timestampMillis))\n    )");
            return string3;
        }
    }
}
