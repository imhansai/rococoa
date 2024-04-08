package org.rococoa.cocoa;

import org.rococoa.ObjCClass;
import org.rococoa.Rococoa;
import org.rococoa.RunOnMainThread;
import org.rococoa.cocoa.foundation.NSArray;
import org.rococoa.cocoa.foundation.NSObject;

@RunOnMainThread
public abstract class NSWorkspace extends NSObject {

    private static final NSWorkspace._Class CLASS = Rococoa.createClass("NSWorkspace", NSWorkspace._Class.class);  //$NON-NLS-1$

    private interface _Class extends ObjCClass {
        NSWorkspace sharedWorkspace();
    }

    static public final NSWorkspace NS_WORKSPACE = NSWorkspace.CLASS.sharedWorkspace();

    static public NSWorkspace sharedWorkspace() {
        return NS_WORKSPACE;
    }

    public abstract NSArray runningApplications();

}
