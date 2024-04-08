package org.rococoa.cocoa;

import org.rococoa.cocoa.foundation.NSObject;
import org.rococoa.cocoa.foundation.NSString;

public abstract class NSRunningApplication extends NSObject {

    public abstract Boolean isActive();

    public abstract NSString localizedName();

}
