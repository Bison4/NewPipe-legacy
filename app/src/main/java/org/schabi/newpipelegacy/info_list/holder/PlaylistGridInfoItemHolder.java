package org.schabi.newpipelegacy.info_list.holder;

import android.view.ViewGroup;

import org.schabi.newpipelegacy.R;
import org.schabi.newpipelegacy.info_list.InfoItemBuilder;

public class PlaylistGridInfoItemHolder extends PlaylistMiniInfoItemHolder {
    public PlaylistGridInfoItemHolder(final InfoItemBuilder infoItemBuilder,
                                      final ViewGroup parent) {
        super(infoItemBuilder, R.layout.list_playlist_grid_item, parent);
    }
}
