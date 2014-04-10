/*
 *  xkcdViewer - Android app to view xkcd comics
 *  Copyright (C) 2013 Akshay Sharma
 *  
 *  xkcd is Copyright (C) Randall Munroe.
 *
 */
package net.bytten.xkcdviewer;

import net.bytten.comicviewer.ArchiveActivity;
import net.bytten.comicviewer.ComicViewerActivity;
import net.bytten.comicviewer.IComicDefinition;

public class XkcdViewerActivity extends ComicViewerActivity {

    @Override
    protected IComicDefinition makeComicDef() {
        return new XkcdComicDefinition();
    }

    @Override
    protected Class<? extends ArchiveActivity> getArchiveActivityClass() {
        return XkcdArchiveActivity.class;
    }

    @Override
    protected String getStringAboutText() {
        return getResources().getString(R.string.aboutText);
    }

    @Override
    protected String getStringAppName() {
        return getResources().getString(R.string.app_name);
    }

}
