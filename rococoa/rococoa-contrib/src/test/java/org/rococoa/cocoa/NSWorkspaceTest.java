package org.rococoa.cocoa;

import org.junit.Test;
import org.rococoa.Rococoa;
import org.rococoa.cocoa.foundation.NSArray;
import org.rococoa.cocoa.foundation.NSString;

public class NSWorkspaceTest {

    @Test
    public void testActiveWindow() {
        NSWorkspace nsWorkspace = NSWorkspace.sharedWorkspace();
        NSArray nsArray = nsWorkspace.runningApplications();

        for (int i = 0; i < nsArray.count(); i++) {
            NSRunningApplication nsRunningApplication = Rococoa.cast(nsArray.objectAtIndex(i), NSRunningApplication.class);
            NSString localizedName = nsRunningApplication.localizedName();
            Boolean active = nsRunningApplication.isActive();
            System.out.println("localizedName: " + localizedName + " isActive: " + active);
        }

    }
}